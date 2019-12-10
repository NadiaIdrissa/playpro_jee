/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var btn_refus = $(".btn_refus");

btn_refus.each(function (index) {
    $(this).on("click", function () {
        var formulaire = $(".formInvit")[index];
        var input1 = $(".statutInvitation")[index];
        input1.value = "refus";
        console.log("ALLO"+index);
        debugger;
        formulaire.submit();
    });
});


//window.onclick = function (event) {
//
//    if (event.target === modalTraiterInvitation) {
//        modalTraiterInvitation.style.display = "none";
//        $(".container").show();
//    } else if (event.target === document.getElementById("modalLieuSupprimer")) {
//        document.getElementById("modalLieuSupprimer").style.display = "none";
//    } else if (event.target === document.getElementById("modalSupprimerSport")) {
//        document.getElementById("modalSupprimerSport").style.display = "none";
//    } else if (event.target === modal) {
//        modal.style.display = "none";
//    }
//};

//$(".close").each(function (index) {
//    $(this).on("click", function () {
//        console.log("ALLO");
//        if (event.target === document.getElementById("modalLieuSupprimer")) {
//            document.getElementById("modalLieuSupprimer").style.display = "none";
//        } else if (event.target === document.getElementById("modalSupprimerSport")) {
//            document.getElementById("modalSupprimerSport").style.display = "none";
//        } else if (event.target === modal) {
//            modal.style.display = "none";
//        }
//    });
//});


