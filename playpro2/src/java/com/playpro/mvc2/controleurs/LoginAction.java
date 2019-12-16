/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.daos.SportDAO;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import com.playpro.entities.Sport;
import com.playpro.services.InvitationServices;
import com.playpro.services.MembreServices;
import java.util.LinkedList;
import java.util.List;

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
                request.setAttribute("message", "Echec de la connexion. Il semble que vous ne soyiez pas membre de PlayPro");
                request.setAttribute("laClasse", "danger");
                return "login";

            } else {
                if (membre.getMpd().equals(mdp)) {
                    request.setAttribute("message", "Email ou/et mot de passe invalides");
                    request.setAttribute("laClasse", "danger");
                    return "login";
                } else {
                    if (membre.getStatus().equals("NotActif")) {
                        dao.UpdateStatus(membre);
                    }

                    List<String> listeq = new LinkedList<String>();

                    SportDAO sports = new SportDAO();
                    List<Sport> s = new LinkedList<Sport>();
                    s = sports.findAll();

                    System.out.println("liste de sport existante");
                    for (int j = 0; j < s.size(); j++) {
                        System.out.println(j + s.get(j).getNom());
                        listeq.add(s.get(j).getNom());
                    }  
                    
                    request.getSession().setAttribute("listeTousSports", s);
                    request.getSession().setAttribute("sportString", listeq);

                    request.getSession(true);
                    request.getSession().setAttribute("connected", true);
                    request.getSession().setAttribute("membre", membre);
                    request.getSession().setAttribute("nomMembre", membre.getNom());

                    List<Invitation> listeInvitations;
                    listeInvitations = InvitationServices.lesinvitationspour(membre);

                    System.out.println("nombre invitations = " + listeInvitations.size());

                    request.getSession().setAttribute("NbInvitations", listeInvitations.size());
                    request.getSession().setAttribute("listeInvitations", listeInvitations);
                }
            }
        }
        request.getSession().setAttribute("viewConf", "");
        return "portail";
    }

}
