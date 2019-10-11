<%-- 
    Document   : MembrePro
    Created on : 2019-10-04, 13:50:41
    Author     : NelletPiaf
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
                
    <head>
        <link href="static/css/styles.css" rel="stylesheet">
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Membre</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://unpkg.com/gijgo@1.9.13/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.13/css/gijgo.min.css" rel="stylesheet" type="text/css" />
    
    </head>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Anton');      
        body {
          background: #29AB87;
          background-image: url("static/images/soccer-933037_960_720.jpg");
          background-repeat: no-repeat;
          background-size: 100%;

        }

        h1 {
          font-family: 'Anton', sans-serif;
          color: #29AB87;
        }

        .input-group {
          margin-top: 20px;
          margin-bottom: 10px;
        }

        .panel {
          margin-top: 10px;
          background-color: rgba(255, 255, 255, .7)!important;
          border: solid 2px #ccc;
        }

        .panel-heading {
          background-color: #8AFFDF!important;
        }

        #accordion_search_bar {
          border: solid 2px #ccc;
        }

        .btn-default {
          border: solid 1.5px #ccc;
        }

        .fa-search {
          font-size: 1.3em;
        }

        .fa-paw {
          font-size: 1.4em;
          color: blue;
        }
          .fa-user ,.fa-male,.fa-envelope {
             font-size: 1.4em;
          color: blue;   
        }
