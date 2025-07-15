package com.vetias.java.workshop.tempdata.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
// import org.h2.jdbcx.JdbcDataSource;

import com.vetias.java.workshop.tempdata.beans.Organization; 

public class OrganizationDAO {

    // public void createTable(){
        // JdbcDataSource h2DataSource= new JdbcDataSource();
        // h2DataSource.setUrl("jdbc:h2:mem:tempdataDB");
        // h2DataSource.setUser("sa");
        // try(Connection dbConnection = h2DataSource.getConnection();
        //     Statement statement = dbConnection.createStatement()){
        //         statement.execute("""
        //                 create table organization(
        //                 id int AUTO_INCREMENT PRIMARY KEY,
        //                 NAME VARCHAR(100),
        //                 WEBSITE VARCHAR(100),
        //                 EMAIL VARCHAR(100),
        //                 CONTACT_NUMBER VARCHAR(100),
        //                 REGISTRATION_NO INT,
        //                 ADDRESS VARCHAR(255))
        //                 """);
        // }catch(SQLException sqlException){
        //     System.out.println("Error creating table:"+sqlException);
        // }

    // }
    public void createTable(Connection dbConnection) {
        try(Statement statement = dbConnection.createStatement()) {
            statement.execute("""
                    create table organization(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    WEBSITE VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,
                    DESCRIPTION VARCHAR(255))
                    """);
        }catch(SQLException sqlException) {
            System.out.println("Error creating Table:"+sqlException);
        }
    }
    public int save(Connection dbConnection,Organization vet) {
        try(PreparedStatement preparedStatement = dbConnection.prepareStatement("""
                insert into organization(name,website,email,contact_number,
                registration_no,description) values(?,?,?,?,?,?)
                """)) {
                    preparedStatement.setString(1,vet.name());
                    preparedStatement.setString(2,vet.description());
                    preparedStatement.setString(3,vet.website());
                    preparedStatement.setString(4,vet.email());
                    preparedStatement.setString(5,vet.contactNumber());
                    preparedStatement.setLong(6,vet.registration());
                    
        }catch(SQLException sqlException) {
            System.out.println("Error inserting into table:"+sqlException);
        }
        return 0;
    }

}
