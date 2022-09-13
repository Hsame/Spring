package com.yedam.java.todoList.mapper;

import java.util.List;

import com.yedam.java.todoList.service.TodoListVO;

public interface TodoListMapper {
	//전체조회
	public List<TodoListVO> getTodoList();
	//등록
	public void insertTodoList(TodoListVO todoVO);	
	//수정
	public void updateTodoList(TodoListVO todoVO);
	//삭제
	public int deleteTodoList(int no);

}
