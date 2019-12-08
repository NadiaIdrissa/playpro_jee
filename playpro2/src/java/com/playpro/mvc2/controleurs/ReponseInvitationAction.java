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
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class ReponseInvitationAction extends AbstractAction{

    @Override
    public String execute() {
        Membre mSession =  (Membre)request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expiré, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }
        
        //traitement de la réponse
        
        String reponse = (String)request.getParameter("reponseI");
        String expediteur = (String)request.getParameter("exped");
        String equipeChoisi = (String) request.getParameter("nomEquipeChoisie");
        
        
        //nom de la personne connectée
        Membre moi = (Membre)request.getSession().getAttribute("membre");
        
        System.out.println("reponse = "+reponse);
        System.out.println("equipe choisie = "+equipeChoisi);
        
        List<Invitation> toutes = new LinkedList<Invitation>();
        
        toutes = (List<Invitation>)request.getSession().getAttribute("listeInvitations");
        
        
        Invitation encours = new Invitation();
        InvitationDAO idao = new InvitationDAO();
        
//        for(int i =0;i<toutes.size();i++){
//            if ((toutes.get(i).getId_expediteur().equals(expediteur)) && (toutes.get(i).getId_requete().equals(equipeChoisi)) ){
//                encours = toutes.get(i);
//            }
//        }
//        
//        System.out.println(" invitation = "+encours.getId_requete());
//        
        if (reponse.equals("refus")){
            idao.delete(encours);
        }
        
        else if (reponse.equals("accept")){
            
            ParticipationDAO partDao = new ParticipationDAO();
            Participation participe = new Participation();
            
            Equipe e = new Equipe();
            EquipesDAO edao = new EquipesDAO();
            
//            e= edao.findById(encours.getId_requete());

            participe.setMembre(moi);
            participe.setEquipe(e);
                        
            partDao.create(participe);
            idao.delete(encours);
       
            
        }
        request.getSession().setAttribute("message", "L'invitation est "+reponse);
        
        request.getSession().setAttribute("viewConf","reponseInvitation");
        
        return "portail";
    }
    
    
    
}
