package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.product.ProductDTO;

@Controller
@RequestMapping("/bankBook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	//list
	@RequestMapping(value="list", method = RequestMethod.GET)
	public ModelAndView getBankBookList()throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BankBookDTO> ar = bankBookService.getBankBookList();
		   //System.out.println(ar.size()>0);
	       mv.setViewName("bankBook/list");
	       mv.addObject("list",ar);
		
		return mv;
	}
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public ModelAndView getBankBookDetail(BankBookDTO bankBookDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		bankBookDTO  = bankBookService.getBankBookDetail(bankBookDTO);
		
		mv.setViewName("bankBook/detail");
		mv.addObject("dto", bankBookDTO);
		
		
		return mv;
	}
	//add form 이동
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public ModelAndView setBankBookAdd(ModelAndView mv)throws Exception{
		mv.setViewName("bankBook/add");
		return mv;
	}
	//add DB Insert
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setBankBookAdd(BankBookDTO bankBookDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		int result = bankBookService.setBankBookAdd(bankBookDTO);//디비를 가야되니까 매개타입과 매개변수 작성
		
		mv.setViewName("redirect:./list");
		
		return mv;
		
	}
	//delelte
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView setBankBookDelete(BankBookDTO bankBookDTO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		int result = bankBookService.setBankBookDelete(bankBookDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
		
	}
	
	//수정 폼 이동
	@RequestMapping(value="update", method = RequestMethod.GET)
	public ModelAndView setBankBookUpdate(BankBookDTO bankBookDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		bankBookDTO = bankBookService.getBankBookDetail(bankBookDTO);
		mv.setViewName("bankBook/update");
		mv.addObject("dto", bankBookDTO);
		return mv;
	}
	
	public ModelAndView setBankBookUpdate(BankBookDTO bankBookDTO, ModelAndView mv) throws Exception{
		
		return mv;
		
	}
}
