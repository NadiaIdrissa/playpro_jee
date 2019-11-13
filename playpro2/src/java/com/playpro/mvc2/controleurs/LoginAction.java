/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.services.MembreServices;

/**
 *
 * @author toute
 */
public class LoginAction extends AbstractAction {

    @Override
    public String execute() {
        Membre membre = new Membre();
        MembreDAO dao = new MembreDAO();
        String email = (String) request.getParameter("email");
        String mdp = (String) request.getParameter("mdp");

        System.out.println("E-mail:" + email);
        System.out.println("MDP ::" + mdp);

        if (email == null || mdp == null) {
            request.getSession().setAttribute("connected", false);
            return "login";
        } else {

            membre = MembreServices.seConnecter(email, mdp);
            if (membre == null) {
                System.out.println("Infos inexistantes");
                request.setAttribute("authentification", "email invalide");
                return "login";

            } else {
                if (membre.getMpd().equals(mdp)) {
                    request.setAttribute("authentification", "mot de passe invalide");
                    return "login";
                } else {
                    if (membre.getStatus().equals("NotActif")){
                        dao.UpdateStatus(membre);
                    }
                    request.getSession(true);
                    request.getSession().setAttribute("connected", true);
                    request.getSession().setAttribute("membre", membre);

                    request.getSession().setAttribute("nomMembre", membre.getNom());
                    

                }
            }
        }
        request.getSession().setAttribute("viewConf","");
        return "portail";
    }

}
