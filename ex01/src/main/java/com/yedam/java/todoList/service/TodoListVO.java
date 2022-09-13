package com.yedam.java.todoList.service;

import lombok.Data;

@Data
public class TodoListVO {
	/*
	 * no number primary key, 
	 * id number, 
	 * contents varchar2(100), 
	 * todoyn char(1) default '0'
	 */
	
	private int no;
	private int id;
	private String contents;
	private String todoyn;

}
