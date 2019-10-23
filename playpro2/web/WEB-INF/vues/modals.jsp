<%-- 
    Document   : modals
    Created on : 2019-10-14, 23:57:04
    Author     : younes-dilali
--%>

<%@page import="com.playpro.entities.Sexe"%>
<%@page import="com.playpro.entities.Niveau"%>
<!--<div id="id01" class="modal"  aria-labelledby="exampleModalLabel" aria-hidden="true"> 
    <div class="modal-dialog-centered" role="document">
        <div class="modal-content "style="width: 1000px;">
            <div class="modal-header">
                <h5 class="modal-title text-center" id="exampleModalLabel" >JOUEUR</h5>
                <div class="text-center">
                    <img src="static/images/joueur.png" class="rounded" alt="...">
                </div>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container">
                    <form  action="" method="post" name="action" value="signup">
                        <div class="row">

                            <div class="vl">
                                <span class="vl-innertext">ou</span>
                            </div>

                            <div class="col">
                                <a href="#" class="fb btn">
                                    <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                                </a>
                                <a href="#" class="twitter btn">
                                    <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                                </a>
                                <a href="#" class="google btn"><i class="fa fa-google fa-fw">
                                    </i> Login with Google+
                                </a>
                            </div>

                            <div class="col">

                                <div id="niveau" class="form-group">
                                    <label for="inputLevel">Niveau</label>
                                    <select class="form-control" name="niveau" required>
                                        <option value='' >Choisissez...</option>
                                        <option value='Debutant'>Débutant</option>
                                        <option value="Moyen">Moyen</option>
                                        <option value="Avance">Avancé</option>
                                    </select>

                                </div>
                                <input id="sport" type="text" class="form-control" name="sport" placeholder="Votre sport" required="required">
                                <input type="text" class="form-control" name="prenom" placeholder="prenom" required="required">
                                <input type="text" class="form-control" name="nom" placeholder="Prénom" required="required"> 
                                <input type="email" class="form-control" name="email" placeholder="Courriel" required="required">
                                <input id="password" type="password" class="form-control" name="password" placeholder="Mot de passe" required="required">
                                <input id="confirm_password" type="password" class="form-control" name="confirm_password" placeholder="Confirmez le mot de passe" required="required">

                            </div>


                        </div>
                        <div class="modal-footer">

                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                            <button id="commit" type="submit" class="btn btn-primary">S'inscrire</button>
                        </div>
                    </form>
                </div>

            </div>
            <div class="text-center">Vous avez déjà un compte ? <a href="/login_view.jsp">Connectez-vous</a></div>
            <br>
        </div>
    </div>
</div>-->
<div id="id02" class="modal"  aria-labelledby="exampleModalLabel" aria-hidden="true"> 
    <div class="modal-dialog-centered" role="document">
        <div class="modal-content "style="width: 1000px;">
            <div class="modal-header">
                <!--<h5 class="modal-title text-center" id="exampleModalLabel" >JOUEUR</h5>-->
                <div class="text-center">
                    <img id='imagejoueur' src="static/images/joueur.png" class="rounded" alt="...">
                    <img id='imageentraineur' src="static/images/entraineur.png" class="rounded" alt="...">
                </div>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container">
                    <!--<form  action="" method="post" name="action" value="signup">-->
                    <div class="row">

                        <div class="vl">
                            <span class="vl-innertext">ou</span>
                        </div>

                        <div class="col">
                            <a href="#" class="fb btn">
                                <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                            </a>
                            <a href="#" class="twitter btn">
                                <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                            </a>
                            <a href="#" class="google btn"><i class="fa fa-google fa-fw">
                                </i> Login with Google+
                            </a>
                        </div>

                        <div class="col">

                            <form class="needs-validation" action="" method="post" name="action" value="signup" novalidate>
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
                                                Champs recquis.
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
                                                    Champs recquis.
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='prenom' class="form-control" id="validationCustom03" placeholder="Prénom" required>
                                            <div class="invalid-feedback">
                                                Champs recquis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="text" name='nom' class="form-control" id="validationCustom04" placeholder="Nom" required>
                                            <div class="invalid-feedback">
                                                Champs recquis.
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
                                                Mot de passe recquis.
                                            </div>
                                        </div>
                                        <div class="col-md-12 mb-12">
                                            <input type="password" id='confirm_password' name='confirm_password' class="form-control"  placeholder="Confirmez le mot de passe" required>
                                            <div class="invalid-feedback">
                                                Mot de passe différent.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="form-check">
                                            <label class="form-check-label" for="invalidCheck">
                                                <input style="width: 5%" class="form-check-input checkbox-primary" type="checkbox" value="" id="invalidCheck" required>
                                                Agree to terms and conditions
                                            </label>
                                            <div class="invalid-feedback">
                                                Vous devez accepter les termes et conditions d'utilisations.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="modal-footer">

                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                                        <button class="btn btn-primary btn-sm" id="commit" type="submit">S'inscrire</button>
                                    </div>

                                </div>
                            </form>


                        </div>

                        <!--</form>-->
                    </div>

                </div>
                <div class="text-center">Vous avez déjà un compte ? <a href="?action=login">Connectez-vous</a></div>
                <br>
            </div>
        </div>
    </div>
