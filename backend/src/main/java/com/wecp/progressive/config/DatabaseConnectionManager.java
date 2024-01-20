package com.wecp.progressive.config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

public class DatabaseConnectionManager {
  private static final Properties properties = new Properties();
  static {
    loadProperties();
  }
  
  private static void loadProperties() {
    try (InputStream input=DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
      if(input==null){
        throw new IllegalStateException("resource.properties not found in classpath");
      }
      properties.load(input);
    } catch (IOException e) {
      // TODO: handle exception
      throw new RuntimeException("Error::Unable to load properties file",e);
    }

  }

  public static Connection getConnection() throws SQLException{
    String JDBC_URL= properties.getProperty("spring.datasource.url");
    String JDBC_USER= properties.getProperty("spring.datasource.username");
    String JDBC_PASSWORD= properties.getProperty("spring.datasource.password");
    return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

}
}
