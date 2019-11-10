<%-- 
    Document   : signup_view
    Created on : 2019-10-05, 15:53:52
    Author     : dd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
<!--        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="static/bootstrap/css/bootstrap.min.css"  rel="stylesheet"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="static/bootstrap/js/bootstrap.min.js" ></script>
        <link href="static/css/styles.css" rel="stylesheet">
        <script src="static/js/gestion.js" ></script>
        <link href="static/css/stylesyoun.css" rel="stylesheet" type="text/css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <!--        <script>
                    $(function () {
                        $("#accordion").accordion();
                    });
                </script>-->

        <%
            Membre mee =null;
            mee = (Membre) request.getSession().getAttribute("membre");
//            String nom = mee.getNom();
        %>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">




        <link rel="stylesheet" type="text/css" href="static/css/normalize.css" />
        <link rel="stylesheet" type="text/css" href="static/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="static/css/component.css" />
        <link rel="stylesheet" type="text/css" href="static/css/calendrier.css"/>
        <!--<link rel="stylesheet" href="static/bootstrap3/css/bootstrap.min.css"/>-->
        <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous">
        </script>
        <!--<script src="static/js/calendrier.js"></script>-->
        <script src="static/js/modernizr.custom.25376.js"></script>

        <!--<link href="static/bootstrap/fontAwesome/css/all.min.css" rel="stylesheet" type="text/css">-->
    </head>            

    <%
        Membre m = (Membre) request.getSession().getAttribute("membre");
    %>

        <title>Profil</title>
    </head>

    <body>
        <%@include file="menu.jsp" %>
        <div id="perspective" class="perspective effect-movedown">
            <div class="container">
                <div class="wrapper"> wrapper needed for scroll 
                    <%@include file="sidebar.jsp" %>

                   
                    <div class="signup-form">
                        <div class="container text-center border-1">
                            <h2>Mon profil</h2>


                            <div class="container d-flex btn-floating">


                                <button id='btnJ'  type="button" class="btn btn-primary" data-toggle="modal" data-target="#id02">
                                    Continuer
                                </button>

                            </div>            
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <%@include file="header4.jsp" %>

            


            <%@include file="modalProfil.jsp" %>

            <%--<%@include file="footer.jsp" %>--%>


            </body>

            <script src="static/js/classie.js"></script>
        <script src="static/js/menu.js"></script>



</html>