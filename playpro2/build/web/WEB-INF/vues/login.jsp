<%-- 
    Document   : login_view
    Created on : 2019-10-05, 14:50:56
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
        <script src="static/js/gestion.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
        <title>Connexion</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
            <form class="form-signin">
              
                <h2 class="form-signin-heading">Connexion</h2>
                
                <label for="inputEmail" class="sr-only">Adresse courriel</label>
                <input type="email" id="inputEmail" class="form-control" placeholder="Courriel" required autofocus>
              
                <label for="inputPassword" class="sr-only">Mot de passe</label>
                <input type="password" id="inputPassword" class="form-control" placeholder="Mot de passe" required>
              
                <div class="checkbox">
                    <label>
                      <input type="checkbox" value="remember-me"> Se souvenir de moi
                    </label>
                </div>
                <button class="btn btn-success btn-lg btn-block" type="submit">Connexion</button>
            </form>
            
        <div class="text-center signup-form">Vous n'avez pas de compte ? <a href="./signup_view.jsp">Inscrivez-vous</a></div>    
        </div> <!-- /container -->
        <%@include file="footer.jsp" %>
    </body>
</html>
