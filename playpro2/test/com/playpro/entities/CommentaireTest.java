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
public class CommentaireTest {
    
    public CommentaireTest() {
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
     * Test of getNom method, of class Commentaire.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Commentaire instance = new Commentaire();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Commentaire.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Commentaire instance = new Commentaire();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCourriel method, of class Commentaire.
     */
    @Test
    public void testGetCourriel() {
        System.out.println("getCourriel");
        Commentaire instance = new Commentaire();
        String expResult = "";
        String result = instance.getCourriel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCourriel method, of class Commentaire.
     */
    @Test
    public void testSetCourriel() {
        System.out.println("setCourriel");
        String courriel = "";
        Commentaire instance = new Commentaire();
        instance.setCourriel(courriel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSujet method, of class Commentaire.
     */
    @Test
    public void testGetSujet() {
        System.out.println("getSujet");
        Commentaire instance = new Commentaire();
        String expResult = "";
        String result = instance.getSujet();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSujet method, of class Commentaire.
     */
    @Test
    public void testSetSujet() {
        System.out.println("setSujet");
        String sujet = "";
        Commentaire instance = new Commentaire();
        instance.setSujet(sujet);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCommentaire method, of class Commentaire.
     */
    @Test
    public void testGetCommentaire() {
        System.out.println("getCommentaire");
        Commentaire instance = new Commentaire();
        String expResult = "";
        String result = instance.getCommentaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCommentaire method, of class Commentaire.
     */
    @Test
    public void testSetCommentaire() {
        System.out.println("setCommentaire");
        String commentaire = "";
        Commentaire instance = new Commentaire();
        instance.setCommentaire(commentaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateReception method, of class Commentaire.
     */
    @Test
    public void testGetDateReception() {
        System.out.println("getDateReception");
        Commentaire instance = new Commentaire();
        Timestamp expResult = null;
        Timestamp result = instance.getDateReception();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateReception method, of class Commentaire.
     */
    @Test
    public void testSetDateReception() {
        System.out.println("setDateReception");
        Timestamp dateReception = null;
        Commentaire instance = new Commentaire();
        instance.setDateReception(dateReception);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
