/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
public class Employee1 implements ActionListener{
JLabel l1,l2,l3,l4,l5;
JButton b,b1;
JTextField t1,t2,t3;
//jTable1=new javax.swing.JTable();
Employee1 ()
{
    JFrame f=new JFrame();
    l1=new JLabel("EMP_ID");
    l1.setBounds(50,50,100,50);
    l2=new JLabel("EMP_NAME");
    l2.setBounds(50,100,100,50);
    l3=new JLabel("salary for one day  :  500");
    l3.setBounds(50,150,200,150);
    l4=new JLabel("part time salary for one day  :  250");
    l4.setBounds(50,175,200,150);
    l5=new JLabel("SALARY");
    l5.setBounds(50,500,100,50);
    t3=new JTextField();
    t3.setBounds(300,500,200,50);
    t1=new JTextField();
    t1.setBounds(300,50,200,50);
    t2=new JTextField();
    t2.setBounds(300,100,200,50);
    b=new JButton("PAY");
    b.setBounds(150,300,100,80);
    b1=new JButton("DETAILS");
    b1.setBounds(150,600,100,80);
    //b.addActionListener(new java.awt.event.ActionListener() {
   b.addActionListener(this);
   b1.addActionListener(this);
    //salarygeneration();
        //@Override
       // public void actionPerformed(java.awt.event.ActionEvent e) {
            //try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              //  bActionPerformed(e);
            //} catch (SQLException ex) {
              //  Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            //}
        //}
    //});
    f.setTitle("payroll");
    f.setLayout(null);
    f.setSize(1000,900);
    f.setVisible(true);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(t1);
    f.add(t2);
    f.add(l5);
    f.add(t3);
    f.add(b);
    f.add(b1);
   //b.addActionListener(this);
    //salarygeneration();
    //salarygeneration();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //salarygeneration
    /**
     * @param args the command line arguments
     */
}
    public static void main(String[] args) {
      new Employee1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //String s1=t1.getText();
    //int a=Integer.parseInt(s1);
    //String s2=t2.getText();
    // try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               // bActionPerformed(e);
            //} catch (SQLException ex) {
               // Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            //}
    // int l = 0,p=0,s=0,leave,parttime,i=0,n;
      //  try{
            //Connection c =DriverManager.getConnection("jdbc:derby://localhost:1527/salary");
            //Statement st=c.createStatement();
            //ResultSet rs=st.executeQuery("select empid,leave_days,parttime_days,salary from payroll");
            //while(rs.next()){
              // i=rs.getInt(1);
               //l=rs.getInt(2);
              // p=rs.getInt(3);
               //s=rs.getInt(4);
               //if(i==a)
               //{
                 // leave=l*500;
                  //parttime=p*250;
                  //s=s+parttime;  
                  //s=s-leave;
                  //String r=String.valueOf(s);
                  //t3.setText(r);
                   //System.out.println(r);
               //}
            //}
             
        
     //}
        //catch(Exception ex){
           // System.out.println(ex);
        //}
        if(e.getSource()==b)
             {
               generatingsalary obj= new generatingsalary(); 
            
             }
        if(e.getSource()==b1)
        {
            try {
                details obj= new details();
            } catch (SQLException ex) {
                Logger.getLogger(Employee1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
