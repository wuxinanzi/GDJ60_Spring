package com.iu.s1.product;

import org.springframework.stereotype.Component;

@Component
public class ProductOptionDTO {
	
	  
	   private Integer optionNum;
	   private Integer productNum;
	   private String optionName;
	   private Integer optionPrice;
	   private Double optionStock;
	   
	   public Integer getOptionNum() {
	      return optionNum;
	   }
	   public void setOptionNum(Integer optionNum) {
	      this.optionNum = optionNum;
	   }
	   public Integer getProductNum() {
	      return productNum;
	   }
	   public void setProductNum(Integer productNum) {
	      this.productNum = productNum;
	   }
	   public String getOptionName() {
	      return optionName;
	   }
	   public void setOptionName(String optionName) {
	      this.optionName = optionName;
	   }
	   public Integer getOptionPrice() {
	      return optionPrice;
	   }
	   public void setOptionPrice(Integer optionPrice) {
	      this.optionPrice = optionPrice;
	   }
	   public Double getOptionStock() {
	      return optionStock;
	   }
	   public void setOptionStock(Double optionStock) {
	      this.optionStock = optionStock;
	   }
	   
	   
	   
	}
	
	

