/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.LieuSport;
import com.playpro.entities.Lieux;
import com.playpro.entities.Sport;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author toute
 */
public class LieuSportDAO extends DAO<LieuSport> {
    private SportDAO sportdao = new SportDAO();
    private LieuxDAO lieudao = new LieuxDAO();
    @Override
    public boolean create(LieuSport x) {
        String req = "INSERT INTO lieuSport (`id_lieu` , `id_sport`) "
                + "VALUES (?,?)";
        //System.out.println("REQUETE "+req);
        PreparedStatement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getLieu().getId_lieu());
            stm.setString(2, x.getSport().getId_sport());

            int n = stm.executeUpdate();
            System.out.println("LIEUSPORT CREE");
            System.out.println("========================================");
            if (n > 0) {
                stm.close();
                return true;
            }
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
    public LieuSport findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LieuSport findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(LieuSport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(LieuSport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LieuSport> findAll() {
        List<LieuSport> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM lieusport");
            while (r.next()) {
                System.out.println("Lecture sport :" + r.toString());
                Lieux l = new Lieux();
                Sport s = new Sport();

                LieuSport ls = new LieuSport();
                
                s = sportdao.findById(r.getString("id_sport"));
                l = lieudao.findById(r.getString("id_lieu"));
                
                ls.setLieu(l);
                ls.setSport(s);

                liste.add(ls);
                System.out.println(liste.size());
                System.out.println("--------Fini--------------");
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(LieuSport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
