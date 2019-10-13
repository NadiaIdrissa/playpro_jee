/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.mvc2.servlets;

import com.playpro.mvc2.controleurs.IndexAction;
import com.playpro.mvc2.controleurs.nousJoindreAction;
import com.playpro.mvc2.controleurs.aProposAction;
import com.playpro.mvc2.controleurs.CalendarAction;
import com.playpro.mvc2.servlets.*;
import com.playpro.mvc2.controleurs.AbstractAction;
import com.playpro.mvc2.controleurs.Action;
import com.playpro.mvc2.controleurs.DefaultAction;
import com.playpro.mvc2.controleurs.EquipeAction;
import com.playpro.mvc2.controleurs.SignupAction;
import com.playpro.mvc2.controleurs.LoginAction;
import com.playpro.mvc2.controleurs.ProfilAction;
//import com.playpro.mvc2.controleurs.SoustractionAction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usager
 */
public class ControleurFrontal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        AbstractAction action = null;
        String vue;
        String actionAFaire = request.getParameter("action");
        if (actionAFaire == null) {
            actionAFaire = "";
        }
        System.out.println("a faire = " + actionAFaire);
        switch (actionAFaire) {
            case "index":
                action = new IndexAction();
                break;

            case "signup":
                action = new SignupAction();
                break;
            case "login":
                action = new LoginAction();
                break;
            case "logout":
                action = new LogoutAction();
                break;
            case "profil":
                action = new ProfilAction();
                break;
            case "calendar":
                action = new CalendarAction();
                break;
            case "aPropos":
                action = new aProposAction();
                break;
            case "nousJoindre":
                action = new nousJoindreAction();
                break;
            case "equipe":
                action = new EquipeAction();
                break;

            default:
                action = new DefaultAction();
        }
        //On injecte dans le contrôleur les objets request et response :
        action.setRequest(request);
        action.setResponse(response);

        vue = action.execute();
        System.out.println("vue = " + vue);
        System.out.println("-------------");
        request.getRequestDispatcher("/WEB-INF/vues/" + vue + ".jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static class LogoutAction extends AbstractAction {

        @Override
        public String execute() {
            return "index";
        }
    }

}
