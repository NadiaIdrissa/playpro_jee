/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
import com.playpro.entities.Equipe;
import com.playpro.services.EquipesServices;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class EquipesAction extends AbstractAction {

    @Override
    public String execute() {
        
//        Membre mem = (Membre) request.getAttribute("membre");
        
//        Equipe team = new Equipe();
//        
//        team.setCapitaine(membre);
//        team.setNomEquipe("Les lions");
//        team.setSport("Soccer");
//        team.setNbJoueurs(5);
//        team.setNbMaxJoueurs(15);
//        
//        EquipesServices.creerEquipe(team);
//        
//        System.out.println("equipe name = "+ team.getNomEquipe());
        
        EquipesDAO dao = new EquipesDAO();
        
        List<Equipe> listeequipes = new LinkedList<Equipe>();
        
        
//        Equipe a = new Equipe();
        
        listeequipes = dao.findAll();
        
//        listeequipes.add(a);
       
        request.setAttribute("listeEquipe", listeequipes);
        request.getSession().setAttribute("viewConf","loadEquipe");
        return "portail";
    }
    
    
    
}
