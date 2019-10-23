package com.playpro.daos;

import com.playpro.entities.Entraineur;
import com.playpro.entities.Joueur;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.playpro.entities.Membre;

public class MembreDAO extends DAO<Membre> {

    public MembreDAO() {
        super();
    }

    @Override
    public boolean create(Membre x) {
        // TODO Auto-generated method stub

        String req = "INSERT INTO membre (`NUMERO` , `PRENOM` ,`NOM` , `COURRIEL` , `PSEUDO`, `MDP` ) "
                + "VALUES ('" + x.getId() + "','" + x.getPrenom() + "','" + x.getNom() + "','" + x.getCourriel() + "','" + x.getPseudo() + "','" + x.getMpd() + "')'";
        //System.out.println("REQUETE "+req);
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
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public boolean delete(Membre x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM membre WHERE numero='" + x.getId() + "'");
            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException exp) {
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
    public Membre findById(int id) {
        // TODO Auto-generated method stub
        return this.findById("" + id);
    }

    @Override
    public Membre findById(String id) {
        // TODO Auto-generated method stub
        Statement stm = null;
        ResultSet r = null;
        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM client WHERE id = '" + id + "'");
            if (r.next()) {
                Membre c = new Membre();
                c.setId(r.getString("id"));
                c.setNom(r.getString("nom"));
                c.setPrenom(r.getString("Prenom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                r.close();
                stm.close();
                return c;
            }
        } catch (SQLException exp) {
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
    public boolean update(Membre x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            String req = "UPDATE client SET NOM = '" + x.getNom() + "',"
                    + "COURRIEL = '" + x.getCourriel() + "',"
                    + "PRENNOM = '" + x.getPrenom() + "'"
                    + " WHERE id = '" + x.getId() + "'";
            //System.out.println("REQUETE "+req);
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
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public List<Membre> findAll() {
        List<Membre> liste = new LinkedList<>();
        
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM membre");
            while (r.next()) {
                Membre c = new Entraineur();
                Joueur j = new Joueur();
                Entraineur e = new Entraineur();
                System.out.println("Dennée: "+r.getString(2));
                //System.out.println("Donnée: "+r.getString("type_membre"));
                
                c.setId(r.getString("id"));
                c.setPrenom(r.getString("nom"));
                c.setNom(r.getString("nom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                c.setMpd(r.getString("mdp"));
                
                if(r.getString("type_membre").equals("joueur")){
                    j = (Joueur)c;
                    liste.add(j);
                }else if(r.getString("type_membre").equals("admin")){
                    //e = (Entraineur)c; 
                    liste.add(c);
                }else{
                    
                }
                
                //liste.add(c);

            }
                
            
            r.close();
            stm.close();
        } catch (SQLException exp) {
        }
        return liste;
    }

}
