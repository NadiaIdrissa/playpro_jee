/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.EquipesDAO;
import com.playpro.entities.Equipe;

/**
 *
 * @author younes-dilali
 */
public class EquipesServices {

    private static EquipesDAO dao;

    public static boolean creerEquipe(Equipe e) {

        dao = new EquipesDAO();
        return dao.create(e);

    }
}
