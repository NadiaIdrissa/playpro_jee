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
                <i class="fa fa-user"></i> <span class="sideLabel">Mon profil</span>
            </a>
        </li>
        
        <li>
            <a href="?action=portail&sousAction=loadCalendrier">
                <i class="fa fa-calendar"></i> <span class="sideLabel">Calendrier</span>
            </a>
        </li>
        
        <li>
            <a href="?action=portail&sousAction=loadEquipe">
                <i class="fa fa-users"></i> <span class="sideLabel">Equipes</span>
            </a>
        </li>
        
        <li>
            <a href="#">
                <i class="fa fa-play-circle"></i> <span class="sideLabel">Parties</span>
            </a>
        </li>
        
        <%
          if (!m.getTypeMembre().equals("Joueur")){  
        %>
            <li>
                <a href="#">
                    <i class="fa fa-file"></i><span class="sideLabel"> Annonces</span>
                </a>
            </li>
        <%}%>
        
        <%
          if (m.getTypeMembre().equals("Admin")){  
        %>
        <li>
            <a href="#">
                <i class="fa fa-user-plus"></i><span class="sideLabel"> Membres</span>
            </a>
        </li>
        <%}%>
        
        <li>
            <a href="#">
                <i class="fa fa-paper-plane"></i><span class="sideLabel"> Invitations</span>
            </a>
        </li>
    </ul>
</div>

