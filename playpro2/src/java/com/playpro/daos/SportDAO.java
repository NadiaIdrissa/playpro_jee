/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Entraineur;
import com.playpro.entities.Joueur;
import com.playpro.entities.Membre;
import com.playpro.entities.Sport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author toute
 */
public class SportDAO extends DAO<Sport> {

    @Override
    public boolean create(Sport x) {
        String req = "INSERT INTO `sport` (`ID_SPORT`,`NOM`,`NB_MAX`,`IMAGE`) "
                + "VALUES('" + x.getIdSport() + "','" + x.getNomSport() + "','" + x.getNbMaxJoueur() + "','" + x.getImage() + "')";

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
    public Sport findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sport findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Sport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Sport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Sport> findAll() {
        List<Sport> liste = new LinkedList<>();

        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM sport");
            while (r.next()) {
                Sport s = new Sport();

                System.out.println("Donnée: "+r.getString("ID_SPORT"));
                s.setIdSport(r.getString("ID_SPORT"));
                s.setNomSport(r.getString("NOM"));
                s.setImage(r.getString("IMAGE"));
                s.setNbMinJoueur(r.getInt("NB_MIN"));
                s.setNbMaxJoueur(r.getInt("NB_MAX"));

                liste.add(s);
                System.out.println("Sport cree");
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
        }
        return liste;
    }

}
