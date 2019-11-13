/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.entities.LieuSport;
import com.playpro.daos.LieuSportDAO;

/**
 *
 * @author toute
 */
public class LieuSportService {
    private static LieuSportDAO dao;
    public static boolean creerLieuSport(LieuSport s){
        
        dao = new LieuSportDAO();
        return  dao.create(s);
    }
}
