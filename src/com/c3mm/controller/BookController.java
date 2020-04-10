package com.c3mm.controller;

import com.c3mm.model.BookModel;
import com.c3mm.view.BookView;

public class BookController
{
	private BookModel book;
	private BookView view;
	
	public BookController(BookModel book, BookView view)
	{
		this.book = book;
		this.view = view;
	}
	
	public String getBookName()
	{
		return book.getTitle();
	}
	
	public String getBookAuthor()
	{
		return book.getAuthor();
	}
	
	public void setBookName(String name)
	{
		book.setTitle(name);
	}
	
	public void setBookAuthor(String author)
	{
		book.setAuthor(author);
	}
	
	public void updateView()
	{
		view.printBookInfo(book.getResults());
	}
}
