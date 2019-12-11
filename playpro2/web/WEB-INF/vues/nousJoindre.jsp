<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
        <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
        <title >Contact</title> 
    </head>

    <body>
        <%@include file="header.jsp" %>
        <br><br><br>
        <div>
            <br>
            <!--Section: Contact v.1-->
            <section class="section pb-5"style="margin: 10px; padding-left: 10 px; border-right-style: solide; border-right-width: 0px; padding-right: 10px;">
                <!--Section heading-->
                <h2 class="section-heading h1 pt-4"style="margin-left: 3px; margin-right: 3px;">Nous contacter </h2>
                <!--Section description-->


                <div class="row"style="margin-left: 1px; margin-right: 1px;">

                    <!--Grid column-->
                    <div class="col-lg-5 mb-4">

                        <!--Form with header-->
                        <div class="card">

                            <div class="card-body">
                                <!--Header-->

                                <div class="form-header blue accent-1">
                                    <h3><i class="fa fa-comment"></i> Commentaire</h3>
                                </div>

                                <p>Vous pouvez nous envoyer vos suggestions.</p>
                                <br>

                                <!--Body-->
                                <form action="" accept-charset="UTF-8" method="get">
                                <div class="md-form">
                                    <label for="form-name" class>Votre nom<i class="fa fa-user"></i></label>
                                    <input type="text" name = "nom" id="form-name" class="form-control">

                                </div>
                                <br>

                                <div class="md-form">
                                    <label for="form-email"> Votre courriel <i class="fa fa-envelope-square"> </i></label>
                                    <input type="email" name ="courriel" id="form-email" class="form-control" required>
                                    <br>

                                </div>

                                <div class="md-form">
                                    <label for="form-Subject">Sujet <i class="fa fa-tag"></i></label>
                                    <input type="text" name="sujet" id="form-Subject" class="form-control">

                                </div>
                                <br>

                                <div class="md-form">
                                    <label for="form-text">Votre texte <i class="fa fa-pencil-alt"></i></label>
                                    <textarea id="form-text" name="commentaire" class="form-control md-textarea" rows="3"></textarea>

                                </div>
                                <br>

                                <div class="text-center mt-4">
                                    <button name="action" value="Commentaire" class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Envoyer</button>
                                    
                                </div>
                                </form>

                            </div>

                        </div>
                        <!--Form with header-->

                    </div>
                    <!--Grid column-->

                    <!--Grid column-->

                    <div class="col-lg-7" style=" padding-right: 0px; border-right-width: 15px">

                        <!--Google map-->
                        <div class="mapouter"><div class="gmap_canvas"><iframe width="100%" height="100%" position="absolute" padding="0" id="gmap_canvas"
                                                                               src="https://maps.google.com/maps?q=college%20de%20rosemont%20&t=&z=13&ie=UTF8&iwloc=&output=embed" 
                                                                               frameborder="0" scrolling="no" marginheight="0" marginwidth="0"></iframe></div>
                        </div>

                        <br><br>  
                        <div class="row text-center">
                            <div class="col-md-4">
                                <a class="btn-floating blue accent-1"><i class="fa fa-map-marker-alt"></i></a>
                                <p>6400, 16e Avenue</p>
                                <p>Montréal (Québec) H1X 2S9</p>
                                <p>Canada</p>
                            </div>

                            <div class="col-md-4">
                                <a class="btn-floating blue accent-1"><i class="fa fa-phone"></i></a>
                                <p>(514) 376-1620</p>
                                <p>Lundi au vendredi : 7h - 22h30</p>
                                <p>Samedi et dimanche : 8h - 17h 
                            </div>

                            <div class="col-md-4">
                                <a class="btn-floating blue accent-1"><i class="fa fa-envelope"></i></a>
                                <p>info@gmail.com</p>

                            </div>
                        </div>
                    </div>

                </div>

                <br>


                </div>

            </section>

            <%@include file="footer.jsp" %>
            <script src="static/bootstrap/js/bootstrap.min.js" ></script>
            <script src="static/bootstrap/js/bootstrap.bundle.min.js" ></script>
            <script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>
            <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
            <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
            <!--<script src="static/js/navBar.js" ></script>-->
    </body>
</html>
