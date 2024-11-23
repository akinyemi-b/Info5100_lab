import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test class for testing the ShapeFactory class.
 * 
 * This class contains tests for the ShapeFactory class that verifies the 
 * correct creation and behavior of different shape objects (Circle, Rectangle, 
 * and Square) based on the provided shape type.
 * 
 * @author akiny
 * @version 1.0
 */
public class ShapeFactoryTest {
 
    /**
     * Test of the getShape method for creating a Circle, of class ShapeFactory.
     * 
     * This test verifies that the ShapeFactory correctly creates a Circle 
     * object when requested, and that the draw() method produces the expected output.
     */
    @Test
    public void testGetShapeCircle() {
        System.out.println("getShape - Circle");
        ShapeFactory instance = new ShapeFactory();
        Shape result = instance.getShape("CIRCLE");
        String expResult = "Circle::draw()";
 
        // Check if the object is not null
        assertNotNull(result);
 
        // Check if the correct object is created
        assertTrue(result instanceof Circle);
 
        // Call the draw() method and validate output
        assertEquals(expResult, result.draw());
 
        // Negative test cases
        assertNotEquals("Rectangle::draw()", result.draw());
        assertNotEquals("Square::draw()", result.draw());
    }
 
    /**
     * Test of the getShape method for creating a Rectangle, of class ShapeFactory.
     * 
     * This test verifies that the ShapeFactory correctly creates a Rectangle 
     * object when requested, and that the draw() method produces the expected output.
     */
    @Test
    public void testGetShapeRectangle() {
        System.out.println("getShape - Rectangle");
        ShapeFactory instance = new ShapeFactory();
        Shape result = instance.getShape("RECTANGLE");
        String expResult = "Rectangle::draw()";
 
        // Check if the object is not null
        assertNotNull(result);
 
        // Check if the correct object is created
        assertTrue(result instanceof Rectangle);
 
        // Call the draw() method and validate output
        assertEquals(expResult, result.draw());
 
        // Negative test cases
        assertNotEquals("Circle::draw()", result.draw());
        assertNotEquals("Square::draw()", result.draw());
    }
 
    /**
     * Test of the getShape method for creating a Square, of class ShapeFactory.
     * 
     * This test verifies that the ShapeFactory correctly creates a Square 
     * object when requested, and that the draw() method produces the expected output.
     */
    @Test
    public void testGetShapeSquare() {
        System.out.println("getShape - Square");
        ShapeFactory instance = new ShapeFactory();
        Shape result = instance.getShape("SQUARE");
        String expResult = "Square::draw()";
 
        // Check if the object is not null
        assertNotNull(result);
 
        // Check if the correct object is created
        assertTrue(result instanceof Square);
 
        // Call the draw() method and validate output
        assertEquals(expResult, result.draw());
 
        // Negative test cases
        assertNotEquals("Circle::draw()", result.draw());
        assertNotEquals("Rectangle::draw()", result.draw());
    }
}
