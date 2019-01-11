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
public class ActionTest {
    
    int x = 3;
    int y = 2;
    int val = 5;
    Action instance;
    
    public ActionTest() {
        instance = new Action(y, x, val);
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
     * Test of getPosX method, of class Action.
     */
    @Test
    public void testGetPosX() {
        
        System.out.println("getPosX");
        int expResult = x;
        int result = instance.getPosX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPosY method, of class Action.
     */
    @Test
    public void testGetPosY() {
        System.out.println("getPosY");
        int expResult = y;
        int result = instance.getPosY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValeur method, of class Action.
     */
    @Test
    public void testGetValeur() {
        System.out.println("getValeur");
        int expResult = val;
        int result = instance.getValeur();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Action.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
