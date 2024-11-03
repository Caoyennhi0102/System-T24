/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking;
import java.sql.Connection;
import java.sql.SQLException;
import com.mycompany.corebanking.config.DatabaseConfig;
import com.mycompany.corebanking.model.Branches;
import com.mycompany.corebanking.repository.BranchesDao;
/**
 *
 * @author PC
 */
public class Main {
    public static void main (String[] args){
        try{
            Connection connection = DatabaseConfig.getConnection();
            System.out.println("Successful Connection");
           
            connection.close();
        }catch(SQLException e){
            System.err.println("Connection Failed" + e.getMessage());
        }
    }
}
