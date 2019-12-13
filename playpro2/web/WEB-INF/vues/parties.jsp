<%-- 
    Document   : parties
    Created on : 2019-12-10, 01:35:08
    Author     : younes-dilali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <!--<meta charset="utf-8">-->
    <!--<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">-->

    <!--<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/css/bootstrap-datepicker.min.css" rel="stylesheet"/>-->
    <!--<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">-->
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">-->
</head>


<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <!--<h1 class="text-center">Liste des équipes existantes</h1>-->
    </div>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >+</button>
    </div>
</div>

<body>
    <!--<h1>Liste des parties</h1>-->

    <!--<button id="myBtn" type="button" >Ajouter</button>-->
    <div >
        <div class=" " style="">
            <c:forEach items="${sessionScope.lesParties}" var="unePartie"> 

                <div class="annonce" >
                    <h2 class='card-text font-weight-bold text-uppercase fondAnnonce' > Partie de <c:out value="${unePartie.sport}" /><br></h2>
                    <div class="row" >
                        <div class="cadre text-center col-sm-3 col-md-3 col-lg-3 border annonceInfos fondAnnonce" style="padding: 3%;" >

                            <p class='card-text'>Prévue le : <strong><c:out value="${unePartie.datePartie}" /></strong></p>
                            <p class="card-text">Heure: <strong><c:out value="${unePartie.heurePArtie}" /></strong></p>
                            <p class="card-text">Lieu: <strong><c:out value="${unePartie.leLieu}" /></strong></p>
                            <p class="card-text">Score: <strong><c:out value="${unePartie.score}" /></strong></p>
                           
                        </div>
                        <div class='col-sm-8 col-md-8 col-lg-8'>
                            
                            <h3 class="border-bottom">Rencontre entre :
                            <strong><c:out value="${unePartie.equipe1.nomEquipe}" /></strong>
                            &
                            <strong><c:out value="${unePartie.equipe2.nomEquipe}" /></strong>
                            </h3>
                            <div class='row'>
                                
                                <p class="card-text col-sm-5 col-md-5 col-lg-5">
                                <c:forEach items="${sessionScope.listeSesequipes}" var="e"> 
                                    <c:if test = "${e.nomEquipe == unePartie.equipe1.nomEquipe}">
                                        <img class="" src="static/images/equipes/<c:out value="${e.image}"/> "/>
                                    </c:if>
                                </c:forEach>
                                </p>
                                <h2 class="col-sm-2 col-md-2 col-lg-2" style="font-style: italic; display: flex;position: relative;align-items: center;justify-content: center;" >VS</h2>
                                <p class="card-text col-sm-5 col-md-5 col-lg-5">
                                    <c:forEach items="${sessionScope.listeSesequipes}" var="e"> 
                                        <c:if test = "${e.nomEquipe == unePartie.equipe2.nomEquipe}">
                                            <img class="" src="static/images/equipes/<c:out value="${e.image}"/> "/>
                                        </c:if>
                                    </c:forEach>
                                </p>
                                
                            </div>
                        </div> 
                    </div> 
                </div> 

            </c:forEach>
        </div> 
    </div>

</body>

<!-- Modal -->
<div class="modal equipeStyle" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header" style="display: flex;align-items: center;">
                <h5 class="modal-title" id="exampleModalLabel">Créer une nouvelle partie</h5>
                <button type="button" class="close" style="color:gray; margin:unset !important;" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>

            <form class="form-signin needs-validation " action="?action=parties" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>

                <div class="modal-body">

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="idUneEquipe">
                            <option value="" >Choisir une de vos équipes</option>
                            <c:forEach items="${sessionScope.listeSesequipes}" var="sonEquipe"> 
                                <option value="${sonEquipe.nomEquipe}" >${sonEquipe.nomEquipe}</option>
                                <c:set var="equipeC" value="${sonEquipe}"/>
                            </c:forEach> 
                        </select>
                    </div>

                    <div>
                        <h1 class="text-center">V.S</h1>
                    </div>

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect2" name="equipeAdverse">
                            <option SELECTED >Equipe invitée</option>
                            <c:forEach items="${sessionScope.listeEquipesParties}" var="equipo"> 
                                <option value="${equipo.nomEquipe}" >${equipo.nomEquipe}</option>
                            </c:forEach> 
                        </select>
                    </div>
                    
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect3" name="idLieuEquipe">
                            <option value="" >Choisir le lieu</option>
                            <c:forEach items="${listeLieux}" var="lieuP"> 
                                <option value="${lieuP.nom}" >${lieuP.nom}</option>
                            </c:forEach> 
                        </select>
                    </div>

                    <input name="datePartie" id="datepicker" width="276" />
                    <script>
                        $('#datepicker').datepicker({
                            uiLibrary: 'bootstrap4'
                        });
                    </script>



                    <input name="heurePartie" id="timepicker" width="276" />
                    <script>
                        $('#timepicker').timepicker({
                            uiLibrary: 'bootstrap4'
                        });
                    </script>

                    <button type="submit" class="btn btn-primary">Créer une partie</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.7.1/js/bootstrap-datepicker.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="static/js/parties.js" ></script>
