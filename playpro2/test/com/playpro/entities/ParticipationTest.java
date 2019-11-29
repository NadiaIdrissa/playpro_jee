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

    final static String NOM_EQUIPE = "TIGRE";
    final static String ID_MEMBRE = "ABCG";
    Participation p;

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
        p = new Participation();
        p.setDateEnvoi(LocalDate.MIN);
        p.setIdMembre(ID_MEMBRE);
        p.setNomEquipe(NOM_EQUIPE);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getIdMembre method, of class Participation.
     */
    @Test
    public void testGetIdMembre() {
        assertEquals(p.getIdMembre(), ID_MEMBRE);
    }

    /**
     * Test of setIdMembre method, of class Participation.
     */
    @Test
    public void testSetIdMembre() {
        final String nvid_membre = "ccccccc";
        p.setIdMembre(nvid_membre);
    }

    /**
     * Test of getNomEquipe method, of class Participation.
     */
    @Test
    public void testGetNomEquipe() {
        assertEquals(p.getNomEquipe(), NOM_EQUIPE);
    }

    /**
     * Test of setNomEquipe method, of class Participation.
     */
    @Test
    public void testSetNomEquipe() {
        final String nvNom_e = "wolf";
        p.setNomEquipe(nvNom_e);
    }

    /**
     * Test of getDateEnvoi method, of class Participation.
     */
    @Test
    public void testGetDateEnvoi() {
        assertEquals(p.getDateEnvoi(), LocalDate.MIN);
    }

    /**
     * Test of setDateEnvoi method, of class Participation.
     */
    @Test
    public void testSetDateEnvoi() {
p.setDateEnvoi(LocalDate.MIN);
    }

    /**
     * Test of toString method, of class Participation.
     */
    @Test
    public void testToString() {
   
    }

}
