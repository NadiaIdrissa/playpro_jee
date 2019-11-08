<%-- 
    Document   : sports
    Created on : 2019-11-02, 21:17:27
    Author     : toute
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
    <h1>Liste des sport offerts</h1><button id="myBtn" type="button" >Ajouter</button>
    <div >
        <div class="card-columns" style="">
            <c:forEach items="${requestScope.sports}" var="unSport"> 

                <div class="card" >
                    <div class="card-body text-center">
                        <img src="static/images/sports/<c:out value="${unSport.image}"/> " />

                        <p class='card-text'>Nom du sport: <c:out value="${unSport.nomSport}" /></p>
                        <p class="card-text">Nombre de joueurs par équipe: <c:out value="${unSport.nbMaxJoueur}" /></p>

                    </div> 
                </div> 

            </c:forEach>
        </div> 
    </div>
    <script>
        $('input[type=file]').change(function () {
            debugger;
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
            <h2>Nouveau sport</h2>
        </div>
        <div class="modal-body">
            <form class="form-signin needs-validation" action="" method="post" name="action" value="sports" novalidate>

                <input type="text" name="nomSport" placeholder="Nom du sport"  />
                <select name="nbMax">
                    <option value="" disabled>Choisir</option>
                    <% for (int i = 0; i < 30; i++) {%>
                    <option value="<%=i%>"><%=i%></option>

                    <%}
                    %>
                </select>
                <input id="imageSport" name="imageSport" type="file"/>
                <input type="text" name="sourceDirPath" id="sourceDirPath" class="myInput" />
                <button class="" id="boutton1" type="submit">Créer</button>
            </form>
        </div>
        <div class="modal-footer">
            <h3>Modal Footer</h3>
        </div>
    </div>

</div>

