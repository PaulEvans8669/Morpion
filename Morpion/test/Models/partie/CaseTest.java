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
public class CaseTest {
    
    public CaseTest() {
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
     * Test of getContenu method, of class Case.
     */
    @Test
    public void testGetContenu() {
        System.out.println("getContenu");
        Case instance = new Case();
        instance.setContenu(1);
        int expResult = 1;
        int result = instance.getContenu();
        assertEquals(expResult, result);
    }

    /**
     * Test of setContenu method, of class Case.
     */
    @Test
    public void testSetContenu() {
        System.out.println("setContenu");
        int contenu = 0;
        Case instance = new Case();
        instance.setContenu(contenu);
    }
    
}
