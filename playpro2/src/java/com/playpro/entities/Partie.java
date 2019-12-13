/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;
import static javax.management.Query.eq;

/**
 *
 * @author toute
 */
public class Partie {


    private int idPartie;
    private String datePartie;
    private String heurePArtie;
    private String sport;

    private Equipe equipe1;
    private Equipe equipe2;
    private String leLieu;
    private LieuSport lieuSportPartie;
    private String score;

    public Partie() {
    }


    public Partie(String datePartie, String heurePArtie, Equipe equipe1, Equipe equipe2, String leLieu) {

        this.datePartie = datePartie;
        this.heurePArtie = heurePArtie;
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        this.leLieu = leLieu;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
    
    

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    
    public String getLeLieu() {
        return leLieu;
    }


    public void setLeLieu(String leLieu) {
        this.leLieu = leLieu;
    }
    
    

    public int getIdPartie() {

        return idPartie;
    }

    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public String getDatePartie() {
        return datePartie;
    }

    public void setDatePartie(String datePartie) {
        this.datePartie = datePartie;
    }

    public String getHeurePArtie() {
        return heurePArtie;
    }

    public void setHeurePArtie(String heurePArtie) {
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partie other = (Partie) obj;
        if (!Objects.equals(this.idPartie, other.idPartie)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Partie{" + "idPartie=" + idPartie + ", datePartie=" + datePartie + ", heurePArtie=" + heurePArtie + ", sport=" + sport + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", leLieu=" + leLieu + ", lieuSportPartie=" + lieuSportPartie + ", score=" + score + '}';
    }



}



