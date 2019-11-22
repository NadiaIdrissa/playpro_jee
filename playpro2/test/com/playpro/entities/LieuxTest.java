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
public class LieuxTest {
    
    final static String NOM = "Parc Jarry";
    final static String NUMERO = "123";
    final static String RUE = "Beaubien";
    final static String CODEPOSTAL = "H2S6H7";
    final static String VILLE = "Montreal";
    final static String PAYS = "CANADA";
    final static String INFO = "Terrain sable";
    final static String IMAGE1 = "c:/static/img";
    final static String IMAGE2 = "c:/static/img2";
    final static String IMAGE3 = "c:/static/img3";
    Lieux l1;
    
    public LieuxTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        l1 = new Lieux();
        l1.setId_lieu("abc");
        l1.setNom(NOM);
        l1.setNumero(NUMERO);
        l1.setCode_postal(CODEPOSTAL);
        l1.setInfos(INFO);
        l1.setVille(VILLE);
        l1.setRue(RUE);
        l1.setPays(PAYS);
        l1.setImage1(IMAGE1);
        l1.setImage2(IMAGE2);
        l1.setImage3(IMAGE3);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId_lieu method, of class Lieux.
     */
    @Test
    public void testGetId_lieu() {
        assertEquals(l1.getId_lieu(), "abc");
    }

    /**
     * Test of getNom method, of class Lieux.
     */
    @Test
    public void testGetNom() {
        assertEquals(l1.getNom(), NOM);
    }

    /**
     * Test of getNumero method, of class Lieux.
     */
    @Test
    public void testGetNumero() {
        assertEquals(l1.getNumero(), NUMERO);
    }

    /**
     * Test of getRue method, of class Lieux.
     */
    @Test
    public void testGetRue() {
        assertEquals(l1.getRue(), RUE);
    }

    /**
     * Test of getCode_postal method, of class Lieux.
     */
    @Test
    public void testGetCode_postal() {
        assertEquals(l1.getCode_postal(), CODEPOSTAL);
    }

    /**
     * Test of getVille method, of class Lieux.
     */
    @Test
    public void testGetVille() {
        assertEquals(l1.getVille(), VILLE);
    }

    /**
     * Test of getPays method, of class Lieux.
     */
    @Test
    public void testGetPays() {
        assertEquals(l1.getPays(), PAYS);
    }

    /**
     * Test of getInfos method, of class Lieux.
     */
    @Test
    public void testGetInfos() {
        assertEquals(l1.getInfos(), INFO);
    }

    /**
     * Test of setId_lieu method, of class Lieux.
     */
    @Test
    public void testSetId_lieu() {
        final String nvID = "aaaaa";        
        l1.setId_lieu(nvID);
    }

    /**
     * Test of setNom method, of class Lieux.
     */
    @Test
    public void testSetNom() {
        final String nvNom = "Parc Beaubien";
        l1.setNom(nvNom);
    }

    /**
     * Test of setNumero method, of class Lieux.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Lieux instance = new Lieux();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRue method, of class Lieux.
     */
    @Test
    public void testSetRue() {
        System.out.println("setRue");
        String rue = "";
        Lieux instance = new Lieux();
        instance.setRue(rue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode_postal method, of class Lieux.
     */
    @Test
    public void testSetCode_postal() {
        System.out.println("setCode_postal");
        String code_postal = "";
        Lieux instance = new Lieux();
        instance.setCode_postal(code_postal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVille method, of class Lieux.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        String ville = "";
        Lieux instance = new Lieux();
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPays method, of class Lieux.
     */
    @Test
    public void testSetPays() {
        System.out.println("setPays");
        String pays = "";
        Lieux instance = new Lieux();
        instance.setPays(pays);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInfos method, of class Lieux.
     */
    @Test
    public void testSetInfos() {
        System.out.println("setInfos");
        String infos = "";
        Lieux instance = new Lieux();
        instance.setInfos(infos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Lieux.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Lieux instance = new Lieux();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage1 method, of class Lieux.
     */
    @Test
    public void testGetImage1() {
        System.out.println("getImage1");
        Lieux instance = new Lieux();
        String expResult = "";
        String result = instance.getImage1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage2 method, of class Lieux.
     */
    @Test
    public void testGetImage2() {
        System.out.println("getImage2");
        Lieux instance = new Lieux();
        String expResult = "";
        String result = instance.getImage2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage3 method, of class Lieux.
     */
    @Test
    public void testGetImage3() {
        System.out.println("getImage3");
        Lieux instance = new Lieux();
        String expResult = "";
        String result = instance.getImage3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage1 method, of class Lieux.
     */
    @Test
    public void testSetImage1() {
        System.out.println("setImage1");
        String image1 = "";
        Lieux instance = new Lieux();
        instance.setImage1(image1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage2 method, of class Lieux.
     */
    @Test
    public void testSetImage2() {
        System.out.println("setImage2");
        String image2 = "";
        Lieux instance = new Lieux();
        instance.setImage2(image2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage3 method, of class Lieux.
     */
    @Test
    public void testSetImage3() {
        System.out.println("setImage3");
        String image3 = "";
        Lieux instance = new Lieux();
        instance.setImage3(image3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
