/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The {@code ShapeFactory} class provides a method to create instances of different shapes.
 * <p>
 * This is an implementation of the Factory Design Pattern. The {@code getShape} method
 * returns an object of type {@code Shape}, based on the input provided. It allows
 * clients to request shapes like Circle, Rectangle, or Square without needing to know
 * the details of their instantiation.
 * </p>
 * 
 * @author akinyemi Bolatito
 * @version 1.0
 */
public class ShapeFactory {

    /**
     * Returns an object of type {@code Shape} based on the specified shape type.
     * <p>
     * This method checks the input string and returns the corresponding shape object.
     * If the input does not match any known shape type, it returns {@code null}.
     * </p>
     * 
     * @param shapeType A {@code String} representing the type of shape to be created. 
     *                  Possible values are "CIRCLE", "RECTANGLE", or "SQUARE".
     * @return A {@code Shape} object corresponding to the given shape type, or {@code null} if no match is found.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
