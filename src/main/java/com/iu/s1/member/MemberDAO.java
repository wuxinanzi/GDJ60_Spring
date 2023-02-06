package com.iu.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.s1.util.DBConnection;

public class MemberDAO {
   
   public String getMEMBER_ID() throws Exception{
      Connection connection = DBConnection.getConnection();
      
      String sql = "SELECT * FROME MEMEBER";
      
      PreparedStatement st = connection.prepareStatement(sql);
      
      ResultSet rs = st.executeQuery();
      
      rs.next();
      
      String id = rs.getString(getMEMBER_ID());
      
      DBConnection.disConnection(rs, st, connection);
      
      return toString();
      
   }
   
}
