/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.corebanking.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class DatabaseConfig {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=CoreBanking;encrypt=false";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";
    
    public  static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
