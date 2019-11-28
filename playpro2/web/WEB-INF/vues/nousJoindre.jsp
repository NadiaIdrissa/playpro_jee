<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title >Contact</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link  rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
    <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link href="static/css/cssFooter/styles.css" rel="stylesheet" type="text/css">
    <link href="static/css/cssNavBar/stylesyami.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="static/css/calendrier.css"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" 
          integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" 
          crossorigin="anonymous">
    <!--<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">-->           
</head>

<body>
<%@include file="header.jsp" %>
<!--Section: Contact v.1-->
<section class="section pb-5 contactSect">
    <!--Section heading-->
    <h2 class="section-heading h1 pt-4 nsContacter">Nous contacter</h2>
    
    <!--Section description-->
    <div class="row descContact">
        <!--Grid column-->
        <div class="col-lg-5 mb-4">
            <!--Form with header-->
            <div class="card">
                <div class="card-body contactForm">
                    <!--Header-->
                    <div class="form-header blue accent-1">
                      <h3><i class="fas fa-envelope"></i> Nous écrire</h3>
                    </div>

                    <p>Vous pouvez nous envoyer vos suggestions</p>

                    <!--Body-->
                    <div class="md-form">
                        <label for="form-name" class>Votre nom <span class="fas fa-user"></span></label>
                        <input type="text" id="form-name" class="form-control">
                    </div>

                    <div class="md-form">
                        <label for="form-email"> Votre courriel <span class="fas fa-envelope"> </span></label>
                        <input type="text" id="form-email" class="form-control">
                    </div>

                    <div class="md-form">
                        <label for="form-Subject">Sujet <span class="fas fa-tag"></span></label>
                        <input type="text" id="form-Subject" class="form-control">
                    </div>
                    
                    <div class="md-form">
                        <label for="form-text">Votre texte <span class="fas fa-pencil-alt"></span></label>
                        <textarea id="form-text" class="form-control md-textarea" rows="3"></textarea>
                    </div>

                    <div class="text-center mt-4">
                        <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Envoyer</button>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-lg-7" style=" padding-right: 0px; border-right-width: 15px">
            <!--Google map-->
            <div class="gmap_canvas">
                <iframe width="100%" height="100%" padding="0" position="absolute" id="gmap_canvas"
                    src="https://maps.google.com/maps?q=college%20de%20rosemont%20&t=&z=13&ie=UTF8&iwloc=&output=embed" 
                    frameborder="0" scrolling="no" marginheight="0" marginwidth="0">
                </iframe>
            </div>
 
            <div class="row text-center infoContact">
                <div class="col-md-4">
                    <a class="btn-floating blue accent-1"><i class="fas fa-map-marker-alt"></i></a>
                    <p>6400, 16e Avenue
                    <br>H1X 2S9 Montréal
                    <br>QC Canada</p>
                </div>

                <div class="col-md-4">
                    <a class="btn-floating blue accent-1"><i class="fas fa-phone"></i></a>
                    <p>514 376-1620</p>
                </div>

                <div class="col-md-4">
                    <a class="btn-floating blue accent-1"><i class="fas fa-envelope"></i></a>
                    <p>contact@playpro.ca</p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <p class="text-center">
                        <i class="fas fa-clock-o"></i>
                        Du lundi au vendredi de 7h00 à 22h30 et le week-end de 9h00 à 17h00
                    </p>
                </div>
            </div>
        </div>
    </div>
</section>

<%@include file="footer.jsp" %>

<script src="static/bootstrap/jQuery/jquery-3.2.1.slim.min.js" ></script>
<!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="static/bootstrap/js/bootstrap.min.js" ></script>
<script src="static/bootstrap/js/bootstrap.bundle.min.js" ></script>
<script src="static/js/calendrier.js"></script>
<script src="static/js/modernizr.custom.25376.js"></script>
<script src="static/js/navBar.js" ></script>

</body>
</html>