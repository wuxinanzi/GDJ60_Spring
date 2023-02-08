package com.iu.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.iu.s1.product.ProductOptionDTO;
import com.iu.s1.util.DBConnection;
@Repository
public class MemberDAO {
	
	//setAddMember
	
	
//
//	public MemberDTO getId(MemberDTO memberDTO) throws Exception{
//		
//		Connection connection = DBConnection.getConnection();
//		String sql = "SELECT * FROM MEMBER";
//		PreparedStatement st = connection.prepareStatement(sql);
//		st.set(1,)
//	}
//}	
public List<MemberDTO> setMemberJoin() throws Exception {
    List<MemberDTO> ar = new ArrayList<MemberDTO>();
    
    Connection con = DBConnection.getConnection();
    
    String sql = "SELECT * FROM MEMBER";
    
    PreparedStatement st = con.prepareStatement(sql);
    
    ResultSet rs = st.executeQuery();
    
    while(rs.next()) {
       MemberDTO memberDTO = new MemberDTO();
       memberDTO.setId(rs.getString("ID"));
       memberDTO.setPw(rs.getString("PW"));
       memberDTO.setName(rs.getString("NAME"));
       memberDTO.setAddress(rs.getString("PHONE"));
       memberDTO.setEmail(rs.getString("EMAIL"));
       ar.add(memberDTO);
    }
    
    DBConnection.disConnection(rs, st, con);
    
    return ar;
    
 }


}