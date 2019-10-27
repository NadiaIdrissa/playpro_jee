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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <script src="static/js/gestion.js" ></script>
        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <!--        <script>
                    $(function () {
                        $("#accordion").accordion();
                    });
                </script>-->

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <title>Profil</title>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <br><br><br><br><br><br><br><br><br><br><br>
        <div class="signup-form">
            <div class="container text-center border-1">
                <h2>Mon profil</h2>

                <div class="container d-flex btn-floating">


                    <button id='btnJ' onclick="cacherE()" type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                        Continuer
                    </button>

                </div>            
            </div>
        </div>
        <br><br><br><br><br><br><br><br><br>


        <%@include file="modalProfil.jsp" %>



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
//        var sport = document.getElementById("sport");

        function  cacherE() {
            var niveau = document.getElementById("niveau");
            var sport = document.getElementById("sport");

            if (sport.style.display === "none") {

            } else {
                debugger
                sport.style.display = "none";
                ($("img")[1]).style.display = "none";
                sport.children[0].required = false
            }
            if (niveau.style.display === "none") {
                niveau.style.display = "block";
                ($("img")[0]).style.display = "block";
                niveau.children[0].children[1].required = true;
            } else {

            }
        }

    </script>





    <script>
        (function () {
            'use strict';
            window.addEventListener('load', function () {
// Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');
// Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>


    <%@include file="footer.jsp" %>

</html>