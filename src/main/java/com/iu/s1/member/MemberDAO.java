package com.iu.s1.member;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.iu.s1.util.DBConnection;
@Repository
public class MemberDAO {
	
	//setAddMember
	public int setAddMember(MemberDTO memberDTO) throws Exception{
	
	Connection con =  DBConnection.getConnection();
	
	String sql ="INSERT INTO MEMBER(ID,PW,NAME,ADDRESS,PHONENUM,EMAIL)"
			+ "VALUSE(?,?,?,?,?,?)";
	
	PreparedStatement st = con.prepareStatement(sql);
	
	st.setString(1, memberDTO.getId());
	st.setString(2, memberDTO.getPw());
	st.setString(3, memberDTO.getName());
	st.setString(4, memberDTO.getAddress());
	st.setString(5, memberDTO.getPhone());
	st.setString(6, memberDTO.getEmail());
	
	int result = st.executeUpdate();
	
	DBConnection.disConnection(st, con);
	
	
	return result;
	
	
	}
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("id1");
		memberDTO.setPw("pw1");
		memberDTO.setName("name1");
		memberDTO.setAddress("address1");
		memberDTO.setPhone("Phone1");
		memberDTO.setEmail("Email1");
		try {
		int result	= memberDAO.setAddMember(memberDTO);
		System.out.println(result != 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
