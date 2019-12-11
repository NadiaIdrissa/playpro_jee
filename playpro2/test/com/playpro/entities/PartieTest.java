/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playpro.entities;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class PartieTest {
     final static String ID_PARTIE = "ABC";
    final static String SCORE = "3";
    final static Equipe EQUIPE_1 = new Equipe();
    final static Equipe EQUIPE_2 = new Equipe();
    final static Sport SPORT_PARTIE = new Sport();
    final static LieuSport LIEU_PARTIE = new LieuSport();
    final static LocalTime HEURE_PARTIE = LocalTime.MIN;
    Partie p;
    Equipe e1;
    Equipe e2;
    Sport nvSport;
    LieuSport nvLieu;  
    public PartieTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Partie();
        p.setId_Partie(ID_PARTIE);
        p.setEquipe1(EQUIPE_1);
        p.setEquipe2(EQUIPE_2);
        p.setSport(SPORT_PARTIE);
        p.setLieuSportPartie(LIEU_PARTIE);
        p.setScore(SCORE);
        p.setHeurePartie(HEURE_PARTIE);
        p.setDatePartie(LocalDate.MIN);
    }
    
    @After
    public void tearDown() {
    }

 @Test
    public void testGetId_Partie() {
        assertEquals(ID_PARTIE, p.getId_Partie());
    }

    /**
     * Test of setId_Partie method, of class Partie.
     */
    @Test
    public void testSetId_Partie() {
        final String nvId = "nnn";
        p.setId_Partie(nvId);
    }

    /**
     * Test of getScore method, of class Partie.
     */
    @Test
    public void testGetScore() {
        assertEquals(p.getScore(), SCORE);
    }

    /**
     * Test of setScore method, of class Partie.
     */
    @Test
    public void testSetScore() {
        final String nvScore = "4";
        p.setScore(nvScore);
    }

    /**
     * Test of getSport method, of class Partie.
     */
    @Test
    public void testGetSport() {
        assertEquals(p.getSport(), SPORT_PARTIE);
    }

    /**
     * Test of setSport method, of class Partie.
     */
    @Test
    public void testSetSport() {
        p.setSport(nvSport);
    }

    /**
     * Test of getEquipe1 method, of class Partie.
     */
    @Test
    public void testGetEquipe1() {
        assertEquals(p.getEquipe1(), EQUIPE_1);
    }

    /**
     * Test of setEquipe1 method, of class Partie.
     */
    @Test
    public void testSetEquipe1() {
        p.setEquipe1(e1);
    }

    /**
     * Test of getEquipe2 method, of class Partie.
     */
    @Test
    public void testGetEquipe2() {
        assertEquals(p.getEquipe2(), EQUIPE_2);
    }

    /**
     * Test of setEquipe2 method, of class Partie.
     */
    @Test
    public void testSetEquipe2() {
        p.setEquipe1(e2);
    }

    /**
     * Test of getDatePartie method, of class Partie.
     */
    @Test
    public void testGetDatePartie() {
        assertEquals(p.getDatePartie(), LocalDate.MIN);
    }

    /**
     * Test of setDatePartie method, of class Partie.
     */
    @Test
    public void testSetDatePartie() {
        p.setDatePartie(LocalDate.MIN);
    }

    /**
     * Test of getHeurePartie method, of class Partie.
     */
    @Test
    public void testGetHeurePartie() {
        assertEquals(p.getHeurePartie(), HEURE_PARTIE);
    }

    /**
     * Test of setHeurePartie method, of class Partie.
     */
    @Test
    public void testSetHeurePartie() {
        final LocalTime nvHeurePartie = LocalTime.MIN;
        p.setHeurePartie(nvHeurePartie);
    }

    /**
     * Test of getLieuSportPartie method, of class Partie.
     */
    @Test
    public void testGetLieuSportPartie() {
        assertEquals(p.getLieuSportPartie(), LIEU_PARTIE);
    }

    /**
     * Test of setLieuSportPartie method, of class Partie.
     */
    @Test
    public void testSetLieuSportPartie() {
        p.setLieuSportPartie(nvLieu);
    }

}
