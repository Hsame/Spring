package com.yedam.java.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookRentVO;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceimpl implements BookService{
	
	@Autowired
	BookMapper mapper;
	
	@Override
	public int getBookNo() {
		BookVO vo = mapper.getBookNo();
		return vo.getBookNo();
	}
	
	@Override
	public int insert(BookVO vo) {
		return mapper.insert(vo);
	}
	
	@Override
	public List<BookVO> getBookList() {	
		return mapper.getBookList();
	}
	
	@Override
	public List<BookRentVO> getBookRentList() {
		return mapper.getBookRentList();
	}

}
