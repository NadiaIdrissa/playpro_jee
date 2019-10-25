/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Entraineur;
import com.playpro.entities.Membre;
import com.playpro.entities.Niveau;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.MembreServices;
import com.playpro.utils.Connexion;
import com.playpro.utils.PasswordHash;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toute
 */
public class CreermembreAction extends AbstractAction {

    @Override
    public String execute() {
//        Connection c = Connexion.getInstance();
        Membre membre = ObjectFactory.getNewMembre();
        
        if(request.getParameter("sport") == null){
            String niv = request.getParameter("niveau");
            membre.setNiveau(niv);
        }
        
        if(request.getParameter("niveau") == null){
            membre.setNiveau("Professionnel");
            membre.setSport(request.getParameter("sport"));
        }
        
        
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String mdp = request.getParameter("password");
        String sexe = request.getParameter("sexe");
        int annee = 1990;
        String mdpHash="";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
        
       
        
        try {
            mdpHash = PasswordHash.createHash(mdp);
            membre.setMpd(mdpHash);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(CreermembreAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeySpecException ex) {
            Logger.getLogger(CreermembreAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        membre.setNom(nom);
        membre.setPrenom(prenom);
        membre.setPseudo(pseudo);
        membre.setCourriel(email);
        membre.setSexe(sexe);
        
        
        
        

        boolean reussi = MembreServices.creerMembre(membre);

        if (reussi) {
            return "profil";
        } else {
            return "index";
        }
    }

}
