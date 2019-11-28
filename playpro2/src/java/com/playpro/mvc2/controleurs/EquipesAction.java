/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.daos.MembreDAO;
import com.playpro.daos.SportDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
import com.playpro.entities.Equipe;
import com.playpro.entities.Sport;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.EquipesServices;
import com.playpro.services.SportServices;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;
import static jdk.nashorn.internal.objects.NativeError.getFileName;

/**
 *
 * @author younes-dilali
 */
public class EquipesAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/equipes";

    @Override
    public String execute() {

        response.setContentType("text/html");

        EquipesDAO dao = new EquipesDAO();
        String nomEquipe = request.getParameter("nomEquipe");
        String nomSport = request.getParameter("nomSportEquipe");
        String imageEquipe = request.getParameter("imageEquipe");
        Membre cap = (Membre) request.getSession().getAttribute("membre");

        List<Part> part = null;
        try {
            part = (List<Part>) request.getParts();
        } catch (IOException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("id membre = " + cap.getId());
        System.out.println("sport choisi formulaire = " + nomSport);

        int nbMaxEquipe = 0;

        if (nomEquipe == null) {

        } else {
            nbMaxEquipe = Integer.parseInt(request.getParameter("nbMaxEquipe"));
            String applicationPath = request.getServletContext().getRealPath("");
            // constructs path of the directory to save uploaded file
            String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

            UploadPhoto up = new UploadPhoto();

            imageEquipe = up.uploader(part, UPLOAD_DIR, applicationPath, imageEquipe);

            // creates the save directory if it does not exists
//            File fileSaveDir = new File(uploadFilePath);
//            if (!fileSaveDir.exists()) {
//                fileSaveDir.mkdirs();
//            }
//            System.out.println("Upload File Directory=" + fileSaveDir.getAbsolutePath());
//
//            try {
//                //Get all the parts from request and write it to the file on server
//                for (Part part : request.getParts()) {
//                    String fileName = (String) getFileName(part);
//                    if (!fileName.equals("")) {
//                        part.write(uploadFilePath + File.separator + fileName);
//                        imageEquipe = fileName;
//                        System.out.println("FILE NAME : " + fileName);
//                    }
//                }
//                request.setAttribute("message", "File uploaded successfully!");
//            } catch (IOException ex) {
//                
//                request.setAttribute("message", "File NOT uploaded successfully!");
//
//            } catch (ServletException ex) {
//                Logger.getLogger(EquipesAction.class.getName()).log(Level.SEVERE, null, ex);
//                request.setAttribute("message", "File NOT uploaded successfully!");
//            }
            Equipe e = new Equipe();
            e.setNomEquipe(nomEquipe);
            e.setNbJoueurs(nbMaxEquipe);
            Sport s = new Sport();
            s.setNom(nomSport);
            e.setSport(s);
            e.setImage(imageEquipe);
            e.setId_capitaine(cap.getId());
            e.setCapitaine(cap);

            EquipesServices.creerEquipe(e);
        }
        List<String> listeq = new LinkedList<String>();
        SportDAO sports = new SportDAO();
        List<Sport> s = new LinkedList<Sport>();
        s = sports.findAll();

        System.out.println("liste de sport existante");
        for (int j = 0; j < s.size(); j++) {
            System.out.println(j + s.get(j).getNom());
            listeq.add(s.get(j).getNom());
        }

        request.getSession().setAttribute("sportString", listeq);

        List<Equipe> listeequipes = new LinkedList<Equipe>();

//        Equipe a = new Equipe();
        listeequipes = dao.findAll();

//        listeequipes.add(a);
        request.setAttribute("listeEquipe", listeequipes);

//        System.out.println("equipe 1 = "+listeequipes.get(0).getNomEquipe());
        request.getSession().setAttribute("viewConf", "loadEquipe");
        
        
        List<Membre> listeDesMembres = new LinkedList<Membre>();
        
        MembreDAO mDao = new MembreDAO();
        
        listeDesMembres = mDao.findAll();
        
        for (int j=0;j<listeDesMembres.size();j++){
            System.out.println(listeDesMembres.get(j).getNom());
        }
        
        request.getSession().setAttribute("listeDesMembres", listeDesMembres);
        
        
        
        
        
        
        
        

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
