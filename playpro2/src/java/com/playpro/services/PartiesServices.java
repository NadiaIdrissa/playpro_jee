/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.PartiesDAO;
import com.playpro.entities.Partie;

/**
 *
 * @author younes-dilali
 */
public class PartiesServices {
    
    private static PartiesDAO dao = new PartiesDAO();

    public static boolean creerPartie(Partie e) {
        return dao.create(e);

    }
    
}
