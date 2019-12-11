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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>


<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <!--<h1 class="text-center">Liste des équipes existantes</h1>-->
    </div>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >+</button>
    </div>
</div>





<!-- Modal -->
<div class="modal equipeStyle" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Créer une nouvelle partie</h5>
                <button type="button" class="close" style="color:gray" data-dismiss="modal" aria-label="Close">
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
                            <option SELECTED >équipe invité</option>
                            <c:forEach items="${sessionScope.listeEquipesParties}" var="equipo"> 
                                <option value="${equipo.nomEquipe}" >${equipo.nomEquipe}</option>
                            </c:forEach> 
                        </select>
                    </div>
                    
                    
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect3" name="idLieuEquipe">
                            <option value="" >Choisir le lieu</option>
                            <c:forEach items="${liste}" var="lieuP"> 
                                <option value="${lieuP.id_lieu}" >${lieuP.nom}</option>
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
<!--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>-->
