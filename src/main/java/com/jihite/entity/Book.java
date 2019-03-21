package com.jihite.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 图书实体
 */
@Getter
@Setter
public class Book {

	private long bookId;// 图书ID

	private String name;// 图书名称

	private int number;// 馆藏数量

	public Book() {
	}

	public Book(long bookId, String name, int number) {
		this.bookId = bookId;
		this.name = name;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", number=" + number + "]";
	}


}
