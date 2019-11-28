<%-- 
    Document   : traitementInvitation
    Created on : 2019-11-26, 22:43:26
    Author     : younes-dilali
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <div class="container">


<!--<h1 class="text-center border-bottom">Nom de l'équipe : <c:out value="${requestScope.nameProjetCours}"></c:out></h1>-->
        <h1 class="text-center border-bottom">Nom de l'équipe : <c:out value="nom de l'équipe"></c:out></h1>
            </br>
            <h3 class="text-center border-bottom">
                <!--Capitaine : <c:out value="${requestScope.nomCreateurProjetCours}"></c:out>-->
            Capitaine : <c:out value="nom du caiptaine"></c:out>

        </h3>


        </br></br></br>
        <div class="row d-flex justify-content-center">
            <div class="col-sm-4">
                <a name="reponseInvitation" class=" btn btn-secondary btn-lg border-0" style="background-color:#e4606d; width: 300px;" href="??action=traitementInvitation&reponseInvitation=refuser" role="button">Refuser l'invitation</a>
                <!--<button class="btn btn-secondary col-sm-4 border-0 " style="background-color:#e4606d; width: 200px;">Refuser l'invitation</button>-->
                <!--<button class="btn col-sm-4 border-0 " style="background-color:#e4606d;" type="submit" >Accepter</button>-->
            </div>
            <!--<p> &DoubleLongLeftArrow; OU&MediumSpace; &DoubleLongRightArrow; &MediumSpace; </p>-->

            <div class="col-sm-4">
                <a name="reponseInvitation" class="btn btn-secondary btn-lg border-0" style="background-color:#138496; width: 300px; " href="?action=traitementInvitation&reponseInvitation=accepter" role="button">Accepter l'invitation</a>
                <!--class="btn btn-primary col-sm-4 border-0" style="background-color:#138496;">Accepter l'invitation-->
            </div>

        </div>

    </div>
</body>


