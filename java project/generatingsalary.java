/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Amrudha
 */
public class generatingsalary extends Employee1{
    public generatingsalary(){
        String s1=t1.getText();
    int a=Integer.parseInt(s1);
    String s2=t2.getText();
    // try {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               // bActionPerformed(e);
            //} catch (SQLException ex) {
               // Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            //}
     int l = 0,p=0,s=0,leave,parttime,i=0,n;
        try{
            Connection c =DriverManager.getConnection("jdbc:derby://localhost:1527/salary");
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery("select empid,leave_days,parttime_days,salary from payroll");
            while(rs.next()){
               i=rs.getInt(1);
               l=rs.getInt(2);
               p=rs.getInt(3);
               s=rs.getInt(4);
               if(i==a)
               {
                  leave=l*500;
                  parttime=p*250;
                  s=s+parttime;  
                  s=s-leave;
                  String r=String.valueOf(s);
                  t3.setText(r);
                   //System.out.println(r);
               }
            }
             
        
     }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
