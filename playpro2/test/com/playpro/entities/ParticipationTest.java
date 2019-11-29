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
 * @author Piaf
 */
public class ParticipationTest {
    
    public ParticipationTest() {
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
     * Test of getIdMembre method, of class Participation.
     */
    @Test
    public void testGetIdMembre() {
        System.out.println("getIdMembre");
        Participation instance = new Participation();
        String expResult = "";
        String result = instance.getIdMembre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMembre method, of class Participation.
     */
    @Test
    public void testSetIdMembre() {
        System.out.println("setIdMembre");
        String idMembre = "";
        Participation instance = new Participation();
        instance.setIdMembre(idMembre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomEquipe method, of class Participation.
     */
    @Test
    public void testGetNomEquipe() {
        System.out.println("getNomEquipe");
        Participation instance = new Participation();
        String expResult = "";
        String result = instance.getNomEquipe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomEquipe method, of class Participation.
     */
    @Test
    public void testSetNomEquipe() {
        System.out.println("setNomEquipe");
        String nomEquipe = "";
        Participation instance = new Participation();
        instance.setNomEquipe(nomEquipe);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateEnvoi method, of class Participation.
     */
    @Test
    public void testGetDateEnvoi() {
        System.out.println("getDateEnvoi");
        Participation instance = new Participation();
        LocalDate expResult = null;
        LocalDate result = instance.getDateEnvoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateEnvoi method, of class Participation.
     */
    @Test
    public void testSetDateEnvoi() {
        System.out.println("setDateEnvoi");
        LocalDate dateEnvoi = null;
        Participation instance = new Participation();
        instance.setDateEnvoi(dateEnvoi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Participation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Participation instance = new Participation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
