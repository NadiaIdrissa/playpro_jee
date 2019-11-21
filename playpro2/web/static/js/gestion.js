/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var btnAjoutMembre = $("#btnAjoutMembre");

var modalAjoutMembre = $("#modalAjoutMembre");

btnAjoutMembre.onclick = function () {
    debugger;
    modalAjoutMembre.style.display = "block";
}

window.onclick = function (event) {
    if (event.target == modal) {
        modalAjoutMembre.style.display = "none";
    }
}


