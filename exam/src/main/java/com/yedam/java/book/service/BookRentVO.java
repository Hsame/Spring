package com.yedam.java.book.service;

import lombok.Data;

@Data
public class BookRentVO {
	
	private int bookNo;
	private String bookName;
	private int rentPirce;
	private int rentStatus;
	
}
