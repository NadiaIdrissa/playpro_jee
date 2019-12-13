<%-- 
    Document   : annonce
    Created on : 2019-11-27, 10:07:35
    Author     : toute
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Liste des commentaires</h1>
    
    <div >
        <div class=" " style="">
            <c:forEach items="${requestScope.listeComm}" var="unComm"> 

                <div class="annonce" >
                    <h2 class='card-text font-weight-bold bg-primary text-uppercase' ><c:out value="${unComm.sujet}" /><br></h2>
                    <div class="row" >
                        <div class="cadre text-center col-4 border">

                            <p class='card-text'>Nom: <c:out value="${unComm.nom}" /></p>
                            <p class="card-text">Courriel: <c:out value="${unComm.courriel}" /></p>

                            <p class="card-text">Date et heure: <c:out value="${unComm.dateReception}" /></p>
                        </div>
                        <div class='col-8'>
                            <h3>Message </h3>
                            <p class="card-text"> <c:out value="${unComm.commentaire}" /></p>
                        </div> 
                    </div> 
                </div> 

            </c:forEach>
        </div> 
    </div>

</body>

<!-- The Modal -->

<!--<script src="static/js/annonces.js"></script>-->
<!--<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>-->

