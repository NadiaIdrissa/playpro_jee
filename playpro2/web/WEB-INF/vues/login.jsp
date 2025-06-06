<%-- 
    Document   : login_view
    Created on : 2019-10-05, 14:50:56
    Author     : dd
--%>

<%@page import="com.playpro.entities.Membre"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <script src="static/js/gestion.js" ></script> 
        <script src="static/js/validation.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet" type="text/css">
        <link href="static/css/styleslogin.css" rel="stylesheet" type="text/css">
        
         <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous">
        </script>
     

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <title>Connexion</title>
  

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <%
            String courriel;
            String password;
            String message = (String) request.getAttribute("message");
            String laClasse = (String) request.getAttribute("laClasse");

            if ((request.getSession().getAttribute("connected") == null) || ((boolean) request.getSession().getAttribute("connected") == false)) {%>
        
        <%@include file="header.jsp" %>


        <%         courriel = "Courriel";
        %>
        <%} else {
            Membre membre = (Membre) request.getSession().getAttribute("membre");
            courriel = membre.getCourriel();
        %>
       
        <%@include file="header.jsp" %>

        <% } %>
        <br><br>

        <div class="container" id="FormulaireConnexion" style="margin-top: 50px;">

            <%if (message != null && !message.equals("")) {
                    %>
                    <div class="alert text-center alert-<%=laClasse%> alert-dismissible fade show" role="alert">
                        <strong>Important!</strong> <%=message%>
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <%}
                    %>

        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="wrapper fadeInDown">
                        <div class="card  card-signin my-5">
                            <div class="  card-body">
                                <h2 class="card-title text-center ">Connexion</h2>
                                <form class="form-signin needs-validation" action="?action=login" method="post" name="action" value="login" novalidate>
                                    <div class="col-md-12 mb-12">
                                        <input type="email" name='email' class="form-control" id="validationCustom05" placeholder="exemple@playpro.ca" required>
                                        <div class="invalid-feedback">
                                            Entrez un courriel valide.
                                        </div>
                                    </div>
                                    <br>
                                    <div class="col-md-12 mb-12">
                                        <input type="password" id='password' name='mdp' class="form-control"  placeholder="Mot de passe" required>
                                        <div class="invalid-feedback">
                                            Mot de passe requis.
                                        </div>
                                    </div>

                                    <div class="custom-control custom-checkbox mb-3">
                                        <input type="checkbox" class="custom-control-input" id="customCheck1">
                                        <label class="custom-control-label" for="customCheck1">Se souvenir moi</label>
                                    </div>
                                    <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Connexion</button>

                                    <hr class="my-4">
                                    <button class="btn btn-google btn-block text-uppercase" type="submit"><i class="fa fa-google" aria-hidden="true"></i> Sign in with Google</button>
                                    <button class="btn btn-facebook btn-block text-uppercase" type="submit"><i class="fa fa-facebook fa-fw"></i> Sign in with Facebook</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
