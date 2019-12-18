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
import com.playpro.entities.Sexe;
import java.sql.PreparedStatement;

public class MembreDAO extends DAO<Membre> {

    public MembreDAO() {
        super();
    }

    @Override
    public boolean create(Membre x) {
        // TODO Auto-generated method stub

        String type = "";

        System.out.println("e.getsport " + x.getSport());
        System.out.println(x);
        if (x.getSport().equals("")) {
            type = "Joueur";
            x.setTypeMembre(type);
        }

        System.out.println("Type : " + type);

        String req = "INSERT INTO `membre` (`ID`,`NOM`,`PRENOM`,`COURRIEL`,`TYPE_MEMBRE`,`SPORT`,`SEXE`,`NIVEAU`,`MDP`,`PSEUDO`, `PHOTO`) "
                + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getId());
            stm.setString(2, x.getNom());
            stm.setString(3, x.getPrenom());
            stm.setString(4, x.getCourriel());
            stm.setString(5, x.getTypeMembre());
            stm.setString(6, x.getSport());
            stm.setString(7, x.getSexe().toString());
            stm.setString(8, x.getNiveau().toString());
            stm.setString(9, x.getMpd());
            stm.setString(10, x.getPseudo());
            stm.setString(11, x.getPhoto());

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
        String critere;

        if (id.contains("@")) {
            critere = "courriel";
        } else {
            critere = "id";
        }

        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM membre WHERE " + critere + " = '" + id + "'");
            if (r.next()) {
                Membre c = new Membre();


                c.setId(r.getString("id"));
                c.setNom(r.getString("nom"));
                c.setPrenom(r.getString("prenom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                c.setMpd(r.getString("mdp"));
                c.setNiveau(r.getString("niveau"));
                c.setSexe(r.getString("sexe"));
                c.setAnneeNaissance(r.getInt("annee_naiss"));
                c.setSport(r.getString("sport"));
                c.setPhoto(r.getString("photo"));
                if (c.getPhoto() == null || c.getPhoto().equals("")) {
                    c.setPhoto("blueplay.png");
                }
                c.setTypeMembre(r.getString("type_membre"));
                c.setStatus(r.getString("statut"));
                r.close();
                stm.close();
                return c;
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
    public boolean update(Membre x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            String req = "UPDATE membre SET NOM = '" + x.getNom() + "',"
                    + "COURRIEL = '" + x.getCourriel() + "',"
                    + "SEXE = '" + x.getSexe() + "',"
                    + "NIVEAU = '" + x.getNiveau() + "',"
                    + "ANNEE_NAISS = '" + x.getAnneeNaissance() + "',"
                    + "PRENOM = '" + x.getPrenom() + "',"
                    + "SPORT = '" + x.getSport() + "',"
                    + "TYPE_MEMBRE = '" + x.getTypeMembre() + "',"
                    + "PSEUDO = '" + x.getPseudo() + "'," //il y a un cle etragere dans pseudo
                    + "PHOTO = '" + x.getPhoto() + "'" //il y a un cle etragere dans pseudo
                    + " WHERE id = '" + x.getId() + "'";

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
    public List<Membre> findAll() {
        List<Membre> liste = new LinkedList<>();

        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM membre");
            while (r.next()) {
                Membre c = new Membre();
                Joueur j = new Joueur();
                Entraineur e = new Entraineur();
                System.out.println("Donnée: " + r.getString(2));

                c.setId(r.getString("id"));
                c.setPrenom(r.getString("prenom"));
                c.setNom(r.getString("nom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                c.setMpd(r.getString("mdp"));
                c.setAnneeNaissance(r.getInt("Annee_naiss"));
                c.setTypeMembre(r.getString("type_membre"));
                c.setSexe(r.getString("sexe"));
                c.setStatus(r.getString("statut"));
                c.setSport(r.getString("sport"));
                c.setDateInscription(r.getTimestamp("date_inscription"));
                c.setPhoto(r.getString("photo"));
                c.setNiveau(r.getString("niveau"));

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
    public boolean UpdateStatus(Membre x) {
        Statement stm = null;
        String status;
        if ("Actif".equals(x.getStatus())) {
            status = "NotActif";
            System.out.println("contenue de vas StatusDAO " + status);
        } else {
            status = "Actif";
            System.out.println("contenue de vas StatusDAO " + status);
        }

        try {
            String req = "UPDATE membre SET STATUT = '" + status + "'"
                    + " WHERE id = '" + x.getId() + "'";

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
}
