package com.iu.s1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
   
   


   public static Connection getConnection() throws Exception {
      //1. 접속 정보 준비
      //1. id
      String username ="hr";
      //.2 pw
      String password ="hr";
      //3.URL IP&PORTnum
      String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
      //.4 driver
      String driver = "oracle.jdbc.driver.OracleDriver";
      
      
      Class.forName(driver);
      //DB 접속 실행
      //2. DB 접속 실행
      Connection connection = DriverManager.getConnection(url, username, password);
      
      return connection;


}
   public static void disConnection(ResultSet rs,PreparedStatement st, Connection connection) throws Exception {
      rs.close();
      st.close();
      connection.close();
      
   }
}