<%-- 
    Document   : modals
    Created on : 2019-10-14, 23:57:04
    Author     : younes-dilali
--%>

<div id="id01" class="modal"  aria-labelledby="exampleModalLabel" aria-hidden="true"> 
    <div class="modal-dialog-centered" role="document">
        <div class="modal-content "style="width: 1000px;">
            <div class="modal-header">
                <!--<h5 class="modal-title text-center" id="exampleModalLabel" >JOUEUR</h5>-->
                <div class="text-center">
                    <img src="static/images/joueur.png" class="rounded" alt="...">
                </div>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container">
                    <form action="" method="post" name="action" value="signup">
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

                                <div class="form-group">
                                    <label for="inputLevel">Niveau</label>
                                    <select class="form-control">
                                        <option>Débutant</option>
                                        <option>Moyen</option>
                                        <option>Avancé</option>
                                    </select>
                                </div>

                                <input type="text" class="form-control" name="prenom" placeholder="Nom" required="required">
                                <input type="text" class="form-control" name="nom" placeholder="Prénom" required="required"> 
                                <input type="email" class="form-control" name="email" placeholder="Courriel" required="required">
                                <input id="password" type="password" class="form-control" name="password" placeholder="Mot de passe" required="required">
                                <input id="confirm_password" type="password" class="form-control" name="confirm_password" placeholder="Confirmez le mot de passe" required="required">

                            </div>


                        </div>
                    </form>
                </div>

            </div>
            <div class="modal-footer">

                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                <button id="commit" type="submit" class="btn btn-primary">S'inscrire</button>
            </div>
            <div class="text-center">Vous avez déjà un compte ? <a href="/login_view.jsp">Connectez-vous</a></div>
            <br>
        </div>
    </div>
</div>







<div id="id02" class="modal"  aria-labelledby="exampleModalLabel" aria-hidden="true"> 
    <div class="modal-dialog-centered" role="document">
        <div class="modal-content "style="width: 1000px;">
            <div class="modal-header">
                <!--<h5 class="modal-title" id="exampleModalLabel" >Vous allez vous inscrire en tant qu'entraineur</h5>-->
                <div class="text-center">
                    <img src="static/images/entraineur.png" class="rounded" alt="...">
                </div>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container">
                    <form action="" method="post" name="action" value="signup">
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


                                <input type="text" class="form-control" name="sport" placeholder="Votre sport" required="required">
                                <input type="text" class="form-control" name="prenom" placeholder="Nom" required="required">
                                <input type="text" class="form-control" name="nom" placeholder="Prénom" required="required"> 
                                <input type="email" class="form-control" name="email" placeholder="Courriel" required="required">
                                <input id="password" type="password" class="form-control" name="password" placeholder="Mot de passe" required="required">
                                <input id="confirm_password" type="password" class="form-control" name="confirm_password" placeholder="Confirmez le mot de passe" required="required">

                            </div>


                        </div>
                    </form>
                </div>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Fermer</button>
                <button id="commit" type="submit" class="btn btn-primary">S'inscrire</button>
            </div>
            <div class="text-center">Vous avez déjà un compte ? <a href="/login_view.jsp">Connectez-vous</a></div>
            <br>
        </div>
    </div>
</div>