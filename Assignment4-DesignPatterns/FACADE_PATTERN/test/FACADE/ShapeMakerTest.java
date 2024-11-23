/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package FACADE;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the {@code ShapeMaker} class.
 * <p>
 * This class provides automated tests for the {@code ShapeMaker} methods,
 * ensuring that the expected shapes are drawn correctly and verified using assertions.
 * </p>
 * 
 * @author akinyemi
 * @version 1.0
 */
public class ShapeMakerTest {

    /**
     * Default constructor for the test class.
     */
    public ShapeMakerTest() {
    }

    /**
     * Runs once before any tests are executed to set up class-level resources.
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Runs once after all tests are completed to clean up class-level resources.
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Runs before each test to set up necessary resources.
     */
    @Before
    public void setUp() {
    }

    /**
     * Runs after each test to release resources used during the test.
     */
    @After
    public void tearDown() {
    }

    /**
     * Tests the {@code drawCircle} method of the {@code ShapeMaker} class.
     * <p>
     * Verifies that the method correctly returns the string representation of a circle being drawn.
     * Includes both positive (matching) and negative (non-matching) test cases.
     * </p>
     */
    @Test
    public void testDrawCircle() {
        System.out.println("drawCircle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Circle::draw()";
        String result = instance.drawCircle();

        // Positive test cases
        assertEquals(expResult, result);
        assertEquals("Circle::draw()", instance.drawCircle());

        // Negative test cases
        assertNotEquals("Not Circle", instance.drawCircle());
        assertNotEquals("Rectangle", instance.drawCircle());
    }

    /**
     * Tests the {@code drawRectangle} method of the {@code ShapeMaker} class.
     * <p>
     * Verifies that the method correctly returns the string representation of a rectangle being drawn.
     * Includes both positive (matching) and negative (non-matching) test cases.
     * </p>
     */
    @Test
    public void testDrawRectangle() {
        System.out.println("drawRectangle");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Rectangle::draw()";
        String result = instance.drawRectangle();

        // Positive test cases
        assertEquals(expResult, result);
        assertEquals("Rectangle::draw()", instance.drawRectangle());

        // Negative test cases
        assertNotEquals("Not Rectangle", instance.drawRectangle());
        assertNotEquals("Circle", instance.drawRectangle());
    }

    /**
     * Tests the {@code drawSquare} method of the {@code ShapeMaker} class.
     * <p>
     * Verifies that the method correctly returns the string representation of a square being drawn.
     * Includes both positive (matching) and negative (non-matching) test cases.
     * </p>
     */
    @Test
    public void testDrawSquare() {
        System.out.println("drawSquare");
        ShapeMaker instance = new ShapeMaker();
        String expResult = "Square::draw()";
        String result = instance.drawSquare();

        // Positive test cases
        assertEquals(expResult, result);
        assertEquals("Square::draw()", instance.drawSquare());

        // Negative test cases
        assertNotEquals("Not Square", instance.drawSquare());
        assertNotEquals("Circle", instance.drawSquare());
    }
}
