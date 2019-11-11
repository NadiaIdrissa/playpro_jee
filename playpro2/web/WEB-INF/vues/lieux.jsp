<%-- 
    Document   : lieu
    Created on : 6-Nov-2019, 11:00:50 AM
    Author     : nadym
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Liste des lieux offerts</h1><button id="myBtn" type="button" >Ajouter</button>
    <div >
        <div class="card-columns" style="">
            <c:forEach items="${requestScope.lieux}" var="unlieu"> 

                <div class="card" >
                    <div class="card-body text-center">
                        <img src="static/images/lieux/<c:out value="${unlieu.image1}"/> " />

                        <p class='card-text'>Nom des lieux: <c:out value="${unlieu.nom}" /></p>
                        <p class='card-text'>Numéro civic: <c:out value="${unlieu.numero}" /></p>
                        <p class='card-text'>Rue : <c:out value="${unlieu.rue}" /></p>
                        <p class='card-text'>Ville: <c:out value="${unlieu.ville}" /></p>
                        <p class='card-text'>Pays : <c:out value="${unlieu.pays}" /></p>                    
                        <p class='card-text'>Code postal: <c:out value="${unlieu.code_postal}" /></p>
                        <p class='card-text'>Infos : <c:out value="${unlieu.infos}" /></p>

                    </div> 
                </div> 

            </c:forEach>
        </div> 
    </div>
    <script>
        $('input[type=file]').change(function () {
           // debugger;
            console.log(this.files[0].mozFullPath);
        });
    </script>
</body>

<!-- The Modal -->
<!-- The Modal -->
<div id="myModal" class="modal">

    <!-- Modal content -->
    <div class="modal-content">
        <div class="modal-header">
            <span class="close">&times;</span> 
            <h2>Ajouter un lieu</h2>
        </div>
        <div class="modal-body">
            <form class="form-signin needs-validation" action="?action=lieux" method="post" name="action" value="ajoutImage" enctype="multipart/form-data" novalidate>

                <input type="text" name="nom" placeholder="Nom du lieu"  />
                <input type="text" name="numero" placeholder="Numero civic"  />
                <input type="text" name="rue" placeholder="Nom de la rue"  />
                <input type="text" name="ville" placeholder="Ville"  />
                <input type="text" name="pays" placeholder="Pays"  />
                <input type="text" name="code_postal" placeholder="Code postal"  />
                <input type="text" name="infos" placeholder="Info suplementaire"  />
                
                <input id="imageSport" name="image1" type="file"/>
                <button class="" id="boutton1" type="submit">Créer</button>
            </form>
        </div>
        <div class="modal-footer">
            <h3>Modal Footer</h3>
        </div>
    </div>

</div>
