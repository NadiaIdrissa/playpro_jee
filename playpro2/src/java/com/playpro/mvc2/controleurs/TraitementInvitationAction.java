/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class TraitementInvitationAction extends AbstractAction{

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
        
        System.out.println("je suis dans traitementInvitation");
        
        
        List<Invitation> invit = (List<Invitation>)request.getSession().getAttribute("listeInvitations");
        
        System.out.println("affichage des id membre");
        
        for(int j=0;j<invit.size();j++){
            System.out.println(invit.get(j).getId_expediteur());
        }
        
        
        
        
        List<Invitation> nouvelList = new LinkedList<Invitation>();
        
        for (int i=0;i<invit.size();i++){
            Membre mem = new Membre();
            MembreDAO mdao = new MembreDAO();
            mem=mdao.findById(invit.get(i).getId_expediteur());
            
            System.out.println("mem"+(i+1)+"== "+mem);
            
            invit.get(i).setId_expediteur(mem.getNom());
            nouvelList.add(invit.get(i));
        }
        
        System.out.println("size nouvelList = "+nouvelList.size());
//        System.out.println("nom capitaine = "+nouvelList.get(0).getId_expediteur());
//        System.out.println("nom capitaine = "+nouvelList.get(1).getId_expediteur());
        
        request.getSession().setAttribute("nouvelList", nouvelList);
        
        
        
        
        
        
        
        
        
      
        request.getSession().setAttribute("viewConf","traitementInvitation");
        
        return "portail";
    }
    
}
