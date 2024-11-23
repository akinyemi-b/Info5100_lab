package FACADE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a Rectangle shape that implements the {@code Shape} interface.
 * <p>
 * This class provides the functionality to draw a rectangle by implementing
 * the {@code draw} method defined in the {@code Shape} interface.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public class Rectangle implements Shape {

    /**
     * Draws the Rectangle and returns a string representation of the drawing process.
     * <p>
     * This method simulates drawing a rectangle by printing a message to the console
     * and returning a string value indicating that a rectangle has been drawn.
     * </p>
     * 
     * @return A {@code String} indicating the action performed, which is "Rectangle::draw()".
     */
    @Override
    public String draw() {
        System.out.println("Rectangle::draw()");
        return "Rectangle::draw()";
    }
}
