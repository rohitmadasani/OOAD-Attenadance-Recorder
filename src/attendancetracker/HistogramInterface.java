/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package attendancetracker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*******************************************************************************
 * The below class is Histogram Interface for the attendance tracking system which
 * is a GUI and holds all other components for Histogram processing.
 * @author rohitreddy
 *******************************************************************************/
public class HistogramInterface extends javax.swing.JFrame {

    /**
     * Creates new form HistogramInterface
     */
     
   final int X = 400;        // Starting X coordinate
   final int Y = 300;        // Bottom of the bars
   final int num = 315;      // Bottom of the values
   int BAR_WIDTH =20;           // Width of each bar
   final int SPACE_BETWEEN_BARS = 5;
    float array1[]=new float[1000];
    float array[]=new float[1000];
    boolean SetGraph=false;// Pixels between bars
 
    public HistogramInterface() {
        initComponents();
    }
    
    
    
    String studArray1[][]=new String[100][100];
    static int row=0;
   static  int count=0;
   int x1;
     
    //generates a histogram.
    public int generateHistogram(String date1)
           
    {
       
        
         BufferedReader reader = null;
        FileNames fileName = new FileNames();
        String path1 = date1+".txt";
        String path2 = fileName.getTempFileName();
        File f1 = new File(path1);
        File file2 = new File(path2);
        
        
        String t=date1;
     
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
                    
                    studArray1[x][0] = part1[0];
                    studArray1[x][1] = part1[1];
                    studArray1[x][2] = part1[2];
                    studArray1[x][3] = part1[3];
                    studArray1[x][4] = part1[4];
//                    column1[x]=part1[0];
//                     System.out.println(column1[x]);
//                    column2[x]=part1[1];
//                     System.out.println(column2[x]);
//                    column3[x]=part1[2];
//                      System.out.println(column3[x]);
//                    column4[x]=part1[3];
//                      System.out.println(column4[x]);
                    column5[x]=part1[4];
                        System.out.println(column5[x]);
//                      System.out.println(column5[x]);
                    String value="true";
                   
          if(column5[x].equals(value))
          {
              count++;
          }
          else {
              
          } 
                    
                    x++;
                    
                } 
                x1=count;
                System.out.println(count);
                 
            } catch (IOException ex) {
                Logger.getLogger(RecordAttendanceUserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RecordAttendanceUserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println(count);
        return count;
          
        
    }
    
    
    
    public void paint(Graphics g)
    {
      super.paint(g);
      g.setColor(Color.BLUE);        // Bars will be blue
      int xStart = X;      // X value for first bar
      
 float nm=25;
 float pr=15;
    
    if(nm>40 && nm<60)  //if months are more then i decreased the bar width and space
    {
    BAR_WIDTH=15;
    
    }
    else if(nm>=60)
    {
    BAR_WIDTH=10;
    
    }
    
    int p;
    for(p=0;p<nm;p++)
    {
    array1[p]=array[p];
    }
    if(pr>=1000 && pr<10000)    //principal value is more then divided by required value for getting graph such that heighest will be 100 and lowest is 0
    {
        for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.1);
        }        
    }
    else if(pr>=10000 && pr <100000)
    {
    for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.01);
    }
    }
    else if(pr>=100000 && pr <1000000)
    {
    for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.001);
    }
    }
    else if(pr>=1000000 && pr <10000000)
    {
    for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.0001);
    }
    }
    else if(pr>=10000000 && pr <100000000)
    {
    for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.00001);
    }
    }
        else if(pr>=100000000 && pr <1000000000)
    {
    for(p=0;p<nm;p++){
          array1[p]=(float) (array1[p]*0.000001);
    }
    }      
   
      for (int i = 0; i < count; i++)
      {
         g.fillRect(xStart, Y - (int)(array1[i]),BAR_WIDTH, (int)(array1[i]) ); //rectangle for bar
         
         g.drawString(Integer.toString(i+1),xStart, num);// number
         
         // Move to starting X value for next bar.
         xStart += BAR_WIDTH + SPACE_BETWEEN_BARS;               
      }
        
        
        
        
    }
      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 205));

        jLabel1.setText("Total Number of students present on given day");

        jLabel2.setText("Input Date Specified");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(334, 334, 334))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(96, 96, 96)
                .addComponent(jLabel1)
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HistogramInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistogramInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistogramInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistogramInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistogramInterface().setVisible(true);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
       new HistogramInterface().setLocation(d.width/2-new HistogramInterface().getSize().width/2, d.height/2-new HistogramInterface().getSize().height/2);     
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
