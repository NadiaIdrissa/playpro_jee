/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;

import com.playpro.entities.Lieux;
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
public class LieuxDAO extends DAO<Lieux> {

    @Override
    public boolean create(Lieux x) {
        String req = "INSERT INTO lieu (`id_lieu` , `nom` , `numero`, `rue`, `code_postal`, `ville`, `pays`, `infos`, `image1`) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        //System.out.println("REQUETE "+req);
        PreparedStatement stm = null;
        try {
            stm = cnx.prepareStatement(req);
            stm.setString(1, x.getId_lieu());
            stm.setString(2, x.getNom());
            stm.setString(3, x.getNumero());
            stm.setString(4, x.getRue());
            stm.setString(5, x.getCode_postal());
            stm.setString(6, x.getVille());
            stm.setString(7, x.getPays());
            stm.setString(8, x.getInfos());
            stm.setString(9, x.getImage1());

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
    public Lieux findById(int id) {
        return this.findById("" + id);
    }

    @Override
    public Lieux findById(String nom) {
        Statement stm = null;
        ResultSet r = null;

        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM lieu WHERE id_lieu = '" + nom + "'");

            if (r.next()) {
                Lieux c = new Lieux();
                System.out.println("------------------------");
                System.out.println(r.getString("id_lieu"));
                System.out.println(r.getString("nom"));
                System.out.println(r.getString("numero"));
                System.out.println(r.getString("rue"));
                System.out.println(r.getString("code_postal"));
                System.out.println(r.getString("ville"));
                System.out.println(r.getString("pays"));
                System.out.println(r.getString("infos"));
                System.out.println("------------------------");

                c.setId_lieu(r.getString("id_lieu"));
                c.setNom(r.getString("nom"));
                c.setNumero(r.getString("numero"));
                c.setRue(r.getString("rue"));
                c.setCode_postal(r.getString("code_postal"));
                c.setVille(r.getString("ville"));
                c.setPays(r.getString("pays"));
                c.setInfos(r.getString("infos"));
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
    public boolean update(Lieux x) {
        Statement stm = null;
        try {
            String req = "UPDATE lieu SET nom = '" + x.getNom() + "',"
                    + "numero = '" + x.getNumero() + "',"
                    + "rue = '" + x.getRue() + "',"
                    + "code_postal = '" + x.getCode_postal() + "',"
                    + "ville = '" + x.getVille() + "',"
                    + "pays = '" + x.getPays() + "',"
                    + "infos = '" + x.getInfos() + "',"
                    + " WHERE id = '" + x.getId_lieu() + "'";
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
    public boolean delete(Lieux x) {
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM lieu WHERE id_lieu='" + x.getId_lieu() + "'");
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
    public List<Lieux> findAll() {
        List<Lieux> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM lieu");
            while (r.next()) {
                System.out.println("Lecture lieu :" + r.toString());
                Lieux c = new Lieux();
                c.setId_lieu(r.getString("id_lieu"));
                c.setNom(r.getString("nom"));
                c.setNumero(r.getString("numero"));
                c.setRue(r.getString("rue"));
                c.setCode_postal(r.getString("code_postal"));
                c.setVille(r.getString("ville"));
                c.setPays(r.getString("pays"));
                c.setInfos(r.getString("infos"));
                c.setImage1(r.getString("image1"));
                c.setImage2(r.getString("image2"));
                c.setImage3(r.getString("image3"));

                liste.add(c);
                System.out.println(liste.size());
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
             exp.printStackTrace();
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(Lieux x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
