<%-- 
    Document   : traitementInvitation
    Created on : 2019-11-26, 22:43:26
    Author     : younes-dilali
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>



    <c:forEach items="${sessionScope.listeInvitations}" var="uneInvitation">


        <div class="container">



            <h1 class="text-center border-bottom">Nom de l'équipe : <c:out value="${uneInvitation.id_requete}"></c:out></h1>
             <!--<h1 class="text-center border-bottom">Nom de l'équipe : <c:out value="haha"></c:out></h1>-->
                </br>
                <h3 class="text-center border-bottom">


                    Capitaine : <c:out value="${uneInvitation.id_expediteur}"></c:out>

                </h3>




                </br></br></br>




              

           



            <div class="row d-flex justify-content-center">
                <form action="?action=reponseInvitation" method="post" name="action" value="" >
                    <div class="col-sm-4">
                        <input type='hidden' name="nomEquipeChoisie" value="${uneInvitation.id_requete}">
                        <input type='hidden' name="reponseI" value="refus">
                        <input type='hidden' name="exped" value="${uneInvitation.id_expediteur}">

                        <button class="btn btn-secondary btn-lg border-0" style="background-color:#e4606d; width: 300px;" type="submit" >Refuser l'invitation de ${uneInvitation.id_expediteur} </button>
                    </div>
                </form>

                <form action="?action=reponseInvitation" method="post" name="action" value="" >
                    <div class="col-sm-4">
                        <input type='hidden' name="nomEquipeChoisie" value="${uneInvitation.id_requete}">
                        <input type='hidden' name="reponseI" value="accept">
                        <input type='hidden' name="exped" value="${uneInvitation.id_expediteur}">

                        <button class="btn btn-secondary btn-lg border-0" style="background-color:#138496; width: 300px;" type="submit" >Accepter l'invitation de ${uneInvitation.id_expediteur}</button>
                    </div>
                </form>

            </div>

        </form>

    </div>


</c:forEach>
</body>


