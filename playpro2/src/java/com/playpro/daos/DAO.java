package com.playpro.daos;

import com.playpro.utils.Connexion;
import java.sql.Connection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class DAO<T> {
	protected Connection cnx;

	public DAO() {
            
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
            }
                System.out.println("entrée DAO");
                cnx = Connexion.getInstance();
		//this.cnx = cnx;
	}
        public DAO(Connection cnx) {
		this.cnx = cnx;
	}
	
	public Connection getCnx() {
		return cnx;
	}

	public void setCnx(Connection cnx) {
		this.cnx = cnx;
	}

	public abstract boolean create(T x);    //INSERT
	public abstract T findById(int id);         //SELECT
	public abstract T findById(String id);      //SELECT
	public abstract boolean update(T x);    //UPDATE
	public abstract boolean delete(T x);    //DELETE
	public abstract List<T> findAll();      //SELECT
        public abstract boolean UpdateStatus(T x);
        
}
