/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking.repository;
import com.mycompany.corebanking.model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Date;
import com.mycompany.corebanking.config.DatabaseConfig;
import com.mycompany.corebanking.model.Branches;
/**
 *
 * @author PC
 */
// Lưu thông tin khách hàng vào Database Sql server
public class CustomerDao {
    public void AddCustomer(Customer customer){
        String Sql = "INSERT INTO Customer(CustomerID, Fullname, DateOfBirth, Gender, CCCD, Address, PhoneNumber, Email, Fingerprint, CreatedDate, Status, BranchesID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try(Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(Sql)){
                statement.setInt(1,customer.getCustomer());
                statement.setString(2, customer.getFullName());
                statement.setDate(3, new java.sql.Date(customer.getDateOfBrith().getTime()));
                statement.setInt(4, customer.isGender() ? 1:0); // 1 là Nam , 0 là Nữ 
                statement.setString(5, customer.getCCCD());
                statement.setString(6, customer.getAddress());
                statement.setString(7, customer.getEmail());
                statement.setString(8, customer.getPhoneNumber());
                statement.setBytes(9,customer.getFingerprint());
                statement.setDate(10, new java.sql.Date(customer.getCreateDate().getTime()));
                statement.setInt(11, customer.IsStatus() ? 1 : 0);
                statement.setString(12, customer.getBranches().getBranchesID());
                statement.executeUpdate();
                
                
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    // Lấy thông tin khách hàng theo ID từ Database SQL server
    public Customer GetCustomerByID(int customerID){
        String Sql = "SELECT * FROM Customer WHERE CustomerID = ?";
        try(Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(Sql)
                ){
            statement.setInt(1, customerID);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                String fullName = resultSet.getString("FullName");
                Date dateOfBirth = resultSet.getDate("DateOfBrith");
                boolean gender = resultSet.getBoolean("Gender");
                String cccd = resultSet.getString("CCCD");
                String address = resultSet.getString("Addresss");
                String phonenumber = resultSet.getString("PhoneNumber");
                String email = resultSet.getString("Email");
                byte[] fingerprint = resultSet.getBytes("Fingerprint");
                Date createdDate = resultSet.getDate("CreatedDate");
                boolean status = resultSet.getBoolean("Status");
                
                String branchID = resultSet.getString("BranchesID");
                BranchesDao branchesDao = new BranchesDao();
                Branches branch = branchesDao.GetBranchByID(branchID);
                return new Customer(customerID, fullName, dateOfBirth, gender, cccd, address, phonenumber, email,fingerprint, createdDate,status, branch);
            }
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return null;
        
    }
}
