<%-- 
    Document   : equipe
    Created on : 12-Oct-2019, 12:40:55 PM
    Author     : salpy
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.playpro.entities.Membre"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
        <button type="submit" class="btn bg-success">CRÉER MON ÉQUIPE</button> 
    </form> 
</div> 





