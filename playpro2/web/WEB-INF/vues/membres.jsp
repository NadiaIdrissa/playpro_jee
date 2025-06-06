<%-- 
    Document   : membres
    Created on : 2019-11-20, 19:38:36
    Author     : toute
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Liste des membres</title>
</head>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${message !=null}"> 
    <div  class="alert text-center alert-success alert-dismissible fade show" role="alert">
        <c:out value="${message}"></c:out>
            <button type="button" class="close" data-dismiss="alert">&times;</button>
        </div>

</c:if>
<div class="equipeStyle row">
    <div class="col-sm-10 col-md-10 col-lg-10">
        <!--<h1>Liste des membres</h1>-->
    </div>
    <div class="colBtn col-sm-2 col-md-2 col-lg-2">
        <button id="myBtn" type="button" >+</button>
    </div>
</div>
<section >
    <div class="table-responsive text-nowrap">
        <table class="table table-striped">
            <thead class="thread-perso">
                <tr>
                    <th scope="col">Pseudo</th>
                    <th scope="col">Nom</th>
                    <th scope="col">Prenom</th>
                    <th scope="col">Année naiss.</th>
                    <th scope="col">Courriel</th>
                    <th scope="col">Date inscr.</th>
                    <th scope="col">Type membre</th>
                    <th scope="col">Niveau</th>
                    <th scope="col">Sport</th>
                    <th scope="col">Statut</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listeMembres}" var="unMembre"> 
                    <tr>

                        <td><c:out value="${unMembre.pseudo}" /></td>
                        <td><c:out value="${unMembre.nom}" /></td>
                        <td><c:out value="${unMembre.prenom}" /></td>
                        <td><c:out value="${unMembre.anneeNaissance}" /></td>
                        <td><c:out value="${unMembre.courriel}" /></td>
                        <td><c:out value="${unMembre.dateInscription}" /></td>
                        <td><c:out value="${unMembre.typeMembre}" /></td>
                        <td><c:out value="${unMembre.niveau}" /></td>
                        <td><c:out value="${unMembre.sport}" /></td>
                        <td><c:out value="${unMembre.status}" /></td>
                        <td>
                            <c:if test="${true}"> 
                                <form action="?action=profil" method="post" name="action" value="profil" >
                                    <input type="hidden" name="idMembreAfficher" value="<c:out value="${unMembre.id}" />"     />
                                    <button class="btn btn-primary float-right" type="submit" >Voir</button>
                                </form>
                            </c:if>
                        </td>

                    </tr>
                </c:forEach>
            </tbody>

        </table>
    </div>
</section>


<!--<div id="myModal" class="modal" tabindex="-1" role="dialog"  aria-labelledby="exampleModalLabel"> 
    <div class="modal-dialog-centered" role="document">
        <form class="needs-validation" action="?action=membres" method="post" name="action" value="membres" novalidate>
            <div class="modal-content "style="width: 1000px;">
                <div class="modal-header">
                    <h5 class="modal-title text-center" id="exampleModalLabel" >JOUEUR</h5>
                    <div  class="form-group">
                        <label for="inputLevel">Type de membre</label>
                        <select class="form-control" name="typeMembre" required>
                            <option value='' >Choisissez...</option>
                            <option value='Admin'>ADMINISTRATEUR</option>
                            <option value='Entraineur'>ENTRAINEUR</option>
                            <option value='Joueur'>JOUEUR</option>
                        </select>

                    </div>

                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <div class="container">
                        <div class="row">

                            <div class="col">
                                <div class="form-group">

                                    <div class="form-row">
                                        <div id='niveau' class="col-md-12 mb-12">
                                            <div  class="form-group">
                                                <label for="inputLevel">Niveau</label>
                                                <select class="form-control" name="niveau" required>
                                                    <option value='' >Choisissez...</option>

                                                    <%for (Niveau n : Niveau.values()) {%>

                                                    <option value='<%=n.toString()%>'><%=n.toString()%></option>

                                                    <%}%>
                                                </select>
                                            </div>
                                            <div class="valid-feedback">
                                                Looks good!
                                            </div>
                                        </div>
                                        <div id='sport' class="col-md-12 mb-12">
                                            <input type="text" name='sport' class="form-control" id="validationCustom05" placeholder="Votre sport" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <div class="input-group" >
                                                <div class="input-group-prepend" style='padding-top: 5px' >
                                                    <span class="input-group-text" id="inputGroupPrepend">@</span>
                                                </div>
                                                <input type="text" name='pseudo' class="form-control" id="validationCustomUsername" placeholder="Pseudo"
                                                       aria-describedby="inputGroupPrepend" required>
                                                <div class="input-group-prepend" style='padding-top: 5px'>
                                                    <select class="form-control" name="sexe" required>
                                                        <option value='' >Choisissez...</option>

                                                        <%for (Sexe s : Sexe.values()) {%>

                                                        <option value='<%=s.toString()%>'><%=s.toString()%></option>

                                                        <%}%>
                                                    </select>
                                                </div>
                                                <div class="invalid-feedback">
                                                    Champ requis.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='prenom' class="form-control" id="validationCustom03" placeholder="Prénom" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='nom' class="form-control" id="validationCustom04" placeholder="Nom" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="email" name='email' class="form-control" id="validationCustom05" placeholder="exemple@playpro.ca" required>
                                            <div class="invalid-feedback">
                                                Entrez un courriel valide.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="password" id='password' name='password' class="form-control"  placeholder="Mot de passe" required>
                                            <div class="invalid-feedback">
                                                Mot de passe requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="password" id='confirm_password' name='confirm_password' class="form-control"  placeholder="Confirmez le mot de passe" required>
                                            <div class="invalid-feedback">
                                                Mots de passe différents.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-check">
                                            <label class="form-check-label" for="invalidCheck">
                                                <input style="width: 5%" class="form-check-input checkbox-primary" type="checkbox" value="" id="invalidCheck" required>
                                                Accepter les termes et conditions d'utilisation
                                            </label>
                                            <div class="invalid-feedback">
                                                Vous devez accepter les termes et conditions d'utilisation.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal-footer">

                                        <button id="close" type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                                        <button class="btn btn-primary btn-sm" id="commit" type="submit">Inscrire le membre</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>-->
                                                        
