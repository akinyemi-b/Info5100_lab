/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for the SingleObject class to verify Singleton behavior
 * and the correct operation of the showMessage method.
 * 
 * @author akiny
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    /**
     * Test to verify that only one instance of the SingleObject class is created.
     * This ensures that the Singleton pattern is correctly implemented.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        // Get the instance of SingleObject using getInstance method
        SingleObject instance1 = SingleObject.getInstance();
        SingleObject instance2 = SingleObject.getInstance();
        
        // Verify that both instances are the same
        assertSame("Both instances should be the same, as SingleObject is a Singleton", instance1, instance2);
    }

    /**
     * Test the showMessage method of SingleObject class.
     * This verifies that the correct message is returned by showMessage().
     */
    @Test
    public void testShowMessage() {
        System.out.println("showMessage");
        
        // Get the instance of SingleObject
        SingleObject instance = SingleObject.getInstance();
        
        // Expected message
        String expResult = "Bolatito";
        
        // Verify that the message returned by showMessage() is as expected
        String result = instance.showMessage();
        assertEquals("The message returned by showMessage() should be 'Bolatito'", expResult, result);
    }
}
