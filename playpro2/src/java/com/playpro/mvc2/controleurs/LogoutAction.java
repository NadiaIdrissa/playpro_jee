/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

/**
 *
 * @author toute
 */
public class LogoutAction extends AbstractAction{

    @Override
    public String execute() {
        
        request.getSession().invalidate();
        return "index";
    }
    
}
