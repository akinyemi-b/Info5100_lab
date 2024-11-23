/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a Square shape that implements the {@code Shape} interface.
 * <p>
 * This class provides functionality to simulate drawing a square by implementing
 * the {@code draw} method defined in the {@code Shape} interface.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public class Square implements Shape {

    /**
     * Simulates the action of drawing a square.
     * <p>
     * This method prints a message to the console indicating that a square is being drawn
     * and returns a string representing the drawing action.
     * </p>
     * 
     * @return A {@code String} that describes the drawing action, specifically "Square::draw()".
     */
    @Override
    public String draw() {
        System.out.println("Inside Square::draw() method");
        return "Square::draw()";
    }
}
