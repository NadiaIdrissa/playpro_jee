/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

/**
 *
 * @author toute
 */
public class Lieux {

    private String id_lieu;
    private String nom;
    private int numero;
    private String rue;
    private String code_postal;
    private String ville;
    private String pays;
    private String infos;

    public Lieux() {
    }

    public String getId_lieu() {
        return id_lieu;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public String getInfos() {
        return infos;
    }

    public void setId_lieu(String id_lieu) {
        this.id_lieu = id_lieu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setInfos(String infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "Lieux{" + "id_lieu=" + id_lieu + ", nom=" + nom + ", numero=" + numero + ", rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", pays=" + pays + ", infos=" + infos + '}';
    }
    
    

}
