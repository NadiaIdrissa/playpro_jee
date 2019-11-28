/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.util.Date;
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
public class AnnonceTest {
    
    public AnnonceTest() {
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

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdAnnonce method, of class Annonce.
     */
    @Test
    public void testGetIdAnnonce() {
     
    }

    /**
     * Test of getIdCreateur method, of class Annonce.
     */
    @Test
    public void testGetIdCreateur() {
        
    }

    /**
     * Test of getTitre method, of class Annonce.
     */
    @Test
    public void testGetTitre() {
        System.out.println("getTitre");
        Annonce instance = new Annonce();
        String expResult = "";
        String result = instance.getTitre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Annonce.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Annonce instance = new Annonce();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGratuit method, of class Annonce.
     */
    @Test
    public void testGetGratuit() {
        System.out.println("getGratuit");
        Annonce instance = new Annonce();
        Boolean expResult = null;
        Boolean result = instance.getGratuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMontant method, of class Annonce.
     */
    @Test
    public void testGetMontant() {
        System.out.println("getMontant");
        Annonce instance = new Annonce();
        int expResult = 0;
        int result = instance.getMontant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreMax method, of class Annonce.
     */
    @Test
    public void testGetNombreMax() {
        System.out.println("getNombreMax");
        Annonce instance = new Annonce();
        int expResult = 0;
        int result = instance.getNombreMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreation method, of class Annonce.
     */
    @Test
    public void testGetDateCreation() {
        System.out.println("getDateCreation");
        Annonce instance = new Annonce();
        Date expResult = null;
        Date result = instance.getDateCreation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMembre method, of class Annonce.
     */
    @Test
    public void testGetMembre() {
        System.out.println("getMembre");
        Annonce instance = new Annonce();
        Membre expResult = null;
        Membre result = instance.getMembre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAnnonce method, of class Annonce.
     */
    @Test
    public void testSetIdAnnonce() {
        System.out.println("setIdAnnonce");
        String idAnnonce = "";
        Annonce instance = new Annonce();
        instance.setIdAnnonce(idAnnonce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCreateur method, of class Annonce.
     */
    @Test
    public void testSetIdCreateur() {
        System.out.println("setIdCreateur");
        String createur = "";
        Annonce instance = new Annonce();
        instance.setIdCreateur(createur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitre method, of class Annonce.
     */
    @Test
    public void testSetTitre() {
        System.out.println("setTitre");
        String titre = "";
        Annonce instance = new Annonce();
        instance.setTitre(titre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Annonce.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Annonce instance = new Annonce();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGratuit method, of class Annonce.
     */
    @Test
    public void testSetGratuit() {
        System.out.println("setGratuit");
        Boolean gratuit = null;
        Annonce instance = new Annonce();
        instance.setGratuit(gratuit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontant method, of class Annonce.
     */
    @Test
    public void testSetMontant() {
        System.out.println("setMontant");
        int montant = 0;
        Annonce instance = new Annonce();
        instance.setMontant(montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreMax method, of class Annonce.
     */
    @Test
    public void testSetNombreMax() {
        System.out.println("setNombreMax");
        int nombreMax = 0;
        Annonce instance = new Annonce();
        instance.setNombreMax(nombreMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreation method, of class Annonce.
     */
    @Test
    public void testSetDateCreation() {
        System.out.println("setDateCreation");
        Date dateCreation = null;
        Annonce instance = new Annonce();
        instance.setDateCreation(dateCreation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMembre method, of class Annonce.
     */
    @Test
    public void testSetMembre() {
        System.out.println("setMembre");
        Membre membre = null;
        Annonce instance = new Annonce();
        instance.setMembre(membre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Annonce.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Annonce instance = new Annonce();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
