package com.iu.s1.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.iu.s1.board.BbsDTO;
import com.iu.s1.board.BoardDAO;
import com.iu.s1.board.BoardDTO;
import com.iu.s1.util.Pager;

public class NoticeDAO implements BoardDAO {
	
	private SqlSession session;
	
	private final String NAMESPACE = "com.iu.s1.board.NoticeDAO.";
	
	@Override
	public Long getTotalCount(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BbsDTO> getBoardList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setBoarAdd(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardUpdate(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setBoardDelete(BbsDTO bbsDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO getBoarDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
