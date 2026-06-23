package com.radhekrishna.billing.Repository;
import com.radhekrishna.billing.Model.Product;
import com.radhekrishna.billing.DatabaseConnection.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class ProductRepo {
   private static Connection conn=null;
   public static void addProduct(Product product)
   {try
    {conn=Conn.createConnection();
     String query="INSERT INTO PRODUCT_MASTER (PRODUCT_NAME,PRODUCT_CATEGORY,PRODUCT_PRICE,PRODUCT_QUANTITY,USER_ID) VALUES (?,?,?,?,?) ";
     PreparedStatement ps=conn.prepareStatement(query);
     ps.setString(1,product.getProductName());
     ps.setString(2,product.getProductCategory());
     ps.setDouble(3,product.getProductPrice());
     ps.setInt(4,product.getProductQuantity());
     ps.setInt(5,product.getUserId());
     ps.executeUpdate();
     ps.close();




    }catch(Exception e){e.printStackTrace();}

   }
}
