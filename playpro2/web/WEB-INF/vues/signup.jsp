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
                <input type="text" class="form-control" name="first_name" placeholder="Nom" required="required">
            </div>
            
            <div class="form-group">
                <input type="text" class="form-control" name="last_name" placeholder="Prénom" required="required">      	
            </div>

            <div class="form-group">
                <input type="email" class="form-control" name="email" placeholder="Courriel" required="required">
            </div>

            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="Mot de passe" required="required">
            </div>

            <div class="form-group">
                <input type="password" class="form-control" name="confirm_password" placeholder="Confirmez le mot de passe" required="required">
            </div> 

            <div class="form-group">
                <button type="submit" class="btn btn-success btn-lg btn-block">S'inscrire</button>
            </div>
        </form>

        <div class="text-center">Vous avez déjà un compte ? <a href="./login_view.jsp">Connectez-vous</a></div>
    </div>
</body>
</html>
