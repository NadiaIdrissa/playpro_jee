/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.LieuxDAO;
import com.playpro.entities.Lieux;
import java.util.List;

/**
 *
 * @author nadym
 */
public class LieuxServices {
    private static LieuxDAO dao = new LieuxDAO();
    public static boolean creerLieux(Lieux s){
        
        dao = new LieuxDAO();
        return  dao.create(s);
    }
    
    
    public static List<Lieux> tousLesLieux(){
        return dao.findAll();
    }
    
    
}
