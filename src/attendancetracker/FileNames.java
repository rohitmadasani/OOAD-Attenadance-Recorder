/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*******************************************************************************
 *Class specifying location of files.
 * @author rohitreddy
 ******************************************************************************/
public class FileNames {
     public String studentFilePath = "Student.txt";
     public String courseFilePath = "Course.txt";
     public String temporaryFilePath = "temp.txt";
     
     public void FileNames(){
        FileOutputStream fstream = null;
        File f2 = new File(studentFilePath);
        if (!f2.exists()) {
            try {
                f2.createNewFile();
                fstream = new FileOutputStream(f2, false);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileNames.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileNames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        f2 = new File(courseFilePath);
        if (!f2.exists()) {
            try {
                f2.createNewFile();
                fstream = new FileOutputStream(f2, false);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileNames.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileNames.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
     }
     
     /**************************************************************************
      * method returns student file path
      * @return 
      *************************************************************************/
     public String getStudFileName(){
        return this.studentFilePath;        
    }
     
     
     /**************************************************************************
      * method returns temp file path
      * @return 
      *************************************************************************/
      public String getTempFileName(){
        return this.temporaryFilePath;        
    }
      
     /**************************************************************************
      * returns course file path 
      * @return 
      *************************************************************************/
     public String getCourseFileName(){
        return this.courseFilePath;        
    }
}
