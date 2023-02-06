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
	   
	   public List<MemberDTO> getMemberList() throws Exception {
	      return memeberDAO.getMemberList();
	   }
	   
	   public int setAddProduct(ProductDTO productDTO, List<ProductOptionDTO> ar) throws Exception {
		  int productNum = productDAO.getProductNum();
	      productDTO.setProduct_Num(productNum);
	      int result = productDAO.setAddProduct(productDTO);
	      
	      if(ar != null) {
	      
	      for(ProductOptionDTO productOptionDTO:ar) {
	         productDAO.setAddProductOption(productOptionDTO);
	         result = productDAO.setAddProductOption(productOptionDTO);
	      }
	      }
	      return result;
	   }

}
