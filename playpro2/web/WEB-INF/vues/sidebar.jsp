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
            <!--            <a href="?action=equipes">-->
            <a href="?action=equipe&sousAction=loadEquipe">
                <i class="fa fa-users"></i> <span class="sideLabel">Equipes</span>
            </a>
        </li>

        <li>
            <a id='parties' href="?action=parties">
                <i class="fa fa-play-circle"></i> <span class="sideLabel" style="margin-right: 30px;">Parties</span>
            </a>
        </li>
        <li>
            <a  href="?action=sports">
                <i class="fa fa-soccer-ball-o"></i> <span class="sideLabel" style="margin-right: 30px;">Sports</span>
            </a>
        </li>
        <li>
            <a  href="?action=lieux">
                <i class="fa fa-map-marker"></i> <span class="sideLabel" style="margin-right: 50px;">Lieux</span>
            </a>
        </li>

        
        <li>
            <a class="btnSide" id="btnAnnonce" >
                
                <i class="fa fa-file"></i><span class="sideLabel"> Annonces</span>
            </a>
        </li>
        

        <%
            if (m.getTypeMembre().equals("Admin")) {
        %>
        <li>
            <a href="?action=membres">
                <i class="fa fa-user-plus"></i><span class="sideLabel"> Membres</span>
            </a>
        </li>
        
        <li>
            <a href="?action=Commentaire">
                <i class="fa fa-pencil"></i><span class="sideLabel"> Commentaires</span>
            </a>
        </li>
        <%}%>

        <li>
            <!--<a class="btnSide" style="display: block" id="btnTraiterInvitation">-->
            <a href="?action=portail&sousAction=invitations">
                <i class="fa fa-paper-plane"></i>

                <span class="sideLabel">Invitations </span><span class="badge">
                <c:out value="${sessionScope.NbInvitations}"/>
                </span>
            </a>
        </li>
    </ul>

</div>

