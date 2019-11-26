/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;

/**
 *
 * @author dd
 */
public class Invitation {
    
    private String id_invitation;
    private String id_expediteur;
    private String id_destinataire;
    private String id_requete;
    private LocalDate dateEnvoi;
    
    
    public Invitation(){
        
    }
    
    public Invitation(String a, String b, String c){
        this.id_invitation=a+b;
        this.id_expediteur=a;
        this.id_destinataire=b;
        this.id_requete=c;
    }

    public String getId_invitation() {
        return id_invitation;
    }

    public void setId_invitation(String id_invitation) {
        this.id_invitation = id_invitation;
    }

    public String getId_expediteur() {
        return id_expediteur;
    }

    public void setId_expediteur(String id_expediteur) {
        this.id_expediteur = id_expediteur;
    }

    public String getId_destinataire() {
        return id_destinataire;
    }

    public void setId_destinataire(String id_destinataire) {
        this.id_destinataire = id_destinataire;
    }

    public String getId_requete() {
        return id_requete;
    }

    public void setId_requete(String id_requete) {
        this.id_requete = id_requete;
    }

    public LocalDate getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDate dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }
    
    
    
}
