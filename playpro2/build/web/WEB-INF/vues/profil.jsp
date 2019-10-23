<%-- 
    Document   : profil
    Created on : 2019-10-12, 18:30:53
    Author     : Piaf
--%>

<%@page import="com.playpro.entities.Membre"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>

        <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>-->
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>            
        <link href="static/css/styleMembre.css" rel="stylesheet" type="text/css">
        <script src="static/js/profil.js" ></script>
        <title>Membres</title>
        <!--a telecharger--><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!--<link href="static/bootstrap/fontAwesome/css/all.min.css" rel="stylesheet" type="text/css">-->
    </head>            
    <style>

    </style>
    <%
        Membre m = (Membre) request.getSession().getAttribute("membre");
    %>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
            <br>  <p class="text-center">Header</p>
            <hr>

            <div class="card bg-light">
                <article>
                    <div class="container-fluid del ">

                        <div class="row">
                            <div class="col-sm-12 col-md-6 col-lg-3">
                                <div>
                                    <div class="card-body imgUp">
                                        <div class="imagePreview"></div>
                                        <label class="btn btn-primary">
                                            Télécharger<input type="file"  class="uploadFile img"  value="Upload Photo" style="width: 0px;height: 0px;overflow: hidden;">
                                        </label>
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-12 col-md-6 col-lg-6 my-1">
                                <div>
                                    <div >
                                        <div class="input-group">
                                            <span class="input-group-btn">
                                                <button class="btn btn-default" type="button">
                                                    <i class="fa fa-search" aria-hidden="true"></i></button>
                                            </span>
                                            <input type="search" id="accordion_search_bar" class="form-control" placeholder="Tapez l'information à modifier.">
                                        </div>
                                    </div>
                                </div>
                                <div class="titreCard text-center">
                                    <h1>Bienvenue <%=m.getPseudo()%>!</h1>
                                </div>
                            </div>

                            <div class="col-sm-12 col-md-6 col-lg-3 my-1">
                                <div class="card cardmargin">
                                    <a class="btn btn-info dropdown-toggle" href="#" id="notifications-dropdown" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i id="notificationsIcon" class="fa fa-bell-o" aria-hidden="true"><span id="kk">amis</span></i>
                                        <span id="notificationsBadge" class="badge badge-danger"><i class="fa fa-spinner fa-pulse fa-fw" aria-hidden="true"></i></span>
                                    </a>
                                    <div class="card-body">Some contentbdbdbdfjkgfjfjfsgsgsgsgsgsgjjffhdfhdfhdhhdhhdhhdhdhdhdbdbbd</div>
                                </div>
                            </div>
                        </div><!--End row-->

                        <div class="row">
                            <div class="col-sm-12 col-md-12 col-lg-12"> 
                                <div class="container">
                                    <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                                        <div class="panel panel-default" id="collapseOne_container">
                                            <div class="panel-heading" role="tab" id="headingOne">
                                                <h4 class="panel-title">
                                                    <a role="button" 
                                                       data-toggle="collapse" 
                                                       data-parent="#accordion" 
                                                       href="#collapseOne" 
                                                       aria-expanded="true" 
                                                       aria-controls="collapseOne">
                                                        <i class="fa fa-user fa-fw" aria-hidden="true"></i><span id="infPers">Informations personnelles</span>
                                                    </a>
                                                </h4>
                                            </div>

                                            <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                                <div class="panel-body">
                                                    <label for="pseudo">Pseudo:</label>
                                                    <input type="text" id="pseudo" placeholder="<%= m.getPseudo()%>" disabled><br>
                                                    <label for="pwd">Mot de passe:</label>
                                                    <input type="password" id="pwd" value="<%= m.getMpd()%>" disabled> 
                                                    <label for="nom">Nom:</label>
                                                    <input type="text" placeholder="<%= m.getNom()%>" id="nom" disabled> 
                                                    <label for="pwd">Prénom:</label>
                                                    <input type="text" placeholder="<%= m.getPrenom()%>" id="prenom" disabled>
                                                </div>
                                            </div>
                                        </div> 

                                        <div class="panel panel-default" id="collapseTwo_container">
                                            <div class="panel-heading" role="tab" id="headingTwo">
                                                <h4 class="panel-title">
                                                    <a role="button" 
                                                       data-toggle="collapse" 
                                                       data-parent="#accordion" 
                                                       href="#collapseTwo" 
                                                       aria-expanded="true" 
                                                       aria-controls="collapseOne">
                                                        <i class="fa fa-male fa-fw" aria-hidden="true"></i><span id="infPers">Mon profil</span>
                                                    </a>
                                                </h4>
                                            </div>

                                            <div id="collapseTwo" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                                <div class="panel-body">
                                                    <label for="sex">Sexe:</label>

                                                    <select id="sex">
                                                        <option value=""disabled selected><%=m.getSexe()%>
                                                        <option value="1">Homme</option>
                                                        <option value="2">Femme</option>
                                                        <option value="3">Autre</option> 
                                                        
                                                    </select><br>
                                                    <label for="tmemb">Type de membre:</label>
                                                    <input type="text" id="tmemb" disabled />
                                                    <label for="equi">Équipe:</label>
                                                    <input type="text" id="equi" disabled/>
                                                    <label for="dInsc">Date-Inscription:</label>
                                                    <input type="text" placeholder="jj/mm/aa" id="dInsc" disabled/>
                                                </div>
                                            </div>
                                        </div>
                                        <!--ici-->

                                        <div class="panel panel-default" id="collapseThree_Container">
                                            <div class="panel-heading" role="tab" id="headingThree">
                                                <h4 class="panel-title">
                                                    <a class="collapsed" 
                                                       role="button" 
                                                       data-toggle="collapse" 
                                                       data-parent="#accordion" 
                                                       href="#collapseThree" 
                                                       aria-expanded="false" 
                                                       aria-controls="collapseThree">
                                                        <i class="fa fa-envelope fa-fw" aria-hidden="true"></i></i><span id="infPers">Mes contacts</span>
                                                    </a>
                                                </h4>
                                            </div>
                                            <div id="collapseThree" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingThree">
                                                <div class="panel-body">
                                                    <label for="email">Courriel:</label>
                                                    <input type="text" placeholder="<%=m.getCourriel()%>" id="email" disabled/> 
                                                    <label for="dateN">Date de naissance:</label>
                                                    <input id="datepicker" width="276"   id="dateN" disabled/>

                                                </div>
                                            </div>
                                            <div class="btn-toolbar justify-content-between">
                                                <button type="button" class="btn btn-outline-primary" onclick="myFunction2()" id="sauv" disabled>Annuler</button>
                                                <button type="button" class="btn btn-outline-success" onclick="myFunction()">Modifier</button>
                                            </div>
                                            <p>Information entièrement confidentielle</p>
                                        </div>

                                    </div>  <!--End row2-->         
                                </div><!--End container fluid-->
                            </div><!--End container fluid-->
                        </div><!--End container fluid-->
                </article>
            </div> <!-- card.// -->  
            <hr>      
        </div> 
        <!--container end.//-->

        <br><br>

        <!--    <article class="bg-secondary mb-3">  
                <div class="card-body text-center">
                    <h3 class="text-white mt-3">footer</h3>
        
                </div>
                <br><br>
            </article>-->
        <%@include file="footer.jsp" %>





        <!--a telecharger-->
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->

        <script>

            // This section makes the search work.
            (function () {
                var searchTerm, panelContainerId;
                $('#accordion_search_bar').on('change keyup', function () {
                    searchTerm = $(this).val();
                    $('#accordion > .panel').each(function () {
                        panelContainerId = '#' + $(this).attr('id');

                        // Makes search to be case insesitive 
                        $.extend($.expr[':'], {
                            'contains': function (elem, i, match, array) {
                                return (elem.textContent || elem.innerText || '').toLowerCase()
                                        .indexOf((match[3] || "").toLowerCase()) >= 0;
                            }
                        });

                        // END Makes search to be case insesitive

                        // Show and Hide Triggers
                        $(panelContainerId + ':not(:contains(' + searchTerm + '))').hide(); //Hide the rows that done contain the search query.
                        $(panelContainerId + ':contains(' + searchTerm + ')').show(); //Show the rows that do!

                    });
                });
            }());
            // End Show and Hide Triggers
        </script>


    </body>
</html>
