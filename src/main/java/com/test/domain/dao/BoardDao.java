package com.test.domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDao {

    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    public BoardDao() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/springweb",
                    "root",
                    "1234");
        } catch (Exception e) {}
    }



}
