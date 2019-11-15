/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.factories;

import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
import com.playpro.entities.Sport;
import com.playpro.entities.Lieux;
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
 
      
    public static Sport getNewSport() {
        Sport objet = new Sport();
        objet.setId_sport(UUID.randomUUID().toString());
        return objet;
    }    
    public static Lieux getNewLieu() {
    Lieux objet = new Lieux();
    objet.setId_lieu(UUID.randomUUID().toString());
    return objet;
    }    
}
