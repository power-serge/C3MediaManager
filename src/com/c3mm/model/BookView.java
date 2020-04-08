package com.c3mm.model;
public class BookView
{
	public void printBookInfo(BookModel book)
	{
		if ( !(book.getRec_id() == 0) )
		{
			System.out.println("Book Info");
			System.out.println("------------------------");
			System.out.println("title: " + book.getTitle());
			System.out.println("author: " + book.getAuthor());
			System.out.println("Published on: " + book.getPubDate());
			System.out.println("isbn: " + book.getIsbn());
			System.out.println("status: " + book.getStatus());
			System.out.println("location: " + book.getLocation());
			System.out.println();
		}
		else
		{
			System.out.println("Unable to update view. Please review your given values");
		}
	}
}
