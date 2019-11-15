/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author toute
 */
public class SportTest {
    
    public SportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Sport s = new Sport();
        String nom = "Hockey";
        s.setNom(nom);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNb_max method, of class Sport.
     */
    @Test
    public void testGetNb_max() {
        System.out.println("getNb_max");
        Sport instance = new Sport();
        int expResult = 0;
        int result = instance.getNb_max();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNb_min method, of class Sport.
     */
    @Test
    public void testGetNb_min() {
        System.out.println("getNb_min");
        Sport instance = new Sport();
        int expResult = 0;
        int result = instance.getNb_min();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNb_max method, of class Sport.
     */
    @Test
    public void testSetNb_max() {
        System.out.println("setNb_max");
        int nb_joueurs_max = 0;
        Sport instance = new Sport();
        instance.setNb_max(nb_joueurs_max);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNb_min method, of class Sport.
     */
    @Test
    public void testSetNb_min() {
        System.out.println("setNb_min");
        int nb_joueurs_min = 0;
        Sport instance = new Sport();
        instance.setNb_min(nb_joueurs_min);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_sport method, of class Sport.
     */
    @Test
    public void testGetId_sport() {
        System.out.println("getId_sport");
        Sport instance = new Sport();
        String expResult = "";
        String result = instance.getId_sport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Sport.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Sport instance = new Sport();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_sport method, of class Sport.
     */
    @Test
    public void testSetId_sport() {
        System.out.println("setId_sport");
        String idSport = "";
        Sport instance = new Sport();
        instance.setId_sport(idSport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Sport.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nomSport = "Hockey";
        Sport instance = new Sport();
        instance.setNom(nomSport);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Sport.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        Sport instance = new Sport();
        String expResult = "";
        String result = instance.getImage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Sport.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        String image = "";
        Sport instance = new Sport();
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sport.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sport instance = new Sport();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
