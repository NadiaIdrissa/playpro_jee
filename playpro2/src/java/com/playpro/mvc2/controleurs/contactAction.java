/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Annonce;
import com.playpro.entities.Lieux;
import com.playpro.entities.Membre;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.AnnoncesServices;
import com.playpro.services.LieuxServices;
import java.sql.Timestamp;
import java.util.List;
import com.google.gson.Gson;
import com.playpro.daos.CommentaireDao;
import com.playpro.entities.Commentaire;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toute
 */
public class contactAction extends AbstractAction implements AjaxAction {

    @Override
    public String execute() {
//        Membre mSession = (Membre) request.getSession().getAttribute("membre");
//        if ((mSession == null)) {
//            String message = "Votre session a expirée, veuillez vous réauthentifier";
//            String laClasse = "danger";
//            request.setAttribute("message", message);
//            request.setAttribute("laClasse", laClasse);
//            return "login";
//        }
//        
//        CommentaireDao dao = new CommentaireDao();
//        List<Commentaire> lst = dao.findAll();
//
//        request.getSession().setAttribute("viewConf", "sports");
//        request.setAttribute("listeComm",lst);
//        System.out.println("Je suis dans contactAction");
//        return "portail";
        System.out.println("Je suis perdu la");
        return "index";
    }

}
