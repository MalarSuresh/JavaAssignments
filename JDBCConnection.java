package com.learnJava.week2.Assignment;
import java.sql.*;
import java.util.Properties;

public class JDBCConnection {
   private static String url="jdbc:mysql://localhost:3306/customerdb";

    public static Connection getConnection() throws Exception{
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "********");
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url,info);
    }


    public static void closeConnection(Connection conn){
        if (conn!= null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Closing attempt error : Please ignore");
            }
        }
    }

    }
