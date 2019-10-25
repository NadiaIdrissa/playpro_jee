/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;

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

        if (email == null || mdp == null) {
            request.getSession().setAttribute("connected", false);
            System.out.println("Infos inexistantes");
            return "login";
        } else {
            //membre = dao.getMembre(email);
            if (membre == null) {

            } else {
                request.getSession(true);
                request.getSession().setAttribute("connected", true);
                request.getSession().setAttribute("membre", membre);
            }
        }
        return "portail";
    }

}
