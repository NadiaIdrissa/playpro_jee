/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Annonce;
import com.playpro.entities.Lieux;
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
        String req = "INSERT INTO annonce (`id_annonce` , `id_createur` , `nombreMax`,`id_lieu`,`date_events` ,`montant`, `titre_annonce`, `gratuit`, `description`, `date_creation`) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getIdAnnonce());
            stm.setString(2, x.getCreateur().getId());
            stm.setInt(3, x.getNombreMax());
            stm.setString(4, x.getId_lieu().getId_lieu());
            stm.setDate(5, (Date) x.getDate_event());
            stm.setDouble(6, x.getMontant());
            stm.setString(7, x.getTitre());
            stm.setBoolean(8, x.getGratuit());
            stm.setString(9, x.getDescription());
            stm.setDate(10, (Date) x.getDateCreation());

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
            r = stm.executeQuery("SELECT * FROM annonce WHERE id_annonce = '" + id + "'");

            if (r.next()) {
                Annonce c = new Annonce();
                Membre u = new Membre();
                Lieux l = new Lieux();

                c.setIdAnnonce(r.getString("annonce.id_annonce"));
                c.setNombreMax(r.getInt("annonce.nombreMax"));
                c.setDate_event(r.getDate("annonce.date_event"));
                c.setMontant(r.getFloat("annonce.montant"));
                c.setTitre(r.getString("annonce.titre_annonce"));
                c.setGratuit(r.getBoolean("annonce.gratuit"));
                c.setDescription(r.getString("annonce.description"));
                c.setDateCreation(r.getDate("annonce.date_creation"));

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
                
                l.setId_lieu(r.getString("lieu.id_lieu"));
                l.setNom(r.getString("lieu.nom"));
                l.setNumero(r.getString("lieu.numero"));
                l.setRue(r.getString("lieu.rue"));
                l.setCode_postal(r.getString("lieu.code_postal"));
                l.setVille(r.getString("lieu.ville"));
                l.setPays(r.getString("lieu.pays"));
                l.setInfos(r.getString("lieu.infos"));
                l.setImage1(r.getString("lieu.image1"));
                l.setImage2(r.getString("lieu.image2"));
                l.setImage3(r.getString("lieu.image3"));
                
                c.setId_lieu(l);
                c.setCreateur(u);
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
            String req = "UPDATE annonce SET id_createur = '" + x.getCreateur().getId() + "',"
                    + "nombreMax = '" + x.getNombreMax() + "',"
                    + "id_lieu = '" + x.getId_lieu()+ "',"
                    + "date_event = '" + x.getDate_event()+ "',"
                    + "montant = '" + x.getMontant() + "',"
                    + "titre_annonce = '" + x.getTitre() + "',"
                    + "gratuit = '" + x.getGratuit() + "',"
                    + "description = '" + x.getDescription() + "',"
                    + "date_creation = '" + x.getDateCreation() + "',"
                    + " WHERE id_annonce = '" + x.getIdAnnonce() + "'";
            //System.out.println("REQUETE "+req);
            stm = cnx.createStatement();
            int n = stm.executeUpdate(req);
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
    public boolean delete(Annonce x) {
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM annonce WHERE id_annonce='" + x.getIdAnnonce() + "'");
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
    public List<Annonce> findAll() {
        List<Annonce> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM `annonce` INNER JOIN `membre`on annonce.id_createur = MEMBRE.ID"
                    + " INNER JOIN lieu ON annonce.id_lieu = lieu.id_lieu");
                                
            while (r.next()) {
                Annonce c = new Annonce();
                Membre u = new Membre();
                Lieux l = new Lieux();

                c.setIdAnnonce(r.getString("annonce.id_annonce"));
                c.setNombreMax(r.getInt("annonce.nombreMax"));
                c.setMontant(r.getFloat("annonce.montant"));
                c.setTitre(r.getString("annonce.titre_annonce"));
                c.setGratuit(r.getBoolean("annonce.gratuit"));
                c.setDescription(r.getString("annonce.description"));
                c.setDateCreation(r.getDate("annonce.date_creation"));

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
                
                l.setId_lieu(r.getString("lieu.id_lieu"));
                l.setNom(r.getString("lieu.nom"));
                l.setNumero(r.getString("lieu.numero"));
                l.setRue(r.getString("lieu.rue"));
                l.setCode_postal(r.getString("lieu.code_postal"));
                l.setVille(r.getString("lieu.ville"));
                l.setPays(r.getString("lieu.pays"));
                l.setInfos(r.getString("lieu.infos"));
                l.setImage1(r.getString("lieu.image1"));
                l.setImage2(r.getString("lieu.image2"));
                l.setImage3(r.getString("lieu.image3"));
                
                c.setId_lieu(l);

                c.setCreateur(u);

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
