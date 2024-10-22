package com.mycompany.mavenproject;

import java.io.IOException;
import java.util.Optional;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    TextField nameTextField;
    @FXML
    TextField ageTextField;
    @FXML
    TextField emailTextField;
  public void submit(ActionEvent event){
      System.out.println("Submitted");
      
    String name = nameTextField.getText();
    String age = ageTextField.getText();
    String email = emailTextField.getText();
    
 
    if(name.equals("")){
               Alert alert =new Alert(AlertType.INFORMATION);
               alert.setTitle( "Error");
               alert.setHeaderText("Kindly Input");
               alert.setContentText("Name is not provided");
               alert.showAndWait();
            } else if (age.equals("")) 
            { 
              Alert alert =new Alert(AlertType.INFORMATION);
               alert.setTitle( "Error");
               alert.setHeaderText("Kindly Input");
               alert.setContentText("Age is not provided");
               alert.showAndWait();
               } else if (email.equals("")) 
            { 
              Alert alert =new Alert(AlertType.INFORMATION);
               alert.setTitle( "Error");
               alert.setHeaderText("Kindly Input");
               alert.setContentText("Email is not provided");
               alert.showAndWait();
               
                  } else {
        // Adding validation for integer-only input in age field
        try {
            int parsedAge = Integer.parseInt(age);  // Attempt to parse age as an integer

            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Submitted");
            alert.setHeaderText("Thank you");
            alert.setContentText("Submitted Details: Name: " + name + " Age: " + parsedAge + " Email: " + email);
            alert.showAndWait();  // Display the alert

        } catch (NumberFormatException e) {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Invalid Age");
            alert.setHeaderText(null);
            alert.setContentText("Please put in  a valid age.");
            alert.showAndWait();
    }
}
  }
}
