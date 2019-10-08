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
        <link href="resources/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="resources/bootstrap/js/bootstrap.min.js" ></script>
        <link href="resources/css/styles.css" rel="stylesheet">
        <script src="resources/js/gestion.js" ></script>
        <link href="resources/css/styles.css" rel="stylesheet" type="text/css">
        <title>Inscription</title>
    </head>
    <body>
        <div class="signup-form">
            <form action="/examples/actions/confirmation.php" method="post">
                <h2>Inscription</h2>

                <p class="hint-text">Devenez membre de PlayPro !</p>

                <div class="form-group">
                    <input type="text" class="form-control" name="prenom" placeholder="Nom" required="required">
                </div>

                <div class="form-group">
                    <input type="text" class="form-control" name="nom" placeholder="Prénom" required="required">      	
                </div>

                <div class="form-group">
                    <input type="email" class="form-control" name="email" placeholder="Courriel" required="required">
                </div>

                <div class="form-group">
                    <input id="password" type="password" class="form-control" name="password" placeholder="Mot de passe" required="required">
                </div>

                <div class="form-group">
                    <input id="confirm_password" type="password" class="form-control" name="confirm_password" placeholder="Confirmez le mot de passe" required="required">
                </div> 

                <div class="form-group">
                    <button id="commit" type="submit" class="btn btn-success btn-lg btn-block">S'inscrire</button>
                </div>
            </form>

            <div class="text-center">Vous avez déjà un compte ? <a href="/login_view.jsp">Connectez-vous</a></div>
        </div>
    </body>
    <script>

        $("#commit").on("click", function validatePassword() {
            debugger;
            var pass1 = $("#password").val();
            var pass2 = $("#confirm_password").val();
            pass1 != pass2 ? document.getElementById("confirm_password").setCustomValidity("Passwords don't Match")
                    : document.getElementById("confirm_password").setCustomValidity('');
        })
    </script>

</html>