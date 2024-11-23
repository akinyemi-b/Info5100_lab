/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 * The {@code Shape} interface defines a contract for shapes that can be drawn.
 * <p>
 * Any class that implements the {@code Shape} interface must provide an implementation
 * for the {@code draw} method, which is responsible for simulating the drawing of the shape.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public interface Shape {

    /**
     * Draws the shape and returns a description of the drawing action.
     * <p>
     * This method is intended to be implemented by concrete shape classes (e.g., Circle, Rectangle, etc.)
     * to define how the shape should be drawn. The method returns a string that describes the drawing action.
     * </p>
     * 
     * @return A {@code String} representing the drawing action of the shape.
     */
    String draw();
}
