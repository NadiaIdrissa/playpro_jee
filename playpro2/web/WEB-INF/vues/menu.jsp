<%@page import="com.playpro.entities.Membre"%>
<header>
    <div class="navbar" style="background-color: #e9ecef">
        
        <img src="static/images/logo.png" class="rounded float-left affichageLogo" alt="Responsive image">
    <%
    if ((request.getSession().getAttribute("connected") != null) && 
       ((boolean) request.getSession().getAttribute("connected") == true)){
        Membre me = null;
        me = (Membre) request.getSession().getAttribute("membre");
    %>
        <p class="affichageNom">Bienvenue <%=me.getPrenom()%></p>
        <button id="showMenu" class="affichageMenuBtn float-right">Menu</button>
    <%}else{%>
    <button id="showMenu" class="affichageMenuBtn float-right">Menu</button>
    <%}%>
    </div>
</header>
