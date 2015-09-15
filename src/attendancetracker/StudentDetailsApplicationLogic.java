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
 * logic for student processing(logic for adding student record,deleting student 
 * record etc).
 * @author rohitreddy
 *******************************************************************************/
public class StudentDetailsApplicationLogic {
    
    
    StudentParameters[] studentDetails= new StudentParameters[100];   ;
    int studentCount;
    StudentDataStorageFile storage;
    //records student data.     
    public void recordData(StudentParameters[] studentDetails){
        storage.save(studentDetails, studentCount);
    }
    
    
    /***************************************************************************
     * The below method adds student record if there exist no such student record
     * enrolled for the same course.
     **************************************************************************/
    public String addStudent(Controller con){
        String netID, fName,lName,mName,course1,course2,course3;
        //Get the details of the current student
         netID  = con.getNetID();
         fName  = con.getfName();
         lName   = con.getLName();
         mName = con.getMName();
         course1=con.getCourse1();

   
       
       // studentDetails = new StudentParameters[100];    
        //Get the list of existing students from the database.  
        storage = new StudentDataStorageFile();
        studentDetails = storage.getStudentList();
        studentCount = storage.totalStudents();
        
        // Check if the student is already enrolled for the course.
        
        for (int i=0; i<storage.totalStudents(); i++){
            //Check if the student  NetID already exists or already enrolled for the specified course. 
            if((studentDetails[i].netID.equals(netID))&&(studentDetails[i].course1.equals(course1)))
            {
             return "Student with netID '" +netID+"course id"+course1+ "' is already recorded.";
            } 
        }
        
        //If no record exists with the specified netID enrolled for a specified course then add a new student. 
        studentDetails[storage.totalStudents()] = new StudentParameters();
        studentDetails[storage.totalStudents()].netID  = netID;
        studentDetails[storage.totalStudents()].fName  = fName;
        studentDetails[storage.totalStudents()].mName = mName;
        studentDetails[storage.totalStudents()].lName   = lName;
         studentDetails[storage.totalStudents()].course1   = course1;
     
        studentCount++;
        
        recordData(studentDetails);
        return "Student Record with netID "+ netID + " has been added.";        
    }
       
    
    /***************************************************************************
     * Deletes student record.
     **************************************************************************/
    public String deleteStudent(Controller con){
       
        try {
           
            //Get the list of existing students from the database.
            storage = new StudentDataStorageFile();
            studentDetails = storage.getStudentList();
            studentCount = storage.totalStudents();
           
          
            BufferedWriter writer = null;
            BufferedReader reader=null;
            FileNames fileName = new FileNames();
            String path1 = fileName.getStudFileName();
            String path2 = fileName.getTempFileName();
            File file1 = new File(path1);
            File file2 = new File(path2);
            String line,deleteRecordWithNetid;
            deleteRecordWithNetid=con.netID;
             writer = new BufferedWriter(new FileWriter(file2));
           
          reader = new BufferedReader(new FileReader(file1));
           
            while ((line = reader.readLine()) != null) {
                //trim newline when comparing with deleteRecordWithNetid
                String cut = line.trim();
                if (!cut.startsWith(deleteRecordWithNetid)) {
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
        return "Record with student ID " + con.netID+ " is deleted.";
    }
    
    /***************************************************************************
     * Deletes student record from a enrolled course.
     **************************************************************************/
    
    public String deleteStudentFromCourse(Controller con){
       
        try {
           
            //Get the list of existing students from the database.
            storage = new StudentDataStorageFile();
            studentDetails = storage.getStudentList();
            studentCount = storage.totalStudents();
           
          
            BufferedWriter writer = null;
            BufferedReader reader=null;
            FileNames fileName = new FileNames();
            String path1 = fileName.getStudFileName();
            String path2 = fileName.getTempFileName();
            File file1 = new File(path1);
            File file2 = new File(path2);
            String line,deleteRecordWithNetid;
            deleteRecordWithNetid=con.netID;
             writer = new BufferedWriter(new FileWriter(file2));
           
          reader = new BufferedReader(new FileReader(file1));
           
            while ((line = reader.readLine()) != null) {
                //trim newline when comparing with deleteRecordWithNetid
                String cut = line.trim();
                if ((line.contains(con.netID)) && (line.contains(con.course1)))continue; {
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
        return "Record with student ID " + con.netID+ " is deleted.";
    }
    /***************************************************************************
     * Modifies student record.
     **************************************************************************/
    public String modifyStudent(StudentParameters sp){
      
        try {
           
            storage = new StudentDataStorageFile();
            studentDetails = storage.getStudentList();
            studentCount = storage.totalStudents();
                    
            BufferedWriter writer = null;
            BufferedReader reader=null;
            FileNames fileName = new FileNames();
            String path1 = fileName.getStudFileName();
            String path2 = fileName.getTempFileName();
            File file1 = new File(path1);
            File file2 = new File(path2);
            String line,recordToModify;
            recordToModify=sp.netID;
            writer = new BufferedWriter(new FileWriter(file2));
           
          reader = new BufferedReader(new FileReader(path1));
           
            while ((line = reader.readLine()) != null) {
                String cut = line.trim();
                if (!cut.startsWith(recordToModify)) {
                    writer.write(line);
                    writer.write("\r\n");
                } 
            }
            
            writer.write(sp.netID+"\t"+sp.fName+"\t"+sp.mName+"\t"+sp.lName+"\t"+sp.course1);            
            writer.close();
            reader.close();
            file1.delete();
            file2.renameTo(file1); 
            
        } catch (IOException ex) {
            Logger.getLogger(StudentDetailsApplicationLogic.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        return "Record with student ID " + sp.netID+ " is modified.";
    }
    
}
