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
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="static/bootstrap/js/bootstrap.min.js" ></script>
    <link href="static/css/styles.css" rel="stylesheet">
    <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

    <%
        //Membre mee =null;
        //mee = (Membre) request.getSession().getAttribute("membre");
        //Membre m = (Membre) request.getSession().getAttribute("membre");
    %>

    <title>Profil</title>
</head>

<body>
    <div class="contentProfil">
        <img id='imagejoueur' src="static/images/head01.png" class="rounded" alt="imgprofil">

    </div>
<!--    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>-->
    <div class="modal-body">
        <div class="container">
            <div class="row">
                <div class="vl">
                    <span class="vl-innertext">ou</span>
                </div>

                <div class="col">
                    <a href="#" class="fb btn">
                        <i class="fa fa-facebook fa-fw"></i> Login with Facebook
                    </a>

                    <a href="#" class="btn btn-info" role="button">Link Modifier</a>
                    <a href="#" class="btn btn-success" role="button">confirmer</a>
                </div>

                <div class="col">
                    <form  action="" method="post" name="action" value="profil" novalidate>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-12 mb-12">
                                    <input type="text" name='pseudoR' class="form-control" id="validationCustom03" placeholder="${sessionScope.membre.pseudo}" required>
                                    <div class="invalid-feedback">
                                        Champs recquis.
                                    </div>
                                </div>
                                <div class="col-md-12 mb-12">
                                    <input type="text" name='nomR' class="form-control" id="validationCustom03" placeholder="${sessionScope.membre.nom}" required>
                                    <div class="invalid-feedback">
                                        Champs recquis.
                                    </div>
                                </div>
                                <div class="col-md-12 mb-12">
                                    <input type="text" name='prenomR' class="form-control" id="validationCustom04" placeholder="${sessionScope.membre.prenom}" required>
                                    <div class="invalid-feedback">
                                        Champs recquis.
                                    </div>
                                </div>
                                <div class="col-md-12 mb-12">
                                    <input type="text" name='anneeR' class="form-control" id="validationCustom5" placeholder="Année de nassaince" required>
                                    <div class="invalid-feedback">
                                        Champs recquis.
                                    </div>
                                </div>
                                <div id='niveaug' class="col-md-12 mb-12">
                                    <div  class="form-group">
                                        <label for="inputLevel">Niveau</label>
                                        <select class="form-control" name="niveauR" required>
                                            <option value='' >${sessionScope.membre.niveau}</option>
                                            <%for (Niveau n : Niveau.values()) {%>

                                            <option value='<%=n.toString()%>'><%=n.toString()%></option>

                                            <%}%>
                                        </select>
                                    </div>
                                    <div class="valid-feedback">
                                        Looks good!
                                    </div>
                                </div>
                                <div id='prenom' class="col-md-12 mb-12">
                                    <div  class="form-group">
                                        <label for="inputLevel">Sexe</label>
                                        <select class="form-control" name="sexeR" required>
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
                                    <input type="email" name='emailR' class="form-control" id="validationCustom05" placeholder="${sessionScope.membre.courriel}" required>
                                    <div class="invalid-feedback">
                                        Entrez un courriel valide.
                                    </div>
                                </div>

                                <div class="col-md-12 mb-12">
                                    <input type="password" id='password' name='passwordR' class="form-control"  placeholder="Mot de passe" required>
                                    <div class="invalid-feedback">
                                        Mot de passe recquis.
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
                                    
                            <div class="footer">
                                <button class="btn btn-primary btn-sm" id="commit" type="submit">Enregistrer</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="text-center">
        Vous avez déjà un compte ? <a href="?action=login">Connectez-vous</a>
    </div>
    </body>
</html>