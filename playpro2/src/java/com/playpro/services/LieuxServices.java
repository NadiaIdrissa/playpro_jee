/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.LieuSportDAO;
import com.playpro.daos.LieuxDAO;
import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Sport;
import java.util.List;

/**
 *
 * @author nadym
 */
public class LieuxServices {
    private static LieuxDAO dao = new LieuxDAO();
    private static LieuSportDAO lsdao = new LieuSportDAO();
    public static boolean creerLieux(Lieux s){
        
        dao = new LieuxDAO();
        return  dao.create(s);
    }
    
    
    public static List<Lieux> tousLesLieux(){
        return dao.findAll();
    }
    
    public static Lieux trouverUnLieu(String s) {
        return dao.findById(s);
    }

    public static boolean supprimer(Lieux l) {
        LieuSport ls = new LieuSport();
        Sport s = new Sport();
        s.setId_sport("");
        ls.setSport(s);
        ls.setLieu(l);

        int i = lsdao.findAllById(ls).size();

        if (i == 0) {
            return dao.delete(l);

        }else{
            return false;
        }
    }
    
    
}
