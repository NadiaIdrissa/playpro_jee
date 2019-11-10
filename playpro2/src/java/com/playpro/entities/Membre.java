/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.awt.image.BufferedImage;
import java.time.LocalDate;

/**
 *
 * @author toute
 */
public class Membre {

    protected String id;
    protected String pseudo;
    protected String mpd;
    protected Sexe sexe;
    protected String nom;
    protected String prenom;
    protected int anneeNaissance;
    protected String courriel;
    protected LocalDate dateInscription;
    protected Equipe equipe;
    protected String sport;
    protected Niveau niveau;
    protected BufferedImage photo;
    protected String typeMembre;
    protected String status;

    public Membre(String pseudo, String courriel, String mpd, String nom, String prenom, Sexe sexe, Niveau niveau) {
        this.pseudo = pseudo;
        this.mpd = mpd;
        this.nom = nom;
        this.prenom = prenom;
        this.courriel = courriel;
        this.sexe = sexe;
        this.niveau = niveau;
    }

    public Membre() {
        this("ken", "kalo@al.ca", "1234", "Kalomba", "Kennedy", Sexe.Homme, Niveau.DEBUTANT);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
    
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMpd() {
        return mpd;
    }

    public void setMpd(String mpd) {
        this.mpd = mpd;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {

        if (sexe.equalsIgnoreCase("homme")) {

            this.sexe = Sexe.Homme;
        } else if (sexe.equalsIgnoreCase("femme")) {
            this.sexe = Sexe.Femme;
        } else {
            this.sexe = Sexe.Autre;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public LocalDate getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(LocalDate dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTypeMembre() {
        return typeMembre;
    }

    public void setTypeMembre(String typeM) {
        this.typeMembre = typeM;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        System.out.println("valeur: " + niveau.equalsIgnoreCase("Professionnel"));
        if (niveau.equalsIgnoreCase("Professionnel")) {

            this.niveau = Niveau.PROFESSIONNEL;
        } else if (niveau.equalsIgnoreCase("intermediaire")) {
            this.niveau = Niveau.INTERMEDIAIRE;
        } else {
            this.niveau = Niveau.DEBUTANT;
        }
    }

    public BufferedImage getPhoto() {
        return photo;
    }

    public void setPhoto(BufferedImage photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Membre{" + "id=" + id + ", pseudo=" + pseudo + ", mpd=" + mpd + ", sexe=" + sexe + ", nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", courriel=" + courriel + ", dateInscription=" + dateInscription + ", equipe=" + equipe + ", sport=" + sport + ", niveau=" + niveau + ", photo=" + photo + '}';
    }

}
