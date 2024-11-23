/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The SingleObject class implements the Singleton design pattern.
 * This ensures that only one instance of the class is created throughout
 * the application.
 * 
 * The class contains a static method to get the single instance of the object
 * and a method to display a message.
 * 
 * @author akiny
 * @version 1.0
 */
public class SingleObject {

    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be instantiated directly
    private SingleObject() {}

    /**
     * Returns the only instance of the SingleObject class.
     * This method is used to ensure that only one instance of the class 
     * exists throughout the application.
     * 
     * @return the single instance of the SingleObject class
     */
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * Displays a greeting message and returns a string.
     * This method prints a message to the console and returns a string 
     * containing the name "Bolatito".
     * 
     * @return a string containing the name "Bolatito"
     */
    public String showMessage() {
        System.out.println("Hello World!");
        String str = "Bolatito";
        return str;
    }
}
