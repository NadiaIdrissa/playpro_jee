/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.MembreDAO;
import com.playpro.entities.Membre;
import com.playpro.entities.Niveau;
import com.playpro.entities.Sexe;
import com.playpro.utils.PasswordHash;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author toute
 */
public class ProfilAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/profils";
    private UploadPhoto up = new UploadPhoto();

    @Override
    public String execute() {
        Membre membre = new Membre();
        MembreDAO dao = new MembreDAO();
        Membre mCourrant = new Membre();
        PasswordHash m;
        new PasswordHash();
        mCourrant = (Membre) request.getSession().getAttribute("membre");
        String id = mCourrant.getId();
        int naiss = mCourrant.getAnneeNaissance();
        Sexe sex = mCourrant.getSexe();
        Niveau niveauN = mCourrant.getNiveau();
        int pAnnee = 2000;

        String pseudo = (String) request.getParameter("pseudoR");
        String nom = (String) request.getParameter("nomR");
        String prenom = (String) request.getParameter("prenomR");
        String annee = (String) request.getParameter("anneeR");
        String niveau = (String) request.getParameter("niveauR");
        String sexe = (String) request.getParameter("sexeR");
        String email = (String) request.getParameter("emailR");
        String mdp = (String) request.getParameter("passwordR");
        String mdpC = (String) request.getParameter("CpasswordR");
        String sport = (String) request.getParameter("sportR");
        String typeM = (String) request.getParameter("tMembreR");
        String photo = (String) request.getParameter("imageMembre");

        List<Part> part = null;
        try {
            part = (List<Part>) request.getParts();
        } catch (IOException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        String applicationPath = request.getServletContext().getRealPath("");

        photo = up.uploader(part, UPLOAD_DIR, applicationPath, photo);
        

        if ((annee != null) && (!"".equals(annee))) {
            try {
                pAnnee = Integer.parseInt(annee.trim());

            } catch (Exception e) {
                System.out.println("Exeception ne pas un entier");
            }
        } else {
            pAnnee = naiss;
        }

        if (niveau == null || "".equals(niveau.trim())) {
            niveau = niveauN.toString();
        }

        if (sexe == null || "".equals(sexe.trim())) {
            sexe = sex.toString();
        }
        if (mdpC == null || "".equals(mdpC.trim())) {
            mdpC = "";
        }
        if (mdp == null || "".equals(mdp.trim())) {
            mdp = mCourrant.getMpd();
        } else {
            if (mdp == mdpC) {
                request.getSession().setAttribute("valid", "vrai");

                m = new PasswordHash();
                try {
                    mdp = m.createHash(mdp);

                } catch (NoSuchAlgorithmException ex) {
                    Logger.getLogger(ProfilAction.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InvalidKeySpecException ex) {
                    Logger.getLogger(ProfilAction.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        System.out.println("--------------Parametres----------------");
        System.out.println("id0 = " + id);
        System.out.println("pseudo1 = " + pseudo);
        System.out.println("sportR = " + sport);
        System.out.println("mdp8 = " + mdp);
        System.out.println("--------------------------------");

        System.out.println("bd sex = " + sex);

        if (!(pseudo == null) && !("".equals(pseudo.trim()))
                && !(nom == null) && !("".equals(nom.trim()))
                && !(prenom == null) && !("".equals(prenom.trim()))
                && !(sport == null) && !("".equals(sport.trim()))
                && !(email == null) && !("".equals(email.trim()))
                && !(mdp == null) && !("".equals(mdp.trim()))) {
            System.out.println("------apres null---------");
            membre.setId(id);
            membre.setNom(nom);
            membre.setPseudo(pseudo);
            membre.setPrenom(prenom);
            membre.setAnneeNaissance(pAnnee);
            membre.setCourriel(email);
            membre.setSexe(sexe);
            membre.setMpd(mdp);
            membre.setNiveau(niveau);
            membre.setSport(sport);
            membre.setTypeMembre(typeM);
            membre.setPhoto(photo);
            System.out.println("----------affectation--------");
            System.out.println("----membre.getNaiss- " + membre.getAnneeNaissance());

            dao.update(membre);
            System.out.println("-----dao.membre-----------" + dao.update(membre));

            request.getSession().setAttribute("membre", membre);
        request.getSession().setAttribute("viewConf","profilaccueil");
            return "portail";
        }else{
            
            request.getSession().setAttribute("membre", membre);
            request.getSession().setAttribute("viewConf","profilaccueil");
           return "profil";  
        }

    }

}
