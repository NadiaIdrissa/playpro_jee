/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.SportDAO;
import java.util.LinkedList;
import java.util.List;
import com.playpro.entities.Sport;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.SportServices;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author toute
 */
public class SportsAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/sports";

    @Override
    public String execute() {
        response.setContentType("text/html");

        SportDAO dao = new SportDAO();
        String nomSport = request.getParameter("nomSport");
        String imageSport = request.getParameter("imageSport");
        
        int nbMax = 0;

        if (nomSport == null) {

        } else {
            nbMax = Integer.parseInt(request.getParameter("nbMax"));
            String applicationPath = request.getServletContext().getRealPath("");
            // constructs path of the directory to save uploaded file
            String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

            // creates the save directory if it does not exists
            File fileSaveDir = new File(uploadFilePath);
            if (!fileSaveDir.exists()) {
                fileSaveDir.mkdirs();
            }
            System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());

            try {
                //Get all the parts from request and write it to the file on server
                for (Part part : request.getParts()) {
                    String fileName = getFileName(part);
                    if (!fileName.equals("")) {
                        part.write(uploadFilePath + File.separator + fileName);
                        imageSport = fileName;
                        System.out.println("FILE NAME : "+fileName);
                    }
                }
                request.setAttribute("message", "File uploaded successfully!");
            } catch (IOException ex) {
                Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);
                request.setAttribute("message", "File NOT uploaded successfully!");
            } catch (ServletException ex) {
                Logger.getLogger(UploadAction.class.getName()).log(Level.SEVERE, null, ex);
                request.setAttribute("message", "File NOT uploaded successfully!");
            }

//        getServletContext().getRequestDispatcher("/response.jsp").forward(
//                request, response);
            Sport s = ObjectFactory.getNewSport();
            s.setNom(nomSport);
            s.setNb_max(nbMax);
            s.setImage(imageSport);

            SportServices.creerSport(s);
        }

        System.out.println("Nom sport : " + nomSport);
        System.out.println("Image sport : " + imageSport);
        System.out.println("Nb max sport : " + nbMax);
        //System.out.println("Chemin : " + fileName);

        List<Sport> liste = new LinkedList<Sport>();
        liste.add(new Sport());
        liste.add(new Sport());
        liste = dao.findAll();
        System.out.println("Liste" + liste);
//        liste.get(1).setImage("tennis.jpg");
        //liste.get(0).setImage("tennis.jpg");
        request.setAttribute("sports", liste);
        request.setAttribute("AfficherSports", true);
        
        System.out.println("Nom sport : " + nomSport);
        System.out.println("Image sport : " + imageSport);
        System.out.println("Nb max sport : " + nbMax);

        return "portail";
    }

    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= " + contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length() - 1);
            }
        }
        return "";
    }
}
