/*
 * Testing class car
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Turbotwins2018
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "Default car name";
        String result = instance.getName();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        short expResult = 90;
        short result = instance.getSpeed();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        Car.Color expResult = null;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "";
        Car instance = new Car();
        instance.setName(newName);
        assertEquals(newName, instance.getName());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        assertEquals(newSpeed, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = Car.Color.WHITE;
        Car instance = new Car();
        instance.setColor(newColor);
        assertEquals(newColor, instance.getColor());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setRentPrice method, of class Car.
     */
    @Test
    public void testSetRentPrice() {
        System.out.println("setRentPrice");
        int newRentPrice = 25;
        Car instance = new Car();
        instance.setRentPrice(newRentPrice);
        assertEquals(newRentPrice, instance.getDailyRentPrice());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int newSalePrice = 0;
        Car instance = new Car();
        instance.setSalePrice(newSalePrice);
        assertEquals(newSalePrice, instance.getSalePrice());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 80;
        short newSpeedBis = 100;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        assertEquals(newSpeed, instance.getSpeed());
        instance.increaseSpeed(newSpeedBis);
        assertEquals(newSpeedBis, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 80;
        short newSpeedBis = 100;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        assertEquals(newSpeed, instance.getSpeed());
        instance.decreaseSpeed(newSpeedBis);
        assertEquals(newSpeedBis, instance.getSpeed());
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getDailyRentPrice();
        assertEquals(expResult, result);
        // fail("The test case is a prototype.");
    }
    
}
