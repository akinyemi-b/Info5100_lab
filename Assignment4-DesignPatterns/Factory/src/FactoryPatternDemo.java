/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Demonstrates the Factory Design Pattern by creating and using shape objects.
 * <p>
 * The {@code FactoryPatternDemo} class utilizes a {@code ShapeFactory} to create instances
 * of different shapes (Circle, Rectangle, and Square) and calls their {@code draw} methods.
 * This demonstrates the encapsulation of object creation logic in the factory.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public class FactoryPatternDemo {

    /**
     * The entry point for the program, demonstrating the Factory Design Pattern.
     * <p>
     * This method creates a {@code ShapeFactory} object to retrieve shape instances 
     * based on provided input strings and calls the {@code draw} methods on these 
     * shape objects to display their specific drawing behavior.
     * </p>
     * 
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Create an instance of the ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw(); // Call draw method of Circle

        // Get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw(); // Call draw method of Rectangle

        // Get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw(); // Call draw method of Square
    }
}
