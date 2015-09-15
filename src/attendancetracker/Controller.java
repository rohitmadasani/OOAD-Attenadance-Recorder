/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;




/*******************************************************************************
 * The below class is the controller class which gets values from GUI Layer and 
 * passes the values to the domain objects for the domain processing.
 * a GUI and holds all other components.It is a part of GUI layer in Logical 
 * architecture.It follows Information Expert design Pattern.
 * Design Pattern followed:Controller
 * @author rohitreddy
 *******************************************************************************/


public class Controller {
    
    String netID,fName,mName,lName,course1,course2,course3;
    String courseID,courseName,professorName;
    String creditHours;
    

    /***************************************************************************
     * get method for courseID
     * @return 
    ***************************************************************************/
    
     public String getCourseID() 
    {
        return courseID;
    }
     
    /***************************************************************************
     * set method for courseID
     * @return 
    ***************************************************************************/

    public void setCourseID(String courseID)
    {
        this.courseID = courseID;
    }
    
    
     
    /***************************************************************************
     * get method for CourseName
     * @return 
    ***************************************************************************/
    
     public String getCourseName() 
    {
        return courseName;
    }

     
    /***************************************************************************
     * set method for CourseName
     * @return 
    ***************************************************************************/
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    /***************************************************************************
     * get method for credit Hours
     * @return 
    ***************************************************************************/
     public String getCreditHours() 
    {
        return creditHours;
    }

    /***************************************************************************
     * set method for credit Hours
     * @return 
    ***************************************************************************/
    public void setCreditHours(String creditHours)
    {
        this.creditHours = creditHours;
       
    }
    
    
    /***************************************************************************
     * get method for Professor Name
     * @return 
    ***************************************************************************/
     public String getProfessorName() 
    {
        return professorName;
    }

    /***************************************************************************
     * set method for Professor Name
     * @return 
    ***************************************************************************/
    public void setProfessorName(String professorName)
    {
        this.professorName = professorName;
    }
    
        
    
    /***************************************************************************
     * get method for course
     * @return 
    ***************************************************************************/
   public String getCourse1() 
    {
        return course1;
    }

    /***************************************************************************
     * set method for course
     * @return 
    ***************************************************************************/
    public void setCourse1(String course1)
    {
        this.course1 = course1;
    }
    
     public String getCourse2() 
    {
        return course2;
    }

    public void setCourse2(String course2)
    {
        this.course2 = course2;
    }
     public String getCourse3() 
    {
        return course3;
    }

    public void setCourse3(String course3)
    {
        this.course3 = course3;
    }
     
    /***************************************************************************
     * get method for firstname 
     * @return 
    ***************************************************************************/
    public String getfName() 
    {
        return fName;
    }

    
    /***************************************************************************
     * set method for firstname 
     * @return 
    ***************************************************************************/
    public void setfName(String fName)
    {
        this.fName = fName;
    }
    
    /***************************************************************************
     * get method for last name
     * @return 
    ***************************************************************************/
    public String getLName() 
    {
        return lName;
    }
    
    /***************************************************************************
     * set method for last name 
     * @return 
    ***************************************************************************/

    public void setLName(String lName)
    {
        this.lName = lName;
    }
    /***************************************************************************
     * get method for middle name
     * @return 
    ***************************************************************************/
    public String getMName() 
    {
        return mName;
    }
    
    /***************************************************************************
     * set method for middle name 
     * @return 
    ***************************************************************************/

    public void setMName(String mName)
    {
        this.mName = mName;
    }
    /***************************************************************************
     * set method for netID
     * @return 
    ***************************************************************************/
    public String getNetID() 
    {
        return netID;
    }

    /***************************************************************************
     * set method for netID 
     * @return 
    ***************************************************************************/
    public void setNetID(String netID)
    {
        this.netID = netID;
    }
    
}

