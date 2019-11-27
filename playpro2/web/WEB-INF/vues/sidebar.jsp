<%-- 
    Document   : sidebar
    Created on : 2019-10-18, 18:35:22
    Author     : dd
--%>
<%@page import="com.playpro.entities.Membre"%>

<div class="sidenav">

    <ul class="nav">
        <li>
</a>
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
<!--            <a href="?action=equipes">-->
            <a href="?action=equipe&sousAction=loadEquipe">
                <i class="fa fa-users"></i> <span class="sideLabel">Equipes</span>
            </a>
        </li>
        
        <li>
            <a href="#">
                <i class="fa fa-play-circle"></i> <span class="sideLabel">Parties</span>
            </a>
        </li>
        <li>
            <a href="?action=sports">
                <i class="fa fa-soccer-ball-o"></i> <span class="sideLabel">Sports</span>
            </a>
        </li>
         <li>
            <a href="?action=lieux">
                <i class="fa fa-map-marker"></i> <span class="sideLabel">Lieux</span>
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
            <a href="?action=membres">
                <i class="fa fa-user-plus"></i><span class="sideLabel"> Membres</span>
            </a>
        </li>
        <%}%>
        
        <li>
            <a href="?action=traitementInvitation">
                <i class="fa fa-paper-plane"></i>
                <span class="sideLabel"> Invitations</span>
            </a>
        </li>
        <span class="badge" style="color: #66afe9;" >
            (<c:out value="${sessionScope.NbInvitations}"/>)
        </span>
    </ul>
</div>

