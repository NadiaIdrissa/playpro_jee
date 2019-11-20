<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page import="com.playpro.entities.Equipe"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Liste des équipes</h1><button id="myBtn" type="button" >Ajouter</button>


    <%
        List<Equipe> liste = (LinkedList<Equipe>) request.getAttribute("listeEquipe");
        System.out.println(liste);%>


    <section>
        <!--        <div style="padding-bottom: 2px;">
                    <button class="btn btn-success text-uppercase float-right w-10 "data-toggle="modal" data-target="#modalProjet" type="submit" ><i class="fab fa-google mr-2"></i> Ajouter</button>
                </div>-->
        <table class="table">
            <thead class="thead-dark">
                <tr>

                    <th scope="col">Nom de l'équipe</th>
                    <th scope="col">Capitaine</th>
                    <th scope="col">Sport</th>
                    <th scope="col">Nombre de joueur</th>
                    <th scope="col">Nombre de parties jouées</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>



                <tr>

            <form  action="" method="post" name="action" value="gestionProjet">
                <%
                    for (int i = 0; i < liste.size(); i++) {
//                            if (liste.get(i).getCreateur().equals(identifiant)) {
                %>
                <form  action="" method="" name="" value="">

                    <td name="prjt"><%=liste.get(i).getNomEquipe()%></td>

                    <td><%=liste.get(i).id_capitaine()%></td>
                    <td><%=liste.get(i).getSport()%></td>
                    <td><%=liste.get(i).getNbJoueurs()%></td>
                    <td><%=liste.get(i).getNbPartiesJouees()%></td>



                    <input type="hidden" name="indice" value=<%=i%>>
                    <td>                            
                        <a class="btn btn-success" type="submit" >Gérer</a>                            
                    </td>

                    </tr>

                    <%
                        }
                    %>

                </form>






                </tbody>
        </table>


    </section>


</body>

<!-- The Modal -->
<!-- Modal -->
<div class="modal" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Créer une équipe</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form class="form-signin needs-validation " action="?action=equipe" method="post" name="action" value="equipe" enctype="multipart/form-data" novalidate>
                <div class="modal-body">
                    <div class="form-group">
                        <input type="text" class="form-control" name="nomEquipe" placeholder="Nom de l'équipe" required />
                    </div>

                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nbMax">
                            <option value="" >Quel sport</option>
                            <% for (int i = 0; i < 5; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
                    </div>
                    <div class="form-group">
                        <select class="form-control" id="exampleFormControlSelect1" name="nbMax">
                            <option value="" >Nombre max de joueurs par équipe</option>
                            <% for (int i = 0; i < 30; i++) {%>
                            <option value="<%=i%>"><%=i%></option>

                            <%}
                            %>
                        </select>
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

