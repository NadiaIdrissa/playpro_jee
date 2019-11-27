/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

/**
 *
 * @author younes-dilali
 */
public class TraitementInvitationAction extends AbstractAction{

    @Override
    public String execute() {
        
        System.out.println("je suis dans traitementInvitation");
        
        
        request.getSession().setAttribute("viewConf","traitementInvitation");
        
        return "portail";
    }
    
}
