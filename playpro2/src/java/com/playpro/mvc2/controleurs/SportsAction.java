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

    @Override
    public String execute() {
        response.setContentType("text/html");

        SportDAO dao = new SportDAO();
        String nomSport = request.getParameter("nomSport");
        String imageSport = request.getParameter("imageSport");
        String chemin = request.getParameter("sourceDirPath");
        int nbMax = 0;

        if (nomSport == null || imageSport == null) {

        } else {
            nbMax = Integer.parseInt(request.getParameter("nbMax"));

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
        liste.get(0).setImage("tennis.jpg");
        request.setAttribute("sports", liste);
        request.setAttribute("AfficherSports", true);

        return "portail";
    }

}
