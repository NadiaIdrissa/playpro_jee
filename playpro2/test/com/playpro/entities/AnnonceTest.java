/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

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
public class AnnonceTest {
    
    final static String IDCREATEUR = "abc";
    final static String TITRE = "Participer";
    final static String DESCRIPTION = "MESSAGE";
    final static boolean GRATUIT = false;
    final static int MONTANT = 25;
    final static int NB_MAX = 20;
    //final static Date  DATECREATION="2004-03-27";
    Membre m;
    Annonce a;
    
    public AnnonceTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new Annonce();
        a.setIdAnnonce("abc");
        a.setIdCreateur(IDCREATEUR);
        a.setDescription(DESCRIPTION);
        a.setGratuit(GRATUIT);
        a.setMembre(m);
        a.setNombreMax(NB_MAX);
        a.setMontant(MONTANT);
        a.setTitre(TITRE);
        // Date d=a.getDateCreation();

    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCreationAnnonce() {
        assertEquals(a.getDescription(), DESCRIPTION);
    }

    /**
     * Test of getIdAnnonce method, of class Annonce.
     */
    @Test
    public void testGetIdAnnonce() {
        assertEquals(a.getIdAnnonce(),"abc");
    }

    /**
     * Test of getIdCreateur method, of class Annonce.
     */
    @Test
    public void testGetIdCreateur() {
        assertEquals(IDCREATEUR, a.getIdCreateur());
    }

    /**
     * Test of getTitre method, of class Annonce.
     */
    @Test
    public void testGetTitre() {
        assertEquals(a.getTitre(), TITRE);
    }

    /**
     * Test of getDescription method, of class Annonce.
     */
    @Test
    public void testGetDescription() {
        assertEquals(a.getDescription(), DESCRIPTION);
    }

    /**
     * Test of getGratuit method, of class Annonce.
     */
    @Test
    public void testGetGratuit() {
        assertEquals(a.getGratuit(), GRATUIT);
    }

    /**
     * Test of getMontant method, of class Annonce.
     */
    @Test
    public void testGetMontant() {
        assertEquals(a.getMontant(), MONTANT);
    }

    /**
     * Test of getNombreMax method, of class Annonce.
     */
    @Test
    public void testGetNombreMax() {
        assertEquals(a.getNombreMax(), NB_MAX);
    }

    /**
     * Test of getDateCreation method, of class Annonce.
     */
    @Test
    public void testGetDateCreation() {
        
    }

    /**
     * Test of getMembre method, of class Annonce.
     */
    @Test
    public void testGetMembre() {
        assertEquals(a.getMembre(), m);
    }

    /**
     * Test of setIdAnnonce method, of class Annonce.
     */
    @Test
    public void testSetIdAnnonce() {
        final String idA = "jbc";
        a.setIdAnnonce(idA);
    }

    /**
     * Test of setIdCreateur method, of class Annonce.
     */
    @Test
    public void testSetIdCreateur() {
        final String idA = "jbc2";
        a.setIdCreateur(idA);
    }

    /**
     * Test of setTitre method, of class Annonce.
     */
    @Test
    public void testSetTitre() {
        final String ti = "message2";
        a.setTitre(ti);
        
    }

    /**
     * Test of setDescription method, of class Annonce.
     */
    @Test
    public void testSetDescription() {
        final String desc = "message34";
        a.setDescription(desc);
    }

    /**
     * Test of setGratuit method, of class Annonce.
     */
    @Test
    public void testSetGratuit() {
        final boolean grat = false;
        a.setGratuit(grat);
    }

    /**
     * Test of setMontant method, of class Annonce.
     */
    @Test
    public void testSetMontant() {
        final int mont = 30;
        a.setMontant(mont);
        
    }

    /**
     * Test of setNombreMax method, of class Annonce.
     */
    @Test
    public void testSetNombreMax() {
        final int nbm = 6;
        a.setNombreMax(nbm);
    }

    /**
     * Test of setDateCreation method, of class Annonce.
     */
    /**
     * Test of setMembre method, of class Annonce.
     */
    @Test
    public void testSetMembre() {
        final Membre m2 = new Membre();
        a.setMembre(m2);
    }

    /**
     * Test of toString method, of class Annonce.
     */
    @Test
    public void testToString() {
        
    }
    
}
