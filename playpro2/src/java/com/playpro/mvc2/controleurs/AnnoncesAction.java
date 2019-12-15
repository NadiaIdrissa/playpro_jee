/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Annonce;
import com.playpro.entities.Lieux;
import com.playpro.entities.Membre;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.AnnoncesServices;
import com.playpro.services.LieuxServices;
import java.sql.Timestamp;
import java.util.List;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author toute
 */
public class AnnoncesAction extends AbstractAction implements AjaxAction{
    
    

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
        
        
        String titre = (String) request.getParameter("titre");
        String message = (String) request.getParameter("message");
        String gratuit[] = request.getParameterValues("gratuit");
        String montant = (String) request.getParameter("montant");
        Membre createur = (Membre) request.getSession().getAttribute("membre");
        String dateheure = (String) request.getParameter("dateheure");

        if (titre != null && message != null) {
            System.out.println("Date time: " + dateheure);
            int nbMax = Integer.parseInt(request.getParameter("nbMax"));
            Annonce annonce = ObjectFactory.getNewAnnonce();
            annonce.setCreateur(createur);
            annonce.setDescription(message);
            annonce.setTitre(titre);
            annonce.setNombreMax(nbMax);
            annonce.setDate_event(creerDate(dateheure));
            System.out.println("Date time: " + annonce.getDate_event());
            if (gratuit == null) {
                annonce.setGratuit(Boolean.FALSE);
            } else if (gratuit[0].equals("on")) {
                annonce.setGratuit(Boolean.TRUE);
            }
            if (!tryParseDouble(montant)) {
                annonce.setMontant(0);
            } else {
                annonce.setMontant(Double.parseDouble(montant));
            }

            boolean reussi = AnnoncesServices.creerAnnonce(annonce);
            if (reussi) {
                request.setAttribute("message", "Annonce créée.");
            }
        }
        List<Lieux> listeLieux = LieuxServices.tousLesLieux();
        List<Annonce> liste = AnnoncesServices.toutesLesAnnonces();
        System.out.println("montant" + montant);
        Gson gson = new Gson();
        String lst = gson.toJson(liste);
        
        request.setAttribute("lieux", listeLieux);
        request.setAttribute("annonces", liste);
        request.getSession().setAttribute("viewConf", "annonces");
        try {
            response.getWriter().print(lst);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//        return "n'importe quoi"
//        System.out.println(lst);
//
//        request.getSession().setAttribute("viewConf", "annonces");
//        request.setAttribute("lieux", listeLieux);
//        request.setAttribute("annonces", liste);
        return "portail";
    }

    boolean tryParseDouble(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    boolean tryParseInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    Timestamp creerDate(String s) {
        String[] dateTime = s.split("T");
        String[] date = dateTime[0].split("-");
        String[] time = dateTime[1].split(":");
        
        Timestamp stamp = new Timestamp(Integer.valueOf(date[0]).intValue() - 1900, 
            Integer.valueOf(date[1]).intValue(), 
            Integer.valueOf(date[2]).intValue(), 
            Integer.valueOf(time[0]).intValue(), 
            Integer.valueOf(time[1]).intValue(), 
            Integer.valueOf(time[2].split("\\.")[0]).intValue(), 
            Integer.valueOf(time[2].split("\\.")[1]).intValue());
        return stamp;
    }

}
