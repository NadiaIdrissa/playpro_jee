/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.SportLieuDAO;
import com.playpro.entities.LieuSport;

/**
 *
 * @author toute
 */
public class LieuSportService {
    private static SportLieuDAO dao;
    public static boolean creerLieuSport(LieuSport s){
        
        dao = new SportLieuDAO();
        return  dao.create(s);
    }
}
