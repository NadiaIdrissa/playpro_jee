/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.entities.Niveau;
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
        Niveau niveauN=mCourrant.getNiveau();
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
      if (niveau==null ||"".equals(niveau.trim())){
          niveau=niveauN.toString();
      }
            
         
       if (sexe==null || "".equals(sexe.trim())){
           System.out.println("null ou vide");
            sexe=sex.toString();
        } 
       
       
       
       
       
        System.out.println("--------------------------------");
        System.out.println("id0 = "+id);
        System.out.println("pseudo1 = "+pseudo); 
        System.out.println("nom2 = "+nom);
        System.out.println("prenom3 = "+prenom);
        System.out.println("annee4= "+annee);
        System.out.println("niveau apres5 = "+niveau);
        System.out.println("sexe apres6 = "+sexe);
        System.out.println("email7 = "+email);
        System.out.println("mdp8 = "+mdp);
        System.out.println("--------------------------------");
        
        System.out.println("bd sex = "+sex);
     
        

        
        
        
       if (!(pseudo == null) && !("".equals(pseudo.trim()))
                && !(nom == null) && !("".equals(nom.trim()))
                && !(prenom == null) && !("".equals(prenom.trim()))
                
                
                
                && !(email == null) && !("".equals(email.trim()))
                && !(mdp == null) && !("".equals(mdp.trim()))) {
            System.out.println("------apres null---------");
            membre.setId(id);
            membre.setNom(nom);
            membre.setPseudo(pseudo);
            membre.setPrenom(prenom);
            membre.setAnneeNaissance(2001);
            membre.setCourriel(email);
            membre.setSexe(sexe);
            membre.setMpd(mdp);
            membre.setNiveau(niveau);
             System.out.println("----------affectation--------");
             System.out.println("----membre.getNom- "+membre.getNom());
             System.out.println("----membre.getCourriel- "+membre.getCourriel());
             dao.update(membre);
              System.out.println("-----dao.membre-----------"+dao.update(membre));
//            UPDATE `membre` SET `prenom` = 'Viviane' WHERE `membre`.`id` = '29e405ab-2014-43e1-b01e-492d4dcc5ebd';
        }

        return "profil";
    }

}
