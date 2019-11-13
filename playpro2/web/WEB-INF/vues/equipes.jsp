<%-- 
    Document   : equipes
    Created on : 2019-11-05, 23:39:59
    Author     : younes-dilali
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page import="com.playpro.entities.Equipe"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%--<%@page import="com.gdp.entities.Projet"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
    </head>
    <body>
        
        
        <% List<Equipe> liste_equipes = new LinkedList<>();
            liste_equipes = (LinkedList<Equipe>) request.getAttribute("Equipes");

            String nomCapitaine = (String) request.getSession().getAttribute("nomMembre");

            out.print("connecté : " + nomCapitaine);
            for (int i = 0; i < liste_equipes.size(); i++) {
                out.print(liste_equipes.get(i).getNomEquipe());
            }
        %>
        
        
        <h1>toutes les équipes</h1>

        <section>
            <div style="padding-bottom: 2px;">
                <button class="btn btn-success text-uppercase float-right w-10 "data-toggle="modal" data-target="#modalProjet" type="submit" ><i class="fab fa-google mr-2"></i> Ajouter</button>
            </div>
            <table class="table">
                <thead class="thead-dark">
                    <tr>

                        <th scope="col">Nom de l'équipe</th>
                        <th scope="col">Capitaine</th>
                        <th scope="col">Sport</th>
                        <th scope="col">Nombre de parties jouées</th>
                        <th scope="col">Nombre de joueurs</th>
                    </tr>
                </thead>
                <tbody>



                    <tr>

                <form  action="" method="post" name="action" value="gestionProjet">
                    <%
                        for (int i = 0; i < liste_equipes.size(); i++) {
                            if (liste_equipes.get(i).getCreateur().equals(identifiant)) {
                    %>
                    <form  action="" method="" name="" value="">

                        <!--<td><input name="pjt" value="<%=liste_projets.%>"></td>-->
                        <td name="prjt"><%=liste_projets.get(i).getNom()%></td>
                        <td><%=liste_projets.get(i).getDescription()%></td>
                        <td><%=liste_projets.get(i).getDateCreation()%></td>
                        <td><%=liste_projets.get(i).getStatut()%></td>



                        <input type="hidden" name="indice" value=<%=i%>>
                        <td>                            
                             <a href="?action=gestionProjet&prjt=<%=liste_projets.get(i).getNom()%>" class="btn btn-success" type="submit" >Gérer</a>                            
                        </td>

                        </tr>

                        <% }
                            }
                        %>

                    </form>






                    </tbody>
            </table>


        </section>



    </body>
</html>
