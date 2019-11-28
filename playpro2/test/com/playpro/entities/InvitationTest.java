/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
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
public class InvitationTest {
    final static String ID_EXPEDITEUR="ABCDF";
    final static String ID_DESTINATAIRE="FGHJI";
    final static String REQUETE="REQUETE";
    Invitation i;
   
    
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
        i=new Invitation();
        i.setDateEnvoi(LocalDate.MIN);
        i.setId_destinataire(ID_DESTINATAIRE);
        i.setId_expediteur(ID_EXPEDITEUR);
        i.setId_requete(REQUETE);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId_expediteur method, of class Invitation.
     */
    @Test
    public void testGetId_expediteur() {
        assertEquals(i.getId_expediteur(), ID_EXPEDITEUR);
    }

    /**
     * Test of setId_expediteur method, of class Invitation.
     */
    @Test
    public void testSetId_expediteur() {
    final String idExp="bbbbb";
    i.setId_expediteur(idExp);
    }

    /**
     * Test of getId_destinataire method, of class Invitation.
     */
    @Test
    public void testGetId_destinataire() {
        assertEquals(i.getId_destinataire(), ID_DESTINATAIRE);
    }

    /**
     * Test of setId_destinataire method, of class Invitation.
     */
    @Test
    public void testSetId_destinataire() {
    final String iddes="CCCC";
    i.setId_destinataire(iddes);
    }

    /**
     * Test of getId_requete method, of class Invitation.
     */
    @Test
    public void testGetId_requete() {
        assertEquals(i.getId_requete(), REQUETE);
    }

    /**
     * Test of setId_requete method, of class Invitation.
     */
    @Test
    public void testSetId_requete() {
     final String req="message45";
     i.setId_requete(req);
    }

    /**
     * Test of getDateEnvoi method, of class Invitation.
     */
    @Test
    public void testGetDateEnvoi() {
       
        assertEquals(i.getDateEnvoi(),LocalDate.MIN);
    }

    /**
     * Test of setDateEnvoi method, of class Invitation.
     */
    @Test
    public void testSetDateEnvoi() {
  i.setDateEnvoi(LocalDate.MIN);
    }

    /**
     * Test of toString method, of class Invitation.
     */
    @Test
    public void testToString() {
    
    }
    
}
