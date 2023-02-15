package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class BankBookService {
	
	@Autowired
	private BankBookDAO bankBookDAO;
	private final String NAMESPACE="com.iu.s1.bankBook.BankBookDAO.";
	
	public List<BankBookDTO> getBankBookList(Pager pager)throws Exception{
		
		
		
		Long totalCount = bankBookDAO.getBankBookCount();//30
		
		pager.makeNum(totalCount);
		pager.makeRow();
		
		return bankBookDAO.getBankBookList(pager);
	}
	
	public BankBookDTO getBankBookDetail(BankBookDTO bankBookDTO)throws Exception{
		 return bankBookDAO.getBankBookDetail(bankBookDTO);
	}
	
	public int setBankBookAdd(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookAdd(bankBookDTO);
	}
	public int setBankBookUpdate(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookUpdate(bankBookDTO);
	}
	
	public int setBankBookDelete(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.setBankBookDelete(bankBookDTO);
	}
}
