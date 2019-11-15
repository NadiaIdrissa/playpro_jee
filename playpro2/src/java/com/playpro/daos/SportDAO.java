/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.daos;
import java.util.List;
import com.playpro.entities.Sport;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
/**
 *
 * @author nadym
 */
public class SportDAO extends DAO<Sport>{

    @Override
    public boolean create(Sport x) {
        String req = "INSERT INTO sport (`id_sport` , `nom` , `nb_max`, `image`) "+
			     "VALUES ('"+x.getId_sport()+"','"+x.getNom()+"','"+x.getNb_max()+"','"+x.getImage()+"')";
		//System.out.println("REQUETE "+req);
		Statement stm = null;
		try 
		{
			stm = cnx.createStatement(); 
			int n= stm.executeUpdate(req);
			if (n>0)
			{
				stm.close();
				return true;
			}
		}
		catch (SQLException exp)
		{
		}
		finally
		{
			if (stm!=null)
			try {
				stm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return false;
    }

    @Override
    public Sport findById(int id) {
        return this.findById("" + id);
    }

    @Override
    public Sport findById(String nom) {
        Statement stm = null;
        ResultSet r = null;
      
        try {
            stm = cnx.createStatement();
            r = stm.executeQuery("SELECT * FROM sport WHERE id_sport = '"+nom+"'");

            if (r.next()) {
                Sport c = new Sport();
                System.out.println("------------------------");
                System.out.println(r.getString("id_sport"));
                System.out.println(r.getString("nom"));
                System.out.println(r.getString("nb_max"));
                  
                System.out.println(r.getString("image"));
                
                System.out.println("------------------------");
                
                
                c.setId_sport(r.getString("id_sport"));
                c.setNom(r.getString("nom"));
                c.setNb_max(r.getInt("nb_max"));
                
                c.setImage(r.getString("image"));
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
    public boolean update(Sport x) {
        Statement stm = null;
        try {
            String req = "UPDATE sport SET nom = '" + x.getNom()+ "',"
                    + "nb_joueurs_max = '" + x.getNb_max()+ "',"
                    + "nb_joueurs_min = '" + x.getNb_min()+ "',"
                    + "image = '" + x.getImage()+ "',"
                    + " WHERE id = '" + x.getId_sport() + "'";
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
    public boolean delete(Sport x) {
        Statement stm = null;
        try {
            stm = cnx.createStatement();
            int n = stm.executeUpdate("DELETE FROM sport WHERE id_sport='" + x.getId_sport()+ "'");
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
    public List<Sport> findAll() {
        System.out.println("je suis dans findAll de sportDAO");
        List<Sport> liste = new LinkedList<>();
        try {
            Statement stm = cnx.createStatement();
            ResultSet r = stm.executeQuery("SELECT * FROM sport");
            while (r.next()) {
                System.out.println("Lecture sport :" +r.toString());
                Sport c = new Sport();
                c.setId_sport(r.getString("id_sport"));
                c.setNom(r.getString("nom"));
                c.setNb_max(r.getInt("nb_max"));
                c.setNb_min(r.getInt("nb_min"));
                c.setImage(r.getString("image"));
                             

                liste.add(c);
                System.out.println(liste.size());
            }

            r.close();
            stm.close();
        } catch (SQLException exp) {
        }
        return liste;
    }

    @Override
    public boolean UpdateStatus(Sport x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
