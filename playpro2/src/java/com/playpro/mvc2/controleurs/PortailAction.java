/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

/**
 *
 * @author dd
 */
public class PortailAction extends AbstractAction {

    @Override
    public String execute() {
        
        String viewConf = "";
        String sousAction = (String) request.getParameter("sousAction");
        if(sousAction == null)sousAction="";
        
        switch(sousAction){
            case "loadProfil" :
                viewConf = "profilaccueil";
                break;
            case "loadCalendrier" :
                viewConf = "calendrier";
                break;
            default :
                viewConf= "";
                break;
        }
            
        request.getSession().setAttribute("viewConf",viewConf);
        return "portail";
    }   
}
