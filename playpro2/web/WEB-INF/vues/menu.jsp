<%@page import="com.playpro.entities.Membre"%>
<head>
    <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
</head>

<header>
    <div class="navbar navbar-nav bg-secondary" style="flex-direction: unset;">

        <img class="affichageLogo" src="static/images/logo2.svg" alt="Logo">
        
        <!--<img src="static/images/logo.png" class="rounded float-left affichageLogo" alt="Responsive image">-->
        
        <%--if ((request.getSession().getAttribute("connected") != null) && 
            ((boolean) request.getSession().getAttribute("connected") == true)){
            Membre me = null;
            me = (Membre) request.getSession().getAttribute("membre");
        --%>
        <a class="affichageNom navbar-header" style="text-transform: uppercase;">Portail PlayPro <span id="typeMembre"><%=m.getTypeMembre()%></span></a>
            <div style="display: flex; flex-direction: column; margin-right: 3%;">
                <a class="affichageNom navbar-header" style="font-size: 1em;">Bienvenue <%=m.getPseudo()%></a>
                <button id="showMenu" class="float-right">Menu</button>
            </div>
    </div>
</header>

