/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.daos.MembreDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import com.playpro.services.InvitationServices;

/**
 *
 * @author younes-dilali
 */

    public class InvitationAction extends AbstractAction{

    @Override
    public String execute() {  
        
        String nomMembre = (String) request.getParameter("nomMembreChoisi");
        MembreDAO mdao = new MembreDAO();
        Membre destinataire = new Membre();
        destinataire=mdao.findById(nomMembre);
        
        String nomEquipe = (String) request.getParameter("nomEquipeChoisi");
        EquipesDAO edao = new EquipesDAO();
        Equipe equipe = new Equipe();
        equipe=edao.findById(nomEquipe);
        
        Membre expediteur = (Membre) request.getSession().getAttribute("membre");
        
        System.out.println("nom invité "+destinataire.getNom());       
        System.out.println("nom expediteur = "+expediteur.getNom());
        
        Invitation uneInvitation = new Invitation(expediteur.getId(),destinataire.getId(),equipe.getNomEquipe());
        
        System.out.println("uneInvitation expediteur = "+expediteur);
        System.out.println("uneInvitation destina = "+destinataire);
        System.out.println("uneInvitation reuqte = "+equipe);
        
//        uneInvitation.setId_expediteur(expediteur.getId());
//        uneInvitation.setId_destinataire(destinataire.getId());
//        uneInvitation.setId_requete(equipe.getNomEquipe());
        
        InvitationServices.creerInvitation(uneInvitation);
        
        request.getSession().setAttribute("viewConf","invitation");
        return "portail";
    }
    
}

