/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.awt.*;

/*******************************************************************************
 * The below class is Student Interface for the attendance tracking system which
 * is a GUI and holds all other components for student processing (add student,
 * delete student etc).It is a part of GUI layer in Logical architecture.
 * Design Pattern:Creator
 * @author rohitreddy
 *******************************************************************************/
public class StudentUserInterface extends javax.swing.JFrame {
    
    //Create object to handle the add delete modify function for the student. 
       StudentParameters sp=new StudentParameters();
       Controller con=new Controller();
       StudentDetailsApplicationLogic handler = new StudentDetailsApplicationLogic();
       String modifyStatusMsg= new String();
       String deleteMsg=new String();
       String addStatusMsg=new String();
      
  
    public StudentUserInterface() {
        handler = new StudentDetailsApplicationLogic();
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        JScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fName = new javax.swing.JTextField();
        mName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        netID = new javax.swing.JTextField();
        statusMessageLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        course1 = new javax.swing.JTextField();
        addStudent = new javax.swing.JButton();
        deleteStudent = new javax.swing.JButton();
        modifyStudent = new javax.swing.JButton();
        deletestudentfromcourse = new javax.swing.JButton();
        homePage = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 205));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        fName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fNameFocusGained(evt);
            }
        });

        mName.setBackground(new java.awt.Color(255, 255, 102));
        mName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNameActionPerformed(evt);
            }
        });
        mName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mNameFocusGained(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("*First Name");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("*Last Name");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText(" Middle Name");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lNameFocusGained(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("*Net ID");
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        netID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                netIDFocusGained(evt);
            }
        });

        jLabel5.setText("* courseID");

        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(course1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(netID, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(455, 455, 455))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(statusMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(course1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        addStudent.setText("Add");
        addStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentActionPerformed(evt);
            }
        });

        deleteStudent.setText("Delete");
        deleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStudentActionPerformed(evt);
            }
        });

        modifyStudent.setText("Modify");
        modifyStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyStudentActionPerformed(evt);
            }
        });

        deletestudentfromcourse.setText("Delete Student from a particular course");
        deletestudentfromcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestudentfromcourseActionPerformed(evt);
            }
        });

        homePage.setText("Back to Home Page");
        homePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePageMouseClicked(evt);
            }
        });
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Student Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(addStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(deleteStudent)
                        .addGap(64, 64, 64)
                        .addComponent(modifyStudent)
                        .addGap(76, 76, 76)
                        .addComponent(deletestudentfromcourse))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(586, 586, 586)
                        .addComponent(homePage)))
                .addContainerGap(856, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homePage)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudent)
                    .addComponent(deleteStudent)
                    .addComponent(modifyStudent)
                    .addComponent(deletestudentfromcourse))
                .addGap(0, 222, Short.MAX_VALUE))
        );

        JScrollPane1.setViewportView(jPanel1);

        getContentPane().add(JScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNameActionPerformed

    private void homePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePageMouseClicked
      
        HomePage home = new HomePage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homePageMouseClicked
    
    
    
/*******************************************************************************
 *The below method is used to refresh the text fields.
 *******************************************************************************/
    
     public void refreshTextFieldsToDefault(){
        fName.setText("");
        mName.setText("");
        lName.setText("");
        netID.setText("");
        course1.setText("");
      
       }
     /**************************************************************************
     * The below method checks if all the mandatory fields required to add 
     * student record are filled or not.  
     * set the background of the field to RED Color.
     **************************************************************************/
    public int checkIfTextFieldsAreEmpty(){
 int statusMessage=0;
        //size of textfield is 100
        if(netID.getText().equals("")){
            netID.setBackground(Color.red);
            statusMessage =  99;
        }
        
        if(fName.getText().equals("")){
            fName.setBackground(Color.red);
            statusMessage = 99;
        }
          if(lName.getText().equals("")){
            lName.setBackground(Color.red);
            statusMessage = 99;
        }
        
        
        if(course1.getText().equals("")){
            course1.setBackground(Color.red);
            statusMessage = 99;
        }
         
         
        
        if (statusMessage == 99){
        statusMessageLabel.setText("Mandatory Fileds Required.");
        return statusMessage;
        }
        return 1;
    }
    
  /*****************************************************************************
* When the ADD  button is pressed:-
*It is checked whether a student with the entered  Net ID is already enrolled for 
* the selected course.If the student is not enrolled then the record will be added.
 *******************************************************************************/
    private void addStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentActionPerformed
        
        //Check if all the fields are filled. 
    
       if (checkIfTextFieldsAreEmpty() == 1){
        //Set the values using Getter Setter method. 
        con.setNetID(netID.getText());
        con.setfName(fName.getText());
        con.setLName(lName.getText());
        con.setMName(mName.getText());
        con.setCourse1(course1.getText());
       
        
         addStatusMsg = handler.addStudent(con);
        statusMessageLabel.setText(addStatusMsg);
     
        //Refresh all fields. 
        refreshTextFieldsToDefault();
        }
    }//GEN-LAST:event_addStudentActionPerformed
    
    
    
  
    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
 
        HomePage home = new HomePage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homePageActionPerformed
    
     
       
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Set window to the center of the screen. 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        //Fill the table.
     
        
    }//GEN-LAST:event_formWindowActivated
    
    
     /**************************************************************************
     * The below method checks if all the mandatory fields required to delete a 
     * student record are filled or not.  
     * set the background of the field to RED Color.
     
     **************************************************************************/
    public int checkIfNetIdisEmptyForDelete(){
 int statusMessage=0;
        //size of textfield is 100
        if(netID.getText().equals("")){
            netID.setBackground(Color.red);
            statusMessage =  99;
        }
        
        if(fName.getText().equals("")){
            fName.setBackground(Color.red);
            statusMessage = 99;
        }
        
        
        if(lName.getText().equals("")){
            lName.setBackground(Color.red);
            statusMessage = 99;
        }
        
        
        if (statusMessage == 99){
        statusMessageLabel.setText("Net id and other mandatory fields are required to delete a student.");
        return statusMessage;
        }
        return 1;
    }
    
    /***************************************************************************
     * Deletes the student entry which is being entered.  
     **************************************************************************/
    private void deleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStudentActionPerformed
      
        
        
      if ( checkIfNetIdisEmptyForDelete() == 1)  {
        con.netID=netID.getText();
        con.fName=fName.getText();
        con.lName=lName.getText();
        con.mName=mName.getText();
        con.course1=course1.getText();
     
        deleteMsg = handler.deleteStudent(con);
        statusMessageLabel.setText(deleteMsg);
        //Refresh all fields. 
        refreshTextFieldsToDefault();
        }
    }//GEN-LAST:event_deleteStudentActionPerformed
    
     /**************************************************************************
     * The below method checks if all the mandatory fields required to modify 
     * student record are filled or not.  
     * set the background of the field to RED Color.
     * Optional fields are in yellow.
     **************************************************************************/
    public int checkIfTextFieldsAreEmptyForModify(){
 int statusMessage=0;
        //size of textfield is 100
        if(netID.getText().equals("")){
            netID.setBackground(Color.red);
            statusMessage =  99;
        }
        
        if(fName.getText().equals("")){
            fName.setBackground(Color.red);
            statusMessage = 99;
        }
        
        
        if(lName.getText().equals("")){
            lName.setBackground(Color.red);
            statusMessage = 99;
        }
        
        if (statusMessage == 99){
        statusMessageLabel.setText("Mandatory Fileds Required to modfiy a student record.");
        return statusMessage;
        }
        return 1;
    }
     
    
    /***************************************************************************
     * Modify the record which is entered. 
     **************************************************************************/
    private void modifyStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyStudentActionPerformed
          if (checkIfTextFieldsAreEmptyForModify() == 1){
        sp.netID  = netID.getText();
        sp.fName  = fName.getText();
        sp.mName = mName.getText();
        sp.lName   = lName.getText();
        sp.course1   = course1.getText();
        sp.course2   = lName.getText();
        sp.course3   = lName.getText();
        modifyStatusMsg = handler.modifyStudent(sp);
        statusMessageLabel.setText(modifyStatusMsg);
        //Refresh all fields. 
        refreshTextFieldsToDefault();
          }
    }//GEN-LAST:event_modifyStudentActionPerformed

    private void netIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_netIDFocusGained
        netID.setBackground(Color.white);
    }//GEN-LAST:event_netIDFocusGained

    private void fNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusGained
        fName.setBackground(Color.white);
    }//GEN-LAST:event_fNameFocusGained

    private void mNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mNameFocusGained
        mName.setBackground(Color.white);
    }//GEN-LAST:event_mNameFocusGained

    private void lNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFocusGained
        lName.setBackground(Color.white);
    }//GEN-LAST:event_lNameFocusGained

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course1ActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameActionPerformed

    private void deletestudentfromcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestudentfromcourseActionPerformed
        // TODO add your handling code here:
        
        if ( checkIfNetIdisEmptyForDelete() == 1)  {
        con.netID=netID.getText();
        con.fName=fName.getText();
        con.lName=lName.getText();
        con.mName=mName.getText();
        con.course1=course1.getText();
     
        deleteMsg = handler.deleteStudentFromCourse(con);
        statusMessageLabel.setText(deleteMsg);
        //Refresh all fields. 
        refreshTextFieldsToDefault();
        }
        
        
        
        
        
    }//GEN-LAST:event_deletestudentfromcourseActionPerformed
    
    
    /***************************************************************************
     * @param args the command line arguments
     **************************************************************************/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JButton addStudent;
    private javax.swing.JTextField course1;
    private javax.swing.JButton deleteStudent;
    private javax.swing.JButton deletestudentfromcourse;
    private javax.swing.JTextField fName;
    private javax.swing.JButton homePage;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField mName;
    private javax.swing.JButton modifyStudent;
    private javax.swing.JTextField netID;
    private javax.swing.JLabel statusMessageLabel;
    // End of variables declaration//GEN-END:variables
}
