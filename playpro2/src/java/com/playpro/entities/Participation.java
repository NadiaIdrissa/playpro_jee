/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;

/**
 *
 * @author Piaf
 */
public class Participation {
    private String nomEquipe;
    private String idMembre;
    private LocalDate dateEnvoi;

    public Participation() {
        this.idMembre = "";
        this.nomEquipe = "";
    }
    
    public Participation(String idMembre, String nomEquipe) {
        this.idMembre = idMembre;
        this.nomEquipe = nomEquipe;
        
    }
   

    public String getIdMembre() {
        return idMembre;
    }

    public void setIdMembre(String idMembre) {
        this.idMembre = idMembre;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public LocalDate getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDate dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    @Override
    public String toString() {
        return super.toString(); 
    }
    
}

