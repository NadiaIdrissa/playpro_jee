/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.services;

import com.playpro.daos.AnnonceDAO;
import com.playpro.entities.Annonce;
import java.util.List;

/**
 *
 * @author toute
 */
public class AnnoncesServices {
    private static AnnonceDAO dao = new AnnonceDAO();

    public static boolean creerAnnonce(Annonce e) {

        return dao.create(e);

    }
    
    public static List<Annonce> toutesLesAnnonces(){
        return dao.findAll();
    }
}
