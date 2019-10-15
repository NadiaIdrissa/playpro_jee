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
                
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#id01">
  Joueur
</button>
                    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
  Entraineur
</button>
                </div>            
            </div>
        </div>
        <br><br><br><br><br><br><br><br><br>


        <%@include file="modals.jsp" %>
        <!--<button onclick="document.getElementById('id01').style.display = 'block'" style="width:auto;">Sign Up</button>-->


        <!--        <div class="container text-center border-1">
                    <div class="container d-flex">
                        <button onclick="myFunction()" id="joueur" class="btn btn-primary float-left"  type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                        <button onclick="myFunction()" id="entraineur" class="btn btn-primary float-right"  type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2" style="">Entrainer</button>
        
                        <button id="joueur" class="btn btn-primary float-left afficher-joueur"  type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                        <button  id="entraineur" class="btn btn-primary float-right"  type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2" style="">Entrainer</button>
        
        
                    </div>-->










        <!--        <div id="id02" class="modal" tabindex="-1" role="dialog">
                    <span onclick="document.getElementById('id02').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                    <form class="modal-content" action="">
        
                        <div class="container">
                            <form action="">
                                <div class="row">
                                    <h2 style="text-align:center">Login with Social Media or Manually</h2>
                                    <div class="vl">
                                        <span class="vl-innertext">or</span>
                                    </div>
        
                                    <div class="col">
                                        <a href="#" class="fb btn">
                                            <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                                        </a>
                                        <a href="#" class="twitter btn">
                                            <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                                        </a>
                                        <a href="#" class="google btn"><i class="fa fa-google fa-fw">
                                            </i> Login with Google+
                                        </a>
                                    </div>
        
                                    <div class="col">
                                        <div class="hide-md-lg">
                                            <p>Or sign in manually:</p>
                                        </div>
        
                                        <input type="text" name="username" placeholder="hello" required>
                                        <input type="password" name="password" placeholder="hello" required>
                                        <input type="password" name="password" placeholder="hello" required>
                                        <input type="password" name="password" placeholder="hello" required>
                                        <input type="password" name="password" placeholder="hello" required>
                                        <input type="submit" value="Login">
                                    </div>
        
                                </div>
                            </form>
                        </div>
        
                        <div class="bottom-container">
                            <div class="row">
                                <div class="col">
                                    <a href="#" style="color:white" class="btn">Sign up</a>
                                </div>
                                <div class="col">
                                    <a href="#" style="color:white" class="btn">Forgot password?</a>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>-->







        <!--        <div id="id01" class="modal" tabindex="-1" role="dialog">
                    <span onclick="document.getElementById('id01').style.display = 'none'" class="close" title="Close Modal">&times;</span>
                    <form class="modal-content" action="">
        
                        <div class="container">
                            <form action="">
                                <div class="row">
                                    <h2 style="text-align:center">Login with Social Media or Manually</h2>
                                    <div class="vl">
                                        <span class="vl-innertext">or</span>
                                    </div>
        
                                    <div class="col">
                                        <a href="#" class="fb btn">
                                            <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                                        </a>
                                        <a href="#" class="twitter btn">
                                            <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                                        </a>
                                        <a href="#" class="google btn"><i class="fa fa-google fa-fw">
                                            </i> Login with Google+
                                        </a>
                                    </div>
        
                                    <div class="col">
                                        <div class="hide-md-lg">
                                            <p>Or sign in manually:</p>
                                        </div>
        
                                        <input type="text" name="username" placeholder="Username" required>
                                        <input type="password" name="password" placeholder="Password" required>
                                        <input type="password" name="password" placeholder="Password" required>
                                        <input type="password" name="password" placeholder="Password" required>
                                        <input type="password" name="password" placeholder="Password" required>
                                        <input type="submit" value="Login">
                                    </div>
        
                                </div>
                            </form>
                        </div>
        
                        <div class="bottom-container">
                            <div class="row">
                                <div class="col">
                                    <a href="#" style="color:white" class="btn">Sign up</a>
                                </div>
                                <div class="col">
                                    <a href="#" style="color:white" class="btn">Forgot password?</a>
                                </div>
                            </div>
                        </div>-->

        <!--                <div class="container">
                            <h1>Sign Up</h1>
                            <p>Please fill in this form to create an account.</p>
                            <hr>
                            <label for="email"><b>Email</b></label>
                            <input type="text" placeholder="Enter Email" name="email" required>
        
                            <label for="psw"><b>Password</b></label>
                            <input type="password" placeholder="Enter Password" name="psw" required>
        
                            <label for="psw-repeat"><b>Repeat Password</b></label>
                            <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
        
                            <label>
                                <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
                            </label>
        
                            <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
        
                            <div class="clearfix">
                                <button type="button" onclick="document.getElementById('id01').style.display = 'none'" class="cancelbtn">Cancel</button>
                                <button type="submit" class="signupbtn">Sign Up</button>
                            </div>
                        </div>-->
        <!--            </form>
                </div>-->

        <!--        <div class="signup-form">
        
                    <form action="" method="post" name="action" value="signup">
        
                        <h2>Inscription</h2>
                        <p class="hint-text">Devenez membre de PlayPro !</p>
        
        
                        <div class="container text-center border-1">
                            <div class="container d-flex">
        
                                <button id="joueur" class="btn btn-primary float-left afficher-joueur"  type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                                <button  id="entraineur" class="btn btn-primary float-right"  type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2" style="">Entrainer</button>
        
        
        
                            </div>
        
                            <div class="login-form hide afficher-joueur">
                                <input type="text" class="form-control" name="prenom" placeholder="Nom" required="required">
                            </div>
        
        
                    </form>
        
        
                </div>-->


        <!--<div class="signup-form">-->





        <!--            <form action="" method="post" name="action" value="signup">
        
                        <h2>Inscription</h2>
        
                        <p class="hint-text">Devenez membre de PlayPro !</p>-->

        <!--                <div id="accordion">
                            <h3>Joueur</h3>
                            <div>
                                <p>
                                    Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer
                                    ut neque. Vivamus nisi metus, molestie vel, gravida in, condimentum sit
                                    amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut
                                    odio. Curabitur malesuada. Vestibulum a velit eu ante scelerisque vulputate.
                                </p>
                            </div>
                            <h3>Entraineur</h3>
                            <div>
                                <p>
                                    Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet
                                    purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor
                                    velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In
                                    suscipit faucibus urna.
                                </p>
                            </div>
                            
                            <h3>Administrateur</h3>
                            <div>
                                <p>
                                    Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet
                                    purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris turpis porttitor
                                    velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In
                                    suscipit faucibus urna.
                                </p>
                            </div>
                        </div>-->



        <!--
                        <div class="container text-center border-1">
                            <div class="container d-flex">
                                                        <button onclick="myFunction()" id="joueur" class="btn btn-primary float-left"  type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                                                        <button onclick="myFunction()" id="entraineur" class="btn btn-primary float-right"  type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2" style="">Entrainer</button>
        
                                <button id="joueur" class="btn btn-primary float-left afficher-joueur"  type="button" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1">Joueur</button>
                                <button  id="entraineur" class="btn btn-primary float-right"  type="button" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample2" style="">Entrainer</button>
        
        
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
                    </form>-->

        <!--<div class="text-center">Vous avez déjà un compte ? <a href="/login_view.jsp">Connectez-vous</a></div>-->
        <!--</div>-->








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




<!--    <script>
        // afficher modal
        var modal = document.getElementById('id01');
        var modal2 = document.getElementById('id02');
        // fermer onclick n'importe où
        window.onclick = function (event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }

            if (event.target == modal2) {
                modal2.style.display = "none";
            }
        }
    </script>-->


    <%@include file="footer.jsp" %>

</html>