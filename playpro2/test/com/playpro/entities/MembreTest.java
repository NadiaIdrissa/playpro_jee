/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.sql.Timestamp;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Piaf
 */
public class MembreTest {
    
   // final static String ID = "abcdfghijk";
    final static String PSEUDO = "vivi";
    final static String MPD = "abcdfhij";
    final static Sexe SEXE = Sexe.Femme;
    final static String NOM = "Vi";
    final static String PRENOM = "Laplante";
    final static String COURRIEL = "vivi@al.ca";
    final static Niveau NIVEAU = Niveau.DEBUTANT;
    final static int ANNEEN = 1998;
    final static String TYPEMEMBRE = "Joueur";
    final static String SPORT = "Hockey";
    final static String PHOTO="c:/tomcat/playproEE/static/imgUsers/IdUser/profil/myphoto";
    final static Equipe E=new Equipe();
    final static String STATU="EN COURS";
    int anneeN;
    
    Membre membre1;
    
    public MembreTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        
    }
    
    @Before
    public void setUp() {
        membre1 = new Membre(PSEUDO, COURRIEL, MPD, NOM, PRENOM, SEXE, NIVEAU);
        membre1.setAnneeNaissance(ANNEEN);
        membre1.setTypeMembre(TYPEMEMBRE);
        membre1.setSport(SPORT);
        membre1.setEquipe(E);
        membre1.setPhoto(PHOTO);
        membre1.setStatus(STATU);
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCrationMembre() {
       //assertEquals(membre1.getId(), ID);
        assertEquals(membre1.getPseudo(), PSEUDO);
        assertEquals(membre1.getCourriel(), COURRIEL);
        assertEquals(membre1.getMpd(), MPD);
        assertEquals(membre1.getNom(), NOM);
        assertEquals(membre1.getNom(), NOM);
        assertEquals(membre1.getSexe(), SEXE);
        assertEquals(membre1.getNiveau(), NIVEAU);
        
    }

    /**
     * Test of getId method, of class Membre.
     */
  

    /**
     * Test of setId method, of class Membre.
     */
 

    /**
     * Test of getStatus method, of class Membre.
     */
    @Test
    public void testGetStatus() {
        
    }

    /**
     * Test of setStatus method, of class Membre.
     */
    @Test
    public void testSetStatus() {
        
    }

    /**
     * Test of getPseudo method, of class Membre.
     */
    @Test
    public void testGetPseudo() {
        assertEquals(membre1.getPseudo(), PSEUDO);
    }

    /**
     * Test of setPseudo method, of class Membre.
     */
    @Test
    public void testSetPseudo() {
        final String nvPseudo = "vivianne";
        membre1.setPseudo(nvPseudo);
    }

    /**
     * Test of getMpd method, of class Membre.
     */
    @Test
    public void testGetMpd() {
        assertEquals(membre1.getMpd(), MPD);
    }

    /**
     * Test of setMpd method, of class Membre.
     */
    @Test
    public void testSetMpd() {
        final String nvMpd = "jjjjjj";
        membre1.setMpd(nvMpd);
    }

    /**
     * Test of getSexe method, of class Membre.
     */
    @Test
    public void testGetSexe() {
        assertEquals(membre1.getSexe(), SEXE);
    }

    /**
     * Test of setSexe method, of class Membre.
     */
    @Test
    public void testSetSexe() {
        final String nvSexe = "Autre";
        membre1.setSexe(nvSexe);
        
    }

    /**
     * * Test of getNom method, of class Membre.
     */
    @Test
    public void testGetNom() {
        assertEquals(membre1.getNom(), NOM);
    }

    /**
     * Test of setNom method, of class Membre.
     */
    @Test
    public void testSetNom() {
        final String nvNom = "vivii";
        membre1.setNom(nvNom);
    }

    /**
     * Test of getPrenom method, of class Membre.
     */
    @Test
    public void testGetPrenom() {
        assertEquals(membre1.getPrenom(), PRENOM);
    }

    /**
     * Test of setPrenom method, of class Membre.
     */
    @Test
    public void testSetPrenom() {
        final String nvPrenom = "vivii";
        membre1.setPrenom(nvPrenom);
    }

    /**
     * Test of getAnneeNaissance method, of class Membre.
     */
    @Test
    public void testGetAnneeNaissance() {
        assertEquals(membre1.getAnneeNaissance(), 1998);
    }

    /**
     * Test of setAnneeNaissance method, of class Membre.
     */
    @Test
    public void testSetAnneeNaissance() {
        final int nvAnneeN = 2000;
        membre1.setAnneeNaissance(nvAnneeN);
    }

    /**
     * Test of getCourriel method, of class Membre.
     */
    @Test
    public void testGetCourriel() {
        assertEquals(membre1.getCourriel(), COURRIEL);
    }

    /**
     * Test of setCourriel method, of class Membre.
     */
    @Test
    public void testSetCourriel() {
        final String nvCourriel = "viviiv@.al.ca";
        membre1.setCourriel(nvCourriel);
    }

    /**
     * Test of getDateInscription method, of class Membre.
     */
    @Test
    public void testGetDateInscription() {
        assertEquals(membre1.getStatus(),STATU);
    }

    /**
     * Test of setDateInscription method, of class Membre.
     */
    @Test
    public void testSetDateInscription() {
        final String nvStatus="STANDBY";
        membre1.setStatus(nvStatus);
        
    }

    /**
     * Test of getEquipe method, of class Membre.
     */
    @Test
    public void testGetEquipe() {
        assertEquals(membre1.getEquipe(),E);
    }

    /**
     * Test of setEquipe method, of class Membre.
     */
    @Test
    public void testSetEquipe() {
        final Equipe nvE=new Equipe();
        membre1.setEquipe(nvE);
    }

    /**
     * Test of getSport method, of class Membre.
     */
    @Test
    public void testGetSport() {
        assertEquals(membre1.getSport(), SPORT);
    }

    /**
     * Test of setSport method, of class Membre.
     */
    @Test
    public void testSetSport() {
        final String nvSport = "Tennis";
        membre1.setSport(nvSport);
    }

    /**
     * Test of getTypeMembre method, of class Membre.
     */
    @Test
    public void testGetTypeMembre() {
        assertEquals(membre1.getTypeMembre(), TYPEMEMBRE);
    }

    /**
     * Test of setTypeMembre method, of class Membre.
     */
    @Test
    public void testSetTypeMembre() {
        final String nvTypeMembre = "Entraineur";
        membre1.setTypeMembre(nvTypeMembre);
    }

    /**
     * Test of getNiveau method, of class Membre.
     */
    @Test
    public void testGetNiveau() {
        assertEquals(membre1.getNiveau(), NIVEAU);
    }

    /**
     * Test of setNiveau method, of class Membre.
     */
    @Test
    public void testSetNiveau() {
        final String nvNiveau = "INTERMEDIAIRE";
        membre1.setNiveau(nvNiveau);
        
    }

    /**
     * Test of getPhoto method, of class Membre.
     */
    @Test
    public void testGetPhoto() {
        assertEquals(membre1.getPhoto(), PHOTO);
        
    }

    /**
     * Test of setPhoto method, of class Membre.
     */
    @Test
    public void testSetPhoto() {
        final  String nvPhoto="c:/tomcat/playproEE/static/imgUsers/IdUser/profil/";
        membre1.setPhoto(nvPhoto);
 
    }

    /**
     * Test of toString method, of class Membre.
     */
    @Test
    public void testToString() {
        
    }
    
}
