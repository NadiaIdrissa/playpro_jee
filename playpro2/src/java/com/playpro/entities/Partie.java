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
}
