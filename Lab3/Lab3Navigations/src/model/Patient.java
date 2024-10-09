/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author akiny
 */
public class Patient {
    private String firstName;
    private String lastName; 
    private String Age;
    private String Email;
    private String gender;
    private String patientType;
    private Date dateChooser;

    public Date getDateChooser() {
        return dateChooser;
    }

    public void setDateChooser(Date dateChooser) {
        this.dateChooser = dateChooser;
    }

    public String getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(String messageBox) {
        this.messageBox = messageBox;
    }
    private String messageBox;
    
    private ImageIcon profilePicture;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public ImageIcon getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ImageIcon profilePicture) {
        this.profilePicture = profilePicture;
    }
    
   
    }
    
    

 
