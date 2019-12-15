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

    final static int NB_MAX_JOUEURS = 30;
    final static int NB_PARTIES_JOUEES = 2;
    final static int NB_JOUEURS = 6;
    final static String NB_Parties = "14";
    Sport s;
    Equipe e;

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
        s = new Sport();
        e = new Equipe();
        e.setNbMaxJoueurs(34);
        e.setNbJoueurs(NB_JOUEURS);
        e.setNbPartiesJouees(4);
    }

    @After
    public void tearDown() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsetNbJoueursNegatif() {

        final int nvMax = -1;
        e.setNbJoueurs(nvMax);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsetNbPartieJoueeNegatif() {

        final int nvMax = -1;
        e.setNbJoueurs(nvMax);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsetNbMaxJoueursNegatif() {

        final int nvMax = -1;
        e.setNbMaxJoueurs(nvMax);
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
     * Test of setCapitaine method, of class Equipe.
     */



    @Test
    public void testGetSport() {

    }

    /**
     * Test of setSport method, of class Equipe.
     */
    @Test
    public void testSetSport() {
        e.setSport(s);
    }

    /**
     * Test of getNbPartiesJouees method, of class Equipe.
     */
    @Test
    public void testGetNbPartiesJouees() {
        assertEquals(e.getNbPartiesJouees(), 4);

    }

    @Test

    public void testSetNbPartiesJouees() {



        final int nvPartiejouees = 4;
        e.setNbPartiesJouees(nvPartiejouees);

    }

    /**
     * Test of getNbJoueurs method, of class Equipe.
     */
    @Test
    public void testGetNbJoueurs() {

  
        assertEquals(e.getNbJoueurs(), NB_JOUEURS);

    }

    /**
     * Test of setNbJoueurs method, of class Equipe.
     */
    @Test
    public void testSetNbJoueurs() {
        final int maxj = 30;
        e.setNbJoueurs(maxj);
    }



}
