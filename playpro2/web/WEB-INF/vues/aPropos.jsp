<!DOCTYPE html>
<html lang="fr" class="no-js">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <title>� propos de nous</title>
        <link rel="stylesheet" type="text/css" href="static/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="static/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="static/css/component.css" />
        <script src="static/js/modernizr.custom.25376.js"></script>
        
    </head>
    <body>
        
        <%@include file="menu.jsp" %>
        <div id="perspective" class="perspective effect-movedown">
            <div class="container">
                
                <div class="wrapper"><!-- wrapper needed for scroll -->
                     
                     
                    <header class="codrops-header">
                        <h1>Equipe de PlayPro <span>Changeant la vision de pratiquer son sport en tant qu'amateur</span></h1>	
                    </header>
                    <div class="main clearfix">
                        <div class="column">
                            <!--<p><button id="showMenu">Show Menu</button></p>-->
                            <p>
                                PlayPro est une plateforme web qui permettra aux sportifs amateurs
                                de sports collectifs de g�rer leurs matchs.
                                Notre application sera un outil de communication 
                                entre amateurs qui offrira des services afin qu'ils puissent organiser 
                                la pratique de leurs sports collectifs pr�f�r�s.
                            </p>
                        </div>
                        <div class="column">

                            <p>
                                 Il servira egalement pour les sportifs professionnels : des outils leur seront
                                 offerts afin qu'ils puissent agrandir leur client�le ou s'en cr�er une. De plus,
                                 l'application g�rera les notifications afin de tenir l'utilisateur � jour, en tout temps,
                                 de tout changement relatif � ses activit�s.
                            </p>

                        </div>

                    </div>
                </div>
            </div>
            
            <%@include file="headerNonMembre.jsp" %>
            <%@include file="footer.jsp" %>

        </div>
        <script src="static/js/classie.js"></script>
        <script src="static/js/menu.js"></script>
    </body>
</html>