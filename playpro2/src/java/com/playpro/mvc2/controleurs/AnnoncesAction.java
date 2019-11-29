/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.entities.Annonce;
import com.playpro.entities.Membre;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.AnnoncesServices;
import java.util.List;

/**
 *
 * @author toute
 */
public class AnnoncesAction extends AbstractAction {

    @Override
    public String execute() {
        String titre = (String) request.getParameter("titre");
        String message = (String) request.getParameter("message");
        String gratuit[] = request.getParameterValues("gratuit");
        String montant = (String) request.getParameter("montant");
        Membre createur = (Membre) request.getSession().getAttribute("membre");
        

        if(titre != null && message !=null ){
            int nbMax = Integer.parseInt(request.getParameter("nbMax"));
            Annonce annonce = ObjectFactory.getNewAnnonce();
            annonce.setCreateur(createur);
            annonce.setDescription(message);
            annonce.setTitre(titre);
            annonce.setNombreMax(nbMax);
            if (gratuit == null){
                annonce.setGratuit(Boolean.FALSE);
            }else if (gratuit[0].equals("on")){
                annonce.setGratuit(Boolean.TRUE);
            }
            if (!tryParseDouble(montant)){
                annonce.setMontant(0);
            }else{
                annonce.setMontant(Double.parseDouble(montant));
            }
            
            boolean reussi = AnnoncesServices.creerAnnonce(annonce);
            if(reussi){
                request.setAttribute("message", "Annonce créée.");
            }
        }
        List<Annonce> liste = AnnoncesServices.toutesLesAnnonces();
        System.out.println("montant" + montant);

        request.getSession().setAttribute("viewConf", "annonces");
        request.setAttribute("annonces", liste);
        return "portail";
    }
    
    boolean tryParseDouble(String value) {  
     try {  
         Double.parseDouble(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }  
}

}
