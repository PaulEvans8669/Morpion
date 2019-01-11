/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Models.partie.Partie;
import java.util.HashMap;
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
public class ConnexionTest {
    
    public ConnexionTest() {
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
     * Test of supprimerPartie method, of class Connexion.
     */
    @Test
    public void testSupprimerPartie() {
        System.out.println("supprimerPartie");
        int idPartie = 0;
        Connexion instance = new Connexion();
        instance.supprimerPartie(idPartie);
    }

    /**
     * Test of chargerPartie method, of class Connexion.
     */
    @Test
    public void testChargerPartie() {
        System.out.println("chargerPartie");
        int idPartie = 0;
        Connexion instance = new Connexion();
        Partie expResult = null;
        Partie result = instance.chargerPartie(idPartie);
        assertEquals(expResult, result);
    }

    /**
     * Test of sauvegarderPartie method, of class Connexion.
     */
    @Test
    public void testSauvegarderPartie() {
        System.out.println("sauvegarderPartie");
        Partie partie = new Partie("j1Test", "j2Test");
        Connexion instance = new Connexion();
        boolean expResult = true;
        boolean result = instance.sauvegarderPartie(partie);
        assertEquals(expResult, result);
    }

    /**
     * Test of nouvelleManche method, of class Connexion.
     */
    @Test
    public void testNouvelleManche() {
        System.out.println("nouvelleManche");
        Partie partie = new Partie("j1Test2", "j2Test2");;
        Connexion instance = new Connexion();
        instance.nouvelleManche(partie);
    }
    
}
