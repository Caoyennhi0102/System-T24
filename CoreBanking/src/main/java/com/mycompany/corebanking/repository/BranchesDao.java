/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking.repository;
import com.mycompany.corebanking.model.Branches;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.corebanking.config.DatabaseConfig;
/**
 *
 * @author PC
 */
public class BranchesDao {
    public boolean AddBranch(Branches branch){
        String query = "INSERT INTO Branches(BranchesID, BranchesName,Email ,PhoneNumber,Manager, Addresss, Status) VALUES(?, ?, ?, ?, ?, ?, ?)";
        try (Connection connection = DatabaseConfig.getConnection();
               PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1,branch.getBranchesID());
            statement.setString(2, branch.getBranchName());
            statement.setString(3, branch.getEmail());
            statement.setString(4, branch.getPhoneNumber());
            statement.setString(5, branch.getManager());
            statement.setString(6, branch.getAddress());
            statement.setInt(7, branch.IsStatus() ? 1: 0);
            return statement.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
               
    }
  
    public boolean UpdateBranch(Branches branch){
        String query = "UPDATE Branches SET BranchesName= ?, Email= ?, PhoneNumber= ?, Manager= ?,Addresss= ?, Status= ? WHERE BranchesID = ?";
        try(Connection connection = DatabaseConfig.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, branch.getBranchName());
            statement.setString(2, branch.getEmail());
            statement.setString(3, branch.getPhoneNumber());
            statement.setString(4, branch.getManager());
            statement.setString(5, branch.getAddress());
            statement.setInt(6, branch.IsStatus() ? 1 : 0);
            statement.setString(7, branch.getBranchesID());
            return statement.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean DeleteBranch(Branches branch){
        String query = "DELETE FROM Branches WHERE BranchesID= ?";
        try(Connection connection = DatabaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, branch.getBranchesID());
            return statement.executeUpdate() > 0;
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
                
    }
    
    public Branches GetBranchByID(String branchID){
        String query = "SELECT * FROM Branches WHERE BranchesID = ?";
        try(Connection connection = DatabaseConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1, branchID);
           ResultSet resultSet = statement.executeQuery();
           if(resultSet.next()){
               return new Branches(
                       resultSet.getString("BranchesID"),
                       resultSet.getString("BranchesName"),
                       resultSet.getString("Email"),
                       resultSet.getString("PhoneNumber"),
                       resultSet.getString("Manager"),
                       resultSet.getString("Addresss"),
                       resultSet.getBoolean("Status")    
               );
           }
                
        }catch(SQLException e){
            e.printStackTrace();
            
        }
        return null;
    }
    
    
   
}
