<%-- 
    Document   : equipes
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@page import="com.playpro.entities.Sport"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.playpro.entities.Equipe"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
</head>




<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <!--<h1 class="text-center">Liste des équipes existantes</h1>-->
    </div>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >+</button>
    </div>
</div>

<div class="equipeStyle">
    <div class="card-columns">
        <c:forEach items="${requestScope.listeEquipe}" var="uneEquipe"> 

            <form class="form-signin needs-validation " action="?action=invitation" method="post" name="action" novalidate>
                <div class="card">
                    <div class="  col-sm-1" style="font-size:5px;">
                        <button id="pref" type="button" ><i class="fa fa-cog fa-spin fa-3x fa-fw"></i></button>
                    </div>

                    <div class="card-body text-center">
                        <img class="avatar rounded-circle" src="static/images/equipes/<c:out value="${uneEquipe.image}"/> " />

                        <ul class="list-group font-weight-bold">
                            <li class="list-group-item">Équipe &#10132; <c:out value="${uneEquipe.nomEquipe}" /> </li>
                            <input name="nomEquipeChoisi" type="hidden" value="<c:out value="${uneEquipe.nomEquipe}" />">
                            <li class="list-group-item">Sport &#10132; <c:out value="${uneEquipe.sport.nom}" /></li>
                            <li class="list-group-item">Effectif &#10132; <c:out value="${uneEquipe.nbJoueurs}" /></li>

                        </ul>


<!--                        <p class='card-text'>Nom de l'équipe: <c:out value="${uneEquipe.nomEquipe}" /></p>
                        <input name="nomEquipeChoisi" type="hidden" value="<c:out value="${uneEquipe.nomEquipe}" />">
                        <p class='card-text'>Sport de l'équipe: <c:out value="${uneEquipe.sport.nom}" /></p>
                        <p class="card-text">Nombre de places: <c:out value="${uneEquipe.nbJoueurs}" /></p>-->
                        <p>
                            <c:set var="nb" value="${uneEquipe.nbJoueurs}"/>
                            <c:set var="nbOqp" value="${sessionScope.placeOqp}"/>
                            <c:set var="membreConnecte" value="${sessionScope.membre.id}"/>
                            <c:set var="capitaine" value="${uneEquipe.capitaine.id}"/>
                        </p>
                        <c:if test = "${uneEquipe.capitaine.id == sessionScope.membre.id}">

                            <button class="btn btn-primary" style="color: #003A5C;" type="button" data-toggle="collapse" data-target="#<c:out value="${uneEquipe.nomEquipe}${uneEquipe.nomEquipe}" />" aria-expanded="false" aria-controls="collapseExample">
                                Inviter un joueur
                            </button>

                            <div class="collapse" id="<c:out value="${uneEquipe.nomEquipe}${uneEquipe.nomEquipe}" />">
                                <div class="card card-body">
                                    <select class="form-control" id="exampleFormControlSelect1" name="membreAInviter">
                                        <option value="" >Choisir un joueur</option>
                                        <c:forEach items="${sessionScope.listeDesMembres}" var="unMembre"> 
                                            <c:if test = "${uneEquipe.capitaine.id != unMembre.id}">
                                                <option value="<c:out value="${unMembre.id}" />" ><c:out value="${unMembre.pseudo}" /></option> 
                                            </c:if>
                                        </c:forEach>
                                    </select>
                                    <button type="submit" class="btn btn-primary btnD">Envoyer</button>
                                </div>
                            </div> 
                        </c:if>
                        <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#<c:out value="${uneEquipe.nomEquipe}" />" aria-expanded="false" aria-controls="collapseExample">
                            Afficher les membres
                        </button>

                        <div class="collapse" id="<c:out value="${uneEquipe.nomEquipe}" />">  
                            <div class="card card-body">
                                <div class="list-group">

                                    <c:forEach items="${uneEquipe.membresEquipe}" var="joueur" varStatus="loop"> 
                                        <a href="?action=profil&idMembreAfficher=${joueur.id}" class="list-group-item list-group-item-action list-group-item-primary text-left" title="Voir le profil de ${joueur.pseudo}">
                                            <span class="badge badge-primary badge-pill text-right">${loop.index+1}</span> ${joueur.pseudo}
                                            <c:if test = "${uneEquipe.capitaine.id == joueur.id}"> <c:out value=": Capitaine" /> </c:if> </a>

                                            <input type="hidden" ${nb=nb-1}>
                                    </c:forEach>

                                </div>

                                <br>

                                <div class="list-group">

                                    <div class="list-group-item list-group-item-warning">
                                        Places libres: 
                                        <div class="spinner-border text-success"> ${nb}</div>
                                    </div>

                                </div>
                            </div>
                        </div>

                    </div> 
                </div> 
            </form>
        </c:forEach> 
    </div>
</div>

<!-- Modal -->
<div class="modal equipeStyle" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Informations sur la nouvelle équipe</h5>
                <button type="button" class="close" style="color:gray" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <form class="form-signin needs-validation " action="?action=equipe" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>

                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" class="form-control" name="nomEquipe" placeholder="Nom de l'équipe" required />
                    </div>

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nbMaxEquipe">
                            <option value="" >Nombre de places</option>
                            <% for (int i = 0; i < 15; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
                    </div>

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="idSportEquipe">
                            <c:forEach items="${slisteSports}" var="unSport"> 
                                <option value="${unSport.id_sport}" >${unSport.nom}</option>
                            </c:forEach> 
                        </select>
                    </div>
                    <div class="file-field">
                        <div class="btn btn-primary btn-sm float-left photo">
                            <span>Glissez une photo</span>
                            <input class="form-control" id="imageEquipe" name="imageEquipe" type="file"/>
                        </div>

                    </div>
                    <button type="submit" class="btn btn-primary">Créer</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="static/js/equipes.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
