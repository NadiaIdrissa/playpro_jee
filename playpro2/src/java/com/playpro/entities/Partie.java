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

    private String idPartie;
    private LocalDate datePartie;
    private LocalTime heurePArtie;
    private Equipe equipe1;
    private Equipe equipe2;
    private LieuSport lieuSportPartie;
    private Sport sport;
    private String score;
    Equipe eq = new Equipe();

    public Partie() {
    }

    public String getId_Partie() {
        return idPartie;
    }

    public void setId_Partie(String idPartie) {
        this.idPartie = idPartie;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
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

    public LocalDate getDatePartie() {
        return datePartie;
    }

    public void setDatePartie(LocalDate datePartie) {
        this.datePartie = datePartie;
    }

    public LocalTime getHeurePartie() {
        return heurePArtie;
    }

    public void setHeurePartie(LocalTime heurePartie) {
        this.heurePArtie = heurePartie;
    }

    public LieuSport getLieuSportPartie() {
        return lieuSportPartie;
    }

    public void setLieuSportPartie(LieuSport lieu) {
        this.lieuSportPartie =lieu;
    }

    @Override
    public String toString() {
        return "Partie{" + "idPartie=" + idPartie + ", datePartie=" + datePartie + ", heurePArtie=" + heurePArtie + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", lieuSportPartie=" + lieuSportPartie + ", sport=" + sport + ", score=" + score + ", eq=" + eq + '}';
    }
    
}
