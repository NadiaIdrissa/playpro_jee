<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h1>Liste des sport offerts</h1>
<%
    if (m.getTypeMembre().equals("Admin")) {
%>
<%}%>
<button id="myBtn" type="button" >Ajouter</button>
<div>
    <div class="card-columns" style="">
        <c:forEach items="${requestScope.sports}" var="unSport"> 

            <div class="card" >
                <div class="cadre text-center">
                    <img src="static/images/sports/<c:out value="${unSport.image}"/> " />

                    <p class='card-text'>Nom du sport: <c:out value="${unSport.nom}" /></p>
                    <p class="card-text">Joueurs par équipe: <c:out value="${unSport.nb_max}" /></p>
                    <div class="col-12">

                        <input name ='idSportSup' id='idSportSup' type='hidden' value='' />
                        <button class="btn btn-primary btnMod col-4" data-index='<c:out value="${unSport.id_sport}" />' data-status='<c:out value="${unSport.nom}" />'>Modifier</button>
                        <button class="btn btn-danger btnSup col-4" data-index='<c:out value="${unSport.id_sport}" />' data-status='<c:out value="${unSport.nom}" />'>Supprimer</button>

                    </div>

                </div>

            </div> 
        </c:forEach>
    </div> 
</div>

<div class="modal" id="modalSupprimerSport" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">

            <div class="modal-header">
                <div class="modal-header text-center">
                    <h4 id='titreSup' class="modal-title w-100 font-weight-bold">Voulez-vous vraiment supprimer le sport? </h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            </div>
            <form class="needs-validation" action="?action=sports" method="post" name="action" value="sports" novalidate>
                <div class="modal-footer d-flex justify-content-center">
                    <input name ='idSportSupprimer' id='idSportSupprimer' type='hidden' value='' />
                    <button class="btn btn-light float-left " data-dismiss="modal">Annuler</button>
                    <button class="btn btn-primary float-right " type='submit'>Supprimer</button>
                </div>
            </form>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Informations sur le nouveau sport</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form class="form-signin needs-validation " action="?action=sports" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>
                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" class="form-control" name="nomSport" placeholder="Nom du sport" required />
                    </div>
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nbMax">
                            <option value="" >Joueurs par équipe</option>
                            <% for (int i = 0; i < 30; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
                    </div>
                    <div class="file-field">
                        <div class="btn btn-primary btn-sm float-left">
                            <span>Glissez une photo</span>
                            <input class="form-control" id="imageSport" name="imageSport" type="file"/>
                        </div>

                    </div>
                    <!--<button class="" id="boutton1" type="submit">Créer</button>-->
                </div>
                <button type="submit" class="btn btn-primary">Créer</button>
            </form>
        </div>
    </div>
</div>
<script src="static/js/sports.js"></script>
<!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>



