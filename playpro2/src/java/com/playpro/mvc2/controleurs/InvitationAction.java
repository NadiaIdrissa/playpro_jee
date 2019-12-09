/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.daos.MembreDAO;
import com.playpro.daos.ParticipationDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import com.playpro.entities.Participation;
import com.playpro.entities.Sport;
import com.playpro.services.EquipesServices;
import com.playpro.services.InvitationServices;
import com.playpro.services.MembreServices;
import com.playpro.services.ParticipationServices;
import com.playpro.services.SportServices;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class InvitationAction extends AbstractAction {

    @Override
    public String execute() {

        Membre mSession = (Membre) request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expirée, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }

        String message = "";
        String laClasse = "";

        String idMembreAInviter = (String) request.getParameter("membreAInviter");
        String nomEquipe = (String) request.getParameter("nomEquipeChoisi");

        Membre destinataire = MembreServices.trouverMembre(idMembreAInviter);
        Equipe equipe = EquipesServices.trouverEquipe(nomEquipe);

        Membre expediteur = (Membre) request.getSession().getAttribute("membre");

        Invitation uneInvitation = new Invitation();
        uneInvitation.setExpediteur(expediteur);
        uneInvitation.setDestinataire(destinataire);
        uneInvitation.setEquipe(equipe);

        List<Invitation> lstInv = InvitationServices.lesinvitationspour(destinataire);

        Participation p = new Participation();
        p.setMembre(destinataire);
        p.setEquipe(equipe);

        List<Participation> lstPrt = ParticipationServices.toutesLesParticipation();

        message = "Votre invitation n'est pas envoyée";
        laClasse = "danger";
        if (lstInv.contains(uneInvitation)) {
            message = "Une invitation est déjà en attente pour " + destinataire.getPseudo() + " pour l'équipe " + equipe.getNomEquipe();
        } else if (lstPrt.contains(p)) {
            message = destinataire.getPseudo() + " est déjà membre de l'équipe " + equipe.getNomEquipe();
        } else {
            boolean succes = InvitationServices.creerInvitation(uneInvitation);

            if (succes) {
                message = "Une invitation a été envoyée à " + destinataire.getPseudo();
                laClasse = "success";
            }
        }


        request.setAttribute("message", message);
        request.setAttribute("laClasse", laClasse);

        List<Sport> slisteSports = SportServices.tousLesSports();

        System.out.println("liste de sport existante");

        request.getSession().setAttribute("slisteSports", slisteSports);

        List<Equipe> listeequipes = EquipesServices.toutesLesEquipes();

        for (Equipe e : listeequipes) {
            for (Participation pa : lstPrt) {
                if (e.getNomEquipe().equals(pa.getEquipe().getNomEquipe())) {
                    e.getMembresEquipe().add(pa.getMembre());
                }
            }
        }

        request.setAttribute("listeEquipe", listeequipes);

        List<Membre> listeDesMembres = MembreServices.tousLesMembre();

        request.getSession().setAttribute("listeDesMembres", listeDesMembres);
        request.getSession().setAttribute("viewConf", "loadEquipe");
        return "portail";
    }

}
