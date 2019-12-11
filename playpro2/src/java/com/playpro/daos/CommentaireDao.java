/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Commentaire;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salpy
 */
public class CommentaireDao extends DAO<Commentaire> {
    public CommentaireDao(Connection cnx) {
        super(cnx);
    }
    public boolean create(Commentaire x) {
        
       
        String req = "INSERT INTO commentaire (`Nom`, `Courriel`, `Sujet`, `Commentaire`) "
                + "VALUES (?,?,?,?)";

        PreparedStatement stm = null;


        try {
            stm = cnx.prepareStatement(req);
            
            
            stm.setString(1, x.getNom());
            stm.setString(2, x.getCourriel());
            stm.setString(3, x.getSujet());
            stm.setString(4, x.getCommentaire());

            int n = stm.executeUpdate();
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    
    public List<Commentaire> findAll() {
        List<Commentaire> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM commentaire");
            while (r.next()) {
                Commentaire c = new Commentaire();
                c.setNom(r.getString("ID_EXPEDITEUR"));
                c.setCourriel(r.getString("ID_DESTINATAIRE"));
                c.setSujet(r.getString("ID_PROJET"));
                liste.add(c);
            }
            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
            Logger.getLogger(CommentaireDao.class.getName()).log(Level.SEVERE, null, exp);
        }        
        return liste;
    }

    @Override
    public Commentaire findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Commentaire findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Commentaire x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Commentaire x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public boolean UpdateStatus(Commentaire x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
