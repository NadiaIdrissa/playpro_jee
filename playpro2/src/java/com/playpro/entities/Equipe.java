/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;

/**
 *
 * @author toute
 */
public class Equipe {

    protected String NomEquipe;
    protected Membre capitaine;
    protected String sport;
    protected int nbPartiesJouees;
    protected int nbJoueurs;
    protected int nbMaxJoueurs;
    protected LocalDate dateCreation;
    Membre ken = new Membre();
    
    
    public Equipe() {
        
        this.NomEquipe = "Loups";
        this.capitaine = ken;
        this.sport = "soccer";
        this.nbPartiesJouees = 0;
        this.nbJoueurs = 15;
        
    }

    public Equipe(String NomEquipe, Membre capitaine, String sport, int nbPartiesJouees, int nbJoueurs, int nbMaxJoueurs) {
        this.NomEquipe = NomEquipe;
        this.capitaine = capitaine;
        this.sport = sport;
        this.nbPartiesJouees = nbPartiesJouees;
        this.nbJoueurs = nbJoueurs;
        this.nbMaxJoueurs = nbMaxJoueurs;
    }

    public String getNomEquipe() {
        return NomEquipe;
    }

    public void setNomEquipe(String NomEquipe) {
        this.NomEquipe = NomEquipe;
    }

    public Membre getCapitaine() {
        return capitaine;
    }

    public void setCapitaine(Membre capitaine) {
        this.capitaine = capitaine;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getNbPartiesJouees() {
        return nbPartiesJouees;
    }

    public void setNbPartiesJouees(int nbPartiesJouees) {
        this.nbPartiesJouees = nbPartiesJouees;
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbMaxJoueurs() {
        return nbMaxJoueurs;
    }

    public void setNbMaxJoueurs(int nbMaxJoueurs) {
        this.nbMaxJoueurs = nbMaxJoueurs;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }


    public Membre getKen() {
        return ken;
    }

    public void setKen(Membre ken) {
        this.ken = ken;
    }

    @Override
    public String toString() {
        return "Equipe{" + "NomEquipe=" + NomEquipe + ", capitaine=" + capitaine + ", sport=" + sport + ", nbPartiesJouees=" + nbPartiesJouees + ", nbJoueurs=" + nbJoueurs + ", nbMaxJoueurs=" + nbMaxJoueurs + ", dateCreation=" + dateCreation + ", ken=" + ken + '}';
    }

    
    
    
    
}
