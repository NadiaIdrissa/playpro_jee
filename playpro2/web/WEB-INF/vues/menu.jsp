<%@page import="com.playpro.entities.Membre"%>
<header>
    <div class="navbar" style="background-color: #e9ecef">
        <a class="navbar-brand" href="#">
            <img src="static/images/logo.png" alt="Logo" style="width:40px;">
        </a>
        <!--<img src="static/images/logo.png" class="rounded float-left affichageLogo" alt="Responsive image">-->
        
        <%if ((request.getSession().getAttribute("connected") != null) && 
            ((boolean) request.getSession().getAttribute("connected") == true)){
            Membre me = null;
            me = (Membre) request.getSession().getAttribute("membre");
        %>
            <a class="affichageNom navbar-header">Bienvenue <%=me.getPrenom()%></a>
            <button id="showMenu" class="float-right">Menu</button>
            
        <%}else{%>
            <button id="showMenu" class="float-right">Menu</button>
        <%}%>
    </div>
</header>

