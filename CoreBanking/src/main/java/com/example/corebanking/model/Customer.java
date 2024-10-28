/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.corebanking.model;
import jakarta.persistence.*;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author PC
 */
@Entity
@Table(name = "Customers")
public class Customer {
    // Mã Khách Hàng Tự Động Tăng 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int CustomerID;
    // Họ và Tên Khách Hàng 
    @Column(name = "FullName", nullable = false)
    private String FullName;
    // Ngày Sinh Khách Hàng 
    @Column(name = "DateOfBrith")
    private Date DateOfBrith;
    // Giới tính (True là Nam, False là Nữ)
    @Column(name = "Gender")
    private boolean Gender;
    // Căn Cước Công Dân 
    @Column(name = "CCCD", unique = true)
    private String CCCD;
    // Địa Chỉ 
    @Column(name = "Addresss")
    private String Address;
    
    // Số Điện Thoại
    @Column(name = "Phonenumber", unique = true)
    private String Phonenumber;
    
    //Địa Chỉ Email
    @Column(name = "Email", unique = true)
    private String Email;
    
    //Dấu Vân Tay
    @Lob // Đối tượng lớn 
    @Column(name = "Fingerprint")
    private byte[] Fingerprint;
    
    //Ngày Mỡ Mã Khách Hàng 
    @Column(name = "CreatedDate")
    private LocalDate CreatedDate = LocalDate.now();
    
    // Trạng Thái mã Khách Hàng 
    @Column(name = "Statuss")
    private String Status;
    
    // Mã Chi Nhánh 
    @Column(name = "BranchesID", nullable = false)
    private Branch branch;
    
    // Hàm Khởi Tạo Không Truyền Giá Trị
    public Customer(){
        
    }
    public Customer(String fullname, Date dateOfBrith, boolean gender, String cccd, String address, String phonenumber, String email, byte[] fingerprint, LocalDate createdate, String status, Branch branch  ){
        this.FullName = fullname;
        this.DateOfBrith = dateOfBrith;
        this.Gender = gender;
        this.CCCD = cccd;
        this.Address = address;
        this.Phonenumber = phonenumber;
        this.Email = email;
        this.Fingerprint = fingerprint;
        this.CreatedDate = createdate;
        this.Status = status;
        
        
    }
    
    public int getID(){
        return CustomerID;
    }
    
    public void setID( int ID){
        this.CustomerID = ID;
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
    public boolean getGenDer(){
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
    public String getPhoneNumBer(){
        return Phonenumber;
    }
    public void setPhoneNumber(String phonenumber){
        this.Phonenumber = phonenumber;
    }
    
   
}
