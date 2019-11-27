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
public class InvitationTest {
    
    public InvitationTest() {
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
     * Test of getId_expediteur method, of class Invitation.
     */
    @Test
    public void testGetId_expediteur() {
        System.out.println("getId_expediteur");
        Invitation instance = new Invitation();
        String expResult = "";
        String result = instance.getId_expediteur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_expediteur method, of class Invitation.
     */
    @Test
    public void testSetId_expediteur() {
        System.out.println("setId_expediteur");
        String id_expediteur = "";
        Invitation instance = new Invitation();
        instance.setId_expediteur(id_expediteur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_destinataire method, of class Invitation.
     */
    @Test
    public void testGetId_destinataire() {
        System.out.println("getId_destinataire");
        Invitation instance = new Invitation();
        String expResult = "";
        String result = instance.getId_destinataire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_destinataire method, of class Invitation.
     */
    @Test
    public void testSetId_destinataire() {
        System.out.println("setId_destinataire");
        String id_destinataire = "";
        Invitation instance = new Invitation();
        instance.setId_destinataire(id_destinataire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_requete method, of class Invitation.
     */
    @Test
    public void testGetId_requete() {
        System.out.println("getId_requete");
        Invitation instance = new Invitation();
        String expResult = "";
        String result = instance.getId_requete();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_requete method, of class Invitation.
     */
    @Test
    public void testSetId_requete() {
        System.out.println("setId_requete");
        String id_requete = "";
        Invitation instance = new Invitation();
        instance.setId_requete(id_requete);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateEnvoi method, of class Invitation.
     */
    @Test
    public void testGetDateEnvoi() {
        System.out.println("getDateEnvoi");
        Invitation instance = new Invitation();
        LocalDate expResult = null;
        LocalDate result = instance.getDateEnvoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateEnvoi method, of class Invitation.
     */
    @Test
    public void testSetDateEnvoi() {
        System.out.println("setDateEnvoi");
        LocalDate dateEnvoi = null;
        Invitation instance = new Invitation();
        instance.setDateEnvoi(dateEnvoi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Invitation.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Invitation instance = new Invitation();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
