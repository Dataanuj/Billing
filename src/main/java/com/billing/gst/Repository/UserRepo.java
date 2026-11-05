package com.billing.gst.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.billing.gst.Model.*;



public class UserRepo {
    public static Connection conn=null;
    public static String gstNo="";

    

    public static String addOrg(Org org)
    {try
    {conn=Conn.connect();
     String query="insert into org_master(name,gstin,address,email,contactNo) values (?,?,?,?,?) ";
     PreparedStatement ps=conn.prepareStatement(query);
     ps.setString(1,org.getName());
     gstNo=org.getGstNo();     
     ps.setString(2,gstNo);
     ps.setString(3,org.getAddress());
     ps.setString(4,org.getEmailId());
     ps.setString(5,org.getContactNo());
     int row=ps.executeUpdate();

     if(row!=1){return "Business Not Added";}


     
     

    }
    catch(SQLException e)
    {e.printStackTrace();
    }

     return "Business Added";
    }

    
    
    public static String addAppUser(AppUser user)
    {int orgId;
    try
        {conn=Conn.connect();
         String query="select id from org_master where gstin=?";
         PreparedStatement ps=conn.prepareStatement(query);
         ps.setString(1,gstNo);
         ResultSet rs=ps.executeQuery();
         while(rs.next())
            {
                orgId=rs.getInt("id");
            }
        ps.close();
        query="insert into user_master (name,password,orgId) values(?,?,?)";
        ps=conn.prepareStatement(query);
        ps.setString(1,user.getUserName());
        ps.setString(2,user.getPassword());
        ps.setString(3,orgId);
        int row=ps.executeUpdate();

        if(row!=1){return "User not Added";}



         
         

        }
        catch(SQLException e)
        {e.printStackTrace();}

    return "";
    }

    
}
