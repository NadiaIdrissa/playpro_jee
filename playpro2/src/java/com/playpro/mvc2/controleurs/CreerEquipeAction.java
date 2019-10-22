/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author salpy
 */
public class CreerEquipeAction extends AbstractAction  {
   @Override
    public String execute() {
        MembreDAO dao = new MembreDAO();
        List<Membre> liste = new LinkedList<>();
        liste = dao.findAll();
        for (Membre membre : liste) {
            System.out.println("Taaille: "+liste.size());
            System.out.println(membre.getNom());
       }
        
        return "creerequipe";
    }
    
}

    

