/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.LieuSportDAO;
import com.playpro.daos.SportDAO;
import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Sport;

/**
 *
 * @author toute
 */
public class SportServices {

    private static SportDAO dao = new SportDAO();
    private static LieuSportDAO lsdao = new LieuSportDAO();

    public static boolean creerSport(Sport s) {

        return dao.create(s);
    }

    public static Sport trouverUnSport(String s) {
        return dao.findById(s);
    }

    public static boolean supprimer(Sport s) {
        LieuSport ls = new LieuSport();
        Lieux l = new Lieux();
        l.setId_lieu("");
        ls.setSport(s);
        ls.setLieu(l);

        int i = lsdao.findAllById(ls).size();

        if (i == 0) {
            return dao.delete(s);

        }else{
            return false;
        }
    }

}
