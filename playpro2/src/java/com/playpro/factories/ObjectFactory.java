/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.factories;

import com.playpro.entities.Membre;
import com.playpro.entities.Joueur;
import com.playpro.entities.Entraineur;
import java.util.UUID;

/**
 *
 * @author toute
 */
public class ObjectFactory {
    public static Membre getNewMembre() {
        Membre objet = new Membre();
        
        
        objet.setId(UUID.randomUUID().toString());
        return objet;
    }
      
//    public static Tache getNewTache() {
//        Tache objet = new Tache();
//        objet.setId(UUID.randomUUID().toString());
//        return objet;
//    }    
}
