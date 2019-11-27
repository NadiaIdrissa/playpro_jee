<%-- 
    Document   : lieu
    Created on : 6-Nov-2019, 11:00:50 AM
    Author     : nadym
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Liste des lieux offerts</h1>
    <%
        if (m.getTypeMembre().equals("Admin")) {
    %>
    <%}%>
    <button id="myBtn" type="button" >Ajouter</button>
    <div >
        <div class="card-columns" style="">
            <c:forEach items="${requestScope.lieux}" var="unlieu"> 

                <div class="card" >
                    <div class="cadre text-center">
                        <img src="static/images/lieux/<c:out value="${unlieu.image1}"/> " />

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

                        <a target="_blank" href="https://www.google.ca/maps/place/Stade+IGA/@45.5329897,-73.6293616,17z/data=!3m1!4b1!4m5!3m4!1s0x4cc9190fedc1e617:0xc3efd9e5fbb085a8!8m2!3d45.5329897!4d-73.6271729">
                            Afficher sur la carte
                        </a>

                        <p class='card-text'>Infos : <c:out value="${unlieu.infos}" /></p>
                        <div class="modal-footer">
                            <button type="submit" class="btn btn-primary">Modifier</button>
                            <button type="submit" class="btn btn-danger">Supprimer</button>
                        </div>

                    </div> 
                </div> 

            </c:forEach>
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
                            <input type="text" name="nom" placeholder="Nom du lieu"  />
                            <input type="text" name="numero" placeholder="Numero civic"  />
                            <input type="text" name="rue" placeholder="Nom de la rue"  />
                            <input type="text" name="ville" placeholder="Ville"  />
                            <input type="text" name="pays" placeholder="Pays"  />
                            <input type="text" name="code_postal" placeholder="Code postal"  />
                            <input type="text" name="infos" placeholder="Info suplementaire"  />
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
                        <!--<button class="" id="boutton1" type="submit">Créer</button>-->
                    </div>
                    <button type="submit" class="btn btn-primary">Créer</button>
                </form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <!-- The Modal -->

    <script>
        $('input[type=file]').change(function () {
            // debugger;
            console.log(this.files[0].mozFullPath);
        });
    </script>
</body>

<!-- The Modal -->
<!-- The Modal 
<div id="myModal" class="modal">

     Modal content 
    <div class="modal-content">
        <div class="modal-header">
            <span class="close">&times;</span> 
            <h2>Ajouter un lieu</h2>
        </div>
        <div class="modal-body">
            <form class="form-signin needs-validation" action="?action=lieux" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>

                <input type="text" name="nom" placeholder="Nom du lieu"  />
                <input type="text" name="numero" placeholder="Numero civic"  />
                <input type="text" name="rue" placeholder="Nom de la rue"  />
                <input type="text" name="ville" placeholder="Ville"  />
                <input type="text" name="pays" placeholder="Pays"  />
                <input type="text" name="code_postal" placeholder="Code postal"  />
                <input type="text" name="infos" placeholder="Info suplementaire"  />

                <input id="imageSport" name="image1" type="file"/>
                <select multiple >
                    <option value="">Choisissez les sports offerts dans ce lieu</option>
<c:forEach items="${requestScope.sports}" var="unSport"> 
    <option value="<c:out value="${unSport.id_sport}" />"><c:out value="${unSport.nom}" /></option> 
</c:forEach>

</select>
<button class="" id="boutton1" type="submit">Créer</button>
</form>
</div>
<div class="modal-footer">
<h3>Modal Footer</h3>
</div>
</div>-->

</div>
