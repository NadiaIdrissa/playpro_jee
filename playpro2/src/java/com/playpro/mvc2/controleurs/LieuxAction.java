/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.LieuxDAO;
import com.playpro.entities.Lieux;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.LieuxServices;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author nadym
 */
public class LieuxAction extends AbstractAction {
    
    private static final String UPLOAD_DIR = "static/images/lieux";

    @Override
    public String execute() {
        response.setContentType("text/html");
        LieuxDAO dao = new LieuxDAO();
        String nom = request.getParameter("nom");
        String rue = request.getParameter("rue");
        String ville = request.getParameter("ville");
        String pays = request.getParameter("pays");
        String numero = request.getParameter("numero");
        String cp = request.getParameter("code_postal");
        String infos = request.getParameter("infos");
        
        String image1 = request.getParameter("image1");
        
        Lieux s = new Lieux();

        if (ville == null || rue == null || pays == null || cp == null) {
            
        } else {
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
                        image1 = fileName;
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
            
            
            s = ObjectFactory.getNewLieu();
            s.setNom(nom);
            s.setRue(rue);
            s.setVille(ville);
            s.setPays(pays);
            s.setNumero(numero);
            s.setCode_postal(cp);
            s.setInfos(infos);
            s.setImage1(image1);

            LieuxServices.creerLieux(s);
        }

        System.out.println("Id lieu : " + s.getId_lieu());
        System.out.println("Nom lieu : " + nom);
        System.out.println("rue : " + rue);
        System.out.println("ville : " + ville);
        System.out.println("code postal : " + cp);
        System.out.println("infos : " + infos);
        System.out.println("pays : " + pays);
        System.out.println("numero: " + numero);

        List<Lieux> liste = new LinkedList<>();
        liste.add(new Lieux());
        liste = dao.findAll();
        System.out.println("Liste" + liste);
        request.setAttribute("lieux", liste);
        request.setAttribute("AfficherLieux", true);
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
