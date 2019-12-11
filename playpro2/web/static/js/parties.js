/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


var btn = document.getElementById("myBtn");

var modal = document.getElementById("myModal");

var span = document.getElementsByClassName("close")[0];

btn.onclick = function () {
    
    modal.style.display = "block";
// Data Picker Initialization
}

// When the user clicks on <span> (x), close the modal
span.onclick = function () {
    modal.style.display = "none";
}


//    $('#datepicker').datepicker({
//        weekStart: 1,
//        daysOfWeekHighlighted: "6,0",
//        autoclose: true,
//        todayHighlight: true,
//    });
//    $('#datepicker').datepicker("setDate", new Date());



//$('#datepicker').datepicker({
//    uiLibrary: 'bootstrap4'
//});
//
//
//$('#timepicker').timepicker({
//    uiLibrary: 'bootstrap4'
//});

//// Data Picker Initialization
//$('.datepicker').pickadate();

//var equipa = document.getElementsByName("idUneEquipe");
//
//
//var generEquipe = new Array("Citroen", "Peugeot", "Renault");
//var d = document.getElementsByName("ListeMarque");
//for (var i = 0; i < generEquipe.length; i++)
//{
//    d.length++;
//    d.options[d.length - 1].text = generEquipe[i];
//}




//var select = document.getElementById("idLieuEquipe"); 
//var options = ["1", "2", "3", "4", "5"]; 
//
//// Optional: Clear all existing options first:
//select.innerHTML = "";
//// Populate list with options:
//for(var i = 0; i < options.length; i++) {
//    var opt = options[i];
//    select.innerHTML += "<option value=\"" + opt + "\">" + opt + "</option>";
//}

var something = '${equipeC}';


console.log(something.valueOf());
