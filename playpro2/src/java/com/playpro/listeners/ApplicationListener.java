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
        System.out.println("Hellooooo ");

        ServletContext sc = sce.getServletContext();

        String pilote = (String) sc.getInitParameter("piloteJDBC");

        // À voir
        String url = (String) sc.getInitParameter("urlBD");

//        System.out.println("Pilote "+ pilote);
//        System.out.println("URL = "+ url);
        //String url = (String) sc.getInitParameter("urlBD");
        url = "jdbc:mysql://localhost/playpro2?serverTimezone=UTC";
        System.out.println("Pilote : " + pilote);
        System.out.println("URL :" + url);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connexion.setUrl(url);
//            System.out.println("trouvable");
        } catch (ClassNotFoundException e) {
//            System.out.println("Introuvable");
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("com.gdp.listeners.ApplicationListener.contextDestroyed()");
    }

}
