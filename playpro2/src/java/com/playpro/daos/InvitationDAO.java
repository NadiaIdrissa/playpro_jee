/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Equipe;
import com.playpro.entities.Invitation;
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
public class InvitationDAO extends DAO<Invitation> {

    @Override
    public boolean create(Invitation x) {

        System.out.println("je suis dans dao invitation");
        String req = "INSERT INTO invitation (`id_expediteur`, `id_destinataire`, `id_requete`) "
                + "VALUES (?,?,?)";

        PreparedStatement stm = null;

        try {
            stm = cnx.prepareStatement(req);

            System.out.println("----------------------------------");
            System.out.println(x.getExpediteur().getId());
            System.out.println(x.getDestinataire().getId());
            System.out.println(x.getEquipe().getNomEquipe());
            System.out.println("----------------------------------");

            stm.setString(1, x.getExpediteur().getId());
            stm.setString(2, x.getDestinataire().getId());
            stm.setString(3, x.getEquipe().getNomEquipe());

            int n = stm.executeUpdate();
            if (n > 0) {
                return true;
            }
            System.out.println("========================================");
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {

                    e.printStackTrace();
                }
            }
        }
        return false;
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
    public boolean update(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Invitation x) {
        PreparedStatement stm = null;
        
        String req = "DELETE FROM invitation WHERE id_expediteur =? AND id_destinataire AND id_requete =? ";
               
        try {
            stm = cnx.prepareStatement(req);
            
            stm.setString(1, x.getExpediteur().getId());
            stm.setString(2, x.getDestinataire().getId());
            stm.setString(3, x.getEquipe().getNomEquipe());

            int n = stm.executeUpdate();

            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override
    public List<Invitation> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean UpdateStatus(Invitation x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Invitation> findAllById(String id) {
        List<Invitation> liste = new LinkedList<>();

        System.out.println("je suis dans invitdao avant request");

        String request = "SELECT * FROM invitation INNER JOIN membre EXP "
                + " ON invitation.id_expediteur = EXP.id"
                + " INNER JOIN equipe ON invitation.id_requete = equipe.nom_equipe"
                + " INNER JOIN membre DEST ON invitation.id_destinataire = DEST.id  "
                + " WHERE invitation.id_destinataire = ? ";

        try {
            PreparedStatement stm = cnx.prepareStatement(request);
            System.out.println("ID :" + id);
            stm.setString(1, id);
            ResultSet res = stm.executeQuery();
            System.out.println("HEEEEEEEEOOOOOOOOOOOOOOOOOOOOOOO");

            while (res.next()) {
                System.out.println("000000000000000000000");
                //System.out.println("res = " + res.next());
                Equipe equipe = new Equipe();
                Membre exp = new Membre();
                Membre dest = new Membre();

                Invitation inv = new Invitation();
                equipe.setNomEquipe(res.getString("equipe.nom_equipe"));

                exp.setId(res.getString("EXP.id"));
                exp.setNom(res.getString("EXP.nom"));
                exp.setPrenom(res.getString("EXP.prenom"));
                exp.setPseudo(res.getString("EXP.pseudo"));
                
                dest.setId(res.getString("DEST.id"));
                dest.setNom(res.getString("DEST.nom"));
                dest.setPrenom(res.getString("DEST.prenom"));
                dest.setPseudo(res.getString("DEST.pseudo"));
                              
                equipe.setNomEquipe(res.getString("EQUIPE.nom_equipe"));
                equipe.setCapitaine(exp);

                System.out.println("expediteur invit " + exp.getNom());
                System.out.println("nom equipe invit = " + equipe.getNomEquipe());

                inv.setExpediteur(exp);
                inv.setEquipe(equipe);
                inv.setDestinataire(dest);

                System.out.println("invitation = " + inv.getEquipe().getNomEquipe());
                liste.add(inv);
                System.out.println("000000000000000000000");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        if (liste.size() > 0) {
            System.out.println("Tout est la");
        } else {
            System.out.println("Aucune invitation copiée");
        }
        return liste;
    }
}
