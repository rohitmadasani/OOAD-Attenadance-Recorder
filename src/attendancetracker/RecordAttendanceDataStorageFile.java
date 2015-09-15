/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*******************************************************************************
 * The below class is a part of Technical Service Layer which contains 
 * logic for storing recorded attendance details into files.
 * @author rohitreddy
 *******************************************************************************/
public class RecordAttendanceDataStorageFile {
 
    public void saveAttendance(String filePath,int numOfStudents,String[][] studAttendance){
        BufferedWriter writer = null;
        String pathTemp = "temp.txt";
        File inputFile = new File(filePath);
        File tempFile = new File(pathTemp);
        
                
        try {
            //Get the File name where Student files are saved.
            
            
            if (!inputFile.exists()) {
                inputFile.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(tempFile));
            String studRecord;
            for(int i=0; i<numOfStudents;i++){
                studRecord = studAttendance[i][0] + "\t" +studAttendance[i][1] 
                        +"\t" +studAttendance[i][2] + "\t"  +studAttendance[i][3]
                        +"\t" + studAttendance[i][4];
                writer.write(studRecord);
                writer.write("\r\n");
            }
            writer.close();
            inputFile.delete();
            tempFile.renameTo(inputFile);
            
             } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }
}
