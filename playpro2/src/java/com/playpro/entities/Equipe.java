/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author toute
 */
public class Equipe {

    protected String nomEquipe;
    protected Membre capitaine;
    protected Sport sport;
    protected int nbPartiesJouees;
    protected int nbJoueurs;
    protected int nbMaxJoueurs;
    protected LocalDate dateCreation;
    private String image;
    private List<Membre> membresEquipe;
        
    public Equipe() {
        this("Loups", 0, 0, 30 );
        
    }

    public Equipe(String NomEquipe, int nbPartiesJouees, int nbJoueurs, int nbMaxJoueurs) {
        this.nomEquipe = NomEquipe;
        this.nbPartiesJouees = nbPartiesJouees;
        this.nbJoueurs = nbJoueurs;
        this.nbMaxJoueurs = nbMaxJoueurs;
        this.membresEquipe = new LinkedList<>();
    }
    
    public String getNomEquipe() {
        return nomEquipe;
    }

    public Membre getCapitaine() {
        return capitaine;
    }

    public void setNomEquipe(String NomEquipe) {
        this.nomEquipe = NomEquipe;
    }


    public void setCapitaine(Membre capitaine) {
        this.capitaine = capitaine;

    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
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

    public List<Membre> getMembresEquipe() {
        return membresEquipe;
    }

    public void setMembresEquipe(List<Membre> membresEquipe) {
        this.membresEquipe = membresEquipe;
    }
    
    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nomEquipe);
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
        final Equipe other = (Equipe) obj;
        if (!Objects.equals(this.nomEquipe, other.nomEquipe)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String toString() {
        return "Equipe{" + "nomEquipe=" + nomEquipe + ", capitaine=" + capitaine.getNom() + ", sport=" + sport.getNom() + ", nbPartiesJouees=" + String.valueOf(nbPartiesJouees) + ", nbJoueurs=" + String.valueOf(nbJoueurs) + ", nbMaxJoueurs=" + String.valueOf(nbMaxJoueurs) +  '}';
    }

    

}
