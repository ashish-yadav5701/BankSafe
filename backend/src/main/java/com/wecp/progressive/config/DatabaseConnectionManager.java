package com.wecp.progressive.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private static String  JDBC_URL="jdbc:mysql://localhost:3306/banksafe_wecp";
    private static String JDBC_USER="root";
    private static String JDBC_PASSWORD="root";

  public static Connection getConnection() throws SQLException{
    
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
    
  }
}
