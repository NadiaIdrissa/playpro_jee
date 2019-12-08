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
import com.playpro.services.SportServices;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */

    public class InvitationAction extends AbstractAction{

    @Override
    public String execute() {  
        
        Membre mSession =  (Membre)request.getSession().getAttribute("membre");
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
        
        boolean succes = InvitationServices.creerInvitation(uneInvitation); 

            if (succes) {
                message = "Une invitation a été envoyée à " + destinataire.getPseudo();
                laClasse = "success";
            } else {
                message = "Votre invitation n'est pas envoyée";
                List<Invitation> lstInv = InvitationServices.lesinvitationspour(destinataire);
                for (Invitation invitation : lstInv) {
                    System.out.println("EGALITEEEEEEEEEEEEEEeEEEE"+(invitation.equals(uneInvitation)));
                    System.out.println(invitation);
                    System.out.println(uneInvitation);
                }
                if (lstInv.contains(uneInvitation)){
                    message = "Une invitation est déjà en attente pour "+destinataire.getPseudo()+" pour l'équipe "+equipe.getNomEquipe();
                }
                laClasse = "danger";
            }

            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
        
        List<Sport> slisteSports = SportServices.tousLesSports();

        System.out.println("liste de sport existante");

        request.getSession().setAttribute("slisteSports", slisteSports);

        List<Equipe> listeequipes = new LinkedList<Equipe>();

        ParticipationDAO pdao = new ParticipationDAO();
        List<Participation> participation = pdao.findAll();

        EquipesDAO edao = new EquipesDAO();
        listeequipes = edao.findAll();
        System.out.println("=======================" + participation.size() + " size");

        for (Equipe e : listeequipes) {
            for (Participation p : participation) {
                if (e.getNomEquipe().equals(p.getEquipe().getNomEquipe())) {
                    e.getMembresEquipe().add(p.getMembre());
                }
            }
            if (equipe.getMembresEquipe().size() > 0) {
                System.out.println("========" + equipe.getNomEquipe() + " a plus que 1 membre");
            } else {
                System.out.println("========" + equipe.getNomEquipe() + " a moins que 1 membre");

            }
            System.out.println("=======================" + equipe.getMembresEquipe().size() + " size");
        }

        request.setAttribute("listeEquipe", listeequipes);

        List<Membre> listeDesMembres = new LinkedList<Membre>();
        listeDesMembres = MembreServices.tousLesMembre();

        for (int j = 0; j < listeDesMembres.size(); j++) {
            System.out.println(listeDesMembres.get(j).getNom());
        }

        request.getSession().setAttribute("listeDesMembres", listeDesMembres);
        request.getSession().setAttribute("viewConf", "loadEquipe");
        return "portail";
    }
    
}

