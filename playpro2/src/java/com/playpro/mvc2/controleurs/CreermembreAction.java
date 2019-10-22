/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.utils.Connexion;
import java.sql.Connection;

/**
 *
 * @author toute
 */
public class CreermembreAction extends AbstractAction {

    @Override
    public String execute() {
//        Connection c = Connexion.getInstance();
        Membre membre = new Membre();
        MembreDAO dao = new MembreDAO();
        String pseudo = request.getParameter("pseudo");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String email = request.getParameter("email");
        String mdp = request.getParameter("password");

        membre.setPseudo(pseudo);
        membre.setNom(nom);
        membre.setPrenom(prenom);
        membre.setMpd(mdp);

        boolean reussi = dao.create(membre);

        if (reussi) {
            return "profil";
        } else {
            return "index";
        }
    }

}
