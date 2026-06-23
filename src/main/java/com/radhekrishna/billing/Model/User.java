package com.radhekrishna.billing.Model;

public class User {
    private int user_id;
    private String businessName;
    private String gst;
    private String address;
    private String email;
    private String mob;
    private String username;
    private String password;



    // Getters and Setters
    public void setUserId(int user_id){this.user_id=user_id;}
    public void setBusinessName(String businessName)
    {this.businessName=businessName;}
    public void setGst(String gst)
    {this.gst=gst;}
    public void setAddress(String address)
    {this.address=address;}
    public void setMob(String mob)
    {this.mob=mob;}
    public void setEmail(String email)
    {this.email=email;}
    public void setUsername(String username)
    {this.username=username;}
    public void setPassword(String password)
    {this.password=password;}

    public int getUser_id(){return user_id;}
    public String getBusinessName(){return businessName;}
    public String getGst(){return gst;}
    public String getAddress(){return address;}
    public String getMob(){return mob;}
    public String getEmail(){return email;}
    public String getUsername(){return username;}
    public String getPassword(){return password;}
    


    
}
