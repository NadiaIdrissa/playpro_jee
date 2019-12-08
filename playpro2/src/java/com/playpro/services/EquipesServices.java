/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.EquipesDAO;
import com.playpro.entities.Equipe;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class EquipesServices {

    private static EquipesDAO dao = new EquipesDAO();

    public static boolean creerEquipe(Equipe e) {
        return dao.create(e);

    }
    
    public static Equipe trouverEquipe(String nom){
        return dao.findById(nom);
    }
    
    public static List<Equipe> toutesLesEquipes(){
        return dao.findAll();
    }
}
