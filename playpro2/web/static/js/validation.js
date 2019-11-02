/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Personnalisation de la modale d inscription pour le joueur ou l entraineur


function  cacherE() {
<<<<<<< HEAD
    debugger;
=======
    debugger
>>>>>>> 34db0805468a016a4dbecd2509383deda5df8b09
    var niveau = document.getElementById("niveau");
    var sport = document.getElementById("sport");

    if (sport.style.display === "none") {

    } else {
        debugger
        sport.style.display = "none";
        ($("img")[2]).style.display = "none";
        sport.children[0].required = false
    }
    if (niveau.style.display === "none") {
        niveau.style.display = "block";
        ($("img")[1]).style.display = "block";
        niveau.children[0].children[1].required = true;
    } else {

    }
}
function  cacherJ() {

    var niveau = document.getElementById("niveau");
    var sport = document.getElementById("sport");


    if (niveau.style.display === "none") {

    } else {
        debugger
        niveau.style.display = "none";
        ($("img")[1]).style.display = "none";
        niveau.children[0].children[1].required = false;
    }
    if (sport.style.display === "none") {
        sport.style.display = "block";
        ($("img")[2]).style.display = "block";
        sport.children[0].required = true;
    } else {

    }
}

//Validation des champs Inscription et Connection
(function () {
    'use strict';
    window.addEventListener('load', function () {
// Fetch all the forms we want to apply custom Bootstrap validation styles to
        var forms = document.getElementsByClassName('needs-validation');
// Loop over them and prevent submission
        var validation = Array.prototype.filter.call(forms, function (form) {
            form.addEventListener('submit', function (event) {
                if (form.checkValidity() === false) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add('was-validated');
            }, false);
        });
    }, false);
})();

// fait disparaître le message après 2 secondes
//setTimeout(function () {
//message = document.getElementById("message");
//        if (typeof (message) != 'undefined' && message != null) {
//document.getElementById('FormulaireConnexion').removeChild(message);
<<<<<<< HEAD
//},
=======
//        },
>>>>>>> 34db0805468a016a4dbecd2509383deda5df8b09
//4000);

