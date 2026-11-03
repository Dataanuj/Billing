package com.billing.gst.Model;

class Product
{
    private int ProductId;
    private String ProductName;
    private String ProductCategory;
    private int ProductQty;
    private double ProductPrice;
    private String HsnCode;
    private double GstRate;
    private int OrgId;

    //getters and setters

    public void addProductId(int id)
    {this.ProductId=id;}
    
    public void addProductName(String name)
    {this.ProductName=name;}

    public void addProductCategory(String cat)
    {this.ProductCategory=cat;}

    public void addProductQty(int qty)
    {this.ProductQty=qty;}

    public void addProductPrice(double price)
    {this.ProductPrice=price;}

    public void addHsnCode(String code)
    {this.HsnCode=code;}

    public void addGstRate(double rate)
    {this.GstRate=rate;}

    public void addOrgId(int id)
    {this.OrgId=id;}
    

    public int takeProductId()
    {return this.ProductId;}
    
    public String takeProductName()
    {return this.ProductName;}

    public String takeProductCategory()
    {return this.ProductCategory;}

    public int takeProductQty()
    {return this.ProductQty;}

    public double takeProductPrice()
    {return this.ProductPrice;}

    public String takeHsnCode()
    {return this.HsnCode;}

    public double takeGstRate()
    {return this.GstRate;}

    public int takeOrgId()
    {return this.OrgId;}








}