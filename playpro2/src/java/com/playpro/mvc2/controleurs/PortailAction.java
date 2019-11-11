/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;

/**
 *
 * @author dd
 */
public class PortailAction extends AbstractAction {

    @Override
    public String execute() {
        return "portail";
    }

}
