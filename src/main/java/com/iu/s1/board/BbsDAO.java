package com.iu.s1.board;

import java.util.List;

import com.iu.s1.util.Pager;

public interface BbsDAO {

	//totalCount
	public  Long  getTotalCount(Pager pager)throws Exception;
	
	//LIST
	public List<BbsDTO> getBoardList(Pager pager) throws Exception;
	
	//INSERT(ADD)
	public int setBoarAdd(BbsDTO bbsDTO)throws Exception;
	
	//UPDATE
	public int setBoardUpdate(BbsDTO bbsDTO)throws Exception; 
	
	//DELETE
	public  int setBoardDelete(BbsDTO bbsDTO)throws Exception;
}
