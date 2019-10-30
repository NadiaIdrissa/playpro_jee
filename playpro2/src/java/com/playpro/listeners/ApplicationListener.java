/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.listeners;

import com.playpro.utils.Connexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.DispatcherType;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author toute
 */
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Debut application aaaaaaaaaaaaaaaaaa");

        ServletContext sc = sce.getServletContext();

        String pilote = (String) sc.getInitParameter("piloteJDBC");
        //String url = (String) sc.getInitParameter("urlBD");
        String url = "jdbc:mysql://localhost/playpro2?serverTimezone=UTC";
        System.out.println("Pilote : "+pilote);
        System.out.println("URL :"+url);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Class.forName(pilote);
            Connexion.setUrl(url);
            System.out.println("trouvable");
            
                Connexion.setUrl(url);
        } catch (ClassNotFoundException ex) {

            System.out.println("Introuvable");
        }
        //Connection cxn = Connexion.getInstance();
        //sc.setAttribute("conn", c);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Application arrétée.");
        Connexion.close();
    }

}
