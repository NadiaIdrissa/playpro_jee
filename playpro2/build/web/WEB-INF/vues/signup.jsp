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
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <script src="static/js/gestion.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
        <title>Inscription</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="signup-form">
            <form action="" method="post" name="action" value="signup">

                <h2>Inscription</h2>

                <p class="hint-text">Devenez membre de PlayPro !</p>
                <div class="container text-center border-1">
                    <div class="container d-flex">
                        <button class="btn btn-primary float-left" type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                        <button class="btn btn-primary float-right" type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2">Entrainer</button>
                    </div>
                    <div class="row">

                        <div class="collapse multi-collapse" id="multiCollapseExample1">
                            <div class="card card-body  text-center">
                                <div class="checkbox"><input type="checkbox" class="radio" value="1" name="fooby[1][]">Débutant</div>
                                <div class="checkbox"><input type="checkbox" class="radio" value="1" name="fooby[1][]">Intermédiaire</div>
                                <div class="checkbox"><input type="checkbox" class="radio" value="1" name="fooby[1][]">Expert</div>
                            </div>
                        </div>

                    </div>
                    <div class="row">
                        <div class="collapse multi-collapse" id="multiCollapseExample2">
                            <div class="card card-body">
                                Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. Nihil anim keffiyeh helvetica, craft beer labore wes anderson cred nesciunt sapiente ea proident.
                            </div>
                        </div>
                    </div>
                </div>
                <br>

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
            pass1 != pass2 ? document.getElementById("confirm_password").setCustomValidity("Les mots de passe sont différents")
                    : document.getElementById("confirm_password").setCustomValidity('');
        })
    </script>
    <script>
        $("input:checkbox").click(function () {
            if ($(this).is(":checked")) {
                var group = "input:checkbox[name='" + $(this).attr("name") + "']";
                $(group).prop("checked", false);
                $(this).prop("checked", true);
            } else {
                $(this).prop("checked", false);
            }
        });

    </script>
    <%@include file="footer.jsp" %>

</html>