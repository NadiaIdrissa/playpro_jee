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
 * @author Piaf
 */
public class SuppressionCompteAction extends AbstractAction{

    @Override
    public String execute() {
       
        MembreDAO dao = new MembreDAO();
        Membre mCourrant = new Membre();
        mCourrant = (Membre) request.getSession().getAttribute("membre");
        String stat = mCourrant.getStatus();
        String f=(String)request.getParameter("sta");       
        if ("a".equals(f)){
            dao.UpdateStatus(mCourrant);  
            request.getSession().invalidate();
            return "index";
        }
        return "suppressionCompte";
    }
}
