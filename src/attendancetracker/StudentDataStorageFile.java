/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/*******************************************************************************
 * The below class is a part of Technical Service Layer which contains 
 * logic for storing the data into files (logic for storing student record into 
 * a file,logic for storing updated student record(delete,modify).
 * @author rohitreddy
 *******************************************************************************/
public class StudentDataStorageFile {
    
    // counts of student.
    int count;
            
    /***************************************************************************
     * Get all the student records from the file and return it to the 
     * domain Layer for  processing.
     **************************************************************************/
    public StudentParameters[] getStudentList(){
       
        StudentParameters[] stu;
        stu = new StudentParameters[100];
        
        
        try {
            
            FileNames file1 = new FileNames();
            String path = file1.getStudFileName();
            
            //opening file to read student details
            BufferedReader bReader;
            bReader = new BufferedReader(new FileReader(path));
            String line;
            String[] column= new String[8];
           
            count = 0;  
            while ((line = bReader.readLine()) != null) {
              column = line.split("\t");
              StudentParameters temp = new StudentParameters();
              temp.netID  = column[0];
              temp.fName  = column[1];
              temp.mName = column[2];
              temp.lName  = column[3];
              temp.course1  = column[4];  
              stu[count]  = temp;
              count++;
              temp = null;
            }
            bReader.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stu;
    }
    
    /***************************************************************************
     *It returns total number of student records from the file.
     **************************************************************************/
    public int totalStudents(){
        return count;
    }
    
    /***************************************************************************
     * Storing data in a array.
    **************************************************************************/
    public void save(StudentParameters[] studArray, int numOfStudents){
        BufferedWriter writer = null;
        FileNames fileName = new FileNames();
        String path1 = fileName.getStudFileName();
        String path2 = fileName.getTempFileName();
        File file1 = new File(path1);
        File file2 = new File(path2);
        
        try {
           
            
            writer = new BufferedWriter(new FileWriter(file2));
            String studentdata;
            for(int i=0; i<numOfStudents;i++){
                StudentParameters temp = new StudentParameters();
                studentdata = null;
                temp = studArray[i];
                studentdata = temp.netID + "\t" + temp.fName +"\t" +
                             temp.mName +"\t" + temp.lName+"\t"+temp.course1;
                writer.write(studentdata);
                writer.write("\r\n");
            }
            writer.close();
            file1.delete();
            file2.renameTo(file1);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }
  
    
    
    
    
}
