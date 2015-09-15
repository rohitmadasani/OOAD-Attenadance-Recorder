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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*******************************************************************************
 * The below class is a part of Technical Service Layer which contains 
 * logic for storing the course data into files (logic for storing course record 
 * into a file,logic for storing updated course record(delete,modify).
 * @author rohitreddy
 *******************************************************************************/
public class CourseDataStorageFile {
    
    //Counter for the count of student.
    int courseNum;
            
    /***************************************************************************
     * Get all the course records from the file.
     **************************************************************************/
    public CourseParameters[] getCourseList(){
        CourseParameters[] courseArray;
        courseArray = new CourseParameters[100];
        
        
        try {
            
            FileNames fileName = new FileNames();
            String filePath = fileName.getCourseFileName();
     
            BufferedReader bReader;
            bReader = new BufferedReader(new FileReader(filePath));
            String line;
            String courseRecLine[];
            courseRecLine = new String[5];
            courseNum = 0; 
            while ((line = bReader.readLine()) != null) {
              courseRecLine = line.split("\t");
              CourseParameters tempCourse = new CourseParameters();
              tempCourse.courseNumber  = courseRecLine[0];
              tempCourse.courseName    = courseRecLine[1];
              tempCourse.creditHours   = courseRecLine[2];   
              courseArray[courseNum]  = tempCourse;
              courseNum++;
              tempCourse = null;
            }
            bReader.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(StudentDataStorageFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return courseArray;
    }
    
    /***************************************************************************
     * Return the total Number of course records in the file.
     **************************************************************************/
    public int totalCourses(){
        return courseNum;
    }
    
     /***************************************************************************
     * Method saves course details.
    **************************************************************************/
    public void saveCourseDetails(CourseParameters[] courseArray, int numOfCourses){
        BufferedWriter writer;
        FileNames fileName = new FileNames();
        String filePath = fileName.getCourseFileName();
        String pathTemp = fileName.getTempFileName();
        File inputFile = new File(filePath);
        File tempFile = new File(pathTemp);
        
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
            String courseRecord;
            for(int i=0; i<numOfCourses;i++){
                CourseParameters tempCourse;
                tempCourse = new CourseParameters();
                courseRecord = null;
                tempCourse = courseArray[i];
                courseRecord = tempCourse.courseNumber + "\t" +tempCourse.courseName + "\t" +
                              tempCourse.creditHours + "\t" +
                            "\t"  ;
                       
                writer.write(courseRecord);
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
