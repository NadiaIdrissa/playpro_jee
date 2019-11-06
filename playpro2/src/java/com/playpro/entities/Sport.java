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
public class Sport {
    private String id_sport;
    private String nom_sport;
    private int nb_joueurs_max;
    private int nb_joueurs_min;
    
    public Sport() {
    }

    public Sport(String idSport) {
        this.id_sport = idSport;
    }
    

    public Sport(String idSport, String nomSport) {
        this.id_sport = idSport;
        this.nom_sport = nomSport;
    }

    public Sport(String id_sport, String nomSport, int nb_joueurs_max, int nb_joueurs_min) {
        this.id_sport = id_sport;
        this.nom_sport = nomSport;
        this.nb_joueurs_max = nb_joueurs_max;
        this.nb_joueurs_min = nb_joueurs_min;
    }

    public int getNb_joueurs_max() {
        return nb_joueurs_max;
    }

    public int getNb_joueurs_min() {
        return nb_joueurs_min;
    }

    public void setNb_joueurs_max(int nb_joueurs_max) {
        this.nb_joueurs_max = nb_joueurs_max;
    }

    public void setNb_joueurs_min(int nb_joueurs_min) {
        this.nb_joueurs_min = nb_joueurs_min;
    }
    

    public String getId_sport() {
        return id_sport;
    }

    public String getNom_sport() {
        return nom_sport;
    }

    public void setId_sport(String idSport) {
        this.id_sport = idSport;
    }

    public void setNom_sport(String nomSport) {
        this.nom_sport = nomSport;
    }
    
     @Override
    public String toString() {
        return "Sport{" + "idSport=" + id_sport+ ", nomSport=" + nom_sport + ", nombre max de joueurs="+nb_joueurs_max+ ", nombre de joueures min="+nb_joueurs_min+'}';
    }

  

}
