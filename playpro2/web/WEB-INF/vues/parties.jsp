<%-- 
    Document   : parties
    Created on : 2019-12-10, 01:35:08
    Author     : younes-dilali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
