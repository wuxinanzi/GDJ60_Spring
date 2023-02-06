package com.iu.s1.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	
	   public void setMemberDAO(MemberDAO memberDAO) {
	      
		   this.memberDAO = memberDAO;
	   }
	   
	 
}
