/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.CommentaireDao;
import com.playpro.entities.Commentaire;
import com.playpro.utils.Connexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salpy
 */
public class CommentaireAction extends AbstractAction {
    @Override
    public String execute() {
        
        String action="?action=portail";
        String nom = (String) request.getParameter("nom");
        String courriel = (String) request.getParameter("courriel");
        String sujet = (String) request.getParameter("sujet");
        String commentaire = (String) request.getParameter("commentaire");
        
        Connection cnx = Connexion.getInstance();
        CommentaireDao c_Dao = new CommentaireDao(cnx);
        Commentaire c = new Commentaire(nom, courriel, sujet, commentaire);
        c_Dao.create(c);
        return action;
    
    }
}
    

