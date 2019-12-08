/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.SportDAO;
import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Membre;
import java.util.LinkedList;
import java.util.List;
import com.playpro.entities.Sport;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.LieuSportService;
import com.playpro.services.LieuxServices;
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
        
        Membre mSession =  (Membre)request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expirée, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }

        String nomSport = request.getParameter("nomSport");
        String imageSport = request.getParameter("imageSport");
        String message = "";
        String laClasse="";
        String idSportSupprimer = request.getParameter("idSportSupprimer");
        
        int nbMax = 0;
        List<Part> part = null;
        try {
             part = (List<Part>) request.getParts();
        } catch (IOException | ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(idSportSupprimer !=null){
            System.out.println("Je suis nul");
            Sport s = SportServices.trouverUnSport(idSportSupprimer);
            
            LieuSport ls = new LieuSport();
            Lieux l = new Lieux();
            l.setId_lieu("");
            ls.setSport(s);
            ls.setLieu(l);
            
            boolean reussi  = LieuSportService.supprimer(ls);
                    
            reussi = SportServices.supprimer(s);
            
            if(reussi){
                message = "Le sport "+s.getNom()+" a été supprimé avec succès";
                laClasse = "success";
            }else{
                message = "Une erreur est survenue lors de la suppression";
                laClasse = "danger";
            }
            
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
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
        
        liste = SportServices.tousLesSports();
        System.out.println("Liste" + liste);

        request.setAttribute("sports", liste);
        
        System.out.println("Nom sport : " + nomSport);
        System.out.println("Image sport : " + imageSport);
        System.out.println("Nb max sport : " + nbMax);
        
        System.out.println("size de la liste sports =  "+ liste.size());

        request.getSession().setAttribute("viewConf","sports");
        return "portail";
    }

}
