/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Membre;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.MembreServices;
import com.playpro.utils.PasswordHash;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author toute
 */
public class MembresAction extends AbstractAction {

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
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String mdp = request.getParameter("password");
        String sexe = request.getParameter("sexe");
        String niv = request.getParameter("niveau");
        String sport = request.getParameter("sport");
        String typeMembre = request.getParameter("typeMembre");
        int annee = 1990;
        String mdpHash = "";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String message = null;

        List<Membre> liste = new LinkedList<Membre>();

        if (nom == null || prenom == null || email == null || mdp == null) {

        } else {
            Membre membre = ObjectFactory.getNewMembre();

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
            membre.setTypeMembre(typeMembre);

            boolean reussi = MembreServices.creerMembre(membre);

            System.out.println("Ecriture BD: " + reussi);
            if (reussi) {
                message = "Le membre " + membre.getPrenom() + " a été créé avec succès.";
            } else {
                message = "Le membre " + membre.getPrenom() + " n'a pas été créé.";
            }

        }
        liste = MembreServices.tousLesMembre();

        request.setAttribute("listeMembres", liste);
        request.getSession().setAttribute("viewConf", "membres");
        return "portail";
    }

}
