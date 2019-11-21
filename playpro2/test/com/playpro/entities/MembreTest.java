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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Membre.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Membre.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Membre instance = new Membre();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Membre.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Membre.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Membre instance = new Membre();
        instance.setStatus(status);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPseudo method, of class Membre.
     */
    @Test
    public void testGetPseudo() {
        System.out.println("getPseudo");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getPseudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPseudo method, of class Membre.
     */
    @Test
    public void testSetPseudo() {
        System.out.println("setPseudo");
        String pseudo = "";
        Membre instance = new Membre();
        instance.setPseudo(pseudo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMpd method, of class Membre.
     */
    @Test
    public void testGetMpd() {
        System.out.println("getMpd");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getMpd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMpd method, of class Membre.
     */
    @Test
    public void testSetMpd() {
        System.out.println("setMpd");
        String mpd = "";
        Membre instance = new Membre();
        instance.setMpd(mpd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexe method, of class Membre.
     */
    @Test
    public void testGetSexe() {
        System.out.println("getSexe");
        Membre instance = new Membre();
        Sexe expResult = null;
        Sexe result = instance.getSexe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexe method, of class Membre.
     */
    @Test
    public void testSetSexe() {
        System.out.println("setSexe");
        String sexe = "";
        Membre instance = new Membre();
        instance.setSexe(sexe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Membre.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Membre.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Membre instance = new Membre();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class Membre.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getPrenom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrenom method, of class Membre.
     */
    @Test
    public void testSetPrenom() {
        System.out.println("setPrenom");
        String prenom = "";
        Membre instance = new Membre();
        instance.setPrenom(prenom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnneeNaissance method, of class Membre.
     */
    @Test
    public void testGetAnneeNaissance() {
        System.out.println("getAnneeNaissance");
        Membre instance = new Membre();
        int expResult = 0;
        int result = instance.getAnneeNaissance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnneeNaissance method, of class Membre.
     */
    @Test
    public void testSetAnneeNaissance() {
        System.out.println("setAnneeNaissance");
        int anneeNaissance = 0;
        Membre instance = new Membre();
        instance.setAnneeNaissance(anneeNaissance);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourriel method, of class Membre.
     */
    @Test
    public void testGetCourriel() {
        System.out.println("getCourriel");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getCourriel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourriel method, of class Membre.
     */
    @Test
    public void testSetCourriel() {
        System.out.println("setCourriel");
        String courriel = "";
        Membre instance = new Membre();
        instance.setCourriel(courriel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateInscription method, of class Membre.
     */
    @Test
    public void testGetDateInscription() {
        System.out.println("getDateInscription");
        Membre instance = new Membre();
        Timestamp expResult = null;
        Timestamp result = instance.getDateInscription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateInscription method, of class Membre.
     */
    @Test
    public void testSetDateInscription() {
        System.out.println("setDateInscription");
        Timestamp dateInscription = null;
        Membre instance = new Membre();
        instance.setDateInscription(dateInscription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipe method, of class Membre.
     */
    @Test
    public void testGetEquipe() {
        System.out.println("getEquipe");
        Membre instance = new Membre();
        Equipe expResult = null;
        Equipe result = instance.getEquipe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipe method, of class Membre.
     */
    @Test
    public void testSetEquipe() {
        System.out.println("setEquipe");
        Equipe equipe = null;
        Membre instance = new Membre();
        instance.setEquipe(equipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSport method, of class Membre.
     */
    @Test
    public void testGetSport() {
        System.out.println("getSport");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getSport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSport method, of class Membre.
     */
    @Test
    public void testSetSport() {
        System.out.println("setSport");
        String sport = "";
        Membre instance = new Membre();
        instance.setSport(sport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeMembre method, of class Membre.
     */
    @Test
    public void testGetTypeMembre() {
        System.out.println("getTypeMembre");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getTypeMembre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTypeMembre method, of class Membre.
     */
    @Test
    public void testSetTypeMembre() {
        System.out.println("setTypeMembre");
        String typeM = "";
        Membre instance = new Membre();
        instance.setTypeMembre(typeM);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNiveau method, of class Membre.
     */
    @Test
    public void testGetNiveau() {
        System.out.println("getNiveau");
        Membre instance = new Membre();
        Niveau expResult = null;
        Niveau result = instance.getNiveau();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNiveau method, of class Membre.
     */
    @Test
    public void testSetNiveau() {
        System.out.println("setNiveau");
        String niveau = "";
        Membre instance = new Membre();
        instance.setNiveau(niveau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoto method, of class Membre.
     */
    @Test
    public void testGetPhoto() {
        System.out.println("getPhoto");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.getPhoto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhoto method, of class Membre.
     */
    @Test
    public void testSetPhoto() {
        System.out.println("setPhoto");
        String photo = "";
        Membre instance = new Membre();
        instance.setPhoto(photo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Membre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Membre instance = new Membre();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
