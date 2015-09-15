/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;


/*******************************************************************************
 * The below class is a part of Application Layer or domain layer which contains 
 * logic for  processing attendance history.
 * @author rohitreddy
 *******************************************************************************/
public class AttendanceHistoryApplicationLogic {
    
    
    
    //write data ti JTable.
     public void writeToTable(JTable historyTable) throws IOException
    {
    
         BufferedReader reader1 = null;
         BufferedReader reader2 = null;
         BufferedReader reader3 = null;
        FileNames fileName = new FileNames();
        int x=0,row=1;
        String p[];String student[][]=new String [100][100];
        String path2 = fileName.getTempFileName();       
        File f1 = new File("cs6359-Apr012013.txt");
        File f2=new File("cs6359-Apr062013.txt");
         File f3=new File("cs6359-Apr082013.txt");
         historyTable.setValueAt("", 0, 0);
         historyTable.setValueAt("Apr012013", 0, 1);
         historyTable.setValueAt("Apr062013", 0, 2);
         historyTable.setValueAt("Apr082013", 0, 3);
        
        try
        {
            reader1=new BufferedReader(new FileReader(f1));
            reader2=new BufferedReader(new FileReader(f2));
            reader3=new BufferedReader(new FileReader(f3));
            String st;
            while((st=reader1.readLine())!=null)
            {
                
                p=st.toString().split("\t");
                student[x][0]=p[0];
                student[x][1]=p[1];
                student[x][2]=p[2];
                student[x][3]=p[3];
                student[x][4]=p[4];
                
                historyTable.setValueAt(student[x][0],row,0);
                     historyTable.setValueAt(student[x][4],row,1);
                x++;
                row++;
            }
            row=1;
            while((st=reader2.readLine())!=null)
            {
                
                p=st.toString().split("\t");
                student[x][0]=p[0];
                student[x][1]=p[1];
                student[x][2]=p[2];
                student[x][3]=p[3];
                student[x][4]=p[4];
                     historyTable.setValueAt(student[x][4],row,2);
                x++;
                row++;
            }
            row=1;
            while((st=reader3.readLine())!=null)
            {
                
                p=st.toString().split("\t");
                student[x][0]=p[0];
                student[x][1]=p[1];
                student[x][2]=p[2];
                student[x][3]=p[3];
                student[x][4]=p[4];
                     historyTable.setValueAt(student[x][4],row,3);
                x++;
                row++;
            }
        }catch(FileNotFoundException e)
        {
        }
        }
    
    
    
    
    
}
