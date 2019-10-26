/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.utils.PasswordHash;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toute
 */
public class MembreServices {
    private static MembreDAO dao;
    public static boolean creerMembre(Membre m){
        dao = new MembreDAO();
       
        boolean reussi = dao.create(m);
        
        return reussi;
    }
    
    public static Membre seConnecter(String email,  String mdp){
        Membre m; 
        dao = new MembreDAO();
        
        
        m = dao.findById(email);
        if(m != null){
            try {
                System.out.println("Mot de passe lu: "+m.getMpd());
                if(!PasswordHash.validatePassword(mdp, m.getMpd())){
                    
                    m.setMpd(mdp);
                    
                }
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(MembreServices.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(MembreServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
        }
        
        
        return m;
    }
}
