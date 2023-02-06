package com.iu.s1.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
   
	
   @Autowired
   private ProductDAO productDAO;
  

   // 결합도가 낮다(약하다)
   public void setProductDAO(ProductDAO productDAO) {
      this.productDAO = productDAO;
   }
   
   public List<ProductDTO> getProductList() throws Exception {
      return productDAO.getProductList();
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

	 


   

//   public static void main(String[] args) {
//      ProductDAO productDAO = new ProductDAO();
//      
//      ProductDTO productDTO = new ProductDTO();
//      productDTO.setProductName("product1");
//      productDTO.setProductDetail("detail1");
//      
//      ProductOptionDTO productOptionDTO = new ProductOptionDTO();
//      productOptionDTO.setOptionName("optionName1");
//      productOptionDTO.setOptionPrice(100);
//      productOptionDTO.setOptionStock(10.0);
//      productOptionDTO.setProductNum(null);
//      
//      ProductOptionDTO productOptionDTO2 = new ProductOptionDTO();
//      productOptionDTO2.setOptionName("optionName2");
//      productOptionDTO.setOptionPrice(200);
//      productOptionDTO.setOptionStock(20.0);
//      productOptionDTO.setProductNum(null);
//      
//      try {
//         int num = productDAO.getProductNum();
//         
//         productDTO.setProductNum(num);
//         
//         int result = productDAO.setAddProduct(productDTO);
//         
//         productOptionDTO.setOptionNum(num);
//         
//         if(result>0) {
//            productDAO.setAddProductOption(productOptionDTO);
//         }
//         
//      } catch(Exception e) {
//         e.printStackTrace();
//      }
//   }

public ProductDTO getProductDetail(ProductDTO productDTO) {
	// TODO Auto-generated method stub
	return null;
}
   }