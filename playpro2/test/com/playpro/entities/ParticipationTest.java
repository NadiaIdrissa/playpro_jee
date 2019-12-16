/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

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
     final static Equipe EQUIPE=new Equipe();
     final static Membre MEMBRE=new Membre(); 
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
        p=new Participation();
        p.setEquipe(EQUIPE);
        p.setMembre(MEMBRE);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEquipe method, of class Participation.
     */
    @Test
    public void testGetEquipe() {

        assertEquals(p.getEquipe(), EQUIPE);
      
    }

  


    /**
     * Test of getMembre method, of class Participation.
     */
    @Test
    public void testGetMembre() {

        assertEquals(p.getMembre(),MEMBRE);

    }

    
}
