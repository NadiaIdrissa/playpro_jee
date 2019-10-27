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
                <i class="fa fa-list-ul"></i> Mon profil
            </a>
        </li>
        
        <li>
            <a href="?action=calendar">
                <i class="fa fa-paper-plane"></i> Calendrier
            </a>
        </li>
        <li>
            <a href="?action=equipe">
                <i class="fa fa-list-ul"></i> Equipes
            </a>
        </li>
        
        <li>
            <a href="?action=partie">
                <i class="fa fa-paper-plane"></i> Parties
            </a>
        </li>
        <%
//        Membre m = null;
//        m = (Membre) request.getSession().getAttribute("membre");
//        if (m.getTypeMembre() == "Entraineur")){  
        %>
            <li>
                <a href="?action=annonce">
                    <i class="fa fa-list-ul"></i> Annonces
                </a>
            </li>
        <% //}%>
        
        <li>
            <a href="?action=membre">
                <i class="fa fa-paper-plane"></i> Membres
            </a>
        </li>
    </ul>
</div>

