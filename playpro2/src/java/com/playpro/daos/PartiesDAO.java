/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import com.playpro.entities.Partie;
import com.playpro.entities.Sport;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class PartiesDAO extends DAO<Partie> {

    @Override
    public boolean create(Partie x) {

        String req = "INSERT INTO partie (`date_partie` , `heure_partie` , `sport`, `equipe_1`, `equipe_2`, `lieu_partie`, `score`) "
                + "VALUES (?,?,?,?,?,?,?)";

        PreparedStatement stm = null;
        
        
        
        
        

        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getDatePartie());
            stm.setString(2, x.getHeurePArtie());
            // stm.setString(3, x.getLieuSportPartie().getSport().getId_sport());
            stm.setString(3, x.getEquipe1().getSport().getNom());
            //stm.setString(4, x.getEquipe1().getNomEquipe());
            stm.setString(4, x.getEquipe1().getNomEquipe());
            stm.setString(5, x.getEquipe2().getNomEquipe());
            stm.setString(6, x.getLeLieu());
            // stm.setString(6, x.getLieuSportPartie().getLieu().getId_lieu());
//            stm.setString(7, x.getScore());
            stm.setString(7, "0 - 0");

            int n = stm.executeUpdate();
            if (n > 0) {
                return true;
            }
            System.out.println("========================================");
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
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
         System.out.println("je suis dans findAll de partieDAO");
        List<Partie> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM partie");
            while (r.next()) {
                
                Equipe e = new Equipe();
                Equipe d = new Equipe();
                
                e.setNomEquipe(r.getString("equipe_1"));
                
                
                Partie p = new Partie();
                p.setDatePartie(r.getString("date_partie"));
                p.setHeurePArtie(r.getString("heure_partie"));
                p.setSport(r.getString("sport"));
                
                e.setNomEquipe(r.getString("equipe_1"));
                p.setEquipe1(e);
                
                d.setNomEquipe(r.getString("equipe_2"));
                p.setEquipe2(d);
                
                
                p.setLeLieu(r.getString("lieu_partie"));
                p.setScore(r.getString("score"));

                liste.add(p);
                System.out.println(liste.size());
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(Partie x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
