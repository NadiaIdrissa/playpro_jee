/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author younes-dilali
 */
public class EquipeTest {

    public EquipeTest() {
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
     * Test of getNomEquipe method, of class Equipe.
     */
    @Test
    public void testGetNomEquipe() {
        System.out.println("getNomEquipe");
        Equipe instance = new Equipe();
        String expResult = "Loups";
        String result = instance.getNomEquipe();
        assertEquals(expResult, result);
        if (expResult.equals(result)) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNomEquipe method, of class Equipe.
     */
    @Test
    public void testSetNomEquipe() {
        System.out.println("setNomEquipe");
        String NomEquipe = "Montreal";
        Equipe instance = new Equipe();
        instance.setNomEquipe(NomEquipe);
        String result = instance.getNomEquipe();
        if (NomEquipe.equals(result)) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of id_capitaine method, of class Equipe.
     */
    @Test
    public void testId_capitaine() {
        System.out.println("id_capitaine");
        Equipe instance = new Equipe();
        String expResult = "1234";
        String result = instance.id_capitaine();
        assertEquals(expResult, result);
        if (expResult.equals(result)) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setCapitaine method, of class Equipe.
     */
    @Test
    public void testSetCapitaine() {
        System.out.println("setCapitaine");
        Membre capitaine = new Membre();
        Equipe instance = new Equipe();
        instance.setCapitaine(capitaine);
        if (capitaine.getPseudo().equals(instance.getCapitaine().getPseudo())) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getSport method, of class Equipe.
     */
    @Test
    public void testGetSport() {
        System.out.println("getSport");
        Equipe instance = new Equipe();
        String expResult = "soccer";
        String result = instance.getSport();
        assertEquals(expResult, result);
        if (expResult.equals(result)) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setSport method, of class Equipe.
     */
    @Test
    public void testSetSport() {
        System.out.println("setSport");
        String sport = "Badminton";
        Equipe instance = new Equipe();
        instance.setSport(sport);
        if (sport.equals(instance.getSport())) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getNbPartiesJouees method, of class Equipe.
     */
    @Test
    public void testGetNbPartiesJouees() {
        System.out.println("getNbPartiesJouees");
        Equipe instance = new Equipe();
        int expResult = 0;
        int result = instance.getNbPartiesJouees();
        assertEquals(expResult, result);
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNbPartiesJouees method, of class Equipe.
     */
    @Test
    public void testSetNbPartiesJouees() {
        System.out.println("setNbPartiesJouees");
        String nbPartiesJouees = "0";
        Equipe instance = new Equipe();
        int expResult = instance.getNbPartiesJouees();
        instance.setNbPartiesJouees(nbPartiesJouees);
        int result = instance.getNbPartiesJouees();;
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getNbJoueurs method, of class Equipe.
     */
    @Test
    public void testGetNbJoueurs() {
        System.out.println("getNbJoueurs");
        Equipe instance = new Equipe();
        int expResult = 15;
        int result = instance.getNbJoueurs();
        assertEquals(expResult, result);
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNbJoueurs method, of class Equipe.
     */
    @Test
    public void testSetNbJoueurs() {
        System.out.println("setNbJoueurs");
        String nbJoueurs = "20";
        Equipe instance = new Equipe();
        int result = 20;
        instance.setNbJoueurs(nbJoueurs);
        int expResult = instance.getNbJoueurs();
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getNbMaxJoueurs method, of class Equipe.
     */
    @Test
    public void testGetNbMaxJoueurs() {
        System.out.println("getNbMaxJoueurs");
        Equipe instance = new Equipe();
        int expResult = 30;
        int result = instance.getNbMaxJoueurs();
        assertEquals(expResult, result);
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of setNbMaxJoueurs method, of class Equipe.
     */
    @Test
    public void testSetNbMaxJoueurs() {
        System.out.println("setNbMaxJoueurs");
        String nbMaxJoueurs = "25";
        int result = 25;
        Equipe instance = new Equipe();
        instance.setNbMaxJoueurs(nbMaxJoueurs);
        int expResult = instance.getNbMaxJoueurs();
        if (expResult == result) {
            System.out.println("<-  Réussi ->");
        } else {
            fail("The test case is a prototype.");
        }
    }

}
