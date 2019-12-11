<%-- 
    Document   : invitation
    Created on : 2019-11-26, 00:22:23
    Author     : younes-dilali
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div >
    <c:if test = "${NbInvitations>0}">
        <div class="d-flex justify-content-center">
            <table class="table table-hover m-3">


                <thead>
                    <tr >
                        <th style="border-bottom: none">Expéd.</th>
                        <th style="border-bottom: none">Équipe</th>
                        <th class="d-flex justify-content-center" style="border-bottom: none">Actions</th>
                    </tr>
                </thead>
                <tbody>

                    <c:forEach items="${listeInvitations}" var="uneInvit">
                        <tr>
                            <td>
                                <span>
                                    <c:out value="${uneInvit.expediteur.pseudo}" />

                                </span>

                            </td>
                            <td>
                                <span>
                                    <c:out value="${uneInvit.equipe.nomEquipe}" />
                                </span>
                            </td>
                            <td class="p-1">
                                <form  class="formInvit" action="?action=reponseInvitation" method="post" name="action" value="" >

                                    <input name ='idExp' value='${uneInvit.expediteur.id}' type='hidden' />
                                    <input name ='nomEquipe' value='${uneInvit.equipe.nomEquipe}' type='hidden' />
                                    <input name ='statutInvitation' class="statutInvitation" value='accept' type='hidden' />

                                    <div class="d-flex justify-content-center">
                                        <button class="btn btn-light btn-sm float-left btn_refus">Refuser</button>
                                        <button class="btn btn-success btn-sm float-right " type='submit'>Accepter</button>
                                    </div>
                                </form>
                            </td>

                        </tr>
                    </c:forEach>

                </tbody>
            </table>

        </div>
    </c:if>
    <c:if test = "${NbInvitations<1}">
        <div class="text-center">Aucune invitation</div>
    </c:if>
    <script src="static/js/invitation.js" ></script>
</div>


