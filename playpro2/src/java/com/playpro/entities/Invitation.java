/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Salpy
 */
public class Invitation {
    private String idExpediteur;
    private String idDestinataire;
    private String idEquipe;
    private Timestamp dateEnvoi;
    
    
    public Invitation() {
        this.idExpediteur = "";
        this.idDestinataire = "";
        this.idEquipe = "";
        this.dateEnvoi = Timestamp.valueOf(LocalDateTime.now());
        
    }
    
    public Invitation(String idExpediteur, String idDestinataire, String idEquipe, Timestamp dateEnvoi) {
        this.idExpediteur = idExpediteur;
        this.idDestinataire = idDestinataire;
        this.idEquipe = idEquipe;
        this.dateEnvoi = dateEnvoi;
    }
    
    public Invitation(String idExpediteur, String idDestinataire, String idEquipe) {
        this.idExpediteur = idExpediteur;
        this.idDestinataire = idDestinataire;
        this.idEquipe = idEquipe;
        this.dateEnvoi = Timestamp.valueOf(LocalDateTime.now());
    }
    
    public String getIdExpediteur() {
        return idExpediteur;
    }

    public void setIdExpediteur(String idExpediteur) {
        this.idExpediteur = idExpediteur;
    }

    public String getIdDestinataire() {
        return idDestinataire;
    }

    public void setIdDestinataire(String idDestinataire) {
        this.idDestinataire = idDestinataire;
    }

    public String getIdEquipe() {
        return idEquipe;
    }
    
    public void setIdEquipe(String idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Timestamp getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDate(Timestamp dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    

    
}
