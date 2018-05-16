package com.soecode.lyf.entity;

import java.util.Date;

public class Appointment {
	private long bookId;//图书ID
	private long studentId;//学号
	private Date appointMent;//预约时间
	private Book book;//图书实体
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public Date getAppointMent() {
		return appointMent;
	}
	public void setAppointMent(Date appointMent) {
		this.appointMent = appointMent;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
}
