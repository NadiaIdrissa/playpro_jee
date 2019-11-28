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
    final static String IDCREATEUR="abc";
    final static String TITRE="Participer";
    final static String DESCRIPTION="MESSAGE";
    final static boolean GRATUIT=false;
    final static int MONTANT=25;
    final static int NB_MAX=20;
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
        a.setIdCreateur(IDCREATEUR);
        a.setDescription(DESCRIPTION);
        a.setGratuit(GRATUIT);
        a.setMembre(m);
        a.setNombreMax(NB_MAX);
        a.setMontant(MONTANT);
        a.setTitre(TITRE);
        Date d=a.getDateCreation();
        
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
       
     
    }

    /**
     * Test of getIdCreateur method, of class Annonce.
     */
    @Test
    public void testGetIdCreateur() {
        assertEquals(IDCREATEUR,a.getIdCreateur());
    }

    /**
     * Test of getTitre method, of class Annonce.
     */
    @Test
    public void testGetTitre() {
        assertEquals(a.getTitre(),TITRE);
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
        System.out.println("getMontant");
        Annonce instance = new Annonce();
        int expResult = 0;
        int result = instance.getMontant();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreMax method, of class Annonce.
     */
    @Test
    public void testGetNombreMax() {
        System.out.println("getNombreMax");
        Annonce instance = new Annonce();
        int expResult = 0;
        int result = instance.getNombreMax();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateCreation method, of class Annonce.
     */
    @Test
    public void testGetDateCreation() {
        System.out.println("getDateCreation");
        Annonce instance = new Annonce();
        Date expResult = null;
        Date result = instance.getDateCreation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMembre method, of class Annonce.
     */
    @Test
    public void testGetMembre() {
        System.out.println("getMembre");
        Annonce instance = new Annonce();
        Membre expResult = null;
        Membre result = instance.getMembre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAnnonce method, of class Annonce.
     */
    @Test
    public void testSetIdAnnonce() {
        System.out.println("setIdAnnonce");
        String idAnnonce = "";
        Annonce instance = new Annonce();
        instance.setIdAnnonce(idAnnonce);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCreateur method, of class Annonce.
     */
    @Test
    public void testSetIdCreateur() {
        System.out.println("setIdCreateur");
        String createur = "";
        Annonce instance = new Annonce();
        instance.setIdCreateur(createur);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitre method, of class Annonce.
     */
    @Test
    public void testSetTitre() {
        System.out.println("setTitre");
        String titre = "";
        Annonce instance = new Annonce();
        instance.setTitre(titre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Annonce.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Annonce instance = new Annonce();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGratuit method, of class Annonce.
     */
    @Test
    public void testSetGratuit() {
        System.out.println("setGratuit");
        Boolean gratuit = null;
        Annonce instance = new Annonce();
        instance.setGratuit(gratuit);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMontant method, of class Annonce.
     */
    @Test
    public void testSetMontant() {
        System.out.println("setMontant");
        int montant = 0;
        Annonce instance = new Annonce();
        instance.setMontant(montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreMax method, of class Annonce.
     */
    @Test
    public void testSetNombreMax() {
        System.out.println("setNombreMax");
        int nombreMax = 0;
        Annonce instance = new Annonce();
        instance.setNombreMax(nombreMax);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateCreation method, of class Annonce.
     */
    @Test
    public void testSetDateCreation() {
        System.out.println("setDateCreation");
        Date dateCreation = null;
        Annonce instance = new Annonce();
        instance.setDateCreation(dateCreation);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMembre method, of class Annonce.
     */
    @Test
    public void testSetMembre() {
        System.out.println("setMembre");
        Membre membre = null;
        Annonce instance = new Annonce();
        instance.setMembre(membre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Annonce.
     */
    @Test
    public void testToString() {
      
    }
    
}
