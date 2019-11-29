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
var span = document.getElementsByClassName("close")[0];


// When the user clicks the button, open the modal 
btn.onclick = function () {
   
    modal.style.display = "block";
}

// When the user clicks on <span> (x), close the modal
span.onclick = function () {
    modal.style.display = "none";
}

// When the user clicks anywhere outside of the modal, close it
window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}



$('input[type=file]').change(function () {
    
    var sourceVal = document.getElementById("imageSport").files[0].path;
        $("#sourceDirPath").val(sourceVal);
    console.log(this.files[0].mozFullPath);
    
});

// Material Select Initialization
$(document).ready(function() {
$('.mdb-select').materialSelect();

});


var checkBox = document.getElementById("switch1");

checkBox.checked = true;
var text = document.getElementById("divMontant");
var montant = document.getElementById("montant");
var textGratuit = document.getElementById("textGatuit")

$(':checkbox').change(function() {

        // do stuff here. It will fire on any checkbox change
  if (checkBox.checked === true){
     text.style.display = "none";
     textGratuit.innerHTML = "Gratuit";
     montant.innerHTML = "0";
  } else {
    text.style.display = "block";
     textGratuit.innerHTML = "Payant";
  }

}); 


