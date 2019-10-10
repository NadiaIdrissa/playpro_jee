/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.utils.PasswordHash;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toute
 */
public class SignupAction extends AbstractAction {

    @Override
    public String execute() {
        String nom = (String) request.getParameter("nom");
        String prenom = (String) request.getParameter("prenom");
        String email = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");
        String confirm = (String) request.getParameter("confirm_password");
        
        if (nom == null || prenom == null || email == null || password == null 
                || confirm == null){
            System.out.println("Infos inexistantes");
            return "signup";
        }
        else{
            System.out.println("Infos OK !");
            
            //Hachage du password (classe PasswordHash)
            try {
                String mdpH = PasswordHash.createHash(password);
                boolean isMdpOk = PasswordHash.validatePassword(password, mdpH);
                
                System.out.println("Les mots de passes sont égaux : "+ isMdpOk);
                
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(SignupAction.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(SignupAction.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            return "login";
        }    
    }

}
