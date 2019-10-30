<!DOCTYPE html>
<html lang="en" class="no-js">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge"> 
        <meta name="viewport" content="width=device-width, initial-scale=1"> 
        <title>Portail</title>
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
        <script src="static/js/calendrier.js"></script>
        <script src="static/js/modernizr.custom.25376.js"></script>
        
    </head>
    <body>

        <%@include file="menu.jsp" %>
        <div id="perspective" class="perspective effect-movedown">
            <div class="container">
                <div class="wrapper"><!-- wrapper needed for scroll -->
                    <%@include file="sidebar.jsp" %>
                    
                    <div class="main mainPortail clearfix">
                        <%@include file="calendrier.jsp" %>
                        <div class="column">

                        </div>
                    </div>
                </div>
            </div>
            <%@include file="header4.jsp" %>
        </div>
        
        
        
        <%--<%@include file="modalProfil.jsp" %>--%>
        
        
        
        <script src="static/js/classie.js"></script>
        <script src="static/js/menu.js"></script>
    </body>
</html>