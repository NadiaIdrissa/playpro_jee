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
        <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <link href="static/css/cssFooter/styles.css" rel="stylesheet" type="text/css">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="static/css/calendrier.css"/>
       
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%--<%@include file="carousel.jsp" %>--%>

    <%--<c:if test="${sessionScope.connected == null || sessionScope.connected == false}">--%>
        <section class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-sm-7">
                        <h2>
                            Avec PlayPro, pratiquez votre sport préféré avec professionalisme.
                        </h2>
                        <p>
                            PlayPro est une plateforme gratuite qui vous permettra d'organiser vos événements sportifs et
                            vos équipes. En tant que simple visiteur, vous pouvez consulter toutes les parties qui
                            existent, mais pour y participer, il faudra vous créer un compte. Ainsi, vous pourrez profiter de toutes les
                            fonctionnalités offertes par PlayPro. 
                        </p>
                        <a href='#' class="btn btn-secondary btnD">Créer un compte</a>
                    </div>
                </div>
            </div>
        </section>
    <%--</c:if >--%>
   <div id="apropos" class="jump">
        <h2 class="subtitleInd">Une gestion d'événements hors du commun</h2>

        <div class="row present">
            <div class="col-md-4 presMembres">
                <h2>Visiteurs</h2>
                <p>
                    Informez vous sur les parties à venir en fonction de votre sport préféré.
                    Inscrivez vous pour accéder à nos fonctionnalités!
                </p>

                <p>
                    <a class="btn btn-secondary btnD" aria-haspopup="true" data-toggle="collapse" href="#collapsePres1" role="button" aria-expanded="false" aria-controls="collapsePres1">Détails</a>
                </p>
                <div class="collapse" id="collapsePres1">
                    <div class="detailsStyle">
                        À l'aide du calendrier, sélectionnez une date pour afficher toutes les parties
                        prévues relatives à ce sport.Si vous désirez intégrer une des équipes pour jouer aux parties à venir,
                        connectez vous ou créez un compte gratuitement.
                    </div>
                </div>         
            </div>

            <div class="col-md-4 presMembres">
                <h2>Joueurs</h2>
                <p>
                    Déjà membre? Accédez à toutes les parties et aux équipes 
                   existantes, personnalisez vos parties et vos équipes!
                </p>
                <p>
                    <a class="btn btn-secondary btnD" data-toggle="collapse" href="#collapsePres2" role="button" aria-expanded="false" aria-controls="collapsePres2">Détails</a>
                </p>
                <div class="collapse" id="collapsePres2">
                    <div class="detailsStyle">
                        Vous pouvez intégrer une équipe créée par un autre joueur. 
                        Accédez à toutes les parties programmées pour une équipe donnée 
                        et trouvez de nouveaux coéquipiers en interagissant avec les autres
                        membres de PlayPro.
                    </div>
                </div>
            </div>

            <div class="col-md-4 presMembres">
                <h2>Entraîneurs</h2>
                <p>En plus du joueur, vous avez la possibilité de publier 
                   des annonces pour l'organisation de vos cours.
                </p>
                <p>
                    <a class="btn btn-secondary btnD" data-toggle="collapse" href="#collapsePres3" role="button" aria-expanded="false" aria-controls="collapsePres3">Détails</a>
                </p>
                <div class="collapse" id="collapsePres3">
                    <div class="detailsStyle">
                        Les annonces vous permettront d'offrir vos services de coach, qu'ils soient gratuits ou non*.
                        À la publication de votre annonce, les joueurs intéressés pourront entrer en contact 
                        avec vous afin de bénéficier de vos compétences.
                        <p style="font-size: xx-small;">
                            *Pour tout problème concernant l'aspect financier lié aux annonces, 
                            la responsabilité est celle de chacun des membres impliqué.
                            PlayPro ne gère pas les modalités pécuniaires relatives aux cours offerts par les entraîneurs
                            mais peut intervenir auprès d'un membre en cas de problème récurrent. 
                            Si un problème persiste, n'hésitez pas à nous contacter.
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div id="cal" class="jump">
        <h2  class="subtitleInd">Les événements enregistrés jusqu'à présent</h2>
        <div class="row" style="margin-left: auto; margin-right: auto;">
            <%@include file="calendrier.jsp" %>
        </div>
    </div>
    <%@include file="footer.jsp" %>
    
    <script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>
    <!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="static/bootstrap/js/bootstrap.min.js" ></script>
    <script src="static/bootstrap/js/bootstrap.bundle.min.js" ></script>
    <script src="static/js/calendrier.js"></script>
    <script src="static/js/modernizr.custom.25376.js"></script>
    <script src="static/js/navBar.js" ></script>
</body>
</html>
