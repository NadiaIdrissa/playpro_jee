/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;


import com.playpro.entities.Invitation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Salpy
 */
public class InvitationDAO extends DAO<Invitation>{
    
    public InvitationDAO (){
       super();
    }

    @Override
    public boolean create(Invitation x) {
        String req = "INSERT INTO invitation (`ID_EXPEDITEUR`, `ID_DESTINATAIRE`, `ID_EQUIPE`, `DATE_ENVOI`) VALUES (?,?,?,?)";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getIdExpediteur());
            paramStm.setString(2, x.getIdDestinataire());
            paramStm.setString(3, x.getIdEquipe());
            paramStm.setTimestamp(4, x.getDateEnvoi());
            
            int nbLignesAffectees= paramStm.executeUpdate();
            if (nbLignesAffectees>0){
                paramStm.close();
                return true;
            }
            
            return false;
        }    
        catch (SQLException exp){
            Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, exp);
        }
        finally {
            try {
                if (paramStm!=null)
                    paramStm.close();
            } catch (SQLException ex) {
                Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }

    
    public Invitation read(int id) {
        try {
            return this.read(id);
        }
        catch (NumberFormatException e){
            return null;
        }
    }

   
    public Invitation read(String id) {
        
        String req = "SELECT * FROM invitation WHERE 'ID_EXPEDITEUR'= ?";
        
        PreparedStatement paramStm = null;
        try {

            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){
                Invitation invite = new Invitation();
                invite.setIdExpediteur(resultat.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(resultat.getString("ID_DESTINATAIRE"));
                invite.setDate(resultat.getTimestamp("DATE_ENVOI"));
                invite.setIdEquipe(resultat.getString("ID_EQUIPE"));
                
                resultat.close();
                paramStm.close();
                return invite;
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
    public boolean update(Invitation x) {
        return false;
    }

    @Override
    public boolean delete(Invitation x) {
        String req = "DELETE FROM invitation WHERE `ID_EXPEDITEUR` = ? AND `ID_DESTINATAIRE` = ? AND `ID_EQUIPE` = ? ";
            PreparedStatement paramStm = null;
            try {

                paramStm = cnx.prepareStatement(req);
                paramStm.setString(1, x.getIdExpediteur());
                paramStm.setString(2, x.getIdDestinataire());
                paramStm.setString(3, x.getIdEquipe());

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
                    Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            return false;
    }

    @Override
    public List<Invitation> findAll() {
        List<Invitation> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM invitation");
            while (r.next()) {
                Invitation invite = new Invitation();
                invite.setIdExpediteur(r.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(r.getString("ID_DESTINATAIRE"));
                invite.setIdEquipe(r.getString("ID_EQUIPE"));
                invite.setDate(r.getTimestamp("DATE_ENVOI"));
                liste.add(invite);
            }
            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
            Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, exp);
        }        
        return liste;
    }
    
    public List<Invitation> findByIdDestinataire(String id) {
       String req = "SELECT * FROM invitation WHERE `ID_DESTINATAIRE` = ? ";
        
        List<Invitation> liste = new LinkedList<>();
        try {
            PreparedStatement stm = cnx.prepareStatement(req);
            stm.setString(1, id);
            ResultSet r = stm.executeQuery();            
            while (r.next()) {
                Invitation invite = new Invitation();
                invite.setIdExpediteur(r.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(r.getString("ID_DESTINATAIRE"));
                invite.setIdEquipe(r.getString("ID_EQUIPE"));
                invite.setDate(r.getTimestamp("DATE_ENVOI"));
                liste.add(invite);
            }
           
            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
        }
        return liste;
    }
    
       public List<Invitation> findByIdExpediteur(String id) {
       String req = "SELECT * FROM invitation WHERE `ID_EXPEDITEUR` = ? ";
        
        List<Invitation> liste = new LinkedList<>();
        try {
            PreparedStatement stm = cnx.prepareStatement(req);
            stm.setString(1, id);
            ResultSet r = stm.executeQuery();            
            while (r.next()) {
                Invitation invite = new Invitation();
                invite.setIdExpediteur(r.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(r.getString("ID_DESTINATAIRE"));
                invite.setIdEquipe(r.getString("ID_EQUIPE"));
                invite.setDate(r.getTimestamp("DATE_EQUIPE"));
                liste.add(invite);
            }
          
            Collections.reverse(liste);
            r.close();
            stm.close();
        }
        catch (SQLException exp) {
        }
        return liste;
    }
    
    public Invitation findByIdProjet(String id) {
        String req = "SELECT * FROM invitation WHERE `ID_EQUIPE` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Invitation invite = new Invitation();
                invite.setIdExpediteur(resultat.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(resultat.getString("ID_DESTINATAIRE"));
                invite.setIdEquipe(resultat.getString("ID_EQUIPE"));
                invite.setDate(resultat.getTimestamp("DATE_ENVOI"));
                resultat.close();
                paramStm.close();
                return invite;
            }

            resultat.close();
            paramStm.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Invitation findByDateEnvoi(Timestamp date) {
        String req = "SELECT * FROM invitation WHERE `DATE_ENVOI` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setTimestamp(1, date);

            ResultSet resultat = paramStm.executeQuery();

            
            if(resultat.next()){

                Invitation invite = new Invitation();
                invite.setIdExpediteur(resultat.getString("ID_EXPEDITEUR"));
                invite.setIdDestinataire(resultat.getString("ID_DESTINATAIRE"));
                invite.setIdEquipe(resultat.getString("ID_EQUIPE"));
                invite.setDate(resultat.getTimestamp("DATE_ENVOI"));
                resultat.close();
                paramStm.close();
                return invite;
            }

            resultat.close();
            paramStm.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(InvitationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
    public boolean UpdateStatus(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
