/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Annonce;
import com.playpro.entities.Membre;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nadym
 */
public class AnnonceDAO extends DAO<Annonce> {

    @Override
    public boolean create(Annonce x) {
        String req = "INSERT INTO annonce (`idAnnonce` , `idCreateur` , `nombreMax`, `montant`, `titre`, `gratuit`, `desciption`, `dateCreation`) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        
        PreparedStatement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getIdAnnonce());
            stm.setString(2, x.getIdCreateur());
            stm.setInt(3, x.getNombreMax());
            stm.setInt(4, x.getMontant());
            stm.setString(5, x.getTitre());
            stm.setBoolean(6, x.getGratuit());
            stm.setString(7, x.getDescription());
            stm.setDate(8, (Date) x.getDateCreation());
           

            int n = stm.executeUpdate();
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
    public Annonce findById(int id) {
        return this.findById("" + id);
    }

    @Override
    public Annonce findById(String id) {
        Statement stm = null;
        ResultSet r = null;

        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM annonce WHERE idAnnonce = '" + id + "'");

            if (r.next()) {
                Annonce c = new Annonce();

                c.setIdAnnonce(r.getString("idAnnonce"));
                c.setIdCreateur(r.getString("idCreateur"));
                c.setNombreMax(r.getInt("nombreMax"));
                c.setMontant(r.getInt("montant"));
                c.setTitre(r.getString("titre"));
                c.setGratuit(r.getBoolean("gratuit"));
                c.setDescription(r.getString("description"));
                c.setDateCreation(r.getDate("dateCreation"));
                r.close();
                stm.close();
                return c;
            }
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    r.close();
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
    public boolean update(Annonce x) {
        Statement stm = null;
        try {
            String req = "UPDATE annonce SET idCreateur = '" + x.getIdCreateur()+ "',"
                    + "nombreMax = '" + x.getNombreMax()+ "',"
                    + "montant = '" + x.getMontant()+ "',"
                    + "titre = '" + x.getTitre()+ "',"
                    + "gratuit = '" + x.getGratuit()+ "',"
                    + "description = '" + x.getDescription()+ "',"
                    + "dateCreation = '" + x.getDateCreation()+ "',"
                    + " WHERE idAnnonce = '" + x.getIdAnnonce()+ "'";
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
    public boolean delete(Annonce x) {
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM annonce WHERE idAnnonce='" + x.getIdAnnonce()+ "'");
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
    public List<Annonce> findAll() {
        List<Annonce> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM `annonce` INNER JOIN `membre`on annonce.idCreateur = MEMBRE.ID");
            while (r.next()) {
                Annonce c = new Annonce();
                Membre u = new Membre();
               
                c.setIdAnnonce(r.getString("annonce.idAnnonce"));
                c.setNombreMax(r.getInt("annonce.nombreMax"));
                c.setMontant(r.getInt("annonce.montant"));
                c.setTitre(r.getString("annonce.titre"));
                c.setGratuit(r.getBoolean("annonce.gratuit"));
                c.setDescription(r.getString("annonce.description"));
                c.setDateCreation(r.getDate("annonce.dateCreation"));
                

                u.setId(r.getString("membre.id"));
                u.setPseudo(r.getString("membre.pseudo"));
                u.setSexe(r.getString("membre.sexe"));
                u.setNom(r.getString("membre.nom"));
                u.setPrenom(r.getString("membre.prenom"));
                u.setAnneeNaissance(r.getInt("membre.Annee_naiss"));
                u.setCourriel(r.getString("membre.courriel"));
                u.setTypeMembre(r.getString("membre.type_membre"));
                u.setSport(r.getString("membre.sport"));
                u.setMpd(r.getString("membre.mdp"));
                u.setStatus(r.getString("membre.statut"));
 
                c.setMembre(u);

                liste.add(c);
            }
            r.close();
            stm.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(Annonce x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
