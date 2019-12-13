/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import java.util.Objects;


/**
 *
 * @author Salpy
 */
public class Participation {
    private Equipe equipe;
    private Membre membre;
    
    

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.equipe);
        hash = 37 * hash + Objects.hashCode(this.membre);
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
        final Participation other = (Participation) obj;
        if (!Objects.equals(this.equipe, other.equipe)) {
            return false;
        }
        if (!Objects.equals(this.membre, other.membre)) {
            return false;
        }
        return true;
    }
   
}
