package com.vetias.java.workshop.tempdata;

import com.vetias.java.workshop.tempdata.dao.OrganizationDAO;

public class JdbcExample {
    public static void main(String[] args){
        OrganizationDAO organizationDAO =new OrganizationDAO();
        organizationDAO.createTable();

    }

}
