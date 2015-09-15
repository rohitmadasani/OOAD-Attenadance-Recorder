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
 * The below class is a part of Application Layer or domain layer which contains 
 * logic for course processing(logic for adding a course record,deleting a course 
 * record etc).
 * @author rohitreddy
 *******************************************************************************/
public class CourseDetailsApplicationLogic {
    
    CourseParameters[] carray;
    int totalCountOfCourses;
    CourseDataStorageFile cf;
         
    public void CourseProcessing(){}    
    
    /***************************************************************************
     *Adds the course details to the file.
     **************************************************************************/
    public String addCourse(CourseParameters course){
        //Local object declaration.
        carray = new CourseParameters[100];    
        //Get the list of existing students from the database.  
        cf = new CourseDataStorageFile();
        carray = cf.getCourseList();
        totalCountOfCourses = cf.totalCourses();
        //check if the course with the courseID is already recorded or not.
        int i;
        for (i=0; i<totalCountOfCourses; i++){
            //Check if the CourseParameters ID already exists in the database. 
            if(carray[i].courseNumber.equals(course.courseNumber)){
               
                return "Course with ID '" +course.courseNumber+ "' already exists.";
            }
        }
        
        //If there  exists no course with the specified courseID then add the course. 
        carray[totalCountOfCourses] = new CourseParameters();
        carray[totalCountOfCourses].courseNumber      = course.courseNumber;
        carray[totalCountOfCourses].courseName    = course.courseName;
        carray[totalCountOfCourses].creditHours   = course.creditHours;   
        carray[totalCountOfCourses].instructorName = course.instructorName;   
        
        totalCountOfCourses++;
        
        saveCourse(carray);
        
       
        return "Course added.";        
    }
    
    public void saveCourse(CourseParameters[] courseArray){
        cf.saveCourseDetails(courseArray, totalCountOfCourses);
    }
    
    
    
    /***************************************************************************
     * Deletes a course record from the file.
     **************************************************************************/
    public String deleteCourse(Controller con){
        try
        {
        carray = new CourseParameters[100]; 
          
        cf = new CourseDataStorageFile();
        carray = cf.getCourseList();
        totalCountOfCourses = cf.totalCourses();
        String str;
        str = "Record with Course ID " +con.courseID+ " deleted.";
        
         BufferedWriter writer = null;
            BufferedReader reader=null;
            FileNames fileName = new FileNames();
            String path1 = fileName.getCourseFileName();
            String path2 = fileName.getTempFileName();
            File file1 = new File(path1);
            File file2 = new File(path2);
            String line,deleteRecordWithCourseID;
            deleteRecordWithCourseID=con.courseID;
             writer = new BufferedWriter(new FileWriter(file2));
           
          reader = new BufferedReader(new FileReader(path1));
           
            while ((line = reader.readLine()) != null) {
                String cut = line.trim();
                if (!cut.startsWith(deleteRecordWithCourseID)) {
                    writer.write(line);
                    writer.write("\r\n");
                }
            }
            writer.close();
            reader.close();
            file1.delete();
            file2.renameTo(file1);
            
      
            
        } catch (IOException ex) {
            Logger.getLogger(StudentDetailsApplicationLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  "Record with Course ID " +con.courseID+ " deleted.";
    }
    
    /***************************************************************************
     * Modifies the course record.
     **************************************************************************/
    public String modifyCourse(CourseParameters sp){
        
        
        try
        {
        carray = new CourseParameters[100]; 
         
        cf = new CourseDataStorageFile();
        carray = cf.getCourseList();
        totalCountOfCourses = cf.totalCourses();
        String str;
                 
            BufferedWriter writer = null;
            BufferedReader reader=null;
            FileNames fileName = new FileNames();
            String path1 = fileName.getStudFileName();
            String path2 = fileName.getTempFileName();
            File file1 = new File(path1);
            File file2 = new File(path2);
            String line,recordToModify;
            recordToModify=sp.courseNumber;
            writer = new BufferedWriter(new FileWriter(file2));
           
          reader = new BufferedReader(new FileReader(path1));
           
            while ((line = reader.readLine()) != null) {
                String cut = line.trim();
                if (!cut.startsWith(recordToModify)) {
                    writer.write(line);
                    writer.write("\r\n");
                } 
            }
            
            writer.write(sp.courseNumber+"\t"+sp.courseName+"\t"+sp.creditHours+"\t");            
            writer.close();
            reader.close();
            file1.delete();
            file2.renameTo(file1); 
            
        } catch (IOException ex) {
            Logger.getLogger(StudentDetailsApplicationLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return "Record with CourseID " + sp.courseNumber+ " is modified.";
    }
    
    
}
