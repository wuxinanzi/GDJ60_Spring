package com.iu.s1.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.util.Pager;

@Controller
@RequestMapping("/product/*")
public class ProductController {
		
	@Autowired
	private ProductService productService;
	
		@RequestMapping(value="list",method = RequestMethod.GET)
		public ModelAndView getProductList(ModelAndView mv,Pager pager) throws Exception {
			 
			
		
			  List<ProductDTO> ar = productService.getProductList(pager);  
//	          System.out.println(ar.size()>0);
	          mv.setViewName("product/productList");
	          mv.addObject("list",ar);
	          mv.addObject("pager", pager);
		      return mv;
		  
		}
		//getProductDetail
		
		@RequestMapping(value="detail")
		public String getProductDetail(ProductDTO productDTO, Model model) throws Exception {
			//파라미터의 이름과 setter의 이름과 같아야함
			System.out.println("Product Detail");
			//String num = request.getParameter("num");
			
			//ProductDTO productDTO = new ProductDTO();
		
			
			//productDTO.setProductNum(num);
			productDTO = productService.getProductDetail(productDTO);
			
			System.out.println(productDTO != null);
			
			model.addAttribute("dto",productDTO);
			
			return "product/productDetail";
		}
		@RequestMapping(value ="productAdd", method = RequestMethod.GET)//http://localhost/s1/product/productAdd
		public void setProductAdd() {
			
		}
		@RequestMapping(value ="productAdd", method = RequestMethod.POST )
		public String setProductAdd(ProductDTO productDTO) throws Exception {
			int result = productService.setProductAdd(productDTO, null);
			
			System.out.println(result == 1);
			return "redirect:./list";
			
		}
		
//		@RequestMapping(value ="productUpdate")
//		public void productUpdate() {
//		 
//		}
		@RequestMapping(value = "update")
		public ModelAndView update() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("prodcut/productUpdate");
			return mv;
		}
	
}
