/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

// Get the <span> element that closes the modal
var spanS = document.getElementsByClassName("close")[0];
var spanC = document.getElementsByClassName("close")[1];

var btnSup = $(".btnSup");
var btnMod = $(".btnMod");



$(document).ready(function () {
    btnSup.click(function () {
        var index = $(this).data('index');
        var status = $(this).data('status');
        var i = $(this).parent().last().val();

        $("#idSportSupprimer").val(index);
        $("#titreSup").text("Voulez-vous vraiment supprimer \"" + status + "\"?");
        document.getElementById("modalSupprimerSport").style.display = "block";
    });
});


// When the user clicks the button, open the modal 
btn.onclick = function () {
    debugger;
    modal.style.display = "block";
// Data Picker Initialization
}


// When the user clicks on <span> (x), close the modal
spanS.onclick = function () {
    modal.style.display = "none";
    document.getElementById("modalSupprimerSport").style.display = "none";
}
spanC.onclick = function () {
    modal.style.display = "none";
    document.getElementById("modalSupprimerSport").style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target === modal) {
        modal.style.display = "none";
    }
    if (event.target === document.getElementById("modalSupprimerSport")) {
        document.getElementById("modalSupprimerSport").style.display = "none";
    }
}



$('input[type=file]').change(function () {

    var sourceVal = document.getElementById("imageSport").files[0].path;
    $("#sourceDirPath").val(sourceVal);
    console.log(this.files[0].mozFullPath);

});



