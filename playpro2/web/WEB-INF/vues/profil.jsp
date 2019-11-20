<%-- 
    Document   : profil
    Created on : 2019-10-05, 15:53:52
    Author     : dd
--%>

<%@page import="com.playpro.entities.Sexe"%>
<%@page import="com.playpro.entities.Niveau"%>
<%@page import="com.playpro.entities.Membre"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <div class="contentProfil">
        <%--        <img id='imagejoueur' src="static/images/head01.png" class="rounded" alt="imgprofil">

    </div>
<!--    <button type="button" class="close" data-dismiss="modal" aria-label="Close">

        </div>--%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <form  id="fprofil" action="?action=profil" method="post" name="action" value="profil" enctype="multipart/form-data">
            <div class="modal-header">
                <div class="text-center">
                    <img id='imagejoueur' src="static/images/profils/<c:out value="${membre.photo}"/> " class="rounded" alt="imgprofil">
                    <input id="imageMembre" type="hidden" class="form-control" name="imageMembre" />
                </div>
            </div>
            <div class="modal-body">
                <div class="container">
                    <!--                <form  id="fprofil" action="" method="post" name="action" value="profil">-->
                    <!--<input type="hidden" name="action" value="profil" method="post"/>-->

                    <div class="form-group">
                        <div class="row">
                            <div class="vl">
                                <span class="vl-innertext">+</span>
                            </div>
                            <div class="col">
                                <div class="form-row">
                                    <div class="col-md-12 mb-12">
                                        <label for="pseudoR">Pseudo</label>
                                        <input type="text" name='pseudoR' class="form-control" id="pse1" value="${sessionScope.membre.pseudo}"  disabled required>
                                        <div class="invalid-feedback">
                                            Champ requis.
                                        </div>
                                    </div>

                                    <div class="col-md-12 mb-12">
                                        <label for="nomR">Nom</label>
                                        <input type="text" name='nomR' class="form-control" id="nom2" value="${sessionScope.membre.nom}"  disabled required>
                                        <div class="invalid-feedback">
                                            Champ requis.
                                        </div>
                                    </div>
                                    <div class="col-md-12 mb-12">
                                        <label for="prenomR">Prénom</label>
                                        <input type="text" name='prenomR' class="form-control" id="pre3" value="${sessionScope.membre.prenom}"  disabled required>
                                        <div class="invalid-feedback">
                                            Champ requis.
                                        </div>
                                    </div>
                                    <div class="col-md-12 mb-12">
                                        <label for="inputLevel">Année de naissance</label>
                                        <input type="text" name='anneeR' class="form-control" id="ann4" value="${sessionScope.membre.anneeNaissance}"  disabled required>
                                        <div class="invalid-feedback">
                                            Champ requis.
                                        </div>
                                    </div>
                                    <div id='prenom' class="col-md-12 mb-12">
                                        <div  class="form-group">
                                            <label for="inputLevel">Sexe</label>
                                            <select class="form-control" name="sexeR" id="sex5"  disabled required>
                                                <option value='' >${sessionScope.membre.sexe}</option>

                                                <%for (Sexe s : Sexe.values()) {%>

                                                <option value='<%=s.toString()%>'><%=s.toString()%></option>

                                                <%}%>
                                            </select>
                                        </div>   
                                        <div class="valid-feedback">
                                            Looks good!
                                        </div>
                                    </div>

                                    <div class="col-md-12 mb-12">
                                        <input type="email" name='emailR' class="form-control" id="ema6" value="${sessionScope.membre.courriel}"  disabled  required>
                                        <div class="invalid-feedback">
                                            Entrez un courriel valide.
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="col">
                                <div class="form-row">
                                    <div id='niveaug' class="col-md-12 mb-12">
                                        <div  class="form-group">
                                            <label for="tMembreR">Type de membre</label>
                                            <select class="form-control" name="tMembreR" id="mem7" disabled required>

                                                <option selected="selected">${sessionScope.membre.typeMembre}</option>

                                                <option value='Joueur'>Joueur</option>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-md-12 mb-12">
                                        <label for="pseudoR">Sport</label>
                                        <input type="text" name='sportR' class="form-control" id="spo8" value="${sessionScope.membre.sport}"   disabled required>
                                        <div class="invalid-feedback">
                                            Champ requis.
                                        </div>
                                    </div>

                                    <div id='niveaug' class="col-md-12 mb-12">
                                        <div  class="form-group">
                                            <label for="inputLevel">Niveau</label>
                                            <select class="form-control" name="niveauR" id="niv9"  disabled required>
                                                <option value='' >${sessionScope.membre.niveau}</option>

                                                <%for (Niveau n : Niveau.values()) {%>

                                                <option value='<%=n.toString()%>'><%=n.toString()%></option>

                                                <%}%>
                                            </select>
                                        </div>
                                    </div>

                                    <div class="col-md-12 mb-12">

                                        <label for="passwordR">Changement de mot de passe</label>
                                        <input type="password"  name='passwordR' class="form-control"  id="pas10" value=""  disabled required>
                                        <%
                                            if (request.getSession().getAttribute("valid") == "vrai" && request.getSession().getAttribute("valid") != null) {
                                        %>
                                        <label><span style="color: red;">Les mots de passe ne sont pas égaux</span></label>
                                        <%
                                            }
                                        %>
                                        <div class="invalid-feedback">
                                            Mot de passe requis.
                                        </div>
                                    </div>
                                    <div class="col-md-12 mb-12">
                                        <label for="CpasswordR">Confirmation mot de passe</label>
                                        <input type="password"  name='CpasswordR' class="form-control"  id="cpas11"value=""  disabled required>
                                        <div class="invalid-feedback">
                                            Mot de passe requis.
                                        </div>
                                    </div>
                                </div>

                                <div class="modal-footer">

                                    <button class="btn btn-primary btn-sm" id="bb" onclick="enableSummit()" type="button">Modifier</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div>                       
                        <a class="btn btn-danger btn-sm" href="?action=portail&sousAction=loadSupp" role="button">Suppression de compte</a>
                    </div>
                </div>    
            </div>
        </form>
    </div>
    <script>
        function enableSummit() {
            var change = document.getElementById("bb");
            // var typ = document.getElementById("bb").type;
            //document.getElementsByTagName('button').style.backgroundColor="green";
            if (change.innerHTML == "Modifier")
            {
                change.innerHTML = "Enregistrer";
                change.style.backgroundColor = "green";

                document.getElementById("pse1").disabled = false;
                document.getElementById("nom2").disabled = false;
                document.getElementById("pre3").disabled = false;
                document.getElementById("ann4").disabled = false;
                document.getElementById("sex5").disabled = false;
                document.getElementById("ema6").disabled = false;
                document.getElementById("mem7").disabled = false;
                document.getElementById("spo8").disabled = false;
                document.getElementById("niv9").disabled = false;
                document.getElementById("pas10").disabled = false;
                document.getElementById("cpas11").disabled = false;
                $('#imageMembre').attr('type', 'file');
            } else {

                change.style.backgroundColor = "blue";
                document.getElementById("fprofil").submit();
                //                        change.type="submit";
            }
        }
    </script>
</html>