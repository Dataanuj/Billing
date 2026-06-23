package com.radhekrishna.billing.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Conn {
    private static Connection conn=null;
    public static Connection createConnection()
    {String url="jdbc:mysql://localhost:3306/billing_master";
     String user="root";
     String password="cashflow";
     try{
     conn=DriverManager.getConnection(url,user,password);
     if(conn!=null){System.out.println("Connection Success");}
     }
     catch(SQLException e){e.printStackTrace();}
     
     
     return conn;
   
    }
    
}
