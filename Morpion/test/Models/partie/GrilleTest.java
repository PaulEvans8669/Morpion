/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.partie;

import java.util.ArrayList;
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
public class GrilleTest {
    
    Grille instance;
    
    public GrilleTest() {
        instance = new Grille();
        instance.setCase(0, 0, 0);
        instance.setCase(0, 1, 2);
        instance.setCase(0, 2, 1);
        instance.setCase(1, 0, 2);
        instance.setCase(1, 1, 1);
        instance.setCase(1, 2, 2);
        instance.setCase(2, 0, 1);
        instance.setCase(2, 1, 2);
        instance.setCase(2, 2, 1);
        /*
            0   2   1
        
            2   1   2
        
            1   2   1
        
        
        */
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
     * Test of getGrille method, of class Grille.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Case[][] expResult = new Case[3][3];
        expResult[0][0] = instance.grille[0][0];
        expResult[0][1] = instance.grille[0][1];
        expResult[0][2] = instance.grille[0][2];
        expResult[1][0] = instance.grille[1][0];
        expResult[1][1] = instance.grille[1][1];
        expResult[1][2] = instance.grille[1][2];
        expResult[2][0] = instance.grille[2][0];
        expResult[2][1] = instance.grille[2][1];
        expResult[2][2] = instance.grille[2][2];
        Case[][] result = instance.getGrille();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of ajouterAction method, of class Grille.
     */
    @Test
    public void testAjouterAction() {
        System.out.println("ajouterAction");
        Action action = new Action(0, 0, 0);
        instance.ajouterAction(action);
    }

    /**
     * Test of setCase method, of class Grille.
     */
    @Test
    public void testSetCase() {
        System.out.println("setCase");
        int ligne = 0;
        int col = 0;
        int val = 0;
        instance.setCase(ligne, col, val);
    }

    /**
     * Test of getListeAction method, of class Grille.
     */
    @Test
    public void testGetListeAction() {
        System.out.println("getListeAction");
        ArrayList<Action> expResult = new ArrayList();
        ArrayList<Action> result = instance.getListeAction();
        assertEquals(expResult, result);
    }

    /**
     * Test of grillePleine method, of class Grille.
     */
    @Test
    public void testGrillePleine() {
        System.out.println("grillePleine");
        boolean expResult = false;
        boolean result = instance.grillePleine();
        assertEquals(expResult, result);
    }

    /**
     * Test of verifLigne method, of class Grille.
     */
    @Test
    public void testVerifLigne() {
        System.out.println("verifLigne");
        int ligne = 0;
        int expResult = 0;
        int result = instance.verifLigne(ligne);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifColonne method, of class Grille.
     */
    @Test
    public void testVerifColonne() {
        System.out.println("verifColonne");
        int col = 0;
        int expResult = 0;
        int result = instance.verifColonne(col);
        assertEquals(expResult, result);
    }

    /**
     * Test of verifDiagonaleMontanteDroite method, of class Grille.
     */
    @Test
    public void testVerifDiagonaleMontanteDroite() {
        System.out.println("verifDiagonaleMontanteDroite");
        int expResult = 1;
        int result = instance.verifDiagonaleMontanteDroite();
        assertEquals(expResult, result);
    }

    /**
     * Test of verifDiagonaleDescendanteDroite method, of class Grille.
     */
    @Test
    public void testVerifDiagonaleDescendanteDroite() {
        System.out.println("verifDiagonaleDescendanteDroite");
        int expResult = 0;
        int result = instance.verifDiagonaleDescendanteDroite();
        assertEquals(expResult, result);
    }


    /**
     * Test of getCase method, of class Grille.
     */
    @Test
    public void testGetCase() {
        System.out.println("getCase");
        int col = 0;
        int lig = 0;
        Case expResult = instance.grille[lig][col];
        Case result = instance.getCase(col, lig);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNbCasesRemplies method, of class Grille.
     */
    @Test
    public void testGetNbCasesRemplies() {
        System.out.println("getNbCasesRemplies");
        int expResult = 8;
        int result = instance.getNbCasesRemplies();
        assertEquals(expResult, result);
    }
    
}
