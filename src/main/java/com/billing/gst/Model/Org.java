package com.billing.gst.Model;

public class Org
{
    private int OrgId;
    private String Name;
    private String GstNo;
    private String Address;
    private String ContactNo;
    private String EmailId;
    
    //getters
    public int getOrgId()
    {
        return this.OrgId;
    }

    public String getName()
    {
        return this.Name;
    }

    public String getGstNo()
    {
        return this.GstNo;
    }

    public String getAddress()
    {
        return this.Address;
    }

    public String getContactNo()
    {
        return this.ContactNo;
    }

    public String getEmailId()
    {
        return this.EmailId;
    }
    
    //setters
    public void setorgId(int id)
    {
        this.OrgId = id;
    }

    public void setName(String name)
    {
        this.Name = name;
    }

    public void setGstNo(String no)
    {
        this.GstNo = no;
    }

    public void setAddress(String add)
    {
        this.Address = add;
    }

    public void setContactNo(String no)
    {
        this.ContactNo = no;
    }

    public void setEmailId(String id)
    {
        this.EmailId = id;
    }
}