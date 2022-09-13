package com.yedam.java.book.service;

import java.util.List;

public interface BookService {

	public int getBookNo();

	public int insert(BookVO vo);

	public List<BookVO> getBookList();
	
	public List<BookRentVO> getBookRentList();

}
