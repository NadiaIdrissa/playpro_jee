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
    protected String id_capitaine;
    protected String sport;
    protected int nbPartiesJouees;
    protected int nbJoueurs;
    protected int nbMaxJoueurs;
    protected LocalDate dateCreation;
    Membre ken = new Membre();

    public Equipe() {

        this.NomEquipe = "Loups";
        this.capitaine = ken;
        this.id_capitaine = "1234";
        this.sport = "soccer";
        this.nbPartiesJouees = 0;
        this.nbJoueurs = 15;
        this.nbMaxJoueurs = 30;

    }

    public Equipe(String NomEquipe, String id_du_capitaine, String sport, int nbPartiesJouees, int nbJoueurs, int nbMaxJoueurs) {
        this.NomEquipe = NomEquipe;
        this.id_capitaine = id_du_capitaine;
        this.sport = sport;
        this.nbPartiesJouees = nbPartiesJouees;
        this.nbJoueurs = nbJoueurs;
        this.nbMaxJoueurs = nbMaxJoueurs;
    }

    public String getNomEquipe() {
        return NomEquipe;
    }

    public Membre getCapitaine() {
        return capitaine;
    }

    public void setNomEquipe(String NomEquipe) {
        this.NomEquipe = NomEquipe;
    }

    public String id_capitaine() {
        return id_capitaine;
    }

    public void setid_capitaine(String id) {
        this.id_capitaine = id;
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

    public void setNbPartiesJouees(String nbPartiesJouees) {
        this.nbPartiesJouees = Integer.parseInt(nbPartiesJouees);
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(String nbJoueurs) {
        this.nbJoueurs = Integer.parseInt(nbJoueurs);
    }

    public int getNbMaxJoueurs() {
        return nbMaxJoueurs;
    }

    public void setNbMaxJoueurs(String nbMaxJoueurs) {
        this.nbMaxJoueurs = Integer.parseInt(nbMaxJoueurs);
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    @Override
    public String toString() {
        return "Equipe{" + "NomEquipe=" + NomEquipe + ", capitaine=" + id_capitaine + ", sport=" + sport + ", nbPartiesJouees=" + nbPartiesJouees + ", nbJoueurs=" + nbJoueurs + ", nbMaxJoueurs=" + nbMaxJoueurs + ", dateCreation=" + dateCreation + ", ken=" + ken + '}';
    }

}
