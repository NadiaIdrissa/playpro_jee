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
                <i class="fa fa-user"></i> Mon profil
            </a>
        </li>
        
        <li>
            <a href="?action=portail">
                <i class="fa fa-calendar-alt"></i> Calendrier
            </a>
        </li>
        <li>
            <a href="#">
                <i class="fa fa-users"></i> Equipes
            </a>
        </li>
        
        <li>
            <a href="#">
                <i class="fa fa-play-circle"></i> Parties
            </a>
        </li>
        <%
//        Membre m = null;
//        m = (Membre) request.getSession().getAttribute("membre");
//        if (m.getTypeMembre() == "Entraineur")){  
        %>
            <li>
                <a href="#">
                    <i class="fa fa-file-signature"></i> Annonces
                </a>
            </li>
        <% //}%>
        
        <li>
            <a href="#">
                <i class="fa fa-users-cog"></i> Membres
            </a>
        </li>
    </ul>
</div>

<%--<%@include file="modalProfil.jsp" %>--%>