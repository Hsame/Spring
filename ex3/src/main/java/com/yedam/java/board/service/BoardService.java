package com.yedam.java.board.service;

import java.util.List;

public interface BoardService {
	//게시글 번호 조회
	public int getBoardNo();
	//게시글 등록
	public int boardInsert(BoardVO boardVO);	
	//게시글 전체 조회
	public List<BoardVO> getAllBoard();
}