<%@page import="com.playpro.entities.Sexe"%>
<%@page import="com.playpro.entities.Niveau"%>

<div id="myModal" class="modal" tabindex="-1"  aria-labelledby="exampleModalLabel" aria-hidden="true"> 
    <div class="modal-dialog-centered" role="document">
        <div class="modal-content "style="width: 1000px;">
            <div class="modal-header m1">
                <h4 class="text-center" id="exampleModalLabel" >Informations du nouveau membre</h4>
                
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body body2">
                <div class="container">
                    <div class="row">

                        <div class="col mod">
                            <form class="needs-validation" action="" method="post" name="action" value="signup" novalidate>
                                <div class="form-group">
                                    <div class="form-row">
                                        <div id='niveau' class="col-md-12 mb-12">
                                            <div  class="form-group">
                                                <select class="form-control" name="niveau" required>
                                                    <option value='' >Type</option>
                                                    <option value='' >ADMIN</option>
                                                    <option value='' >JOUEUR</option>
                                                    <option value='' >ENTRAINEUR</option>
                                                </select>
                                                <select class="form-control" name="niveau" required>
                                                    <option value='' >Niveau</option>

                                                    <%for (Niveau n : Niveau.values()) {%>

                                                    <option value='<%=n.toString()%>'><%=n.toString()%></option>

                                                    <%}%>

                                                </select>

                                            </div>
                                            <div class="valid-feedback">
                                                Looks good!
                                            </div>
                                        </div>
                                        <div id='sport' class="col-md-12 mb-12">
                                            <input type="text" name='sport' class="form-control" id="validationCustom05" placeholder="Sport" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">

                                            <div class="input-group" >
                                                <div class="input-group-prepend"  >
                                                    <span class="input-group-text" id="inputGroupPrepend">@</span>
                                                </div>
                                                <input type="text" name='pseudo' class="form-control" id="validationCustomUsername" placeholder="Pseudo"
                                                       aria-describedby="inputGroupPrepend" required>
                                                <div class="input-group-prepend" style='padding-top: 5px'>
                                                    <select class="form-control" name="sexe" required>
                                                        <option value='' >Sexe</option>

                                                        <%for (Sexe s : Sexe.values()) {%>

                                                        <option value='<%=s.toString()%>'><%=s.toString()%></option>

                                                        <%}%>

                                                    </select>
                                                </div>

                                                <div class="invalid-feedback">
                                                    Champ requis.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='prenom' class="form-control" id="validationCustom03" placeholder="Prénom" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='nom' class="form-control" id="validationCustom04" placeholder="Nom" required>
                                            <div class="invalid-feedback">
                                                Champ requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="email" name='email' class="form-control" id="validationCustom05" placeholder="Courriel" required>
                                            <div class="invalid-feedback">
                                                Entrez un courriel valide.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="password" id='password' name='password' class="form-control"  placeholder="Mot de passe" required>
                                            <div class="invalid-feedback">
                                                Mot de passe requis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="password" id='confirm_password' name='confirm_password' class="form-control"  placeholder="Confirmez le mot de passe" required>
                                            <div class="invalid-feedback">
                                                Mots de passe différents.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 1rem;">
                                        <div class="form-check">
                                            <label class="form-check-label" for="invalidCheck">
                                                <input style="width: 5%" class="form-check-input checkbox-primary" type="checkbox" value="" id="invalidCheck" required>
                                                <span style="margin-left: 5px">Accepter les termes et conditions d'utilisation</span>
                                            </label>
                                            <div class="invalid-feedback">
                                                Vous devez accepter les termes et conditions d'utilisation.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal-footer">

                                        <button type="button" class="btn btn-secondary btnD" data-dismiss="modal">Fermer</button>
                                        <button class="btn btn-primary" id="commit" type="submit">Ajouter</button>
                                    </div>

                                </div>
                            </form>

                        </div>

                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
<script src="static/js/membres.js"></script>
