package attendancetracker;


import attendancetracker.FileNames;
import attendancetracker.RecordAttendanceUserInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.*;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*******************************************************************************
 * The below class is a part of Application Layer or domain layer which contains 
 * logic for recording attendance(logic for recording student attendance).
 * @author rohitreddy
 *******************************************************************************/



public class RecordAttendanceApplicationLogic {
    
        static String studArray[][] =new String [100][100];
    int row=0;
    //writes data to Jtable.
    public void writeDataToJTable(JTable Jtable,String t)
    {
        
            
         BufferedReader reader = null;
        FileNames fileName = new FileNames();
        String path1 = fileName.getStudFileName();
        String path2 = fileName.getTempFileName();
        File f1 = new File(path1);
        File file2 = new File(path2);
        
        
        
        String st;
        String[] column1=new String[100];
        String[] column2=new String[100];
        String[] column3=new String[100];
        String[] column4=new String[100];
        String[] column5=new String[100];
        
        
      
        int i=0,i1=0,x=0,j=1,k=2,l=3,m=4;
        
        try {
           reader= new BufferedReader(new FileReader(f1));
           
            try {
                while((st=reader.readLine()) !=null)
                {
                    String[] part1;// = new String[6];
                    part1=st.toString().split("\t");
                    
                    studArray[x][0] = part1[0];
                    studArray[x][1] = part1[1];
                    studArray[x][2] = part1[2];
                    studArray[x][3] = part1[3];
                 
                    column5[x]=part1[4];
                  
                    if(t.equals(column5[x]))
                    {
                        System.out.println(column1[x]);
                        //Jtable.setValueAt(column2[x], x, i);
                        Jtable.setValueAt(studArray[x][0], row, 0);
                        Jtable.setValueAt(studArray[x][1], row, 1);
                        Jtable.setValueAt(studArray[x][2], row, 2);
                        Jtable.setValueAt(studArray[x][3], row, 3);
                        Jtable.setValueAt(true, row, 4);
                        row++;
//                        Jtable.setValueAt(column5[x], x, 5);
                        System.out.println(column1[x]);
                    }
                    i=i+5;j=j+5;k=k+5;l=l+5;m=m+5;
                    x++;
                } 
                 
            } catch (IOException ex) {
                Logger.getLogger(RecordAttendanceUserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordAttendanceUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    
    

