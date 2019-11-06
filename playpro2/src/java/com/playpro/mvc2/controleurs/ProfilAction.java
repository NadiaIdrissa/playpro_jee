/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.entities.Sexe;
import com.playpro.utils.PasswordHash;

/**
 *
 * @author toute
 */
public class ProfilAction extends AbstractAction {

    @Override
    public String execute() {
        Membre membre = new Membre();
        MembreDAO dao = new MembreDAO();
        Membre mCourrant = new Membre();

        mCourrant = (Membre) request.getSession().getAttribute("membre");
        String id = mCourrant.getId();
        int naiss = mCourrant.getAnneeNaissance();
        Sexe sex=mCourrant.getSexe();
        Sexe sexi;
        // String id=${sessionScope.membre.id};
        
       
        System.out.println("actuel = "+id);
        System.out.println("actuel_naiss = "+naiss);
        

        String pseudo = (String) request.getParameter("pseudoR");
        String nom = (String) request.getParameter("nomR");
        String prenom = (String) request.getParameter("prenomR");
        String annee = (String) request.getParameter("anneeR");
        String niveau = (String) request.getParameter("niveauR");
        String sexe = (String) request.getParameter("sexeR");
        String email = (String) request.getParameter("emailR");
        String mdp = (String) request.getParameter("passwordR");
        //int anneeNa=Integer.parseInt(annee);	
        //Sexe dd=(Sexe)request.getParameter("anneeR");
        if ("Autre".equals(sexe)){
            sexi=Sexe.Autre;
        }
        else if ("Femme".equals(sexe)){
            sexi=Sexe.Femme;
        }
        
        else if ("Homme".equals(sexe)){
            sexi=Sexe.Homme;
        }
        else {
            sexi=mCourrant.getSexe();
        }
            
        
        
        
 
        System.out.println("pseudo = "+pseudo); 
        System.out.println("nom = "+nom);
        System.out.println("prenom = "+prenom);
        System.out.println("annee= "+annee);
        System.out.println("niveau = "+niveau);
        System.out.println("sexe = "+sexe);
        System.out.println("email = "+email);
        System.out.println("mdp = "+mdp);
        System.out.println("bd sex = "+sex);
        System.out.println(" var sexi = "+sexi);
        
        
        //if ("".equals(sexe.trim())){
            //sex=(Sexe)mCourrant.getSexe();
        //}
        PasswordHash mm=new PasswordHash();
        
        
        if (!(pseudo == null) && !("".equals(pseudo.trim()))
                && !(nom == null) && !("".equals(nom.trim()))
                && !(prenom == null) && !("".equals(prenom.trim()))
                && !(annee == null) && !("".equals(annee.trim()))
                && !(niveau == null) && !("".equals(niveau.trim()))
                && !(sexe == null) && !("".equals(sexe.trim()))
                && !(email == null) && !("".equals(email.trim()))
                && !(mdp == null) && !("".equals(mdp.trim()))) {
            membre.setId(id);
            membre.setNom(nom);
            membre.setPrenom(prenom);
            membre.setAnneeNaissance(0);
            membre.setCourriel(email);
            membre.setSexe(sexe);
            membre.setMpd(mdp);
            membre.setNiveau(niveau);
             //dao.update(membre);
//            UPDATE `membre` SET `prenom` = 'Viviane' WHERE `membre`.`id` = '29e405ab-2014-43e1-b01e-492d4dcc5ebd';
        }
        return "profil";
    }

}
