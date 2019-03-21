package com.jihite.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 预约图书实体
 */
@Getter
@Setter
public class Appointment {

	private long bookId;// 图书ID

	private long studentId;// 学号

	private Date appointTime;// 预约时间

	// 多对一的复合属性
	private Book book;// 图书实体

	public Appointment() {
	}

	public Appointment(long bookId, long studentId, Date appointTime) {
		this.bookId = bookId;
		this.studentId = studentId;
		this.appointTime = appointTime;
	}

	public Appointment(long bookId, long studentId, Date appointTime, Book book) {
		this.bookId = bookId;
		this.studentId = studentId;
		this.appointTime = appointTime;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + "]";
	}

}
