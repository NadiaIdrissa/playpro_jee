/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;

/**
 *
 * @author toute
 */
public class MembreServices {
    public static boolean creerMembre(Membre m){
        MembreDAO dao = new MembreDAO();
       
        boolean reussi = dao.create(m);
        
        return reussi;
    }
}
