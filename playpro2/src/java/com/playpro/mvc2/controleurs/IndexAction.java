/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.mvc2.controleurs.AbstractAction;

/**
 *
 * @author nadym
 */
public class IndexAction extends AbstractAction {

    @Override
    public String execute() {
        return "index";
    }
    
}
