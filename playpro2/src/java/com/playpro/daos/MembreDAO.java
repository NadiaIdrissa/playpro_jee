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

public class MembreDAO extends DAO<Membre> {

    public MembreDAO() {
        super();
    }

    @Override
    public boolean create(Membre x) {
        // TODO Auto-generated method stub

//        String req = "INSERT INTO `membre`(`ID`, `PSEUDO` , `PRENOM` ,`NOM` , `COURRIEL` , `ANNEE_NAISSS`, `MDP` ) "
//                + "VALUES ('" + x.getId() + "','" + x.getPseudo()+ "','" + x.getPrenom()+ "','" + x.getNom() 
//                + "','" + x.getCourriel() + "','" + x.getAnneeNaissance()+ "','" + x.getMpd() + "')";
        //System.out.println("REQUETE "+req);
        String type = "";

        System.out.println("e.getsport " + x.getSport());
        System.out.println(x);
        if (x.getSport().equals("")) {
            type = "Joueur";
        } else {
            type = "Entraineur";
        }

        System.out.println("Type : " + type);

//        String req = "INSERT INTO `membre`(`id`) VALUES ('OOOOOOOO')";
        String req = "INSERT INTO `membre` (`ID`,`NOM`,`PRENOM`,`COURRIEL`,`TYPE_MEMBRE`,`SPORT`,`SEXE`,`NIVEAU`,`MDP`,`PSEUDO`) "
                + "VALUES('" + x.getId() + "','" + x.getNom() + "','" + x.getPrenom() + "','" + x.getCourriel() + "','" + type + "','"
                + x.getSport() + "','" + x.getSexe() + "','" + x.getNiveau() + "','" + x.getMpd() + "','" + x.getPseudo() + "')";

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
                } catch (SQLException exp) {
                    // TODO Auto-generated catch block
                    exp.printStackTrace();
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
            System.out.println("Il y a un @: "+id);
            critere = "courriel";
        } else {
            critere = "id";
            System.out.println("Il n y a pas de @: "+id);
        }

        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM membre WHERE "+critere+" = '" + id + "'");
            if (r.next()) {
                Membre c = new Membre();
                System.out.println("------------------------");
                System.out.println(r.getString("id"));
                System.out.println(r.getString("nom"));
                System.out.println(r.getString("prenom"));
                System.out.println(r.getString("pseudo"));   
                System.out.println(r.getString("mdp")); 
                
                
                System.out.println("------------------------");
                
                
                c.setId(r.getString("id"));
                c.setNom(r.getString("nom"));
                c.setPrenom(r.getString("Prenom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                c.setMpd(r.getString("mdp"));
                c.setNiveau(r.getString("niveau"));
                c.setSexe(r.getString("sexe"));
                c.setAnneeNaissance(r.getInt("annee_naiss"));
                r.close();
                stm.close();
                return c;
            }
        } catch (SQLException exp) {
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
    public boolean update(Membre x) {
        // TODO Auto-generated method stub
        Statement stm = null;
        try {
            String req = "UPDATE membre SET NOM = '" + x.getNom() + "',"
                    + "COURRIEL = '" + x.getCourriel() + "'"
                   // + "SEXE = '" + x.getSexe() + "',"
                   // + "NIVEAU = '" + x.getNiveau() + "',"
                   // + "ANNEE_NAISS = '" + x.getAnneeNaissance() + "',"
                  //  + "PRENOM = '" + x.getPrenom() + "'"
                   // + "PSEUDO = '" + x.getPseudo() + "'"
                    + " WHERE id = '" + x.getId() + "'";
            // UPDATE `membre` SET `prenom` = 'Viviane' WHERE `membre`.`id` = '29e405ab-2014-43e1-b01e-492d4dcc5ebd';
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
                System.out.println("Dennée: " + r.getString(2));
                //System.out.println("Donnée: "+r.getString("type_membre"));

                c.setId(r.getString("id"));
                c.setPrenom(r.getString("nom"));
                c.setNom(r.getString("nom"));
                c.setCourriel(r.getString("courriel"));
                c.setPseudo(r.getString("pseudo"));
                c.setMpd(r.getString("mdp"));

                if (r.getString("type_membre").equals("joueur")) {
                    j = (Joueur) c;
                    liste.add(j);
                } else if (r.getString("type_membre").equals("admin")) {
                    //e = (Entraineur)c; 
                    liste.add(c);
                } else {

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
