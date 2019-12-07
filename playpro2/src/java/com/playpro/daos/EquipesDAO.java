/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
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
public class EquipesDAO extends DAO<Equipe> {

    public EquipesDAO() {
        super();
    }

    @Override
    public boolean create(Equipe x) {

        System.out.println("je suis dans equipdao");

        System.out.println(" equipe a creer = " + x.toString());

        
        String req = "INSERT INTO equipe (`nom_equipe` , `id_capitaine` , `id_sport`, `nb_parties_jouees`, `nb_joueurs`, `nb_max_joueurs`, `image`) "
                + "VALUES (?,?,?,?,?,?,?)";
        //System.out.println("REQUETE "+req);
        PreparedStatement stm = null;

//        Statement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getNomEquipe());
            stm.setString(2, x.getCapitaine().getId());
            stm.setString(3, x.getSport().getId_sport());
            stm.setInt(4, x.getNbPartiesJouees());
            stm.setInt(5, x.getNbJoueurs());
            stm.setInt(6, x.getSport().getNb_max());
            stm.setString(7, x.getImage());
            
            int n = stm.executeUpdate();
            if(n>0) return true;
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
    public Equipe findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Equipe findById(String id) {
                // TODO Auto-generated method stub
        Statement stm = null;
        ResultSet r = null;
      

        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM equipe INNER JOIN sport ON equipe.id_sport = sport.id_sport"
                    + " WHERE nom_equipe = '" + id + "'");
            if (r.next()) {
                Equipe e = new Equipe();
               
                e.setNomEquipe(r.getString("nom_equipe"));
                          
                Sport s = new Sport();
                s.setId_sport(r.getString("sport.id_sport"));
                s.setNom(r.getString("sport.nom"));
                s.setNb_max(r.getInt("sport.nb_max"));
                
                e.setSport(s);
                
                e.setNbPartiesJouees(r.getString("nb_parties_jouees"));
                e.setNbJoueurs(r.getInt("nb_joueurs"));
                e.setNbMaxJoueurs(r.getString("nb_max_joueurs"));
                
                e.setImage(r.getString("equipe.image"));
                               
                r.close();
                stm.close();
                return e;
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            if (r != null) {
                try {
                    r.close();
                    
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (stm != null) {
                try {
                    
                    stm.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        return null;
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
            ResultSet r = stm.executeQuery("SELECT * FROM equipe INNER JOIN membre on "
                    + " equipe.id_capitaine = membre.id INNER JOIN sport on "
                    + " equipe.id_sport = sport.id_sport");
            while (r.next()) {
                System.out.println("Lecture equipe :" + r.toString());
                Equipe team = new Equipe();
                Sport sport = new Sport();
                Membre m = new Membre();

                m.setNom(r.getString("Membre.nom"));
                m.setPrenom(r.getString("Membre.prenom"));
                m.setId(r.getString("Membre.id"));
                m.setCourriel(r.getString("Membre.courriel"));
                m.setTypeMembre(r.getString("Membre.type_membre"));
                    
                sport.setNom(r.getString("sport.nom"));
                sport.setId_sport(r.getString("sport.id_sport"));
                sport.setNb_min(r.getInt("sport.nb_min"));
                sport.setNb_max(r.getInt("sport.nb_max"));
                   
                team.setNomEquipe(r.getString("equipe.nom_equipe"));
                team.setSport(sport);
                team.setCapitaine(m);
                team.setNbPartiesJouees(r.getString("equipe.nb_parties_jouees"));
                team.setNbJoueurs(r.getInt("equipe.nb_joueurs"));
                team.setNbMaxJoueurs(r.getString("sport.nb_max"));
                team.setImage(r.getString("equipe.image"));

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

    public boolean UpdateStatus(Equipe x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
