/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

/**
 *
 * @author toute
 */
public class AnnoncesAction extends AbstractAction {

    @Override
    public String execute() {
        String titre = (String) request.getParameter("titre");
        String message = (String) request.getParameter("message");
        String gratuit[] = request.getParameterValues("gratuit");
        String montant = (String) request.getParameter("montant");

        System.out.println("Titre" + titre);
        System.out.println("Titre" + message);
        if (titre != null) {

            for (String string : gratuit) {
                System.out.println("gratuit" + string);

            }
        }
        System.out.println("montant" + montant);

        request.getSession().setAttribute("viewConf", "annonces");
        return "portail";
    }

}
