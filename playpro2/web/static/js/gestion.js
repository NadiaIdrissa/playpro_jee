/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const FabriqueNoeud = function (type, attributs, elements = {}) {

    // création du noeud
    const noeud = document.createElement(type);

    // Ajouter les attributs
    for (var attribut in attributs) {
        if (attribut === 'style') {
            for (var param in attributs[attribut]) {
                noeud[attribut][param] = attributs[attribut][param];
            }
        } else {
            noeud[attribut] = attributs[attribut];
        }
    }

    // Ajouter les éléments
    for (var element in elements) {
        noeud.appendChild(elements[element]);
    }

    return noeud;
}
fabriquerBtnPlus = function () {
    var btn = FabriqueNoeud("button", {className: "", type: "button", textContent: "+", id: "myBtnAnnonce"});

    var div1 = FabriqueNoeud("div", {className: "colBtn col-sm-2 col-md-2 col-lg-2"}, {btn});
    var div2 = FabriqueNoeud("div", {className: "col-sm-10 col-md-10 col-lg-10"});
    var div3 = FabriqueNoeud("div", {className: "equipeStyle row"}, {div2, div1});
    $("#contenu").append(div3);
}
afficherAnnonces = function (annonce) {
    var textGratuit = "";
    if (annonce.gratuit) {
        textGratuit = "Ce cours est gratuit";

    } else {
        textGratuit = "Montant: " + annonce.montant + "$";
    }
    var p1 = FabriqueNoeud("p", {className: "infos", textContent: "Lieu: " + annonce.lieu.nom});
    var p2 = FabriqueNoeud("p", {className: "infos", textContent: "Date et heure: " + annonce.date_event});
    var p3 = FabriqueNoeud("p", {className: "infos", textContent: textGratuit});
    var p4 = FabriqueNoeud("p", {className: "infos", textContent: "Nombre de places: " + annonce.nombreMax});
    var p5 = FabriqueNoeud("p", {className: "infos", textContent: "Annonceur: " + annonce.createur.prenom});

    var div1 = FabriqueNoeud("div", {className: "cadre col-3 titreAnnonce fondAnnonce annonceInfos border"}, {p1, p2, p3, p4, p5});

    var p6 = FabriqueNoeud("p", {className: "infos", textContent: annonce.description});
    var h3 = FabriqueNoeud("h3", {className: "border-bottom", textContent: "Message de l'annonceur "});

    var div2 = FabriqueNoeud("div", {className: "col-8"}, {h3, p6});

    var div3 = FabriqueNoeud("div", {className: "row"}, {div1, div2});
    var h2 = FabriqueNoeud("h2", {className: "card-text font-weight-bold fondAnnonce text-uppercase", textContent: annonce.titre});

    div4 = fabriquerSectionButton();

    var div5 = FabriqueNoeud("div", {className: "annonce"}, {h2, div3});

    if ($("#typeMembre").html().toLowerCase() === "Admin".toLowerCase()) {
        div5.appendChild(div4);
    }
    
//    $("#contenu").append(div1);
    $(div5).appendTo($("#contenu"));

}

fabriquerSectionButton = function () {
    var btn1 = FabriqueNoeud("button", {className: "btn btn-primary btnModLieu col-3 m-1", textContent: "Modifier"});
    var btn2 = FabriqueNoeud("button", {className: "btn btn-danger btnModLieu col-3 m-1", textContent: "Supprimer"});
    var input = FabriqueNoeud("input", {name: "idAnnonce", id: "idAnnonce", type: "hidden", value: ""});

    var div = FabriqueNoeud("div", {className: "col-sm-12 col-md-12 col-lg-12 text-center"}, {input, btn1, btn2})

    return div;
}


