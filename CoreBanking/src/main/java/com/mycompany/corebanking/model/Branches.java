/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking.model;

/**
 *
 * @author PC
 */
public class Branches {
    private String BranchID;
    private String BranchesName;
    private String Email;
    private String PhoneNumber;
    private String Manager;
    private String Address;
    private boolean Status;
    
    public String getBranchesID(){
        return BranchID;
        
    }
    public void setBranchID(String branchID){
        this.BranchID = branchID;
    }
    public String getBranchName(){
        return BranchesName;
    }
    public void setBranchName(String branchName){
        this.BranchesName = branchName;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }
    public String getManager(){
        return Manager;
    }
    public void setManager(String manager){
        this.Manager = manager;
    }
    public String getAddress(){
        return Address;
    }
    public boolean IsStatus(){
        return Status;
    }
    public void setIsStatus(boolean status){
        this.Status = status;
    }
    
    public Branches(){}
    
    public Branches(String branchID, String branchName, String email, String phonenumber, String manager, String address, boolean isStatus){
        this.BranchID = branchID;
        this.BranchesName = branchName;
        this.Email = email;
        this.PhoneNumber = phonenumber;
        this.Manager = manager;
        this.Address = address;
        this.Status = isStatus;
        
    }
}
