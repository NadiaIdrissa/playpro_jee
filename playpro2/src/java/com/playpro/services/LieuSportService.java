/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.LieuSportDAO;
import com.playpro.entities.LieuSport;
import com.playpro.daos.LieuSportDAO;
import java.util.List;

/**
 *
 * @author toute
 */
public class LieuSportService {
    private static LieuSportDAO dao = new LieuSportDAO();
    public static boolean creerLieuSport(LieuSport s){
        
        
        return  dao.create(s);
    }
    
    public static boolean supprimer(LieuSport x){
        return dao.delete(x);
    }
    
    public static List<LieuSport> lesLieuxSports(LieuSport nom){
        return dao.findAllById(nom);
        
    }
           
}
