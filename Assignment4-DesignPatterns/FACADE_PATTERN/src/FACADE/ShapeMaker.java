package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Provides a simplified interface to draw various shapes.
 * <p>
 * The {@code ShapeMaker} class acts as a Facade, encapsulating the complexity of 
 * handling individual shape objects ({@code Circle}, {@code Rectangle}, and {@code Square}).
 * It provides methods to draw each shape through a single unified interface.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public class ShapeMaker {

    // Attributes representing the shapes to be managed by the ShapeMaker facade
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    /**
     * Constructs a new {@code ShapeMaker} and initializes the shape instances.
     * <p>
     * The constructor creates instances of {@code Circle}, {@code Rectangle}, and {@code Square},
     * allowing the facade to delegate drawing tasks to these objects.
     * </p>
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draws a circle by delegating to the {@code Circle} object's {@code draw} method.
     * 
     * @return A {@code String} representation of the circle drawing process.
     */
    public String drawCircle() {
        return circle.draw();
    }

    /**
     * Draws a rectangle by delegating to the {@code Rectangle} object's {@code draw} method.
     * 
     * @return A {@code String} representation of the rectangle drawing process.
     */
    public String drawRectangle() {
        return rectangle.draw();
    }

    /**
     * Draws a square by delegating to the {@code Square} object's {@code draw} method.
     * 
     * @return A {@code String} representation of the square drawing process.
     */
    public String drawSquare() {
        return square.draw();
    }
}
