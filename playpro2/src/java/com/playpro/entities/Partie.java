/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author toute
 */
public class Partie {
    private int idPartie;
    private LocalDate datePartie;
    private LocalTime heurePArtie;
    private Equipe equipe1;
    private Equipe equipe2;
    private LieuSport lieuSportPartie;

    public Partie() {
    }
    
    

    public Partie(LocalDate datePartie, LocalTime heurePArtie, Equipe equipe1, Equipe equipe2, LieuSport lieuSportPartie) {
        this.datePartie = datePartie;
        this.heurePArtie = heurePArtie;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.lieuSportPartie = lieuSportPartie;
    }

    public int getIdPartie() {
        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public LocalDate getDatePartie() {
        return datePartie;
    }

    public void setDatePartie(LocalDate datePartie) {
        this.datePartie = datePartie;
    }

    public LocalTime getHeurePArtie() {
        return heurePArtie;
    }

    public void setHeurePArtie(LocalTime heurePArtie) {
        this.heurePArtie = heurePArtie;
    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public LieuSport getLieuSportPartie() {
        return lieuSportPartie;
    }

    public void setLieuSportPartie(LieuSport lieuSportPartie) {
        this.lieuSportPartie = lieuSportPartie;
    }

    @Override
    public String toString() {
        return "Partie{" + "idPartie=" + idPartie + ", datePartie=" + datePartie + ", heurePArtie=" + heurePArtie + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", lieuSportPartie=" + lieuSportPartie + '}';
    }
    
    
    
    
    
    
    
    
    
    
}


