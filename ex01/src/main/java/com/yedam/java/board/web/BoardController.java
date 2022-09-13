package com.yedam.java.board.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	BoardService service;

	// 등록 - 입력폼
	@GetMapping("/insert")
	public String insertForm(Model model) {
		model.addAttribute("no", service.getBoardNo());
		return "board/boardInsert";
	}

	// 등록- DB insert
	@PostMapping("/insert")
	public String insertBook(BoardVO BoardVO) {
		service.insertBoard(BoardVO);
		return "redirect:list";
	}

	// 전체조회
	@GetMapping("/list")
	public String selectBoardList(Model model) {
		model.addAttribute("boardList", service.getBoardList());
		return "board/boardList";
	}

	// 단건조회
	@GetMapping("/info")
	public String selectBoardInfo(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardInfo";
	}
	
	//수정 - 폼
	@GetMapping("/update")
	public String updateForm(BoardVO boardVO, Model model) {
		model.addAttribute("board", service.getBoardInfo(boardVO));
		return "board/boardUpdate";
	}
	
	//수정 -DB update
	@PostMapping("/update")
	public String updateBoardInfo(BoardVO boardVO) {
		service.updateBoard(boardVO);
		return "redirect:list";
	}
}
