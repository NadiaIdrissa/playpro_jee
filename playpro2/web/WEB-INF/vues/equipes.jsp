<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@page import="com.playpro.entities.Sport"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.playpro.entities.Equipe"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <h1>Liste des équipes existantes</h1>
        
    </div>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >Ajouter</button>
    </div>
</div>

<div class="equipeStyle">
    <div class="card-columns">
        <c:forEach items="${requestScope.listeEquipe}" var="uneEquipe"> 

            <div class="card" >
                <div class="card-body text-center">
                    <img src="static/images/equipes/<c:out value="${uneEquipe.image}"/> " />

                    <p class='card-text'>Nom de l'équipe: <c:out value="${uneEquipe.nomEquipe}" /></p>
                    <p class='card-text'>Sport de l'équipe: <c:out value="${uneEquipe.sport.nom}" /></p>
                    <p class="card-text">Nombre de joueurs par équipe: <c:out value="${uneEquipe.nbJoueurs}" /></p>

                </div> 
            </div> 

        </c:forEach>
    </div> 
</div>
   
<!-- The Modal -->
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
                            <option value="" >Nombre max de joueurs par équipe</option>
                            <% for (int i = 0; i < 15; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
                    </div>

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nomSportEquipe">
                            <% List<String> listGet = (List<String>) request.getSession().getAttribute("sportString");

                                for (int h = 0; h < listGet.size(); h++) {%>
                            <option value="<%=listGet.get(h)%>" ><%=listGet.get(h)%></option>
                            <%}

                            %>

                        </select>
                    </div>
                    <div class="file-field">
                        <div class="btn btn-primary btn-sm float-left photo">
                            <span>Glissez une photo</span>
                            <input class="form-control" id="imageEquipe" name="imageEquipe" type="file"/>
                        </div>

                    </div>
                    <!--<button class="" id="boutton1" type="submit">Créer</button>-->
                
                <button type="submit" class="btn btn-primary">Créer</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
