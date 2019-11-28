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
import com.playpro.entities.Participation;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class ReponseInvitationAction extends AbstractAction{

    @Override
    public String execute() {
        
        //traitement de la réponse
        
        String reponse = (String)request.getParameter("reponseI");
        String expediteur = (String)request.getParameter("exped");
        String equipeChoisi = (String) request.getParameter("nomEquipeChoisie");
        
        
        //nom de la personne connectée
        String moi = (String)request.getSession().getAttribute("nomMembre");
        
        System.out.println("reponse = "+reponse);
        System.out.println("equipe choisie = "+equipeChoisi);
        
        List<Invitation> toutes = new LinkedList<Invitation>();
        
        toutes = (List<Invitation>)request.getSession().getAttribute("listeInvitations");
        
        
        Invitation encours = new Invitation();
        InvitationDAO idao = new InvitationDAO();
        
        for(int i =0;i<toutes.size();i++){
            if ((toutes.get(i).getId_expediteur().equals(expediteur)) && (toutes.get(i).getId_requete().equals(equipeChoisi)) ){
                encours = toutes.get(i);
            }
        }
        
        System.out.println(" invitation = "+encours.getId_requete());
        
        if (reponse.equals("refus")){
            idao.delete(encours);
        }
        
        else if (reponse.equals("accept")){
            
            ParticipationDAO partDao = new ParticipationDAO();
            Participation participe = new Participation();

            participe.setIdMembre(moi);
            participe.setNomEquipe(equipeChoisi);
            
            
            
            System.out.println("particpant "+participe.getIdMembre());
            System.out.println("participant dans "+participe.getNomEquipe());
            
            partDao.create(participe);
            idao.delete(encours);

           

            
            
        }
        
        
//        if (reponse.equals("accept")) {
//
//            ParticipationDAO partDao = new ParticipationDAO();
//            Participation participe = new Participation();
//
//            EquipesDAO edao = new EquipesDAO();
//            Equipe equipe = new Equipe();
//
//            equipe = edao.findById(idProjetcours);
//
//            participe.setParticipant(ux);
//            participe.setProjet(prjt);
//
//            if(ParticipationService.creerParticipation(participe)){
//                message = "Vous avez été ajouté à ce projet";
//            }
//
//            System.out.println("participation créée personne = " + participe.getParticipant().getNom_prenom());
//            System.out.println("participation créée projet = " + participe.getProjet().getNom());
//            
//            
//            System.out.println("retour fonction chercher invitation encours = "+encours.toString());
//            
//            uneInvitation.delete(encours);
//            
//
//            request.setAttribute("reponseInvit", "acceptée !");
//
//        }
//else if (reponse.equals("refuser")) {
//
//
//            for (int i = 0; i < invitList.size(); i++) {
//                if (invitList.get(i).getIdProjet().getId().equals(idProjetcours)) {
//
//                    encours = invitList.get(i);
//
//                    uneInvitation.delete(encours);
//
//                    System.out.println(invitList.get(i).getIdProjet().getId());
//
//                    request.setAttribute("reponseInvit", "refusée !");
//
//                }
//            }
//
//
//        }
        
        
        
        
        
        
        
        
        
        
        
        request.getSession().setAttribute("message", "L'invitation est "+reponse);
        
        
        
        
        
        
        
        request.getSession().setAttribute("viewConf","reponseInvitation");
        
        return "portail";
    }
    
    
    
}
