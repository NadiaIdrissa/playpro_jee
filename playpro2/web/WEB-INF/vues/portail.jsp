<%
    HttpSession httpSession = request.getSession(false);
    Membre m = null;
    String viewConf = "";
    String message = "";
    String laClasse = "";

    if (httpSession != null) {
        m = (Membre) httpSession.getAttribute("membre");
        viewConf = (String) httpSession.getAttribute("viewConf");
        message = (String) request.getAttribute("message");
        laClasse = (String) request.getAttribute("laClasse");
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

        <script src="static/js/jquery-3.4.1.min.js"></script>
        <script src="static/js/calendrier.js"></script>
        <script src="static/js/modernizr.custom.25376.js"></script>
        <!--<script src="static/js/gestion.js" ></script>-->
        <link href="static/css/styles.css" rel="stylesheet">
        <link href="static/css/sportsstyles.css" rel="stylesheet">
        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">

    </head>
    <body>
        <%@include file="menu.jsp" %>
        <div id="perspective" class="perspective effect-movedown">
            <div class="container" style="max-width: unset;">
                <div class="wrapper"><!-- wrapper needed for scroll -->
                    <%@include file="sidebar.jsp" %>
                </div>

                <div class="main mainPortail clearfix">
                    <%if (message != null && !message.equals("")) {
                    %>
                    <div class="alert text-center alert-<%=laClasse%> alert-dismissible fade show" role="alert">
                        <strong>Important!</strong> <%=message%>
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <%}
                    %>

                    <div id="contenu">
                        <%if (viewConf.equals("profilaccueil")) {%>
                        <%@include file="profil.jsp"%>
                        <%} else if (viewConf.equals("calendrier")) {%>
                        <%@include file="calendrier.jsp"%>
                        <%} else if (viewConf.equals("suppCompte")) {%>
                        <%@include file="suppressionCompte.jsp"%>
                        <%} else if (viewConf.equals("loadEquipe")) {%>
                        <%@include file="equipes.jsp"%>
                        <%} else if (viewConf.equals("sports")) {%>
                        <%@include file="sports.jsp"%>
                        <%} else if (viewConf.equals("lieux")) {%>
                        <%@include file="lieux.jsp"%>
                        <%} else if (viewConf.equals("annonces")) {%>
                        <%@include file="annonce.jsp"%>
                        <%} else if (viewConf.equals("membres")) {
                        %>
                        <%@include file="membres.jsp"%>

                        <%} else if (viewConf.equals("parties")) {
                        %>
                        <%@include file="parties.jsp"%>

                        <%} else if (viewConf.equals("invitation")) {
                        %>
                        <%@include file="invitation.jsp"%>

                        <%} else if (viewConf.equals("traitementInvitation")) {
                        %>
                        <%@include file="traitementInvitation.jsp"%>

                        <%} else if (viewConf.equals("reponseInvitation")) {
                        %>
                        <%@include file="reponseInvitation.jsp"%>
                        <%} else if (viewConf.equals("invitations")) {
                        %>
                        <%@include file="reponseInvitation.jsp"%>

                        <%} else {%>
                        <%@include file="calendrier.jsp"%>
                        <%}%>
                    </div>

                </div>
            </div>
            <%@include file="header4.jsp" %>
        </div>  
        
        <script>
            $('#btnAnnonce').click(function (e) {
                var contenu = document.getElementById("contenu");

                contenu.innerHTML = "";
//        e.preventDefault();
                console.log("allo");
                console.log("allo");

                $.ajax({
                    url: 'playpro2/?action=annonce',
                    type: 'POST',
                    dataType: "json",
                    success: function (response, statut) {
                        console.log("reussi");
                        console.log(response);
                        console.log(statut);

                        $.each(response, function (index, value) {
                            afficherAnnonces(value);
                        });
                    },
                    error: function (response, statut, message) {
                        console.log("echec");
                        console.log(response);
                    }
                })
            });

        </script>
        <script src="static/js/classie.js"></script>
        <script src="static/js/menu.js"></script>
        <script src="static/js/validation.js" ></script>
        <script src="static/js/gestion.js" ></script>
        
    </body>
</html>