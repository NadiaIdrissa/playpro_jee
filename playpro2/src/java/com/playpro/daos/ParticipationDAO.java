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
       String req = "INSERT INTO participationequipe (`NOM_EQUIPE`, `ID_MEMBRE`) VALUES (?,?)";
       
       PreparedStatement paramStm = null;
       try {
            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getNomEquipe());
            paramStm.setString(2, x.getIdMembre());
            
            
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
        String req = "SELECT * FROM participationequipe WHERE 'NOM_EQUIPE'= ?";
        
        PreparedStatement paramStm = null;
        try {

            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation membre = new Participation();
                membre.setNomEquipe(resultat.getString("NOM_EQUIPE"));
                membre.setIdMembre(resultat.getString("ID_MEMBRE"));
                
                
                resultat.close();
                paramStm.close();
                return membre;
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
        String req = "DELETE FROM participationequipe WHERE `NOM_EQUIPE` = ? AND `ID_MEMBRE` = ?";

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
        List<Participation> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM participationequipe");
            while (r.next()) {
                Participation membre = new Participation();
                membre.setNomEquipe(r.getString("NOM_EQUIPE"));
                membre.setIdMembre(r.getString("ID_MEMBRE"));
                liste.add(membre);
            }
            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, exp);
        }        
        return liste;
    }
    
    public Participation findByNomEquipe(String id) {
        String req = "SELECT * FROM participationequipe WHERE `NOM_EQUIPE` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation membre = new Participation();
                membre.setNomEquipe(resultat.getString("NOM_EQUIPE"));
                membre.setIdMembre(resultat.getString("ID_MEMBRE"));
                
                resultat.close();
                paramStm.close();
                return membre;
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
        String req = "SELECT * FROM participationequipe WHERE `NOM_EQUIPE` = ? AND `ID_MEMBRE` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, nomEquipe);
            paramStm.setString(2, idMembre);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Participation membre = new Participation();
                membre.setNomEquipe(resultat.getString("NOM_EQUIPE"));
                membre.setIdMembre(resultat.getString("ID_MEMBRE"));
                resultat.close();
                paramStm.close();
                return membre;
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
        String req = "SELECT * FROM participationequipe WHERE `ID_MEMBRE` = ?";
        List<Participation> liste = new ArrayList<>();
        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            while (resultat.next()){

                Participation membre = new Participation();
                membre.setNomEquipe(resultat.getString("NOM_EQUIPE"));
                membre.setIdMembre(resultat.getString("ID_MEMBRE"));
                
                
                liste.add(membre);
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
