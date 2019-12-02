/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var btnSupL = $(".btnSupLieu");
var btnModL = $(".btnModLieu");

$(document).ready(function () {
    btnSup.click(function () {
        var index = $(this).data('index');
        var status = $(this).data('status');
        var i = $(this).parent().last().val();

        $("#idLieuSupprimer").val(index);
        $("#titreSup").text("Voulez-vous vraiment supprimer \"" + status + "\"?");
        document.getElementById("modalLieuSupprimer").style.display = "block";
    });
});
span.onclick = function () {
//    modal.style.display = "none";
    document.getElementById("modalLieuSupprimer").style.display = "none";
}

window.onclick = function (event) {
    if (event.target == document.getElementById("modalLieuSupprimer")) {
        document.getElementById("modalLieuSupprimer").style.display = "none";
    }
}
