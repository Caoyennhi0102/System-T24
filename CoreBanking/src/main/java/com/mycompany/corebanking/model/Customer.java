/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking.model;
import java.util.Date;
/**
 *
 * @author PC
 */

public class Customer {
    private int  CustomerID;
    private String FullName;
    private Date DateOfBrith;
    private boolean Gender;
    private String CCCD;
    private String Address;
    private String PhoneNumber;
    private String Email;
    private byte[] Fingerprint;
    private Date CreateDate;
    private boolean Status;
    private Branches branches;
    
    public int getCustomer(){
        return CustomerID;
    }
    public void setCustomer(int customerID){
        this.CustomerID = customerID;
    }
    public String getFullName(){
        return FullName;
    }
    public void setFullName(String fullname){
        this.FullName = fullname;
    }
    public Date getDateOfBrith(){
        return DateOfBrith;
    }
    public void setDateOfBrith(Date dateOfBrith){
        this.DateOfBrith = dateOfBrith;
    }
    public boolean isGender(){
        return Gender;
    }
    public void setGender(boolean gender){
        this.Gender = gender;
    }
    public String getCCCD(){
        return CCCD;
    }
    public void setCCCD(String cccd){
        this.CCCD = cccd;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String address){
        this.Address = address;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber(String phonenumber){
        this.PhoneNumber = phonenumber;
    }
    public String getEmail(){
        return Email;
    }
   public void setEmail(String email){
       this.Email = email;
   }
   public byte[] getFingerprint(){
       return Fingerprint;
   }
   public void setFingerprint(byte[] fingerprint){
       this.Fingerprint = fingerprint;
   }
   public Date getCreateDate(){
       return CreateDate;
   }
   public void setCreateDate(Date createdate){
       this.CreateDate = createdate;
   }
   public boolean IsStatus(){
       return Status;
   }
   public void setStatus(boolean status){
       this.Status = status;
   }
   public Branches getBranches(){
       return branches;
   }
   public void setBranches(Branches branches){
       this.branches = branches;
   }
   
   public Customer(){}
   
   public Customer(int customerID, String fullname, Date dateOfBirth, boolean gender, String cccd,
                    String address, String phoneNumber, String email, byte[] fingerprint,
                    Date createdDate, boolean status, Branches branches){
       this.CustomerID = customerID;
       this.FullName = fullname;
       this.DateOfBrith = dateOfBirth;
       this.Gender = gender;
       this.CCCD = cccd;
       this.Address = address;
       this.PhoneNumber = phoneNumber;
       this.Email = email;
       this.Fingerprint = fingerprint;
       this.CreateDate = createdDate;
       this.Status = status;
       this.branches = branches;
       
   }
    
}
