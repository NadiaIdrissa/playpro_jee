/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.ParticipationDAO;
import com.playpro.entities.Membre;
import com.playpro.entities.Participation;
import java.util.List;

/**
 *
 * @author toute
 */
public class ParticipationServices {
    private static ParticipationDAO dao = new ParticipationDAO();
    
    public static boolean creerParticipation(Participation p){
        return  dao.create(p);
    }
    
    public static List<Participation> lesParticipationPour(Membre u) {
        //return dao.findAllById(u.getId());
        return null;
    }
    public static List<Participation> toutesLesParticipation() {
        return dao.findAll();
    }

}
