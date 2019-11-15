<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>PlayPro</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link  rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>

        <!--<link href="static/css/styles.css" rel="stylesheet">-->
        <!--<script src="static/js/gestion.js" ></script>-->
        <!--<link href="static/css/styles.css" rel="stylesheet" type="text/css">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">

        <link href="static/css/cssFooter/styles.css" rel="stylesheet" type="text/css">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="static/css/calendrier.css"/>
        <script src="static/js/calendrier.js"></script>
        <script src="static/js/modernizr.custom.25376.js"></script>




    </head>
    <body>
        <%if ((request.getSession().getAttribute("connected") == null) || ((boolean) request.getSession().getAttribute("connected") == false)) {%>
        <%@include file="header.jsp" %>
        <%--<%@include file="carousel.jsp" %>--%>

        <%} else {%>
        <%@include file="headerMembre.jsp" %>

        <% }%>

        <c:if test="${sessionScope.connected == null }">

    <%--<jsp:forward page="login.jsp" />--%>
    <section class="banner">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <h2>
                        Avec PlayPro, pratiquez votre sport préféré avec professionalisme.

                    </h2>
                    <p>
                        Il s'agit d'une plateforme gratuite qui vous permettra d'organiser tous vos événements sportifs ainsi
                        que vos propres équipes. En tant qu'un simple visiteur, vous pouvez consulter toutes les parties qui
                        existent, mais pour y participer, il faut créer un compte. Ainsi, vous pouvez profiter de tous les
                        avantages de PlayPro. 
                    </p>
                    <a href='#' class="btnD">Créer un compte</a>

                </div>
            </div>
        </div>
    </section>

</c:if >

        <h1>Une gestion d'événements hors du commun</h1>

        <br><br>


        <div class="row present">
            <div class="col-md-4">
                <h2>Agilité</h2>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                <p><a class="btn btn-secondary" href="#" role="button">Voir détails »</a></p>
            </div>
            <div class="col-md-4">
                <h2>Retrospection</h2>
                <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
                <p><a class="btn btn-secondary" href="#" role="button">Voir détails »</a></p>
            </div>
            <div class="col-md-4">
                <h2>Suivi</h2>
                <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn btn-secondary" href="#" role="button">Voir détails »</a></p>
            </div>
        </div>

        <br><br><br>
        <%@include file="calendrier.jsp" %>

        <%@include file="calendrier2.jsp" %>

    </div>
    <%@include file="footer.jsp" %>
    <script src="static/bootstrap/js/bootstrap.min.js" ></script>
    <script src="static/bootstrap/js/bootstrap.bundle.min.js" ></script>
    <script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <!--<script src="static/js/navBar.js" ></script>-->
</body>
</html>