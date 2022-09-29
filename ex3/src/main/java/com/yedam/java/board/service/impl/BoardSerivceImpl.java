package com.yedam.java.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Service
public class BoardSerivceImpl implements BoardService {

	@Autowired // 반드시 타입을 기준으로만 가능하진 않음. 필요한 경우 별도의 Bean 이름을 필드로 사용.
	BoardMapper mapper;
	
	@Override
	public int getBoardNo() {
		return mapper.getBoardNo();
	}

	@Override
	public int boardInsert(BoardVO boardVO) {
		return mapper.insertBoard(boardVO);
	}

	@Override
	public List<BoardVO> getAllBoard() {
		return mapper.selectAllBoardList();
	}

}
