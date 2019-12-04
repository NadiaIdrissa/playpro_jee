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

    protected String nomEquipe;
    protected Membre capitaine;
    protected String id_capitaine;
    protected Sport sport;
    protected int nbPartiesJouees;
    protected int nbJoueurs;
    protected int nbMaxJoueurs;
    protected LocalDate dateCreation;
    private String image;
    Membre ken = new Membre();

    
    public Equipe()throws IllegalArgumentException{

        this.nomEquipe = "Loups";
        this.capitaine = ken;
        this.id_capitaine = "1234";
        this.setNbMaxJoueurs("15");
       
        this.setNbPartiesJouees("0");
        this.setNbJoueurs(15);
   
       

    }

    public Equipe(String NomEquipe, String id_du_capitaine, String sport, int nbPartiesJouees, int nbJoueurs, int nbMaxJoueurs) {
        this.nomEquipe = NomEquipe;
        this.id_capitaine = id_du_capitaine;

        this.setNbPartiesJouees("2");
        this.setNbJoueurs(nbJoueurs);
        this.setNbMaxJoueurs("12");
       
        
    }

    public String getId_capitaine() {
        return id_capitaine;
    }

    public void setId_capitaine(String id_capitaine) {
        this.id_capitaine = id_capitaine;
    }

    public Membre getKen() {
        return ken;
    }

    public void setKen(Membre ken) {
        this.ken = ken;
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

    public String id_capitaine() {
        return id_capitaine;
    }

    public void setid_capitaine(String id) {
        this.id_capitaine = id;
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

    public void setNbPartiesJouees(String nbPartiesJouees) {
        int nv=Integer.parseInt(nbPartiesJouees);
        if(nv<0){
            throw new IllegalArgumentException("Nombre parties jouees inferior à 0");
        }
        this.nbPartiesJouees = nv;
    }

    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        if(nbJoueurs<0){
            throw new IllegalArgumentException("Nombre NbJoueurs inferior à 0");
        }
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbMaxJoueurs() {
        return nbMaxJoueurs;
    }

    public void setNbMaxJoueurs(String nbMaxJoueurs) {
        int nv=Integer.parseInt(nbMaxJoueurs);
        if(nv<0){
            throw new IllegalArgumentException("Nombre Max_Joueurs inferior à 0");
        }
        this.nbMaxJoueurs = nv;
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
    public String toString() {
        return "Equipe{" + "NomEquipe=" + nomEquipe + ", capitaine=" + id_capitaine + ", sport=" + sport + ", nbPartiesJouees=" + nbPartiesJouees + ", nbJoueurs=" + nbJoueurs + ", nbMaxJoueurs=" + nbMaxJoueurs + ", dateCreation=" + dateCreation + ", ken=" + ken + '}';
    }

}
