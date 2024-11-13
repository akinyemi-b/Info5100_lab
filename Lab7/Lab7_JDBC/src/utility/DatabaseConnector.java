/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.sql.*;
import java.util.ArrayList;
import model.Patient;

/**
 *
 * @author akiny
 */
public class DatabaseConnector {
    // data members
 private static final String DB_URL = "jdbc:mysql://localhost:3306/medicaldb?USESSL=false";
 private static final String DB_USERNAME = "root";
 private static final String DB_PASSWORD = "my-secret-pw";
 // CRUD Operations on Database
// C - Create: Inserting data into the database
public static void addPatient(Patient p1) throws SQLException{
String query = "INSERT INTO patient(firstName,lastName,Age,Email,gender,patientType) VALUES(?, ?, ?,?,?,?) ";

try{
// Create a connection
Connection conn =  DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
PreparedStatement stmt = conn.prepareStatement(query);
stmt.setString(1, p1.getFirstName());
stmt.setString(2, p1.getLastName());
stmt.setInt(3, p1.getAge());
stmt.setString(4, p1.getEmail());
stmt.setString(5, p1.getGender());
stmt.setString(6, p1.getPatientType());
// stmt.setInt(5, p1.getAge());
int rows = stmt.executeUpdate();
System.out.println("Rows inserted: "+rows);
// After this query will look like: 
// Close the connection
conn.close();
} catch (SQLException sqle){
System.out.println("SQL Exception Occured.");
System.out.println(sqle);
} catch (Exception ex){
System.out.println(ex);
}
}
// R - Read: Getting all the values from the database
public static ArrayList<Patient> getPatients(){
ArrayList <Patient> patients = new ArrayList();
String query = "SELECT * FROM patient";
try{
Connection conn = (Connection) DriverManager.getConnection(DB_URL, DB_USERNAME,
DB_PASSWORD);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query);
while(rs.next()){
Patient p1 = new Patient();
p1.setId(rs.getInt("id"));
p1.setFirstName(rs.getString("firstName"));
p1.setLastName(rs.getString("lastName"));
p1.setAge(rs.getInt("Age"));
p1.setEmail(rs.getString("Email"));
p1.setGender(rs.getString("gender"));
p1.setPatientType(rs.getString("patientType"));
patients.add(p1);
}
rs.close();
conn.close();
} catch (SQLException sqle){
System.out.println("SQL Exception Occured.");
System.out.println(sqle);
} catch (Exception ex){
System.out.println(ex);
}
return patients;
}
public static void getPatientName(){
String query = "SELECT first_name, last_name FROM patient";
}
// U - Update: Changing a value in the database
public static void updatePatient(Patient oldPatient, Patient updatedPatient){
String query = "UPDATE patient SET firstName = ?,lastName =?, gender = ?,Age=?, Email=?, patientType =? WHERE id = ? ";
// Update the query
try{
Connection conn = (Connection) DriverManager.getConnection(DB_URL, DB_USERNAME,
DB_PASSWORD);
PreparedStatement stmt = conn.prepareStatement(query);
stmt.setString(1, updatedPatient.getFirstName());
stmt.setString(2, updatedPatient.getLastName());
stmt.setString(3, updatedPatient.getGender());
stmt.setInt(4,updatedPatient.getAge() );
stmt.setString(5, updatedPatient.getEmail());

stmt.setString(6, updatedPatient.getPatientType());


stmt.setInt(7, oldPatient.getId());
int rows = stmt.executeUpdate();
System.out.println("Rows updated: "+rows);
conn.close();
} catch (SQLException sqle){
System.out.println("SQL Exception Occured.");
System.out.println(sqle);
} catch (Exception ex){
System.out.println(ex);
}
}
// D - Delete
public static void deletePatient(Patient p1){
String query = "DELETE FROM patient WHERE id = ? ";
try {
Connection conn = (Connection) DriverManager.getConnection(DB_URL, DB_USERNAME,
DB_PASSWORD);
PreparedStatement stmt = conn.prepareStatement(query);
stmt.setInt(1, p1.getId());
int rows = stmt.executeUpdate();
System.out.println("Rows deleted: "+rows);
conn.close();
} catch (SQLException sqle){
System.out.println("SQL Exception Occured.");
System.out.println(sqle);
} catch (Exception ex){
System.out.println(ex);
}
}
}