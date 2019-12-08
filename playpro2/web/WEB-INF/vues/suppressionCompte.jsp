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
            <h6 style="margin-bottom: 30px;">Voulez vous vraiment supprimer votre compte?</h6>
            <div class="row">
                <div class="col-sm-4 col-md-4 col-lg-4">
                    <a class="btn btn-primary" href="?action=portail" role="button">Annuler</a>
                </div>
                <div class="col-sm-4 col-md-4 col-lg-4 text-center text-uppercase">
                    <label>Nous garderons vos informations en toute confidentialité. Votre profil ne sera plus accessible pour les autres membres du site. Votre compte pourra toujours être réactivé</label>
                </div>
                <div class="col-sm-4 col-md-4 col-lg-4">
                    <a class="btn btn-primary" href="?action=supp&sta=a" role="button">Suppression</a>
                </div>
                
            </div> 
            
            
        </div>
    </div>
</html>