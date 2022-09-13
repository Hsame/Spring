package com.yedam.java.todoList.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoListService {
	//전체조회
	public List<TodoListVO> getTodoList();
	//등록
	public void insertTodoList(TodoListVO todoVO);	
	//수정
	public void updateTodoList(TodoListVO todoVO);
	//삭제
	public void deleteTodoList(TodoListVO todoVO);
	
}
