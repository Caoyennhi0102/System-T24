/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.corebanking.config;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


/**
 *
 * @author PC
 */
public class DatabaseConfig {
    private static final String PERSISTENCE_UNIT_NAME = "CoreBanking";
    private EntityManagerFactory  entityManagerFactory;
    public DatabaseConfig() {
        // Tạo EntityManagerFactory từ persistence.xml
        entityManagerFactory = Persistence.createEntityManagerFactory("CoreBanking");
    }
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    public void Close(){
        if(entityManagerFactory != null){
            entityManagerFactory.close();
        }
    }
}
