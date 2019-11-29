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
            System.out.println(x.getId_expediteur());
            System.out.println(x.getId_destinataire());
            System.out.println(x.getId_requete());
            System.out.println("----------------------------------");
            
            
            
            stm.setString(1, x.getId_expediteur());
            stm.setString(2, x.getId_destinataire());
            stm.setString(3, x.getId_requete());

            int n = stm.executeUpdate();
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
        Statement stm = null;

        String request = "DELETE FROM invitation WHERE id_requete='" + x.getId_requete() + "'";
        try {
            stm = cnx.createStatement();

            int n = stm.executeUpdate(request);

            if (n > 0) {
                stm.close();
                return true;
            }
        } catch (SQLException e) {
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
    
    public List<Invitation> findAllById(String id){
        List<Invitation> liste = new LinkedList<Invitation>();
        String request = "SELECT * FROM invitation INNER JOIN membre "
                + "ON invitation.id_expediteur = membre.id"
                + " INNER JOIN equipe ON invitation.id_requete = equipe.nom_equipe "
                + " WHERE invitation.id_destinataire = ? ";

        try {
            PreparedStatement stm = cnx.prepareStatement(request);
            System.out.println("ID :" + id);
            stm.setString(1, id);
            ResultSet res = stm.executeQuery();
            System.out.println("HEEEEEEEEOOOOOOOOOOOOOOOOOOOOOOO");

            while (res.next()) {
                Equipe equipe = new Equipe();
                Invitation inv = new Invitation();
                Membre expediteur = new Membre();

                equipe.setNomEquipe(res.getString("equipe.nom_equipe"));
                
                MembreDAO mdao = new MembreDAO();
                expediteur=mdao.findById(res.getString("equipe.id_capitaine"));
                
                Sport sport = new Sport();
                SportDAO sdao = new SportDAO();
                sport = sdao.findById(res.getString("equipe.nom_sport"));
                
                
                equipe.setCapitaine(expediteur);
                
//                equipe.setDateCreation(res.getTimestamp("equipe.date_creation"));
                equipe.setSport(sport);
                equipe.setNbPartiesJouees(res.getString("nb_parties_jouees"));
                equipe.setNbJoueurs(res.getInt("nb_joueurs"));
                equipe.setNbMaxJoueurs(res.getString("nb_max_joueurs"));
                equipe.setImage(res.getString("image"));

//                expediteur.setId(res.getString("UTILISATEUR.ID"));
//                expediteur.setCourriel("UTILISATEUR.COURRIEL");
//                expediteur.setNom_prenom("UTILISATEUR.NOM_PRENOM");

                inv.setId_expediteur(expediteur.getId());
                inv.setId_requete(equipe.getNomEquipe());

                liste.add(inv);

            }

        } catch (Exception e) {
        }
        if (liste.size() > 0) {
            System.out.println("Tout est la");
        } else {
            System.out.println("Aucune invitation copiée");
        }
        return liste;
    }

    

}
