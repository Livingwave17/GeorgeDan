/*
 * Tests for Alu Class
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins2018
 */
public class AluTest {
    
    public AluTest() {
    }

    /**
     * Test of getOperator method, of class Alu.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Alu instance = new Alu();
        Character expResult = null;
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Alu.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '+';
        Alu instance = new Alu();
        instance.setOperator(operator);
        assertEquals(operator, instance.getOperator());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class Alu.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        expResult = 2;
        instance.setOperandUnu(2);
        result = instance.getOperandUnu();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class Alu.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = 1234;
        Alu instance = new Alu();
        instance.setOperandUnu(operandUnu);
        assertEquals(operandUnu, instance.getOperandUnu());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class Alu.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        expResult = 2;
        instance.setOperandDoi(2);
        result = instance.getOperandDoi();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class Alu.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = 12;
        Alu instance = new Alu();
        instance.setOperandDoi(operandDoi);
        assertEquals(operandDoi, instance.getOperandDoi());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class Alu.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        Alu instance = new Alu();
        Integer expResult = null;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        expResult = 10;
        instance.setRezultat(10);
        result = instance.getRezultat();
        assertEquals(result, expResult);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class Alu.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = 12;
        Alu instance = new Alu();
        instance.setRezultat(rezultat);
        assertEquals(instance.getRezultat(), rezultat);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class Alu.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Alu instance = new Alu();
        instance.setOperator('+');
        instance.setOperandUnu(4);
        instance.setOperandDoi(2);
        instance.calculeaza();
        Integer expResult = 6;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('-');
        instance.calculeaza();
        expResult = 2;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('*');
        instance.calculeaza();
        expResult = 8;
        assertEquals(expResult, instance.getRezultat());
        instance.setOperator('/');
        instance.calculeaza();
        expResult = 2;
        assertEquals(expResult, instance.getRezultat());
        
        // fail("The test case is a prototype.");
    }
    
}
