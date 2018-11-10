/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins2018
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of aduna method, of class Calculator.
     */
    @Test
    public void testAduna() {
        System.out.println("aduna");
        int a = 2;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 5;
        int result = instance.aduna(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of scade method, of class Calculator.
     */
    @Test
    public void testScade() {
        System.out.println("scade");
        int a = 5;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 3;
        int result = instance.scade(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of inmulteste method, of class Calculator.
     */
    @Test
    public void testInmulteste() {
        System.out.println("inmulteste");
        int a = 4;
        int b = 3;
        Calculator instance = new Calculator();
        int expResult = 12;
        int result = instance.inmulteste(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of imparte method, of class Calculator.
     */
    @Test
    public void testImparte() {
        System.out.println("imparte");
        int a = 4;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.imparte(a, b);
        assertEquals(expResult, result);
        boolean thrown = false;
        a = 5;
        b = 0;
        try {
            instance.imparte(a, b);
        } catch (ArithmeticException e) {
            thrown = true;
        }
        assertTrue(thrown);
        //fail("The test case is a prototype.");
    }
    
}
