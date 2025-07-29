package com.vetias.java.workshop.tempdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.vetias.java.workshop.tempdata.beans.Organization;
import com.vetias.java.workshop.tempdata.dao.OrganizationDAO;

public class JdbcExample {
    public static void main(String[] args){
        // OrganizationDAO organizationDAO =new OrganizationDAO();
        // organizationDAO.createTable(null);
        Connection dbConnection = null;
        try{
            Class.forName("org.h2.Driver");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            dbConnection =DriverManager.getConnection("jdbc:h2:mem:tempdataDB","sa",null);
        }catch(SQLException sqlException) {
            System.out.println("Error Creating table:"+sqlException);
        }
        OrganizationDAO organizationDAO =new OrganizationDAO();
        organizationDAO.createTable(dbConnection);
        Organization vet =new Organization("VET",
        "www.vet.com","contact@vet.com","9843170755",12345L,
        "Vellalar Educational Trust:",null);
        organizationDAO.save(dbConnection,vet);
        Organization myorganization =organizationDAO.findByName(dbConnection,"VET");
        System.out.println("My Organization:"+myorganization);




    }

}
