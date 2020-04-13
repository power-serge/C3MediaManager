package com.c3mm;

import com.c3mm.client.controller.BookController;
import com.c3mm.client.model.BookModel;
import com.c3mm.client.view.BookView;
import com.c3mm.server.dba.MediaDB;

public class BookTest
{
	public static void main(String[] args)
	{
		String isbn = "1234567890";
		BookModel book = MediaDB.getBook(isbn);
		BookView view = new BookView();
		BookController controller = new BookController(book, view);
		System.out.println(controller.getBookAuthor());
		System.out.println(controller.getBookName());
		
		controller.updateView();
		
		controller.setBookAuthor("Chechi");
		controller.setBookName("My Book");
		controller.updateView();
	}
}
