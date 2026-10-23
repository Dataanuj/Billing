package com.billing.gst.Model;

public class AppUser {

    private int UserId;
    private int OrgId;
    private String UserName;
    private String Password;
    private String Role;

    // getters
    public int getUserId()
    {
        return this.UserId;
    }

    public int getOrgId()
    {
        return this.OrgId;
    }

    public String getUserName()
    {
        return this.UserName;
    }

    public String getPassword()
    {
        return this.Password;
    }

    public String getRole()
    {
        return this.Role;
    }

    // setters
    public void setUserId(int id)
    {
        this.UserId = id;
    }

    public void setOrgId(int id)
    {
        this.OrgId = id;
    }

    public void setUserName(String name)
    {
        this.UserName = name;
    }

    public void setPassword(String pass)
    {
        this.Password = pass;
    }

    public void setRole(String role)
    {
        this.Role = role;
    }

}