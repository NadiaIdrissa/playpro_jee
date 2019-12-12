/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

/**
 *
 * @author salpy
 */
public class Commentaire {
    private String nom;
    private String courriel;
    private String sujet;
    private String commentaire;
    
    public Commentaire() {
    }
    
    public Commentaire(String nom, String courriel, String sujet, String commentaire) {
        this.nom = nom;
        this.courriel = courriel;
        this.sujet = sujet;
        this.commentaire = commentaire;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getCourriel() {
        return courriel;
    }
    
    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }
    
    public String getSujet() {
        return sujet;
    }
    
    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
    
    public String getCommentaire() {
        return commentaire;
    }
    
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
