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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salpy
 */
public class CommentaireAction extends AbstractAction {

    @Override
    public String execute() {

        String message = "";
        String laClasse = "";
        String action = "?action=portail";
        String nom = (String) request.getParameter("nom");
        String courriel = (String) request.getParameter("courriel");
        String sujet = (String) request.getParameter("sujet");
        String commentaire = (String) request.getParameter("commentaire");

        if (nom != null) {

            CommentaireDao c_Dao = new CommentaireDao();
            Commentaire c = new Commentaire(nom, courriel, sujet, commentaire);
            if (c_Dao.create(c)) {
                message = "Votre message a été envoyé";
                laClasse = "warning";
            }

            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);

            System.out.println("Message : "+message);
            return "nousJoindre";
        } else {

            CommentaireDao dao = new CommentaireDao();
            List<Commentaire> lst = dao.findAll();

//            request.getSession().setAttribute("viewConf", "sports");
            request.setAttribute("listeComm", lst);
            System.out.println("Je suis dans contactAction");
            request.getSession().setAttribute("viewConf", "contact");
            return "portail";
        }

    }
}
