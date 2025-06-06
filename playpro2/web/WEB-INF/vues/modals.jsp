<%-- 
    Document   : modals
    Created on : 2019-10-14, 23:57:04
    Author     : younes-dilali
--%>

<%@page import="com.playpro.entities.Sexe"%>
<%@page import="com.playpro.entities.Niveau"%>

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
            <div class="modal-body body2">
                <div class="container">
                    <div class="row">

                        <div class="vl">
                            <span class="vl-innertext">ou</span>
                        </div>

                        <div class="col mod">
                            <a href="#" class="fb color-white btn">
                                <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                            </a>
                            <a href="#" class="twitter color-white btn">
                                <i class="fa fa-twitter fa-fw"></i> Login with Twitter
                            </a>
                            <a href="#" class="google color-white btn"><i class="fa fa-google fa-fw">
                                </i> Login with Google+
                            </a>
                        </div>

                        <div class="col mod">
                            <form class="needs-validation" action="?action=signup" method="post" name="action" value="signup" novalidate>
                                <div class="form-group">
                                    <div class="form-row">
                                        <div id='niveau' class="col-md-12 mb-12">
                                            <div  class="form-group">
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
                                            <input type="text" name='sport' class="form-control" id="validationCustom05" placeholder="Votre sport" required>
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
                                            <input type="text" name='prenom' class="form-control" id="validationCustom03" placeholder="Pr�nom" required>
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
                                                Mots de passe diff�rents.
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group" style="margin-top: 1rem;">
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

                                        <button type="button" class="btn btn-secondary btnD" data-dismiss="modal">Fermer</button>
                                        <button class="btn btn-primary" id="commit" type="submit">S'inscrire</button>
                                    </div>

                                </div>
                            </form>

                        </div>

                    </div>

                </div>
            </div>
            <div class="text-center footer2">
                Vous avez d�j� un compte ? 
                <a href="?action=login">Connectez-vous</a>
            </div>
        </div>
    </div>
</div>
