<%-- 
    Document   : annonce
    Created on : 2019-11-27, 10:07:35
    Author     : toute
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--<body>
    <h1>Liste des annonces</h1>
    A MODIFIER KENNEDY !!!!
    <%
        if (!(m.getTypeMembre().equals("Joueur"))) {
    %>
        <div class="equipeStyle row">
            <div class="col-sm-10 col-md-10 col-lg-10">
                <h1 class="text-center">Liste des annonces</h1>
            </div>
            <div class="colBtn col-sm-2 col-md-2 col-lg-2">
                <button id="myBtn" type="button" >+</button>
            </div>
        </div>
    <%}%>
    !!!
-->    <div  >
        <div class=" " style="">
            <c:forEach items="${requestScope.annonces}" var="uneAnnonce"> 

                <div class="annonce" >
                    <h2 class='card-text font-weight-bold text-uppercase fondAnnonce' ><c:out value="${uneAnnonce.titre}" /><br></h2>
                    <div class="row" >
                        <div class="cadre text-center col-4 border annonceInfos fondAnnonce">

                            <p class='card-text'>Annonceur: <c:out value="${uneAnnonce.createur.prenom}" /></p>
                            <p class="card-text">Nombre de places: <c:out value="${uneAnnonce.nombreMax}" /></p>

                            <c:if test="${uneAnnonce.gratuit}"> 
                                <p class="card-text">Ce cours est gratuit</p>
                            </c:if>
                            <c:if test="${!uneAnnonce.gratuit}"> 
                                <p class="card-text">Montant: <c:out value="${uneAnnonce.montant}" /> $</p>
                            </c:if>
                            <p class="card-text">Lieu: <c:out value="${uneAnnonce.lieu.nom}" /></p>
                            <p class="card-text">Date et heure: <c:out value="${uneAnnonce.date_event}" /></p>
                        </div>
                        <div class='col-8'>
                            <h3 class="border-bottom">Message de l'entrainneur :</h3>
                            <p class="card-text"> <c:out value="${uneAnnonce.description}" /></p>
                        </div> 
                    </div> 
                </div> 

            </c:forEach>
        </div> 
    </div><!--

</body>-->

<!-- The Modal -->
<!-- Modal -->
<div class="modal" id="myModalAnnonce" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Informations sur l'annonce</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form class="needs-validation " id="annonceForm" action="?action=annonce" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>
                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" class="form-control" name="titre" placeholder="Titre de l'annonce" required />
                    </div>
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nbMax">
                            <option value="" >Nombre de places disponibles</option>
                            <% for (int i = 0; i < 50; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
                    </div>
                    <div class="form-group ">
                        <div class="custom-control custom-switch">
                            <input type="checkbox" name="gratuit" class="custom-control-input" id="switch1">
                            <label class="custom-control-label" id="textGatuit" for="switch1">Gratuit</label>
                        </div>
                    </div>
                    <div class="form-group " id="divMontant" style="display:none">
                        <input type="number" step="0.10" min="0" class="form-control" id="montant" name="montant" placeholder="Montant" required />

                    </div>
                    <div class="form-group">
                        Date et heure de l'événement :
                        <input type="datetime-local" name="dateheure" required>
                    </div>
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="lieux"  required> 
                            <option value="" >Lieu de l'événement</option>
                            <c:forEach items="${requestScope.lieux}" var="unLieu"> 
                                <option value="<c:out value="${unLieu.id_lieu}" />"><c:out value="${unLieu.nom}" /></option> 
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <textarea name='message' rows="6" cols="43">
Entrez votre message ici
                        </textarea>
                    </div>
                </div>
                <div class="text-center justify-content-center">
                    <div class="col-3 ">
                        <button id="btnCreerAnnonce" type="submit" class="btn btn-primary btnD">Créer</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<!--<script src="static/js/annonces.js"></script>-->
<!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
