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
    private static InvitationDAO dao = new InvitationDAO();
    
    public static boolean creerInvitation(Invitation i){
        return  dao.create(i);
    }
    
    public static List<Invitation> lesinvitationspour(Membre u) {
        return dao.findAllById(u.getId());
    }
}
