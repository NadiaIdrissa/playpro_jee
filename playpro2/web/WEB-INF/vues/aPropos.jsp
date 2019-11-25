<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
       <title>À propos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link  rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>

        <!--<link href="static/css/styles.css" rel="stylesheet">-->
        <!--<script src="static/js/gestion.js" ></script>-->
        <!--<link href="static/css/styles.css" rel="stylesheet" type="text/css">-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">

        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">

        
    </head>
    <body>
        
        <%@include file="header.jsp" %>
        <%--<c:if test="${sessionScope.connected == null }">--%>

            <%--<jsp:forward page="login.jsp" />--%>
            <!--<section class="banner">-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2>
                                Avec PlayPro, pratiquez votre sport préféré avec professionalisme.

                            </h2>
                            <p>
                               PlayPro est une plateforme web qui permettra aux sportifs amateurs
                                de sports collectifs de gérer leurs matchs.
                                Notre application sera un outil de communication 
                                entre amateurs qui offrira des services afin qu'ils puissent organiser 
                                la pratique de leurs sports collectifs préférés.
                                Il servira egalement pour les sportifs professionnels : des outils leur seront
                                offerts afin qu'ils puissent agrandir leur clientèle ou s'en créer une. De plus,
                                l'application gèrera les notifications afin de tenir l'utilisateur à jour, en tout temps,
                                de tout changement relatif à ses activités.
                            </p>
                            <!--<a href='#' class="btnD">Créer un compte</a>-->

                        </div>
                    </div>
                </div>
            <!--</section>-->
        <%--</c:if>--%>

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