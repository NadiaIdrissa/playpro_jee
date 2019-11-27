/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.InvitationDAO;
import com.playpro.entities.Invitation;
import com.playpro.entities.Membre;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class InvitationServices {
    private static InvitationDAO dao;
    public static boolean creerInvitation(Invitation i){
        
        dao = new InvitationDAO();
        return  dao.create(i);
    }
    
    public static List<Invitation> lesinvitationspour(Membre u) {
        dao = new InvitationDAO();
        List<Invitation> liste = new LinkedList<Invitation>();
        liste = dao.findAllById(u.getId());

        return liste;
    }
}
