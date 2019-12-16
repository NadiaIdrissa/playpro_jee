/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.EquipesDAO;
import com.playpro.daos.MembreDAO;
import com.playpro.daos.ParticipationDAO;
import com.playpro.daos.SportDAO;
import com.playpro.entities.Equipe;
import com.playpro.entities.Membre;
import com.playpro.entities.Equipe;
import com.playpro.entities.Participation;
import com.playpro.entities.Sport;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.EquipesServices;
import com.playpro.services.LieuSportService;
import com.playpro.services.MembreServices;
import com.playpro.services.SportServices;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;
import static jdk.nashorn.internal.objects.NativeError.getFileName;

/**
 *
 * @author younes-dilali
 */
public class EquipesAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/equipes";

    @Override
    public String execute() {

        Membre mSession = (Membre) request.getSession().getAttribute("membre");
        if ((mSession == null)) {
            String message = "Votre session a expiré, veuillez vous réauthentifier";
            String laClasse = "danger";
            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);
            return "login";
        }

        response.setContentType("text/html");

        EquipesDAO dao = new EquipesDAO();
        String nomEquipe = request.getParameter("nomEquipe");
        String idSportEquipe = request.getParameter("idSportEquipe");
        String imageEquipe = request.getParameter("imageEquipe");
        Membre cap = (Membre) request.getSession().getAttribute("membre");
        String message = "";
        String laClasse = "";

        List<Part> part = null;
        try {
            part = (List<Part>) request.getParts();
        } catch (IOException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("id membre = " + cap.getId());
        System.out.println("sport choisi formulaire = " + idSportEquipe);

        int nbMaxEquipe = 0;

        if (nomEquipe == null) {

        } else {
            nbMaxEquipe = Integer.parseInt(request.getParameter("nbMaxEquipe"));
            String applicationPath = request.getServletContext().getRealPath("");
            // constructs path of the directory to save uploaded file
            String uploadFilePath = applicationPath + File.separator + UPLOAD_DIR;

            UploadPhoto up = new UploadPhoto();

            imageEquipe = up.uploader(part, UPLOAD_DIR, applicationPath, imageEquipe);
            if (imageEquipe == null || imageEquipe.equals("")) {
                imageEquipe = "newteam.jpg";
            } 

            Equipe e = new Equipe();
            e.setNomEquipe(nomEquipe);
            e.setNbJoueurs(nbMaxEquipe);
            Sport s = SportServices.trouverUnSport(idSportEquipe);
            e.setSport(s);
            e.setImage(imageEquipe);
            e.setCapitaine(cap);

            System.out.println("=====================================Nom capitaine : " + cap.getNom());

            boolean reussi = EquipesServices.creerEquipe(e);

            if (reussi) {
                message = "La nouvelle équipe " + e.getNomEquipe() + " a été créée";
                laClasse = "success";
            } else {
                message = "Une erreur est survenue lors de la création de l'équipe";
                laClasse = "danger";
            }

            request.setAttribute("message", message);
            request.setAttribute("laClasse", laClasse);

            Participation participe = new Participation();
            ParticipationDAO pdao = new ParticipationDAO();
            participe.setMembre(cap);
            participe.setEquipe(e);

            pdao.create(participe);
        }

        List<Sport> slisteSports = SportServices.tousLesSports();

        System.out.println("liste de sport existante");

        request.getSession().setAttribute("slisteSports", slisteSports);

        List<Equipe> listeequipes = new LinkedList<Equipe>();

        ParticipationDAO pdao = new ParticipationDAO();
        List<Participation> participation = pdao.findAll();
//        Equipe a = new Equipe();
        listeequipes = dao.findAll();
        System.out.println("=======================" + participation.size() + " size");

        for (Equipe equipe : listeequipes) {
            for (Participation p : participation) {
                if (equipe.getNomEquipe().equals(p.getEquipe().getNomEquipe())) {
                    equipe.getMembresEquipe().add(p.getMembre());
                }
            }
            if (equipe.getMembresEquipe().size() > 0) {
                System.out.println("========" + equipe.getNomEquipe() + " a plus que 1 membre");
            } else {
                System.out.println("========" + equipe.getNomEquipe() + " a moins que 1 membre");

            }
            System.out.println("=======================" + equipe.getMembresEquipe().size() + " size");
        }

        request.setAttribute("listeEquipe", listeequipes);

        List<Membre> listeDesMembres = new LinkedList<Membre>();
        listeDesMembres = MembreServices.tousLesMembre();

        for (int j = 0; j < listeDesMembres.size(); j++) {
            System.out.println(listeDesMembres.get(j).getNom());
        }

        request.getSession().setAttribute("listeDesMembres", listeDesMembres);
        request.getSession().setAttribute("viewConf", "loadEquipe");

        return "portail";
    }
}
