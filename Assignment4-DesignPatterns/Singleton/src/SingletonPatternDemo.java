/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The SingletonPatternDemo class demonstrates the use of the Singleton design pattern.
 * It showcases how to access the single instance of the SingleObject class and
 * call its method to display a message.
 * 
 * This class demonstrates the correct usage of the Singleton pattern by ensuring
 * that only one instance of the SingleObject class is created.
 * 
 * @author akiny
 * @version 1.0
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // show the message
        object.showMessage();
    }
}
