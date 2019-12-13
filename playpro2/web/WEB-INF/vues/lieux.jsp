<%-- 
    Document   : lieu
    Created on : 6-Nov-2019, 11:00:50 AM
    Author     : nadym
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <!--<h1>Liste des lieux offerts</h1>-->
    </div>
    <%
        if (m.getTypeMembre().equals("Admin")) {
    %>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >+</button>
    </div>
    <%}%>     
</div>

<div>
    <div class="card-columns" style="">
        <c:forEach items="${requestScope.lieux}" var="unlieu" varStatus="loop"> 
            <div class="card" >
                <div class="cadre text-center">
                    <div>
                        <div id="#carouselExampleIndicators<c:out value="${loop.index}"/>" class="carousel slide" data-ride="carousel">
                            <ol>
                                <li data-target="#carouselExampleIndicators<c:out value="${loop.index}"/>" data-slide-to="0"></li>
                                <li data-target="#carouselExampleIndicators<c:out value="${loop.index}"/>" data-slide-to="1"></li>
                                <li data-target="#carouselExampleIndicators<c:out value="${loop.index}"/>" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner">
                                <div class="carousel-item carousel-item-lieu active">
                                    <img src="static/images/lieux/<c:out value="${unlieu.image1}"/> " class="d-block w-100" alt="Responsive image" />
                                    <!--<img src="static/images/img1.jpg" >-->
                                </div>
                                <div class="carousel-item carousel-item-lieu">
                                    <img src="static/images/lieux/<c:out value="${unlieu.image2}"/> " class="d-block w-100" alt="Responsive image" />
                                </div>
                                <div class="carousel-item carousel-item-lieu">
                                    <img src="static/images/lieux/<c:out value="${unlieu.image3}"/> " class="d-block w-100" alt="Responsive image" />
                                </div>
                            </div>
<!--                            <a class="carousel-control-prev" href="#carouselExampleIndicators<c:out value="${loop.index}"/>" role="button" data-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#carouselExampleIndicators<c:out value="${loop.index}"/>" role="button" data-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>-->
                        </div>
                    </div>

                    <p class='card-text'>Nom : <c:out value="${unlieu.nom}" /></p>
                    <p class='card-text'>Adresse: <c:out value="${unlieu.numero}" /> 
                        <c:out value="${unlieu.rue}" />
                        <c:out value="${unlieu.ville}" />
                        <c:out value="${unlieu.pays}" />
                        <c:out value="${unlieu.code_postal}" />

                    </p>

                    <p class="card-text">Sports offerts :
                        <c:forEach items="${requestScope.lieuxSports}" var="ls"> 
                            <c:if test="${ls.lieu.id_lieu == unlieu.id_lieu}"> 
                                <c:out value="${ls.sport.nom}" />
                            </c:if>
                        </c:forEach>
                    </p>

                    <a target="_blank" href="<c:out value="${unlieu.surCarte}" />">
                        Afficher sur la carte
                    </a>

                    <p class='card-text'>Infos : <c:out value="${unlieu.infos}" /></p>
                    <div class="col-sm-12 col-md-12 col-lg-12">
                        <input name ='idLieuSup' id='idLieuSup' type='hidden' value='' />
                        <button class="btn btn-primary btnModLieu col-4" data-index='<c:out value="${unlieu.id_lieu}" />' data-status='<c:out value="${unlieu.nom}" />'>Modifier</button>
                        <button class="btn btn-danger btnSupLieu col-4" data-index='<c:out value="${unlieu.id_lieu}" />' data-status='<c:out value="${unlieu.nom}" />'>Supprimer</button>
                    </div>
                </div> 
            </div> 

        </c:forEach>
    </div> 
</div>


<div class="modal equipeStyle" id="modalLieuSupprimer" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">

            <div class="modal-header">
                <div class="modal-header text-center">
                    <h4 id='titreSup' class="modal-title w-100 font-weight-bold">Voulez-vous vraiment supprimer le lieu? </h4>
                    <button type="button" class="close" >
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
            </div>
            <form class="needs-validation" action="?action=lieux" method="post" name="action" value="lieux" novalidate>
                <div class="modal-footer d-flex justify-content-center">
                    <input name ='idLieuSupprimer' id='idLieuSupprimer' type='hidden' value='' />
                    <button class="btn btnD float-left " data-dismiss="modal">Annuler</button>
                    <button class="btn btn-primary float-right " type='submit'>Supprimer</button>
                </div>
            </form>
        </div>
    </div>
</div>

<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Informations sur le nouveau lieu</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form class="form-signin needs-validation " action="?action=lieux" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>
                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" class="form-control" name="nom" placeholder="Nom du lieu" required  />
                        <div class="invalid-feedback">
                            Un nom est requis
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="numero" placeholder="Numéro civique" required  />
                        <div class="invalid-feedback">
                            Champ requis.
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="rue" placeholder="Nom de la rue" required  />
                        <div class="invalid-feedback">
                            Champ requis.
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="ville" placeholder="Ville" required  />
                        <div class="invalid-feedback">
                            Champ requis.
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="pays" placeholder="Pays" required  />
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="code_postal" placeholder='Code postal "A1A 1A1"' required pattern="^[ABCEGHJKLMNPRSTVXYabceghjklmnprstvxy]{1}\d{1}[A-Za-z]{1}[ ]{0,1}\d{1}[A-Za-z]{1}\d{1}$"  />
                        <div class="invalid-feedback">
                            Champs invalide
                        </div>
                    </div>
                    <div class="col-md-12 mb-12">
                        <input type="text" name='prenom' class="form-control" id="validationCustom03" placeholder="Prénom" required>
                        <div class="invalid-feedback">
                            Champ requis.
                        </div>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" name="infos" placeholder="Info supplémentaire" required  />
                        <div class="invalid-feedback">
                            Champ requis.
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <select class="form-control" id="exampleFormControlSelect1" name="sports" multiple required> 
                        <c:forEach items="${requestScope.sports}" var="unSport"> 
                            <option value="<c:out value="${unSport.id_sport}" />"><c:out value="${unSport.nom}" /></option> 
                        </c:forEach>
                    </select>
                </div>
                <div class="file-field">
                    <div class="btn btn-primary btn-sm float-left">
                        <span>Glissez une photo</span>
                        <input class="form-control" id="imageSport" name="image1" type="file" multiple/>
                    </div>

                </div>

                <button type="submit" class="btn btn-primary">Créer</button>
            </form>
        </div>
    </div>
</div>

<script src="static/js/lieux.js"></script>
<!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!-- The Modal -->
<script src="static/js/validation.js" ></script>
<script>
    $('input[type=file]').change(function () {
        // debugger;
        console.log(this.files[0].mozFullPath);
    });
</script>
