<%-- 
    Document   : sidebar
    Created on : 2019-10-18, 18:35:22
    Author     : dd
--%>
<%@page import="com.playpro.entities.Membre"%>

<div class="sidenav">

    <ul class="nav">
        <li>
            <a href="?action=profil">
                <!--<a data-toggle="modal" data-target="#id02">-->
                <i class="fa fa-list-ul"></i> Mon profil
            </a>
        </li>
        
        <li>
            <a href="?action=portail">
                <i class="fa fa-paper-plane"></i> Calendrier
            </a>
        </li>
        <li>
            <a href="?action=equipes">
                <i class="fa fa-list-ul"></i> Equipes
            </a>
        </li>
        
        <li>
            <a href="#">
                <i class="fa fa-paper-plane"></i> Parties
            </a>
        </li>
        <li>
            <a href="?action=sports">
                <i class="fa fa-paper-plane"></i> Les sports
            </a>
        </li>
         <li>
            <a href="#">
                <i class="fa fa-paper-plane"></i> Les lieux
            </a>
        </li>
        
        <%
//        Membre m = null;
//        m = (Membre) request.getSession().getAttribute("membre");
//        if (m.getTypeMembre() == "Entraineur")){  
        %>
            <li>
                <a href="#">
                    <i class="fa fa-list-ul"></i> Annonces
                </a>
            </li>
        <% //}%>
        
        <li>
            <a href="#">
                <i class="fa fa-paper-plane"></i> Membres
            </a>
        </li>
    </ul>
</div>

<%--<%@include file="modalProfil.jsp" %>--%>