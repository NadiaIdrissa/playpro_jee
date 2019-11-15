<%-- 
    Document   : signup_view
    Created on : 2019-10-05, 15:53:52
    Author     : dd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <div class="contentSuppCompte">
        <div class="container text-center border-1">
            <h2>Confirmation</h2>
            <h6>Voulez vous vraiment supprimer votre compte</h6>


            <div class="row">
                <div class="col-sm-6 col-md-5 col-lg-5">
                <a class="btn btn-primary" style="text-decoration: none" href="?action=portail" role="button">Annuler</a>
                </div>
                <div class="col-sm-6 col-md-5 col-lg-5">
                <a class="btn btn-primary" style="text-decoration: none" href="?action=supp&sta=a" role="button">Suppression</a>
                </div>
            </div> 
            <label>Votre compte pourra toujours être réactivé</label>
        </div>
    </div>
</html>