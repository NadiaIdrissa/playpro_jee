/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
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
public class ParticipationDAO extends DAO<Participation> {

    public ParticipationDAO() {
        super();
    }

    @Override
    public boolean create(Participation x) {
        String req = "INSERT INTO participationequipe (`id_joueur`, `nom_equipe`) VALUES (?,?)";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getMembre().getId());
            paramStm.setString(2, x.getEquipe().getNomEquipe());

            int nbLignesAffectees = paramStm.executeUpdate();
            System.out.println("Je suis dans le create de ParticipationDAO");
            System.out.println(nbLignesAffectees);
            if (nbLignesAffectees > 0) {
                paramStm.close();
                return true;
            }

            return false;
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                if (paramStm != null) {
                    paramStm.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }

    @Override
    public boolean update(Participation x) {
        return false;
    }

    @Override
    public boolean delete(Participation x) {
        String req = "DELETE FROM participationequipe WHERE `nom_equipe` = ? AND `id_joueur` = ?";

        PreparedStatement paramStm = null;
        try {

            paramStm = cnx.prepareStatement(req);
            paramStm.setString(1, x.getEquipe().getNomEquipe());
            paramStm.setString(2, x.getMembre().getId());

            int nbLignesAffectees = paramStm.executeUpdate();

            if (nbLignesAffectees > 0) {
                paramStm.close();
                return true;
            }

            return false;
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            try {
                if (paramStm != null) {
                    paramStm.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return false;
    }

    @Override
    public List<Participation> findAll() {
        List<Participation> liste = new LinkedList<Participation>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM participationEquipe INNER JOIN membre ON id_joueur = id"
                    + " INNER JOIN equipe ON participationEquipe.nom_equipe = equipe.nom_equipe INNER JOIN Membre"
                    + " AS CAP ON equipe.id_capitaine = cap.id ");
            while (r.next()) {
                Participation participe = new Participation();
                Equipe e = new Equipe();
                Membre m = new Membre();
                Membre cap = new Membre();

                m.setId(r.getString("Membre.id"));
                m.setPseudo(r.getString("Membre.pseudo"));
                m.setNom(r.getString("Membre.nom"));
                m.setPrenom(r.getString("Membre.prenom"));

                cap.setId(r.getString("CAP.id"));
                cap.setPseudo(r.getString("CAP.pseudo"));
                cap.setNom(r.getString("CAP.nom"));
                cap.setPrenom(r.getString("CAP.prenom"));

                e.setNomEquipe(r.getString("Equipe.nom_equipe"));
                e.setCapitaine(cap);

                participe.setEquipe(e);
                participe.setMembre(m);
                liste.add(participe);
            }
//            Collections.reverse(liste);
            r.close();
            stm.close();
        } catch (SQLException exp) {
            exp.printStackTrace();
        }
        return liste;
    }

    public List<Participation> findByNomEquipe(String id) {
        List<Participation> liste = new LinkedList<Participation>();
        String req = "SELECT * FROM participationEquipe INNER JOIN membre ON id_joueur = id"
                    + " INNER JOIN equipe ON participationEquipe.nom_equipe = equipe.nom_equipe INNER JOIN Membre"
                    + " AS CAP ON equipe.id_capitaine = membre.id WHERE `nom_equipe` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, id);

            ResultSet r = paramStm.executeQuery();

            while (r.next()) {
                Participation participe = new Participation();
                Equipe e = new Equipe();
                Membre m = new Membre();
                Membre cap = new Membre();

                m.setId(r.getString("Membre.id"));
                m.setPseudo(r.getString("Membre.pseudo"));
                m.setNom(r.getString("Membre.nom"));
                m.setPrenom(r.getString("Membre.prenom"));

                cap.setId(r.getString("CAP.id"));
                cap.setPseudo(r.getString("CAP.pseudo"));
                cap.setNom(r.getString("CAP.nom"));
                cap.setPrenom(r.getString("CAP.prenom"));

                e.setNomEquipe(r.getString("Equipe.nom_equipe"));
                e.setCapitaine(cap);

                participe.setEquipe(e);
                participe.setMembre(m);
                liste.add(participe);
            }

            r.close();
           
            
            paramStm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ParticipationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return liste;
    }

    public Participation findByNomEquipeIdMembre(String nomEquipe, String idMembre) {
        String req = "SELECT * FROM participationEquipe INNER JOIN membre ON id_joueur = id"
                    + " INNER JOIN equipe ON participationEquipe.nom_equipe = equipe.nom_equipe INNER JOIN Membre"
                    + " AS CAP ON equipe.id_capitaine = membre.id WHERE `nom_equipe` = ? AND `id_joueur` = ?";

        PreparedStatement paramStm = null;
        try {
            paramStm = cnx.prepareStatement(req);

            paramStm.setString(1, nomEquipe);
            paramStm.setString(2, idMembre);

            ResultSet r = paramStm.executeQuery();

            if (r.next()) {

                Participation participe = new Participation();
                Equipe e = new Equipe();
                Membre m = new Membre();
                Membre cap = new Membre();

                m.setId(r.getString("Membre.id"));
                m.setPseudo(r.getString("Membre.pseudo"));
                m.setNom(r.getString("Membre.nom"));
                m.setPrenom(r.getString("Membre.prenom"));

                cap.setId(r.getString("CAP.id"));
                cap.setPseudo(r.getString("CAP.pseudo"));
                cap.setNom(r.getString("CAP.nom"));
                cap.setPrenom(r.getString("CAP.prenom"));

                e.setNomEquipe(r.getString("Equipe.nom_equipe"));
                e.setCapitaine(cap);

                participe.setEquipe(e);
                participe.setMembre(m);
                return participe;
            }

            r.close();
            paramStm.close();
        } catch (SQLException ex) {
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

            ResultSet r = paramStm.executeQuery();

            while (r.next()) {
                Participation participe = new Participation();
                Equipe e = new Equipe();
                Membre m = new Membre();
                Membre cap = new Membre();

                m.setId(r.getString("Membre.id"));
                m.setPseudo(r.getString("Membre.pseudo"));
                m.setNom(r.getString("Membre.nom"));
                m.setPrenom(r.getString("Membre.prenom"));

                cap.setId(r.getString("CAP.id"));
                cap.setPseudo(r.getString("CAP.pseudo"));
                cap.setNom(r.getString("CAP.nom"));
                cap.setPrenom(r.getString("CAP.prenom"));

                e.setNomEquipe(r.getString("Equipe.nom_equipe"));
                e.setCapitaine(cap);

                participe.setEquipe(e);
                participe.setMembre(m);
                liste.add(participe);
            }
//            Collections.reverse(liste);
            r.close();
            paramStm.close();
        } catch (SQLException ex) {
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
