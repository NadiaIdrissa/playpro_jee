<%-- 
    Document   : equipe
    Created on : 12-Oct-2019, 12:40:55 PM
    Author     : salpy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href= "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"> 
    <link href="static/css/styles.css" rel="stylesheet">
    <script src= "https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"
</script> 

<script src= "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js">
</script> 

<script src= "https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js">
</script> 
<title>Création d'équipe</title>



</head>

<body>
    <%@include file="headerMembre.jsp" %>
    <br>
    <br>
    <br>
    <h1 class="text-success text-center">Formulaire de création d'une équipe</h1> 


    <div class="container"> 
        <form action="#" class="was-validated"> 
            <div class="form-group"> 
                <label for="fname">Nom de l'équipe:</label> 
                <input type="text" class="form-control" id="Nequipe"
                       placeholder="Entrez le nom de l'équipe" name="Nequipe" required> 
                <div class="valid-feedback">Valide</div> 
                <div class="invalid-feedback"> 
                    Veuillez remplir cette section 
                </div> 
            </div> 

            <div class="form-group"> 
                <label for="sport">Sport:</label> 
                <input type="text" class="form-control" id="sport"
                       placeholder="Entrez le sport" name="sport" required> 
                <div class="valid-feedback">Valide</div> 
                <div class="invalid-feedback"> 
                    Veuillez remplir cette section 
                </div> 
            </div> 

            <div class="form-row"> 
                <div class="form-group col-md-4">
                    <label for="nbrPartieJouee">Nombre partie jouée:</label> 
                    <input type="text" class="form-control" id="nbrPartieJouee"
                           placeholder="Entrez le nombre de partie jouée" name="nbrPartiejouee" required> 
                    <div class="valid-feedback">Valide</div> 
                    <div class="invalid-feedback"> 
                        Veuillez remplir cette section 
                    </div> 
                </div>



                <div class="form-group col-md-4">
                    <label for="nbrJoueurs">Nombre de joueurs:</label> 
                    <input type="text" class="form-control" id="nbrJoueurs"
                           placeholder="Entrez le nombre de joueurs" name="nbrJoueurs" required> 
                    <div class="valid-feedback">Valide</div> 
                    <div class="invalid-feedback"> 
                        Veuillez remplir cette section 
                    </div> 
                </div>

                <div class="form-group col-md-4">
                    <label for="nbrJoueursMAx">Nombre de joueurs maximum:</label> 
                    <input type="text" class="form-control" id="nbrJoueurs"
                           placeholder="Entrez le nombre de joueurs maximum" name="nbrJoueursMax" required> 
                    <div class="valid-feedback">Valide</div> 
                    <div class="invalid-feedback"> 
                        Veuillez remplir cette section 
                    </div> 
                </div>
            </div> 



            <button type="submit" class="btn bg-success">CÉER MON ÉQUIPE</button> 
        </form> 
    </div> 
    <br>
    <%@include file="footer.jsp" %>
</body> 




