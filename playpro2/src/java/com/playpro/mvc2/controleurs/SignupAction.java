/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Entraineur;
import com.playpro.entities.Joueur;
import com.playpro.entities.Membre;
import com.playpro.entities.Niveau;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.MembreServices;
import com.playpro.utils.PasswordHash;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toute
 */
public class SignupAction extends AbstractAction {

    @Override
    public String execute() {
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String mdp = request.getParameter("password");
        String sexe = request.getParameter("sexe");
        String niv = request.getParameter("niveau");
        String sport = request.getParameter("sport");
        int annee = 1990;
        String mdpHash = "";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        for (Niveau n : Niveau.values()) {

            System.out.println(n);
        }

        if (nom == null || prenom == null || email == null || mdp == null) {

            return "signup";
        } else {
            Membre membre = ObjectFactory.getNewMembre();
            System.out.println("REQUEST SPORT : " + request.getParameter("sport"));
            membre.setTypeMembre("Joueur");

            if (!request.getParameter("sport").equals("")) {

                niv = "Professionnel";
                membre.setSport(request.getParameter("sport"));
                membre.setTypeMembre("Entraineur");
            }

            try {
                mdpHash = PasswordHash.createHash(mdp);
                membre.setMpd(mdpHash);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SignupAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(SignupAction.class.getName()).log(Level.SEVERE, null, ex);
            } 

            membre.setNom(nom);
            membre.setPrenom(prenom);
            membre.setPseudo(pseudo);
            membre.setCourriel(email);
            membre.setSexe(sexe);
            membre.setNiveau(niv);
            membre.setSport(sport);

            boolean reussi = MembreServices.creerMembre(membre);

            System.out.println("Ecriture BD: " + reussi);

            if (reussi) {
                membre= MembreServices.seConnecter(membre.getCourriel(), membre.getMpd());
                request.getSession(true);
                request.getSession().setAttribute("connected", true);
                request.getSession().setAttribute("membre", membre);
                request.getSession().setAttribute("nomMembre", membre.getNom());

                request.getSession().setAttribute("viewConf", "");
                return "portail";
            } else {
                return "index";
            }

        }
    }

}
