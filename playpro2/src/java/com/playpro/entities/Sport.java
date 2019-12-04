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
    private String nom;
    private int nb_max;
    private int nb_min;
    private String image;

    
    public Sport()throws IllegalArgumentException{
    }

    public Sport(String idSport)throws IllegalArgumentException{
        this.id_sport = idSport;
    }
    

    public Sport(String idSport, String nomSport)throws IllegalArgumentException{
        this.id_sport = idSport;
        this.nom = nomSport;
    }

    public Sport(String id_sport, String nomSport, int nb_joueurs_max, int nb_joueurs_min)throws IllegalArgumentException{
        this.id_sport = id_sport;
        this.nom = nomSport;
        this.nb_max = nb_joueurs_max;
        this.nb_min = nb_joueurs_min;
    }

    public int getNb_max() {
        return nb_max;
    }

    public int getNb_min() {
        return nb_min;
    }

    public void setNb_max(int nb_joueurs_max) {
        if(nb_joueurs_max<0){
            throw new IllegalArgumentException("Nb_Max inferior à 0");
        }
        this.nb_max = nb_joueurs_max;
    }

    public void setNb_min(int nb_joueurs_min) {
        if (nb_joueurs_min<0){
            throw new IllegalArgumentException("Nb_Min inferior à 0");
        }
        this.nb_min = nb_joueurs_min;
    }
    

    public String getId_sport() {
        return id_sport;
    }

    public String getNom() {
        return nom;
    }

    public void setId_sport(String idSport) {
        this.id_sport = idSport;
    }

    public void setNom(String nomSport) {
        this.nom = nomSport;
    }
        
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        
    }
     @Override
    public String toString() {
        return "Sport{" + "idSport=" + id_sport+ ", nomSport=" + nom + ", nombre max de joueurs="+nb_max+ ", nombre de joueurs min="+nb_min+'}';
    }

  

}
