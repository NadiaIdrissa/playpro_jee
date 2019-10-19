/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

/**
 *
 * @author toute
 */
public class Joueur extends Membre {

    private Niveau niveau;

    public Joueur(String pseudo, String courriel, String mpd, String nom, String prenom, Niveau niveau, Sexe sexe) {
        super(pseudo, courriel, mpd, nom, prenom, sexe);
        this.niveau = niveau;
    }

    public Joueur() {
        super();
        this.niveau = Niveau.DEBUTANT;
    }
    
    
}
