/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;


import java.util.Date;

/**
 *
 * @author toute
 */
public class Annonce {
    private String idAnnonce;
    private String idCreateur;
    private String titre;
    private String description;
    private Boolean gratuit;
    private int montant;
    private int nombreMax;
    private Date dateCreation;
    private Membre membre;

    public Annonce() {
    }

    public String getIdAnnonce() {
        return idAnnonce;
    }

    public String getIdCreateur() {
        return idCreateur;
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

    public int getMontant() {
        return montant;
    }

    public int getNombreMax() {
        return nombreMax;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Membre getMembre() {
        return membre;
    }
    

    public void setIdAnnonce(String idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public void setIdCreateur(String createur) {
        this.idCreateur = createur;
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

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setNombreMax(int nombreMax) {
        this.nombreMax = nombreMax;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }
    
    

    @Override
    public String toString() {
        return "Annonce{" + "idAnnonce=" + idAnnonce + ", createur=" + idCreateur + ", titre=" + titre + ", description=" + description + ", gratuit=" + gratuit + ", montant=" + montant + ", nombreMax=" + nombreMax + ", dateCreation=" + dateCreation + '}';
    }
    
    
}
