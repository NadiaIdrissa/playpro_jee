/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.sql.Timestamp;
import java.time.LocalDateTime;
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
   final static String NOM="jesus";
    final static String COURRIEL="jesus@gmail.com";
    final static String SUJET="horaire";
    final static String COMMMENTAIRE="annulation";
    final static Timestamp DATE_RECEPTION=Timestamp.valueOf(LocalDateTime.MIN);    
   Commentaire c;
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
        c=new Commentaire();
        c.setCommentaire(COMMMENTAIRE);
        c.setCourriel(COURRIEL);
        c.setDateReception(DATE_RECEPTION);
        c.setNom(NOM);
        c.setSujet(SUJET);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Commentaire.
     */
    @Test
    public void testGetNom() {

        assertEquals(c.getNom(),NOM);
 
    }

    /**
     * Test of setNom method, of class Commentaire.
     */


    /**
     * Test of getCourriel method, of class Commentaire.
     */
    @Test
    public void testGetCourriel() {
     
        assertEquals(c.getCourriel(), COURRIEL);

    }




    /**
     * Test of getSujet method, of class Commentaire.
     */
    @Test
    public void testGetSujet() {

        assertEquals(c.getSujet(),SUJET);

    }



    /**
     * Test of getCommentaire method, of class Commentaire.
     */
    @Test
    public void testGetCommentaire() {

        assertEquals(c.getCommentaire(),COMMMENTAIRE);

    }

  

    /**
     * Test of getDateReception method, of class Commentaire.
     */
    @Test
    public void testGetDateReception() {

        assertEquals(c.getDateReception(), DATE_RECEPTION);

    }

 
    
}
