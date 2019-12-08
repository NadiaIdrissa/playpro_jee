/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.daos.InvitationDAO;
import com.playpro.daos.ParticipationDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import com.playpro.entities.Participation;
import com.playpro.services.EquipesServices;
import com.playpro.services.InvitationServices;
import com.playpro.services.MembreServices;
import com.playpro.services.ParticipationServices;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class ReponseInvitationAction extends AbstractAction {

    @Override
    public String execute() {
        Membre mSession = (Membre) request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expiré, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }

        //traitement de la réponse
        String idExp = (String) request.getParameter("idExp");
        String nomEquipe = (String) request.getParameter("nomEquipe");
        String statutInvitation = (String) request.getParameter("statutInvitation");

        System.out.println(idExp);
        System.out.println(nomEquipe);
        System.out.println(statutInvitation);
        System.out.println("==================================================");

        if (nomEquipe != null && statutInvitation.equals("accept")) {
            Equipe equipe = EquipesServices.trouverEquipe(nomEquipe);
            Participation partic = new Participation();
            partic.setEquipe(equipe);
            partic.setMembre(mSession);
            Membre exp = MembreServices.trouverMembre(idExp);
            String message = "";
            String laClasse = "";
            System.out.println("ca va");

            List<Participation> toutesLesParticipations = ParticipationServices.toutesLesParticipation();

            for (Participation p : toutesLesParticipations) {
                System.out.println("---------------" + p);
            }
            System.out.println(toutesLesParticipations.contains(partic));

            if (toutesLesParticipations.contains(partic)) {
                message = "Vous êtes déja membre de l'équipe " + equipe.getNomEquipe();
                laClasse = "danger";
            } else {
                boolean reussi = ParticipationServices.creerParticipation(partic);
                if (reussi) {
                    System.out.println("Participation créée");
                    message = "Vous faites desormais partie de l'équipe " + equipe.getNomEquipe();
                    laClasse = "success";
                }

            }
            Invitation i = new Invitation();
            i.setExpediteur(exp);
            i.setDestinataire(mSession);
            i.setEquipe(equipe);

            boolean reussi = InvitationServices.supprimer(i);
            if (reussi) {
                System.out.println("Invitation supprimee============================");
            }
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);

        }

        List<Invitation> listeInvitations;
        listeInvitations = InvitationServices.lesinvitationspour(mSession);

        System.out.println("nombre invitations = " + listeInvitations.size());

        request.getSession().setAttribute("NbInvitations", listeInvitations.size());
        request.getSession().setAttribute("listeInvitations", listeInvitations);
        return "portail";
    }

}
