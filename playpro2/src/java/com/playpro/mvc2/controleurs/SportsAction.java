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
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author toute
 */
public class SportsAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/sports";
    private final UploadPhoto up = new UploadPhoto();

    @Override
    public String execute() {
        response.setContentType("text/html");

        SportDAO dao = new SportDAO();
        String nomSport = request.getParameter("nomSport");
        String imageSport = request.getParameter("imageSport");
        
        int nbMax = 0;
        List<Part> part = null;
        try {
             part = (List<Part>) request.getParts();
        } catch (IOException | ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (nomSport == null) {

        } else {
            nbMax = Integer.parseInt(request.getParameter("nbMax"));
            String applicationPath = request.getServletContext().getRealPath("");
            // constructs path of the directory to save uploaded file
            String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;
            
            imageSport = up.uploader(part, UPLOAD_DIR, applicationPath, imageSport);
            
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

        List<Sport> liste = new LinkedList<>();
        liste.add(new Sport());
        liste.add(new Sport());
        liste = dao.findAll();
        System.out.println("Liste" + liste);

        request.setAttribute("sports", liste);
        request.setAttribute("AfficherSports", true);
        
        System.out.println("Nom sport : " + nomSport);
        System.out.println("Image sport : " + imageSport);
        System.out.println("Nb max sport : " + nbMax);
        
        System.out.println("size de la liste sports =  "+ liste.size());

        request.getSession().setAttribute("viewConf","sports");
        return "portail";
    }

}
