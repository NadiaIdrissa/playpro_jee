/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Participation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salpy
 */
public class ParticipationDAO extends DAO<Participation>{
  
    public ParticipationDAO() {
        super();
    }    

    @Override
    public boolean create(Participation x) {
       String req = "INSERT INTO participationequipe (`id_joueur`, `id_equipe`) VALUES (?,?)";
       
       PreparedStatement paramStm = null;
       try {
            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getIdMembre());
            paramStm.setString(2, x.getNomEquipe());
            
            
            int nbLignesAffectees= paramStm.executeUpdate();
            System.out.println("Je suis dans le create de ParticipationDAO");
            System.out.println(nbLignesAffectees);
            if (nbLignesAffectees>0){
                paramStm.close();
                return true;
            }
            
            return false;
       }    
       catch (SQLException exp){
       }
       finally {
            try {
                if (paramStm!=null)
                    paramStm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    } 

    public Participation read(int id) {
        try {
            return this.read(id);
        }
        catch (NumberFormatException e){
            return null;
        }
    }

    
    public Participation read(String id) {
        String req = "SELECT * FROM participationEquipe WHERE 'id_equipe'= ?";
        
        PreparedStatement paramStm = null;
        try {

            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation participe = new Participation();
                participe.setIdMembre(resultat.getString("id_joueur"));
                participe.setNomEquipe(resultat.getString("id_equipe"));
                
                
                resultat.close();
                paramStm.close();
                return participe;
            }

            resultat.close();
            paramStm.close();
            return null;

        }
        catch (SQLException exp) {
        }
        finally {
            try{
                if (paramStm!=null)
                    paramStm.close();
            }
            catch (SQLException exp) {
            }
             catch (Exception e) {
            }
        }

        return null;
    }

    @Override
    public boolean update(Participation x) {
        return false;
    }

    @Override
    public boolean delete(Participation x) {
        String req = "DELETE FROM participationequipe WHERE `id_equipe` = ? AND `id_joueur` = ?";

        PreparedStatement paramStm = null;
        try {

            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getNomEquipe());
            paramStm.setString(2, x.getIdMembre());

            int nbLignesAffectees= paramStm.executeUpdate();

            if (nbLignesAffectees>0) {
                paramStm.close();
                return true;
            }

            return false;
        }
        catch (SQLException exp) {
        }
        finally {
            try {
                if (paramStm!=null)
                    paramStm.close();
            } catch (SQLException ex) {
                Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }

    @Override
    public List<Participation> findAll() {
        List<Participation> liste = new LinkedList<Participation>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM participationEquipe");
            while (r.next()) {
                Participation participe = new Participation();
                participe.setIdMembre(r.getString("id_joueur"));
                participe.setNomEquipe(r.getString("id_equipe"));
                liste.add(participe);
            }
//            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, exp);
        }        
        return liste;
    }
    
    public Participation findByNomEquipe(String id) {
        String req = "SELECT * FROM participationequipe WHERE `id_equipe` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation participe = new Participation();
                participe.setIdMembre(resultat.getString("id_joueur"));
                participe.setNomEquipe(resultat.getString("id_equipe"));
                
                resultat.close();
                paramStm.close();
                return participe;
            }

            resultat.close();
            paramStm.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Participation findByNomEquipeIdMembre(String nomEquipe, String idMembre) {
        String req = "SELECT * FROM participationequipe WHERE `id_equipe` = ? AND `id_joueur` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, nomEquipe);
            paramStm.setString(2, idMembre);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation participe = new Participation();
                participe.setIdMembre(resultat.getString("id_joueur"));
                participe.setNomEquipe(resultat.getString("id_equipe"));
                resultat.close();
                paramStm.close();
                return participe;
            }

            resultat.close();
            paramStm.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<Participation> findByIdMembre(String id) {
        String req = "SELECT * FROM participationequipe WHERE `id_joueur` = ?";
        List<Participation> liste = new ArrayList<>();
        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            while (resultat.next()){

                Participation participe = new Participation();
                participe.setNomEquipe(resultat.getString("id_equipe"));
                participe.setIdMembre(resultat.getString("id_joueur"));
                
                
                liste.add(participe);
            }
            Collections.reverse(liste);
            resultat.close();
            paramStm.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }
    
    
    @Override
    public Participation findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Participation findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateStatus(Participation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
