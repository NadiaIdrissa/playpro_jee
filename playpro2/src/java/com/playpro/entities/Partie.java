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
<<<<<<< HEAD
    private String id;
    private String idPartie;
    private LocalDate datePartie;
    private LocalTime heurePArtie;
=======

    private int idPartie;
    private String datePartie;
    private String heurePArtie;
    private String sport;
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
    private Equipe equipe1;
    private Equipe equipe2;
    private String leLieu;
    private LieuSport lieuSportPartie;
    private String score;

    public Partie() {
    }

<<<<<<< HEAD
    public Partie(String idPartie, LocalDate datePartie, LocalTime heurePArtie, Equipe equipe1, Equipe equipe2, LieuSport lieuSportPartie) {
        this.idPartie = idPartie;
=======
    public Partie(String datePartie, String heurePArtie, Equipe equipe1, Equipe equipe2, String leLieu) {
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
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

<<<<<<< HEAD
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPartie() {
=======
    public void setLeLieu(String leLieu) {
        this.leLieu = leLieu;
    }
    
    

    public int getIdPartie() {
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52
        return idPartie;
    }

    public void setIdPartie(String idPartie) {
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
<<<<<<< HEAD
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Partie{" + "id=" + id + ", idPartie=" + idPartie + ", datePartie=" + datePartie + ", heurePArtie=" + heurePArtie + ", equipe1=" + equipe1 + ", equipe2=" + equipe2 + ", lieuSportPartie=" + lieuSportPartie + '}';
    }

}

=======
>>>>>>> a4dede1f1f2e872672b3e5ec30c52cdf40cc9a52

}
