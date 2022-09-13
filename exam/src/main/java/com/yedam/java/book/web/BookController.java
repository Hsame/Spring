package com.yedam.java.book.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	BookService service;
	
	// 전체조회
	@GetMapping("/bookList")
	public String selectBookList(Model model) {
		model.addAttribute("bookList", service.getBookList());
		return "book/booklist";
	}
	
	// 등록페이지 이동
	@GetMapping("/bookInsert")
	public String BookInsert(Model model) {
		model.addAttribute("no", service.getBookNo());
		return "book/bookInsert";
	}

	// 등록처리
	@RequestMapping(value = "/bookInsert", method = RequestMethod.POST)
	public String BookInsertProc(BookVO vo) {
		// 커맨드객체
		logger.debug(vo.toString());
		System.out.println(vo);
		service.insert(vo);
		System.out.println(vo.getBookNo() + "책번호 등록");
		return "rediect:bookList";
	}
	
	// 등록페이지 이동
	@GetMapping("/rentList")
	public String BookRentList(Model model) {
		model.addAttribute("BookRentList", service.getBookRentList());
		return "book/bookRentList";
	}

}
