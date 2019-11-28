/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;

/**
 *
 * @author dd
 */
public class PortailAction extends AbstractAction {

    @Override
    public String execute() {
        
        String viewConf = "";
        String rep =((Membre)request.getSession().getAttribute("membre")).getId()+"/";
        String sousAction = (String) request.getParameter("sousAction");
        if(sousAction == null)sousAction="";
        
        switch(sousAction){
            case "loadProfil" :
                
                viewConf = "profilaccueil";
                
                break;
            case "loadCalendrier" :
                viewConf = "calendrier";
                break;
            case "loadSupp" :
                viewConf = "suppCompte";
                break;
            case "loadEquipe" :
                viewConf = "equipe";
                break;
            default :
                viewConf= "";
                break;
        }
            
        request.getSession().setAttribute("viewConf",viewConf);
        return "portail";
    }
}
