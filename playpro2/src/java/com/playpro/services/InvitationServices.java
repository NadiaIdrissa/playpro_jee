/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.InvitationDAO;
import com.playpro.entities.Invitation;

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
}
