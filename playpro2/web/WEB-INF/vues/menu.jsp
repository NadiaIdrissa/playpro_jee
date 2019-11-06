<%@page import="com.playpro.entities.Membre"%>
<header>
    <div class="row">
        <img src="static/images/logo.png" class="rounded float-left affichageLogo" alt="Responsive image">
    <%
    if ((request.getSession().getAttribute("connected") != null) && 
       ((boolean) request.getSession().getAttribute("connected") == true)){
        Membre me = null;
        me = (Membre) request.getSession().getAttribute("membre");
    %>
        <span class="affichageNom">Bienvenue <%=me.getPrenom()%></span>
        <button id="showMenu" class="affichageMenuBtn">Menu</button>
    <%}else{%>
    <button id="showMenu" class="affichageMenuBtn">Menu</button>
    <%}%>
    </div>
</header>

