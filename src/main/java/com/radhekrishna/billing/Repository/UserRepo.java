package com.radhekrishna.billing.Repository;

import com.radhekrishna.billing.Model.User;
import com.radhekrishna.billing.DatabaseConnection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserRepo {
    private static Connection conn=null;
    public static boolean createUser(User user)
    {int rows=0;
     if(conn==null)
     {conn=Conn.createConnection();}
     String query="insert into user_master (businessName,gst,address,mob,email,username,password) values (?,?,?,?,?,?,?)";

     try{
     PreparedStatement ps=conn.prepareStatement(query);
     ps.setString(1,user.getBusinessName());
     ps.setString(2,user.getGst());
     ps.setString(3,user.getAddress());
     ps.setString(4,user.getMob());
     ps.setString(5,user.getEmail());
     ps.setString(6,user.getUsername());
     ps.setString(7,user.getPassword());
     rows=ps.executeUpdate();
     ps.close();
    

     
     
  
     }catch(SQLException e){
     System.out.println("Database Error: " + e.getMessage());
     e.printStackTrace();
     
     }
     
    if(rows==0){return false;}
    return true;
    }

    public static User checkLogin(String username,String password)
    { 
      User user=null;
      if(conn==null){conn=Conn.createConnection();}
      String query="SELECT * FROM USER_MASTER WHERE USERNAME=? AND PASSWORD=?";
      try{
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setString(1,username);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
            {user=new User();
             user.setUserId(rs.getInt("user_id"));
             user.setUsername(rs.getString("username"));
             user.setPassword(rs.getString("password"));
            }



        }
      catch(SQLException e)
      {System.out.println("Database error "+e.getMessage());

      }
     
     return user;
    }

}
