/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.listeners;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author toute
 */
public class ApplicationListener implements ServletContextListener
{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Debut application");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("com.playpro.listeners.ApplicationListener.contextDestroyed()");
    }
    
}
