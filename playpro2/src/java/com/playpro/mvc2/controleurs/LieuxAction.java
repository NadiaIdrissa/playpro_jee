/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.LieuxDAO;
import com.playpro.entities.Lieux;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.LieuxServices;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author nadym
 */
public class LieuxAction extends AbstractAction{

    @Override
    public String execute() {
        response.setContentType("text/html");
        LieuxDAO dao = new LieuxDAO();
        String nom = request.getParameter("nom");
        String rue = request.getParameter("rue");
        String ville = request.getParameter("ville");
        String pays = request.getParameter("pays");
        String numero = request.getParameter("numero");
        String cp = request.getParameter("code_postal");
        String infos = request.getParameter("infos");
        
         if (ville == null || rue == null || pays == null || cp == null) {

        } else {
            
            Lieux s = ObjectFactory.getNewLieu();
            s.setNom(nom);
            s.setRue(rue);
            s.setVille(ville);
            s.setPays(pays);
            //s.setNumero((Integer(numero)));
            s.setCode_postal(cp);
            s.setInfos(infos);

            LieuxServices.creerLieux(s);
        }

        System.out.println("Nom lieu : " + nom);
        System.out.println("rue : " + rue);
        System.out.println("ville : " + ville);
        System.out.println("code postal : " + cp);
        System.out.println("infos : " + infos);
        System.out.println("pays : " + pays);
//        System.out.println("numero: " + numero);

        List<Lieux> liste = new LinkedList<Lieux>();
        liste.add(new Lieux());
        liste = dao.findAll();
        System.out.println("Liste" + liste);
        request.setAttribute("lieux", liste);
        request.setAttribute("AfficherLieux", true);
        return "portail";
    }
    
}
