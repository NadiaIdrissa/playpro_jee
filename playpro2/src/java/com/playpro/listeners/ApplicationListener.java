/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.listeners;

import com.playpro.utils.Connexion;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author younes-dilali
 */
public class ApplicationListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
        ServletContext sc = sce.getServletContext();
        
        String pilote = (String) sc.getInitParameter("piloteJDBC");
        String url = (String) sc.getInitParameter("urlBD");
        
        System.out.println("Pilote : " + pilote);
        System.out.println("URL :" + url);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connexion.setUrl(url);
//            System.out.println("trouvable");
        } catch (ClassNotFoundException e) {
//            System.out.println("Introuvable");
            e.printStackTrace();
        }
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("com.gdp.listeners.ApplicationListener.contextDestroyed()");
        Connexion.close();
    }
    
}
