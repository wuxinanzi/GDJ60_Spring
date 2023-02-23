package com.iu.s1.board.notice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.MyTestCase;
import com.iu.s1.util.Pager;

public class NoticeDAOTest extends MyTestCase{
    
	@Autowired
	private NoticeDAO noticeDAO;
	
	@Test
	public void getBoardListTest()throws Exception{
		Pager pager = new Pager();
		pager.setKind("writer");
	    pager.setSearch("나");
	}
}
