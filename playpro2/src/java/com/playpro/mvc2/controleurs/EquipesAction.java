/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
import com.playpro.services.EquipesServices;

/**
 *
 * @author younes-dilali
 */
public class EquipesAction extends AbstractAction {

    @Override
    public String execute() {
        
        Membre membre = (Membre) request.getAttribute("membre");
        
        Equipe team = new Equipe();
        
        team.setCapitaine(membre);
        team.setNomEquipe("Les lions");
        team.setSport("Soccer");
        team.setNbJoueurs(5);
        team.setNbMaxJoueurs(15);
        
        EquipesServices.creerEquipe(team);
        
        System.out.println("equipe name = "+ team.getNomEquipe());
        
        
        
        
        
        
        return "equipes";
    }
    
    
    
}
