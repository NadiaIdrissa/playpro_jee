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
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <!--<script src="static/js/gestion.js" ></script>--> 
        <script src="static/js/jquery-3.4.1.min.js"></script>
        <script src="static/js/validation.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
        <link href="static/css/styleslogin.css" rel="stylesheet" type="text/css">
        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">


        <title>Inscription</title>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="signup-form">
            <div class="container text-center border-1">
                <h2>Inscription</h2>
                <p class="hint-text">Devenez membre de PlayPro !</p>

                <div class="btn-floating">
                    <button id='btnJ' onclick="cacherE()" type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                        Joueur
                    </button>
                    <button id='btnE' onclick="cacherJ()" type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                        Entraineur
                    </button>
                </div>            
            </div>
        </div>

        <%@include file="modals.jsp" %>
        <%@include file="footer.jsp" %>        

        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <script src="static/bootstrap/js/bootstrap.bundle.min.js" ></script>
        <script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script>
            $("#commit").on("click", function validatePassword() {
                var pass1 = $("#password").val();
                var pass2 = $("#confirm_password").val();
                pass1 != pass2 ? document.getElementById("confirm_password").setCustomValidity("Les mots de passe sont différents")
                        : document.getElementById("confirm_password").setCustomValidity('');
            })
        </script>
    </body>
</html>