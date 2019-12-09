/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var modalTraiterInvitation = document.getElementById("modalTraiterInvitation");

// Get the button that opens the modal
var btnTraiterInvitation = document.getElementById("btnTraiterInvitation");

// Get the <span> element that closes the modal
var spanInvit = document.getElementsByClassName("close")[0];

var btn_refus = $(".btn_refus");

btnTraiterInvitation.onclick = function () {
    $(".container").hide();
    modalTraiterInvitation.style.display = "block";
}

spanInvit.onclick = function () {
    modalTraiterInvitation.style.display = "none";
    $(".container").show();
}

window.onclick = function (event) {
    if (event.target == modalTraiterInvitation) {
        modalTraiterInvitation.style.display = "none";
        $(".container").show();
    }
}

$(document).ready(function () {
    btn_refus.onclick = function (e) {
        e.preventDefault();
        debugger;
        $("statutInvitation").val("refus");
        console.log($("statutInvitation").val());
    }
});
