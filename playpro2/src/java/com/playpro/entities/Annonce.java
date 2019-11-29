/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;


import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author toute
 */
public class Annonce {
    private String idAnnonce;
    private Membre createur;
    private String titre;
    private String description;
    private Boolean gratuit;
    private double montant;
    private int nombreMax;
    private Timestamp dateCreation;
    private Timestamp date_event;
    private Lieux lieu;

    public Annonce() {
    }

    public String getIdAnnonce() {
        return idAnnonce;
    }

    public Timestamp getDate_event() {
        return date_event;
    }

    public Lieux getLieu() {
        return lieu;
    }

    public Membre getCreateur() {
        return createur;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getGratuit() {
        return gratuit;
    }

    public double getMontant() {
        return montant;
    }

    public int getNombreMax() {
        return nombreMax;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public void setDate_event(Timestamp date_event) {
        this.date_event = date_event;
    }

    public void setLieu(Lieux id_lieu) {
        this.lieu = id_lieu;
    }

    public void setIdAnnonce(String idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public void setCreateur(Membre createur) {
        this.createur = createur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGratuit(Boolean gratuit) {
        this.gratuit = gratuit;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setNombreMax(int nombreMax) {
        this.nombreMax = nombreMax;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Annonce{" + "idAnnonce=" + idAnnonce + ", createur=" + createur + ", titre=" + titre + ", description=" + description + ", gratuit=" + gratuit + ", montant=" + montant + ", nombreMax=" + nombreMax + ", dateCreation=" + dateCreation + ", date_event=" + date_event + ", id_lieu=" + lieu + '}';
    }
    
}
