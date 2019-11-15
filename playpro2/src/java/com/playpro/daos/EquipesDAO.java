/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
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
                + x.getNbJoueurs() + "','" + x.getNbMaxJoueurs() + "','" + x.getNbMaxJoueurs()+ "')";

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
        
         List<Equipe> liste = new LinkedList<>();
         
         System.out.println("je suis dans findAll de equipeDAO");
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM equipe");
            while (r.next()) {
                System.out.println("Lecture equipe :" + r.toString());
                Equipe team = new Equipe();
                team.setNomEquipe(r.getString("nom_equipe"));
                team.setid_capitaine(r.getString("id_capitaine"));
                team.setSport(r.getString("nom_sport"));
                team.setNbPartiesJouees(r.getString("nb_parties_jouees"));
                team.setNbJoueurs(r.getString("nb_joueurs"));
                team.setNbMaxJoueurs(r.getString("nb_max_joueurs"));
                

                liste.add(team);
                System.out.println(liste.size());
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
             exp.printStackTrace();
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(Equipe x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
