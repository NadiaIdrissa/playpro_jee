/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.SportDAO;
import com.playpro.entities.Sport;

/**
 *
 * @author toute
 */
public class SportServices {
    private static SportDAO dao = new SportDAO();
    public static boolean creerSport(Sport s){
       
        return  dao.create(s);
    }
    
    public static Sport trouverUnSport(String s){
        return dao.findById(s);
    }
    
    public static boolean supprimer(Sport s){
        return dao.delete(s);
    }
    
}
