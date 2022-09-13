package com.yedam.java.todoList.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todoList.service.TodoListService;
import com.yedam.java.todoList.service.TodoListVO;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TodoRestController {
	
	@Autowired
	TodoListService service;
	
	//전체조회 
	@GetMapping("/todoSelect")
	public List<TodoListVO> getTodoList() {
		return service.getTodoList();
	}
	
	@PostMapping("/todoInsert")
	public TodoListVO insertTodoList(TodoListVO todoVO) {
		service.insertTodoList(todoVO);
		return todoVO;
	}
	
	@PutMapping("/todoUpdate/{no}/{todoyn}") 
	public TodoListVO updateTodoList(@PathVariable int no,@PathVariable String todoyn, TodoListVO todoVO) {
		todoVO.setNo(no);
		todoVO.setTodoyn(todoyn);
		service.updateTodoList(todoVO);
		return todoVO;
	}
	
	@DeleteMapping("/delete/{no}")
	public TodoListVO deleteTodoList(@PathVariable int no) {
		TodoListVO todoVO = new TodoListVO();
		todoVO.setNo(no);
		service.deleteTodoList(todoVO);
		return todoVO;
	}

}
