/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const FabriqueNoeud = function(type, attributs, elements = {}) {

    // création du noeud
    const noeud = document.createElement(type);

    // Ajouter les attributs
    for (var attribut in attributs) {
        if(attribut === 'style') {
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

afficherAnnonces= function(annonce) {
    var textGratuit ="";
    if(annonce.gratuit){
        textGratuit = "Ce cours est gratuit";
        
    }else{
        textGratuit = "Montant: "+annonce.montant+"$";
    }
    var p1 = FabriqueNoeud("p", {className:"infos", textContent:"Lieu: "+annonce.lieu.nom});
    var p2 = FabriqueNoeud("p", {className:"infos", textContent:"Date et heure: "+annonce.date_event});
    var p3 = FabriqueNoeud("p", {className:"infos", textContent:textGratuit});
    var p4 = FabriqueNoeud("p", {className:"infos", textContent:"Nombre de places: "+annonce.nombreMax});
    var p5 = FabriqueNoeud("p", {className:"infos", textContent:"Annonceur: "+annonce.createur.prenom});
    
    var div1 = FabriqueNoeud("div", {className:"cadre text-left col-3 fondAnnonce annonceInfos border"},{p1,p2, p3, p4, p5} );
    
    var p6 = FabriqueNoeud("p", {className:"", textContent: annonce.description});
    var h3 = FabriqueNoeud("h3", {className:"border-bottom", textContent:"Message de l'annonceur "});
    
    var div2 = FabriqueNoeud("div", {className:"col-8"},{h3,p6} );
    
    var div3 = FabriqueNoeud("div", {className:"row"},{div1, div2} );
    var h2 = FabriqueNoeud("h2", {className:"card-text font-weight-bold fondAnnonce text-uppercase", textContent:annonce.titre});
    
    var div4 = FabriqueNoeud("div", {className:"annonce"},{h2, div3} );
    
    
//    $("#contenu").append(div1);
    $(div4).appendTo($("#contenu"));
    
}



