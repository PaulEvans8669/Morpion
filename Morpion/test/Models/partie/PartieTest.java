/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.partie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author p1709400
 */
public class PartieTest {
    
    Partie instance;
    public PartieTest() {
        instance = new Partie(0, "j1", "j2", 0, 1);
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
     * Test of setIdPartie method, of class Partie.
     */
    @Test
    public void testSetIdPartie() {
        System.out.println("setIdPartie");
        int idPartie = 0;
        instance.setIdPartie(idPartie);
    }

    /**
     * Test of getIdPartie method, of class Partie.
     */
    @Test
    public void testGetIdPartie() {
        System.out.println("getIdPartie");
        int expResult = 0;
        int result = instance.getIdPartie();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJoueur1 method, of class Partie.
     */
    @Test
    public void testGetJoueur1() {
        System.out.println("getJoueur1");
        String expResult = "j1";
        String result = instance.getJoueur1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getJoueur2 method, of class Partie.
     */
    @Test
    public void testGetJoueur2() {
        System.out.println("getJoueur2");
        String expResult = "j2";
        String result = instance.getJoueur2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScoreJoueur1 method, of class Partie.
     */
    @Test
    public void testGetScoreJoueur1() {
        System.out.println("getScoreJoueur1");
        int expResult = 0;
        int result = instance.getScoreJoueur1();
        assertEquals(expResult, result);
    }

    /**
     * Test of getScoreJoueur2 method, of class Partie.
     */
    @Test
    public void testGetScoreJoueur2() {
        System.out.println("getScoreJoueur2");
        int expResult = 1;
        int result = instance.getScoreJoueur2();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGagnant method, of class Partie.
     */
    @Test
    public void testGetGagnant() {
        System.out.println("getGagnant");
        int expResult = 0;
        int result = instance.getGagnant();
        assertEquals(expResult, result);
    }

    /**
     * Test of nouvelleManche method, of class Partie.
     */
    @Test
    public void testNouvelleManche_0args() {
        System.out.println("nouvelleManche");
        instance.nouvelleManche();
    }
    
}
