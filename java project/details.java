/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Amrudha
 */
public class details {
//public class detailemployee {
    JLabel l1,l2,l3,l4,l5;
JButton b,b1;
JTextField t1,t2,t3,t4,t5;
public details() throws SQLException{

     JFrame f=new JFrame();
    l1=new JLabel("EMP_ID");
    l1.setBounds(50,50,100,50);
    l2=new JLabel("EMP_NAME");
    l2.setBounds(50,100,100,50);
    l3=new JLabel("NO.OF LEAVE_DAYS");
    l3.setBounds(50,100,150,150);
    l4=new JLabel("NO.OF PARTTIME_DAYS");
    l4.setBounds(50,150,150,150);
    l5=new JLabel("SALARY");
    l5.setBounds(50,250,100,50);
    t3=new JTextField();
    t3.setBounds(300,150,200,50);
    t4=new JTextField();
    t4.setBounds(300,200,200,50);
    t5=new JTextField();
    t5.setBounds(300,250,200,50);
    t1=new JTextField();
    t1.setBounds(300,50,200,50);
    t2=new JTextField();
    t2.setBounds(300,100,200,50);
   // b=new JButton("PAY");
   // b.setBounds(150,300,80,80);
    b1=new JButton("DETAILS");
    b1.setBounds(150,850,80,80);
    //b.addActionListener(new java.awt.event.ActionListener() {
    //b1.addActionListener(this);
    f.setTitle("DETAILS OF GIVEN EMPLOYEE");
    f.setLayout(null);
    f.setSize(1000,900);
    f.setVisible(true);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.add(l5);
    f.add(t4);
    f.add(t5);
    f.add(t1);
    f.add(t2);
    f.add(t3);
   // f.add(b1);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //details();
//}

//public void actionPerformed(ActionEvent ex){
//public void details(){

        String s1=t1.getText();
   int a=Integer.parseInt(s1);
    // try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               // bActionPerformed(e);
            //} catch (SQLException ex) {
               // Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            //}
     int l = 0,p=0,s=0,leave,parttime,i=0,n;
     String u;
        //try{
            Connection c =DriverManager.getConnection("jdbc:derby://localhost:1527/salary");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select empid,leave_days,parttime_days,salary,empname from payroll");
            while(rs.next()){
               i=rs.getInt(1);
               l=rs.getInt(2);
               p=rs.getInt(3);
               s=rs.getInt(4);
               u=rs.getString(5);
               if(i==a)
               {
                  leave=l*500;
                  parttime=p*250;
                  s=s+parttime;  
                  s=s-leave;
                  String r=String.valueOf(s);
                  t5.setText(r);
                  String m=String.valueOf(i);
                  t1.setText(m);
                   String q=String.valueOf(p);
                  t4.setText(q);
                   String t=String.valueOf(p);
                  t4.setText(t);
                  t2.setText(u);
                   String j=String.valueOf(l);
                  t3.setText(j);
                   //System.out.println(r);
               }
            //}
            
        }
        //catch(Exception ext){
           // System.out.println(ext);
        //}
}     
      
}




    

