/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author akiny
 */
public class ViewJPanel1 extends javax.swing.JPanel {
       ImageIcon profilePicture;
       Patient p1;
    /**
     * Creates new form FormJPanel
     */
    public ViewJPanel1() {
        initComponents();
        disableALL();
    }

    public ViewJPanel1(Patient p1){
        this.p1 = p1;
        initComponents();
         populateData();
         disableALL();
    }/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imageJButton1 = new javax.swing.JButton();
        TextField2 = new javax.swing.JTextField();
        imgJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textFieldName = new javax.swing.JTextField();
        jButtonSubmit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientJLabel = new javax.swing.JLabel();
        patientTypeJComboBox = new javax.swing.JComboBox<>();
        imageJLabel8 = new javax.swing.JLabel();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        TextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        messagebox = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("Last Name");

        imageJButton1.setText("Select image File");
        imageJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageJButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Age");

        jLabel6.setText("Email");

        textFieldName.setEditable(false);

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name");

        jLabel4.setText("Gender");

        patientJLabel.setText("Patient Type");

        patientTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appointment", "Walk-in" }));
        patientTypeJComboBox.setSelectedIndex(-1);

        imageJLabel8.setText("Select Image");

        buttonGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");

        buttonGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");

        buttonGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Prefer Not To Say");

        jLabel7.setText("Message");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patientJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jRadioButtonOthers)
                                .addComponent(jRadioButtonMale, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonFemale, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(textFieldName)
                            .addComponent(patientTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextField4))))
                .addGap(116, 116, 116))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(messagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageJLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(imageJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jButtonSubmit)
                    .addGap(192, 198, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButtonMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonFemale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonOthers)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(patientTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(patientJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageJLabel8)
                    .addComponent(imageJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(messagebox, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 435, Short.MAX_VALUE)
                    .addComponent(jButtonSubmit)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageJButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80,
                    Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    this.imgJLabel.setIcon(new ImageIcon(edited_image));
                    this.profilePicture =new ImageIcon(edited_image);

                    //            imgLabel.setText(file.getSelectedFile().getAbsolutePath());
                    //           this.userInfo.setPic(new ImageIcon(edited_image));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Please upload image correctly", "Error - Incorrect image", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_imageJButton1ActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
    try{
            String firstName = this.textFieldName.getText();
            String lastName = this.TextField2.getText();
            String Age = this.TextField3.getText();
            String Email = this.TextField4.getText();
            String gender = this.buttonGroupGender.getSelection().getActionCommand();
            String patientType =this.patientTypeJComboBox.getSelectedItem().toString();
            String messagebox = this.messagebox.getText();
            String displayMessage;
            if(firstName.equals("")){
                displayMessage = "No First Name Entered";
            } else if (lastName.equals("")) {
                displayMessage = "No Last Name Entered";
            } else if (Age.equals("")) {
                displayMessage = "No Age Entered";
            } else{
                // Ensure the age is an integer
                try {
                    int ageInt = Integer.parseInt(Age);
                    displayMessage ="SUCCESSFULLY SAVED First Name: " + firstName +
                    " Last Name: " + lastName +
                    " Gender: " + gender +
                    " Age: " + Age +
                    " Email: " + Email;
        } catch (NumberFormatException nfe) {
                    displayMessage = "Invalid Age: Age must be a valid integer.";
                }
         }
            System.out.println(this.textFieldName.getText());
            System.out.println(this.buttonGroupGender.getSelection().getActionCommand());
            JOptionPane.showMessageDialog(this, displayMessage);
            JOptionPane.showMessageDialog(this, displayMessage,"Success",HEIGHT,this.profilePicture);
         }catch(NullPointerException ne){
            String errorMessage ="You must enter values in Gender.";
            JOptionPane.showMessageDialog(this, errorMessage);
        } catch(Exception e){
            System.out.println("Exception has occurred.");
            System.out.println(e);
    }//GEN-LAST:event_jButtonSubmitActionPerformed
        }
      
      public void populateData(){
          this.textFieldName.setText(p1.getFirstName());
          this.TextField2.setText(p1.getLastName());
          String gender =p1.getGender();
          if(gender.equals("Male")){
             this.buttonGroupGender.setSelected( this.jRadioButtonMale.getModel(), true);
         }else if(gender.equals("Female")){
              this.buttonGroupGender.setSelected( this.jRadioButtonFemale.getModel(), true);
         }else {
             this.buttonGroupGender.setSelected( this.jRadioButtonOthers.getModel(), true);
         }
          this.patientTypeJComboBox.setSelectedItem(p1.getPatientType());
          this.imgJLabel.setIcon(p1.getProfilePicture());
          this.TextField3.setText(p1.getAge());
          this.TextField4.setText(p1.getEmail());
           this.messagebox.setText(p1.getMessageBox());
          
          this.jRadioButtonFemale.setEnabled(false);
          this.TextField2.setEnabled(false);
          this.TextField3.setEnabled(false);
          this.TextField4.setEnabled(false);
          this.jRadioButtonMale.setEnabled(false);
          this.jRadioButtonOthers.setEnabled(false);
          this.textFieldName.setEnabled(false);
          this.messagebox.setEnabled(false);
   }
      
      public void disableALL(){
          this.patientTypeJComboBox.setSelectedItem(p1.getPatientType());
          this.imgJLabel.setIcon(p1.getProfilePicture());
          
          this.jRadioButtonFemale.setEnabled(false);
          this.TextField2.setEnabled(false);
          this.TextField3.setEnabled(false);
          this.TextField4.setEnabled(false);
          this.jRadioButtonMale.setEnabled(false);
          this.jRadioButtonOthers.setEnabled(false);
          this.textFieldName.setEnabled(false);
          this.patientTypeJComboBox.setEnabled(false);
          this.messagebox.setEnabled(false);
          
          this.jButtonSubmit.setVisible(false);
      }
    // Variables declaration - do not modify                           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField2;
    private javax.swing.JTextField TextField3;
    private javax.swing.JTextField TextField4;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.JButton imageJButton1;
    private javax.swing.JLabel imageJLabel8;
    private javax.swing.JLabel imgJLabel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JTextField messagebox;
    private javax.swing.JLabel patientJLabel;
    private javax.swing.JComboBox<String> patientTypeJComboBox;
    private javax.swing.JTextField textFieldName;
    // End of variables declaration//GEN-END:variables
}
