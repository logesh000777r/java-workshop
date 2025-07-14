package com.vetias.java.workshop.tempdata.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import org.h2.jdbcx.JdbcDataSource; 

public class OrganizationDAO {

    public void createTable(){
        JdbcDataSource h2DataSource= new JdbcDataSource();
        h2DataSource.setUrl("jdbc:h2:mem:tempdataDB");
        h2DataSource.setUser("sa");
        try(Connection dbConnection = h2DataSource.getConnection();
            Statement statement = dbConnection.createStatement()){
                statement.execute("""
                        create table organization(
                        id int AUTO_INCREMENT PRIMARY KEY,
                        NAME VARCHAR(100),
                        WEBSITE VARCHAR(100),
                        EMAIL VARCHAR(100),
                        CONTACT_NUMBER VARCHAR(100),
                        REGISTRATION_NO INT,
                        ADDRESS VARCHAR(255))
                        """);
        }catch(SQLException sqlException){
            System.out.println("Error creating table:"+sqlException);
        }
    }

}