.imagePreview {
    width: 100%;
    height: 180px;
    background-position: center center;
  background:url(http://cliquecities.com/assets/no-image-e3699ae23f866f6cbdf8ba2443ee5c4e.jpg);
  background-color:#fff;
    background-size: cover;
  background-repeat:no-repeat;
    display: inline-block;
  box-shadow:0px -3px 6px 2px rgba(0,0,0,0.2);
}
.btn-primary
{
  display:block;
  border-radius:0px;
  box-shadow:0px 4px 6px 2px rgba(0,0,0,0.2);
  margin-top:-5px;
}
.imgUp
{
  margin-bottom:15px;
}
.del
{
  position:absolute;
  top:0px;
  right:15px;
  width:30px;
  height:30px;
  text-align:center;
  line-height:30px;
  background-color:rgba(255,255,255,0.6);
  cursor:pointer;
}
.imgAdd
{
  width:30px;
  height:30px;
  border-radius:50%;
  background-color:#4bd7ef;
  color:#fff;
  box-shadow:0px 0px 2px 1px rgba(0,0,0,0.2);
  text-align:center;
  line-height:30px;
  margin-top:0px;
  cursor:pointer;
  font-size:15px;
}
    </style>
    <body>
        <%@include file="header.jsp" %>
        <form>
            

            <div class="form-group">
                <div class="col-lg-12">
                  <div class="container">
                    <div class="row">
                      <section class="panel panel-default">
                        <div class="panel-body">

                            <div class="row">
                                <div class="col-lg-3">
                                  <h1>Membres</h1>
                                  
                                  

                                </div>
 

                                <div class="col-lg-7">
                                    <div class="input-group">
                                        <span class="input-group-btn">
                                           <button class="btn btn-default" type="button">
                                                <i class="fa fa-search" aria-hidden="true"></i></button>
                                        </span>
                                    <input type="search" id="accordion_search_bar" class="form-control" placeholder="Tapez l'information à modifier.">
                                </div>
                                    <!-- /input-group -->
                            </div>
                            <!-- /.col-lg-6 -->
                        </div>
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-2 imgUp">
                                    <div class="imagePreview"></div>
                                    <label class="btn btn-primary">
                                    Télécharger<input type="file" id="t11" class="uploadFile img" disabled value="Upload Photo" style="width: 0px;height: 0px;overflow: hidden;">
                                    </label>                                                                                         
                                    </div><!-- col-2 --> 
                                 </div><!-- row -->
                            </div><!-- container --> 
                        <div class="row">
                            <div class="col-lg-12 col-xs-12">
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
                                                 <i class="fa fa-user fa-fw" aria-hidden="true"></i>Informations Personnelles
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                                          <div class="panel-body">
                                              Pseudo:<input type="text" id="t1" placeholder="Miqui" disabled>
                                              Mot de passe:<input type="password" id="t2" value="Mickey" disabled> 
                                              Nom:<input type="text" value="Mickey" id="t3" disabled> 
                                              Prènom:<input type="text" value="Mickey" id="t4" disabled>
                                          </div>
                                        </div>
                                    </div>
                                    <div class="panel panel-default" id="collapseTwo_Container">
                                        <div class="panel-heading" role="tab" id="headingTwo">
                                            <h4 class="panel-title">
                                                <a class="collapsed" 
                                                   role="button" 
                                                   data-toggle="collapse" 
                                                   data-parent="#accordion" 
                                                   href="#collapseTwo" 
                                                   aria-expanded="false" 
                                                   aria-controls="collapseTwo">
                                                 <i class="fa fa-male fa-fw" aria-hidden="true"></i>Mon Profil
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="collapseTwo" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingTwo">
                                            <div class="panel-body">
                                                Sexe: <select id="t5" disabled>
                                                          <option>Homme</option>
                                                          <option>Femme</option>
                                                          <option>Autre</option>                         
                                                      </select>

                                                Type de membre:<input type="text" id="t6" disabled /> 
                                                Équipe:<input type="text" id="t7" disabled/>
                                                Date-Inscription:<input type="text" placeholder="jj/mm/aa" id="t9" disabled/>                                                 
                                            </div>
                                        </div>
                                    </div>
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
                                                    <i class="fa fa-envelope fa-fw" aria-hidden="true"></i>Mes contacts
                                                </a>
                                            </h4>
                                        </div>
                                        <div id="collapseThree" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingThree">
                                            <div class="panel-body">
                                                   Courriel:<input type="text" placeholder="myemail@gmail.com" id="t8" disabled/> 
                                                   Date naissance: <input id="datepicker" width="276"   id="t10" disabled/>

                                            </div>
                               
                                        </div>
                                    </div>
                                </div>
                
                                <div class="btn-toolbar justify-content-between">
                                    <button type="button" class="btn btn-outline-primary" onclick="myFunction2()" id="sauv" disabled>Annuler</button>
                                    <button type="button" class="btn btn-outline-success" onclick="myFunction()">Modifier</button>
                                </div>
                                <p>Information entièrement confidentielle</p>
                            </div>
                        </div>
          <!-- Row -->
                    </div>
        <!-- Col -->
                </div>
                    
    <!-- Container -->
        </form>

        
        <script type="text/javascript">
    $(".form_datetime").datetimepicker({format: 'yyyy-mm-dd'});
</script>            
        <script>
            function myFunction(){
            
                document.getElementById("t1").disabled=false;
                document.getElementById("t2").disabled=false;
                document.getElementById("t3").disabled=false;
                document.getElementById("t4").disabled=false;
                document.getElementById("t5").disabled=false;
                document.getElementById("t6").disabled=false;

                document.getElementById("t11").disabled=false;
                document.getElementById("sauv").innerHTML="Sauvegarde";
                document.getElementById("sauv").disabled=false;
            }
        </script>
        
                <script>
            function myFunction2(){
            
                document.getElementById("t1").disabled=true;
                document.getElementById("t2").disabled=true;
                document.getElementById("t3").disabled=true;
                document.getElementById("t4").disabled=true;
                document.getElementById("t5").disabled=true;
                document.getElementById("t6").disabled=true;

                document.getElementById("sauv").innerHTML="Annuler";
                document.getElementById("sauv").disabled=true;
                document.getElementById("t11").disabled=true;
            }
        </script>
    <script>
        $('.collapse').not(':first').collapse(); // Collapse all but the first row on the page.
</script>
<script>
// This section makes the search work.
(function() {
  var searchTerm, panelContainerId;
  $('#accordion_search_bar').on('change keyup', function() {
    searchTerm = $(this).val();
    $('#accordion > .panel').each(function() {
      panelContainerId = '#' + $(this).attr('id');

      // Makes search to be case insesitive 
      $.extend($.expr[':'], {
        'contains': function(elem, i, match, array) {
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
<script>
$(".imgAdd").click(function(){
  $(this).closest(".row").find('.imgAdd').before('<div class="col-sm-2 imgUp"><div class="imagePreview"></div><label class="btn btn-primary">Upload<input type="file" class="uploadFile img" value="Upload Photo" style="width:0px;height:0px;overflow:hidden;"></label><i class="fa fa-times del"></i></div>');
});
$(document).on("click", "i.del" , function() {
	$(this).parent().remove();
});
$(function() {
    $(document).on("change",".uploadFile", function()
    {
    		var uploadFile = $(this);
        var files = !!this.files ? this.files : [];
        if (!files.length || !window.FileReader) return; // no file selected, or no FileReader support
 
        if (/^image/.test( files[0].type)){ // only image file
            var reader = new FileReader(); // instance of the FileReader
            reader.readAsDataURL(files[0]); // read the local file
 
            reader.onloadend = function(){ // set image data as background of div
                //alert(uploadFile.closest(".upimage").find('.imagePreview').length);
uploadFile.closest(".imgUp").find('.imagePreview').css("background-image", "url("+this.result+")");
            }
        }
      
    });
});
</script>


  
        
    </body>
</html>
