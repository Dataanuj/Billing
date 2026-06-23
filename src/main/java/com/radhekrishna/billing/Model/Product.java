package com.radhekrishna.billing.Model;
//PLAIN OLD JAVA OBJECT
public class Product {
    private int product_id;
    private String product_name;
    private String product_category;
    private double product_price;
    private int product_quantity;
    private int user_id;

    //Getters and Setters;
    public void setProductId(int product_id)
    {this.product_id=product_id;}

    public void setProductName(String product_name)
    {this.product_name=product_name;}

    public void setProductCategory(String product_category)
    {this.product_category=product_category;

    }

    public void setProductPrice(double product_price)
    {this.product_price=product_price;

    }

    public void setProductQuantity(int product_quantity)
    {this.product_quantity=product_quantity;

    }

    public void setUserId(int user_id)
    {this.user_id=user_id;}


   
    public int getProductId()
    {return product_id;}

    public String getProductName()
    {return product_name;}

    public String getProductCategory()
    {return product_category;

    }

    public double getProductPrice()
    {return product_price;

    }

    public int getProductQuantity()
    {return product_quantity;

    }

    public int getUserId()
    {return user_id;}



    
}
