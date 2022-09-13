package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookRentVO;
import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	
	//전체조회
	public List<BookVO> getBookList();
	//번호
	public BookVO getBookNo();
	//insert
	public int insert(BookVO vo);
	//책 대여
	public List<BookRentVO> getBookRentList();

}
