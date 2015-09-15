/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.awt.*;

/*******************************************************************************
 * The below class is the main class for the attendance tracking system which is 
 * creator class and holds all other components. 
 * It follows Creator design Pattern.
 * @author rohitreddy
 *******************************************************************************/
public class AttendanceTrackingSystem {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         HomePage home = new HomePage();
         home.setVisible(true);
         Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
         home.setLocation(d.width/2-home.getSize().width/2, d.height/2-home.getSize().height/2);
     
    }
    
    
}
