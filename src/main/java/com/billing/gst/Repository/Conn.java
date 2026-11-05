package com.billing.gst.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn 
{public static Connection conn=null;
 
 public static Connection connect()
 { String url="jdbc:mysql://localhost:3306/gst_billing";
  
    try
    { 
    conn=DriverManager.getConnection(url,${spring.datasource.username},${spring.datasource.password});
    if(conn!=null)
        {
            System.out.println("Connection Success");
        }
    



    }
    catch(SQLException e)
    {
        e.printStackTrace();
    }

    
return conn;

 }   




    
}
