/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Invitation;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class InvitationDAO extends DAO<Invitation> {

    @Override
    public boolean create(Invitation x) {
        
        System.out.println("je suis dans dao invitation");
        String req = "INSERT INTO invitation (`id_invitation` , `id_expediteur`, `id_destinataire`, `id_requete`) "
                + "VALUES (?,?,?,?)";

        PreparedStatement stm = null;


        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getId_invitation());
            stm.setString(2, x.getId_expediteur());
            stm.setString(3, x.getId_destinataire());
            stm.setString(4, x.getId_requete());

            int n = stm.executeUpdate();
            System.out.println("========================================");
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

    @Override
    public Invitation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Invitation findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Invitation> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateStatus(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
