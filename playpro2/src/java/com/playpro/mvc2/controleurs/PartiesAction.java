/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.PartiesDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Membre;
import com.playpro.entities.Partie;
import com.playpro.services.EquipesServices;
import com.playpro.services.LieuxServices;
import com.playpro.services.PartiesServices;
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

        List<Lieux> listeLieux = new LinkedList<Lieux>();
        listeLieux = LieuxServices.tousLesLieux();

        request.setAttribute("listeLieux", listeLieux);

//        for(int y=0;y<listeLieux.size();y++){
//            System.out.println("lieu "+y+": "+listeLieux.get(y).getNom());
//        }
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
        String lieux = request.getParameter("idLieuEquipe");

        String date = (String) request.getParameter("datePartie");

<<<<<<< HEAD
        LocalDate localDate = null;
        ////if (date != null) {

            //localDate = LocalDate.parse(date, formatter);
        //}

        LocalTime time = null;
=======
//        LocalDate localDate = null;
//        if (date != null) {
//
//            localDate = LocalDate.parse(date, formatter);
//        }
//        LocalTime time = null;
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
        String heure = (String) request.getParameter("heurePartie");
//        if (heure != null) {
//
//            time = LocalTime.parse(heure);
//        }
//        if (date != null && heure != null) {
//
//            System.out.println("info form = " + equipeChoisi + "," + equipeAdvers + "," + localDate.toString() + "," + time.toString());
//        }

        request.getSession().setAttribute("listeSesequipes", listeSesequipes);
        request.getSession().setAttribute("listeEquipesParties", listeEquipes);

        Equipe equipeC = new Equipe();
        Equipe equipeAd = new Equipe();

        equipeC = EquipesServices.trouverEquipe(equipeChoisi);
        equipeAd = EquipesServices.trouverEquipe(equipeAdvers);
        

        if (equipeC != null) {

            System.out.println("nom equipe choisi = " + equipeC.getNomEquipe());
            System.out.println("sport = " + equipeC.getSport().getNom());
        }
        if (equipeAd != null) {

            System.out.println("nom equipe adversaire = " + equipeAd.getNomEquipe());
        }

        //un lieu provisoire
        LieuSport lieu = new LieuSport();

        Partie partie = new Partie();
<<<<<<< HEAD
        
        partie.setDatePartie(localDate);
        
=======

        partie.setDatePartie(date);
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
        partie.setEquipe1(equipeC);
        partie.setEquipe2(equipeAd);
        partie.setHeurePArtie(heure);
        partie.setLeLieu(lieux);

        if (equipeC!=null) {

            PartiesServices.creerPartie(partie);
        }
        
        List<Partie> lesParties = new LinkedList<Partie>();
        lesParties = PartiesServices.toutesLesParties();
        
        System.out.println("nombre de partie = "+lesParties.size());
        
<<<<<<< HEAD
        PartiesDAO dao = new PartiesDAO();
        
      //System.out.println("Creation de partie:=== "+dao.create(partie));
       // PartiesServices.creerPartie(partie);
=======
        request.getSession().setAttribute("lesParties", lesParties);
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
        
        

        request.getSession().setAttribute("viewConf", "parties");
        return "portail";
    }

}
