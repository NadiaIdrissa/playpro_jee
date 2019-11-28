/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.controleurs;

import com.playpro.daos.LieuSportDAO;
import com.playpro.daos.LieuxDAO;
import com.playpro.daos.SportDAO;
import com.playpro.entities.Lieux;
import com.playpro.entities.Sport;
import com.playpro.entities.LieuSport;
import com.playpro.factories.ObjectFactory;
import com.playpro.services.LieuSportService;
import com.playpro.services.LieuxServices;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.Part;

/**
 *
 * @author nadym
 */
public class LieuxAction extends AbstractAction {

    private static final String UPLOAD_DIR = "static/images/lieux";
    private final UploadPhoto up = new UploadPhoto();

    @Override
    public String execute() {
        response.setContentType("text/html");
        LieuxDAO dao = new LieuxDAO();
        SportDAO daoSport = new SportDAO();
        LieuSportDAO lsDao = new LieuSportDAO();
        
        String nom = request.getParameter("nom");
        String rue = request.getParameter("rue");
        String ville = request.getParameter("ville");
        String pays = request.getParameter("pays");
        String numero = request.getParameter("numero");
        String cp = request.getParameter("code_postal");
        String infos = request.getParameter("infos");
        String image1 = request.getParameter("image1");
        String[] sports = request.getParameterValues("sports");
        List<Part> part = null;
        try {
             part = (List<Part>) request.getParts();
        } catch (IOException | ServletException ex) {
            Logger.getLogger(LieuxAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Sports : " + sports);

        Lieux s = new Lieux();
        Sport sp = new Sport();
        LieuSport ls = new LieuSport();

        if (ville == null || rue == null || pays == null || cp == null) {

        } else {
            if (request.getParameter("sports") != null) {
                int w = request.getParameter("sports").length();
                System.out.println("Longueur" + w);
            }
            
            String applicationPath = request.getServletContext().getRealPath("");
            
            image1 = up.uploader(part, UPLOAD_DIR,applicationPath, image1);


            s = ObjectFactory.getNewLieu();
            s.setNom(nom);
            s.setRue(rue);
            s.setVille(ville);
            s.setPays(pays);
            s.setNumero(numero);
            s.setCode_postal(cp);
            s.setInfos(infos);
            s.setImage1(image1);

            LieuxServices.creerLieux(s);
            System.out.println("Longueur "+sports.length);
            for (int i = 0; i < sports.length; i++) {
                System.out.println("Sport ==="+sports[i]);
                sp = daoSport.findById(sports[i]);
                System.out.println("sport trouve: "+sp.getNom());
                ls.setLieu(s);
                ls.setSport(sp);
                
                LieuSportService.creerLieuSport(ls);
                
            }

        }

        System.out.println("Id lieu : " + s.getId_lieu());
        System.out.println("Nom lieu : " + nom);
        System.out.println("rue : " + rue);
        System.out.println("ville : " + ville);
        System.out.println("code postal : " + cp);
        System.out.println("infos : " + infos);
        System.out.println("pays : " + pays);
        System.out.println("numero: " + numero);
        System.out.println("sports: " + sports);

        List<Sport> listeSports = daoSport.findAll();
        List<Lieux> liste = new LinkedList<>();
        List<LieuSport> listeLieuSport = new LinkedList<>();
        
        listeLieuSport = lsDao.findAll();

        liste = dao.findAll();
        System.out.println("Liste des Sports" + listeSports);

        request.setAttribute("lieuxSports", listeLieuSport);
        request.setAttribute("sports", listeSports);
        request.setAttribute("lieux", liste);
        request.setAttribute("AfficherLieux", true);

        request.getSession().setAttribute("viewConf", "lieux");
        return "portail";
    }

}
