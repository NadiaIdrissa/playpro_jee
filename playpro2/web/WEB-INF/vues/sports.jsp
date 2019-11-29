<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        
<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <h1>Liste des sports offerts</h1>
    </div>
    <%
        if (m.getTypeMembre().equals("Admin")) {
    %>

    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >Ajouter</button>
    </div>
    <%}%>
</div>


<div class="card-columns" style="">
    <c:forEach items="${requestScope.sports}" var="unSport"> 

        <div class="card" >
            <div class="cadre text-center">
                <img src="static/images/sports/<c:out value="${unSport.image}"/> " />

                <p class='card-text'>Nom du sport: <c:out value="${unSport.nom}" /></p>
                <p class="card-text">Joueurs par équipe: <c:out value="${unSport.nb_max}" /></p>

            </div> 
        </div> 
    </c:forEach>
</div> 

<script>
    $('input[type=file]').change(function () {
        debugger;
        console.log(this.files[0].mozFullPath);

    });
</script>


<!-- The Modal -->
<!-- Modal -->
<div class="modal equipeStyle" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
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

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!-- The Modal -->
<!--<div id="myModal1" class="modal fade">

     Modal content 
    <div class="modal-content">
        <div class="modal-header">
            <span class="close">&times;</span> 
            <h2>Nouveau sport</h2>
        </div>
        <div class="modal-body">
            <form class="form-signin needs-validation" action="?action=sports" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>

                <input type="text" name="nomSport" placeholder="Nom du sport"  />
                <select name="nbMax">
                    <option value="" disabled>Choisir</option>
<% for (int i = 0; i < 30; i++) {%>
<option value="<%=i%>"><%=i%></option>

<%}
%>
</select>
<input id="imageSport" name="imageSport" type="file"/>
<button class="" id="boutton1" type="submit">Créer</button>
</form>
</div>
<div class="modal-footer">
<h3>Modal Footer</h3>
</div>
</div>

</div>-->

