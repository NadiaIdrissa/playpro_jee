<%
    HttpSession httpSession = request.getSession(false); 
    Membre m = null;
    String viewConf = "";

    if(httpSession != null){
        m = (Membre) httpSession.getAttribute("membre");
        viewConf = (String) httpSession.getAttribute("viewConf");
    }
%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
       
        
        <title>Portail</title>
        <!--<link rel="stylesheet" type="text/css" href="static/css/normalize.css" />-->
        <link rel="stylesheet" type="text/css" href="static/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="static/css/component.css" />
        <link rel="stylesheet" type="text/css" href="static/css/calendrier.css"/>
        <link rel="stylesheet" href="static/bootstrap/fontAwesome/css/font-awesome.min.css"/>
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous">
        </script>
        <script src="static/js/calendrier.js"></script>
        <script src="static/js/modernizr.custom.25376.js"></script>
        <script src="static/js/gestion.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <link href="static/css/sportsstyles.css" rel="stylesheet">
        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <%@include file="menu.jsp" %>
        <div id="perspective" class="perspective effect-movedown">
            <div class="container" style="max-width: unset">
                <div class="wrapper"><!-- wrapper needed for scroll -->
                    <%@include file="sidebar.jsp" %>
                </div>
                
                <div class="main mainPortail clearfix">
                    <%if (viewConf.equals("profilaccueil")){%>
                        <%@include file="profil.jsp"%>
                    <%}else if (viewConf.equals("calendrier")){%>
                        <%@include file="calendrier.jsp"%>
                    <%}else if (viewConf.equals("suppCompte")){%>
                        <%@include file="suppressionCompte.jsp"%>
                    <%--}else if (viewConf.equals("equipe")){--%>
                        <%--<%@include file="creerEquipe.jsp"%>--%>
                    <%}else if (viewConf.equals("sports")){%>
                        <%@include file="sports.jsp"%>
                    <%}else if (viewConf.equals("lieux")){%>
                        <%@include file="lieux.jsp"%>
                    <%}else{%>
                        <%@include file="calendrier.jsp"%>
                    <%}%>
                </div>
            </div>
            <%@include file="header4.jsp" %>
        </div>        
        <script src="static/js/classie.js"></script>
        <script src="static/js/menu.js"></script>
        <script src="static/js/sports.js"></script>
    </body>
</html>