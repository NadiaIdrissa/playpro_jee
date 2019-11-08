<%-- 
    Document   : sidebar
    Created on : 2019-10-18, 18:35:22
    Author     : dd
--%>
<%@page import="com.playpro.entities.Membre"%>

<div class="sidenav">

    <ul class="nav">
        <li>
            <a href="?action=portail&sousAction=loadProfil">
                <i class="fa fa-user"></i> Mon profil
            </a>
        </li>
        
        <li>
            <a href="?action=portail&sousAction=loadCalendrier">
                <i class="fa fa-calendar"></i> Calendrier
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
                    <i class="fa fa-file"></i> Annonces
                </a>
            </li>
        <% //}%>
        
        <li>
            <a href="#">
                <i class="fa fa-user-plus"></i> Membres
            </a>
        </li>
        
        <li>
            <a href="#">
                <i class="fa fa-paper-plane"></i> Invitations
            </a>
        </li>
    </ul>
</div>

