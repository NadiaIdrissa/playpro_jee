<html>
<header>
<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="static/css/styles.css" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</header>
<body>
    <%@include file="header.jsp" %>
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
            <h3><i class="fas fa-envelope"></i> Nous crire:</h3>
          </div>

          <p>Vous pouvez nous envoyer vos suggestions.</p>
          <br>

          <!--Body-->
          <div class="md-form">
			<label for="form-name">Votre nom <span class="glyphicon glyphicon-user"></span></label>
            <i class="fas fa-user prefix grey-text"></i>
            <input type="text" id="form-name" class="form-control">
            
          </div>
		  <br>

          <div class="md-form">
		    <label for="form-email"> Votre courriel <span class="glyphicon glyphicon-envelope"> </span></label>
            <i class="fas fa-envelope prefix grey-text"></i>
            <input type="text" id="form-email" class="form-control">
			<br>
            
          </div>

          <div class="md-form">
		    <label for="form-Subject">Sujet <span class="glyphicon glyphicon-tag"></span></label>
            <i class="fas fa-tag prefix grey-text"></i>
            <input type="text" id="form-Subject" class="form-control">
            
          </div>
		  <br>

          <div class="md-form">
		    <label for="form-text">Votre texte <span class="glyphicon glyphicon-pencil"></span></label>
            <i class="fas fa-pencil-alt prefix grey-text"></i>
            <textarea id="form-text" class="form-control md-textarea" rows="3"></textarea>
            
          </div>
		  <br>

          <div class="text-center mt-4">
			
            <button type="button" class="btn btn-default btn-sm">Envoyer</button>
          </div>

        </div>

      </div>
      <!--Form with header-->

    </div>
    <!--Grid column-->

    <!--Grid column-->
    <div class="col-lg-7" style=" padding-right: 15px; border-right-width: 15px">

      <!--Google map-->
      <div id="map-container-google-11" class="z-depth-1-half map-container-6" style="height: 400px">
        <iframe src="https://maps.google.com/maps?q=montreal&amp;t=&amp;z=10&amp;ie=UTF8&amp;iwloc=&amp;output=embed" style="border:1" allowfullscreen="" frameborder="0"></iframe>
      </div>

      <br>
   
      <!--Buttons-->
      <div class="row text-center">
        <div class="col-md-4">
          <a class="btn-floating blue accent-1"><i class="fas fa-map-marker-alt"></i></a>
          <p>6400, 16e Avenue</p>
		  <p>Montral (Qubec) H1X 2S9</p>
          <p>Canada</p>
        </div>

        <div class="col-md-4">
          <a class="btn-floating blue accent-1"><i class="fas fa-phone"></i></a>
          <p> 514 376-1620</p>
          <p>Lundi au vendredi : 7 h  22 h 30</p>
		  <p>Samedi et dimanche : 8 h  17 h 
        </div>

        <div class="col-md-4">
          <a class="btn-floating blue accent-1"><i class="fas fa-envelope"></i></a>
          <p>info@gmail.com</p>
          <p>sale@gmail.com</p>
        </div>
      </div>

    </div>
    <!--Grid column-->

  </div>
</div>

</section>
		
<style>
    .map-container-6{
    overflow:hidden;
    padding-bottom:56.25%;
    position:relative;
    height:0;
    }
    .map-container-6 iframe{
    left:0;
    top:0;
    height:100%;
    width:100%;
    position:absolute;
    }
</style>
<!--Section: Contact v.1-->
<%@include file="footer.jsp" %>
</body>
</html>
