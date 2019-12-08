/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author dd
 */
public class Invitation {
    
    
    private Membre expediteur;
    private Membre destinataire;
    private Equipe equipe;
    private Timestamp dateEnvoi;
    
    
    public Invitation(){
        
    }

    public Membre getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(Membre expediteur) {
        this.expediteur = expediteur;
    }

    public Membre getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(Membre destinataire) {
        this.destinataire = destinataire;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Timestamp getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Timestamp dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.expediteur.getId());
        hash = 59 * hash + Objects.hashCode(this.destinataire.getId());
        hash = 59 * hash + Objects.hashCode(this.equipe.getNomEquipe());
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
        final Invitation other = (Invitation) obj;
        if (!Objects.equals(this.expediteur.getId(), other.expediteur.getId())) {
            return false;
        }
        if (!Objects.equals(this.destinataire.getId(), other.destinataire.getId())) {
            return false;
        }
        if (!Objects.equals(this.equipe.getNomEquipe(), other.equipe.getNomEquipe())) {
            return false;
        }
        return true;
    }

        

    @Override
    public String toString() {
        return expediteur.getId()+"|"+destinataire.getId()+"|"+equipe.getNomEquipe(); 
    }  
}
