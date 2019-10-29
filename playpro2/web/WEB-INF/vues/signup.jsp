<%-- 
    Document   : signup_view
    Created on : 2019-10-05, 15:53:52
    Author     : dd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

        <link href="static/css/styles.css" rel="stylesheet">
        <link href="static/css/styleslogin.css" rel="stylesheet">

        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        
        

        <!--        <script>
                    $(function () {
                        $("#accordion").accordion();
                    });
                </script>-->

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Inscription</title>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <br><br><br><br><br><br><br><br><br><br><br>
        <div class="signup-form">
            <div class="container text-center border-1">
                <h2>Inscription</h2>
                <p class="hint-text">Devenez membre de PlayPro !</p>
                <div class="container d-flex btn-floating">

                    <!--<button onclick="document.getElementById('id01').style.display = 'block'" class="btn btn-primary float-left" style="width:auto;">Joueur</button>-->

                    <!--<button onclick="document.getElementById('id02').style.display = 'block'" class="btn btn-primary float-right" style="width:auto;">Entraineur</button>-->

                    <button id='btnJ' onclick="cacherE()" type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                        Joueur
                    </button>
                    <button id='btnE' onclick="cacherJ()" type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                        Entraineur
                    </button>
                </div>            
            </div>
        </div>
        <br><br><br><br><br><br><br><br><br>


        <%@include file="modals.jsp" %>
        
        

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script src="static/js/gestion.js" ></script>
        <script src="static/js/validation.js" ></script>
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    </body>
    <script>

                        $("#commit").on("click", function validatePassword() {
                            var pass1 = $("#password").val();
                            var pass2 = $("#confirm_password").val();
                            pass1 != pass2 ? document.getElementById("confirm_password").setCustomValidity("Les mots de passe sont différents")
                                    : document.getElementById("confirm_password").setCustomValidity('');
                        })
    </script>

    <script>
    </script>





    <script>

    </script>


    <%@include file="footer.jsp" %>

</html>