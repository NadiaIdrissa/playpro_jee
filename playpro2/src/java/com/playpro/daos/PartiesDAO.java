/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Partie;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class PartiesDAO extends DAO<Partie>{

    @Override
    public boolean create(Partie x) {
        
//        System.out.println("je suis dans partiedao");
//
//        System.out.println(" partie a creer = " + x.toString());
//
//        
//        String req = "INSERT INTO partie (`date_partie` , `heure_partie` , `sport`, `equipe_1`, `equipe_2`, `lieu_partie`, `score`) "
//                + "VALUES (?,?,?,?,?,?,?)";
//        
//         PreparedStatement stm = null;
//         
//          try {
//            stm = cnx.prepareStatement(req);
//            stm.setString(1, x.getDatePartie().toString());
//            stm.setString(2, x.getHeurePArtie().toString());
//            stm.setString(3, x.getLieuSportPartie().getSport().getId_sport());
//            stm.setString(4, x.getEquipe1().getNomEquipe());
//            stm.setString(5, x.getEquipe2().getNomEquipe());
//            stm.setString(6, x.getLieuSportPartie().getLieu().getId_lieu());
//            stm.setString(7, x.getImage());
//            
//            int n = stm.executeUpdate();
//            if(n>0) return true;
//            System.out.println("========================================");
//        } catch (SQLException exp) {
//            exp.printStackTrace();
//        } finally {
//            if (stm != null) {
//                try {
//                    stm.close();
//                } catch (SQLException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
        return false;
    }

    @Override
    public Partie findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Partie findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Partie x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Partie x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Partie> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateStatus(Partie x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
