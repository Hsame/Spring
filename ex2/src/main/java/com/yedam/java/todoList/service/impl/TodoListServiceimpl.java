package com.yedam.java.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todoList.mapper.TodoListMapper;
import com.yedam.java.todoList.service.TodoListService;
import com.yedam.java.todoList.service.TodoListVO;

@Service
public class TodoListServiceimpl implements TodoListService {
	
	@Autowired
	TodoListMapper todoListMapper;
	
	@Override
	public List<TodoListVO> getTodoList() {
		return todoListMapper.getTodoList();
	}

	@Override
	public void insertTodoList(TodoListVO todoVO) {
		todoListMapper.insertTodoList(todoVO);	
	}

	@Override
	public void updateTodoList(TodoListVO todoVO) {
		todoListMapper.updateTodoList(todoVO);
	}

	@Override
	public void deleteTodoList(TodoListVO todoVO) {
		todoListMapper.deleteTodoList(todoVO.getNo());
	}

}
