package com.yedam.java.board.mapper;

import java.util.List;

import com.yedam.java.board.service.BoardVO;

public interface BoardMapper {
	//게시글 번호 조회
	public int getBoardNo();	
	//게시글 등록
	public int insertBoard(BoardVO boardVO);	
	//게시글 전체조회
	public List<BoardVO> selectAllBoardList();
}
