/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author younes-dilali
 */
public class EquipesDAO extends DAO<Equipe> {

    public EquipesDAO() {
        super();
    }

    @Override
    public boolean create(Equipe x) {
        String type = "";

        String req = "INSERT INTO `equipe` (`nom_equipe`,`id_capitaine`,`nom_sport`,`nb_parties_jouees`,`nb_joueurs`,`nb_max_joueurs`) "
                + "VALUES('" + x.getNomEquipe() + "','" + x.id_capitaine() + "','" + x.getSport() + "','" + x.getNbPartiesJouees() + "','"
                + x.getNbJoueurs() + "','" + x.getNbMaxJoueurs() + "','" + x.getNbMaxJoueurs() + "')";

        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate(req);
            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException exp) {
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException exp) {
                    // TODO Auto-generated catch block
                    exp.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public Equipe findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipe findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Equipe x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Equipe x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Equipe> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean UpdateStatus(Equipe x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
