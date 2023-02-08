package com.iu.s1.member;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.iu.s1.MyTestCase;
import com.iu.s1.product.ProductDTO;


public class MemberDAOTest extends MyTestCase{
	
	private MemberDAO memberDAO;
	
	@Test
	public void setMemberJoinTest() throws Exception{
		
		List<MemberDTO> ar = memberDAO.setMemberJoin();
		//단정문
		assertNotEquals(0,ar.size());
	
	}
	@Test
	public void getProductDetailTest() throws Exception{
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductNum(11L);

			assertNotNull(productDTO);
	}
	}
	
//	//insert
//	public void setProductAddTest() throws Exception{
//		ProductDTO productDTO = new ProductDTO();
//		productDTO.setProductNum(2L);
//		productDTO.setProductName("Test");
//		productDTO.setProductDetail("TestDetail");
//		int result = productDAO.setProductAdd(productDTO);
//		assertEquals(1, result);
//	}
//	
//}


