/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancetracker;

import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*******************************************************************************
 * The below class is the Home Page for the attendance tracking system which is 
 * a GUI and holds all other components.It is a part of GUI layer in Logical 
 * architecture.It follows Information Expert design Pattern.
 * @author rohitreddy
 *******************************************************************************/
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public HomePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        enrollstudent = new javax.swing.JButton();
        coursebook = new javax.swing.JButton();
        markattendance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        historyButton = new javax.swing.JButton();
        histogramButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        enrollstudent.setText("Student Enrollement");
        enrollstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enrollstudentMouseClicked(evt);
            }
        });
        enrollstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enrollstudentActionPerformed(evt);
            }
        });

        coursebook.setText("Course Book");
        coursebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coursebookMouseClicked(evt);
            }
        });
        coursebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursebookActionPerformed(evt);
            }
        });

        markattendance.setText("Mark Attendance ");
        markattendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markattendanceMouseClicked(evt);
            }
        });
        markattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markattendanceActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Attendance Tracking System");

        historyButton.setText("Attendance History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        histogramButton.setText("Histogram");
        histogramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                histogramButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(enrollstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coursebook, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(histogramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enrollstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursebook, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markattendance, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(histogramButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(261, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//the below action is performed when mark attendance button is pressed.
    private void markattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markattendanceActionPerformed
        RecordAttendanceUserInterface att = new RecordAttendanceUserInterface();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        att.setLocation(d.width/2-att.getSize().width/2, d.height/2-att.getSize().height/2);
        att.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_markattendanceActionPerformed

    private void markattendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markattendanceMouseClicked
           
           
    }//GEN-LAST:event_markattendanceMouseClicked

    private void coursebookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coursebookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_coursebookMouseClicked

    private void enrollstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enrollstudentMouseClicked
        
    }//GEN-LAST:event_enrollstudentMouseClicked
//the below action is performed when enroll student button is pressed.
    private void enrollstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enrollstudentActionPerformed
       StudentUserInterface stu = new StudentUserInterface();
       Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
       stu.setLocation(d.width/2-stu.getSize().width/2, d.height/2-stu.getSize().height/2);
       stu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_enrollstudentActionPerformed
//the below action is performed when course book button is pressed.
    private void coursebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursebookActionPerformed
       CourseUserInterface cou = new CourseUserInterface();
       Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
       cou.setLocation(d.width/2-cou.getSize().width/2, d.height/2-cou.getSize().height/2);
       cou.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_coursebookActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(d.width/2-this.getSize().width/2, d.height/2-this.getSize().height/2);
    }//GEN-LAST:event_formWindowActivated
//the below action is performed when  Attendance History button is pressed
    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed

        

         AttendanceHistoryUserInterface ui;
        try {
            ui = new AttendanceHistoryUserInterface();
              ui.setVisible(true);
          this.setVisible(false);
          Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
           ui.setLocation(d.width/2-ui.getSize().width/2, d.height/2-ui.getSize().height/2);

        } catch (IOException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

 
        
    }//GEN-LAST:event_historyButtonActionPerformed
//the below action is performed when Histogram button is pressed.
    private void histogramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_histogramButtonActionPerformed

        
HistogramUserInterface histogram=new HistogramUserInterface();
histogram.setVisible(true);
this.setVisible(false);
       Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
       histogram.setLocation(d.width/2-histogram.getSize().width/2, d.height/2-histogram.getSize().height/2);



// TODO add your handling code here:
    }//GEN-LAST:event_histogramButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coursebook;
    private javax.swing.JButton enrollstudent;
    private javax.swing.JButton histogramButton;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton markattendance;
    // End of variables declaration//GEN-END:variables
}
