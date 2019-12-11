/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Equipe;
import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Membre;
import com.playpro.entities.Partie;
import com.playpro.services.EquipesServices;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class PartiesAction extends AbstractAction {

    @Override
    public String execute() {

        Membre mSession = (Membre) request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expiré, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }

        response.setContentType("text/html");

        Membre cap = (Membre) request.getSession().getAttribute("membre");

        String message = "";
        String laClasse = "";

        System.out.println("nom personne connecté = " + cap.getNom());

        List<Equipe> listeEquipes = new LinkedList<Equipe>();
        listeEquipes = EquipesServices.toutesLesEquipes();

        List<Equipe> listeSesequipes = new LinkedList<Equipe>();

//        listeSesequipes = EquipesServices.toutesLesEquipes();
        for (int i = 0; i < listeEquipes.size(); i++) {

            if (listeEquipes.get(i).getCapitaine().getId().equals(cap.getId())) {

                System.out.println(listeEquipes.get(i));
                listeSesequipes.add(listeEquipes.get(i));
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

        String equipeChoisi = (String) request.getParameter("idUneEquipe");
        String equipeAdvers = (String) request.getParameter("equipeAdverse");

        String date = (String) request.getParameter("datePartie");

        LocalDate localDate = null;
        if (date != null) {

            localDate = LocalDate.parse(date, formatter);
        }

        LocalTime time = null;
        String heure = (String) request.getParameter("heurePartie");
        if (heure != null) {

            time = LocalTime.parse(heure);
        }
        if (date != null && heure != null) {

            System.out.println("info form = " + equipeChoisi + "," + equipeAdvers + "," + localDate.toString() + "," + time.toString());
        }

        request.getSession().setAttribute("listeSesequipes", listeSesequipes);
        request.getSession().setAttribute("listeEquipesParties", listeEquipes);

        Equipe equipeC = new Equipe();
        Equipe equipeAd = new Equipe();

        equipeC = EquipesServices.trouverEquipe(equipeChoisi);
        equipeAd = EquipesServices.trouverEquipe(equipeAdvers);

        if (equipeC != null) {

            System.out.println("nom equipe choisi = " + equipeC.getNomEquipe());
        }
        if (equipeAd != null) {

            System.out.println("nom equipe adversaire = " + equipeAd.getNomEquipe());
        }
        
        //un lieu provisoire
        
        LieuSport lieu = new LieuSport();
        
        Partie partie = new Partie();
        
        partie.setDatePartie(localDate);
        partie.setEquipe1(equipeC);
        partie.setEquipe2(equipeAd);
        partie.setHeurePArtie(time);
        partie.setLieuSportPartie(lieu);
        
        
        

        request.getSession().setAttribute("viewConf", "parties");
        return "portail";
    }

}
