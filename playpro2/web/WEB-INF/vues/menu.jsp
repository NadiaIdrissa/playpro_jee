<%@page import="com.playpro.entities.Membre"%>
<header>
    <div class="row">
        <img src="static/images/logo.png" class="rounded float-left affichageLogo" alt="Responsive image">
    <%
    if ((request.getSession().getAttribute("connected") != null) && 
       ((boolean) request.getSession().getAttribute("connected") == true)){
        Membre m = null;
        m = (Membre) request.getSession().getAttribute("membre");
    %>
        <span class="affichageNom">Bienvenue <%=m.getPrenom()%></span>
        <button id="showMenu" class="affichageMenuBtn">Menu</button>
    <%}else{%>
    <button id="showMenu" class="affichageMenuBtn">Menu</button>
    <%}%>
    </div>
</header>

<<<<<<< HEAD


<!--<div id="perspective" class="perspective effect-movedown">-->
    
    
    

=======
<!--<div id="perspective" class="perspective effect-movedown">--> 
<nav class="outer-nav top horizontal">
    <a href="#" class="icon-home">Home</a>
    <a href="#" class="icon-news">News</a>
    <a href="#" class="icon-image">Images</a>
    <a href="#" class="icon-upload">Uploads</a>
    <a href="#" class="icon-star">Favorites</a>
    <a href="#" class="icon-mail">Messages</a>
    <a href="#" class="icon-lock">Security</a>
</nav>
>>>>>>> e9db1ad54458ccfb0ff792396cfe807023fc662a
<!--</div>-->