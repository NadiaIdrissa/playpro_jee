/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Get the modal
var modal = document.getElementById("myModal");
var modalP = document.getElementById("myModalParam");

// Get the button that opens the modal
var btn = document.getElementById("myBtn");

var btnP = document.getElementById("myBtnP");







// Get the <span> element that closes the modal
var span = document.getElementsByClassName("close")[0];

var span1 = document.getElementsByClassName("closing")[0];

var btnSup = $(".btnSup");
var btnMod = $(".btnMod");



btnP.onclick = function(){
    modalP.style.display ="block";
    
}

span1.onclick = function () {
    modalP.style.display = "none";
}


$(document).ready(function(){
});



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
span.onclick = function () {
    modal.style.display = "none";
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



