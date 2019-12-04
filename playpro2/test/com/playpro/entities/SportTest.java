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
import org.junit.Before;

/**
 *
 * @author toute
 */
public class SportTest {

    final static String NOM = "Tennis";
    final static String IMGAGE = "://stattic/img1";
    final static int NB_MAX = 2;
    final static int NB_MIN = 8;
    String id = "ABC";
    String sportc = "Hockey";
    Sport S;

    public SportTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        S = new Sport(id, NOM);
        S.setId_sport(id);
        S.setNom(NOM);
        S.setImage(IMGAGE);
        S.setNb_max(NB_MAX);
        S.setNb_min(NB_MIN);

    }

    /**
     * Test of getNb_max method, of class Sport.
     */

    @Test(expected = IllegalArgumentException.class)
    public void testNB_MaxNegatif() {

        final int nvMax = -1;
        S.setNb_max(nvMax);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testNB_MinNegatif() {

        final int nvMin = -1;
        S.setNb_max(nvMin);
    }
    @Test
    public void testGetNb_max() {
        assertEquals(S.getNb_max(), NB_MAX);
    }

    /**
     * Test of getNb_min method, of class Sport.
     */
    @Test
    public void testGetNb_min() {
        System.out.println("getNb_min");
        assertEquals(S.getNb_min(), NB_MIN);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setNb_max method, of class Sport.
     */
    @Test
    public void testSetNb_max() {
        final int nvmax = 8;
        S.setNb_max(nvmax);
    }

    /**
     * Test of setNb_min method, of class Sport.
     */
    @Test
    public void testSetNb_min() {
        final int nvmin = 3;
        S.setNb_min(nvmin);
    }

    /**
     * Test of getId_sport method, of class Sport.
     */
    @Test
    public void testGetId_sport() {
        final String nvId = "abc";
        S.setId_sport(nvId);
    }

    /**
     * Test of getNom method, of class Sport.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Sport instance = new Sport();
        String expResult = "Hockey";

        instance.setNom(expResult);
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId_sport method, of class Sport.
     */
    @Test
    public void testSetId_sport() {
        System.out.println("setId_sport");
        String idSport = "12345";
        Sport instance = new Sport();
        instance.setId_sport(idSport);
        String expResult = idSport;
        String result = instance.getId_sport();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        String result = instance.getNom();
        assertEquals(nomSport, result);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class Sport.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        assertEquals(S.getImage(), IMGAGE);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of setImage method, of class Sport.
     */
    @Test
    public void testSetImage() {
        final String nvImg = "c://static/im2";
        S.setImage(nvImg);
    }

    /**
     * Test of toString method, of class Sport.
     */
    @Test
    public void testToString() {

        // TODO review the generated test code and remove the default call to fail.
    }

}
