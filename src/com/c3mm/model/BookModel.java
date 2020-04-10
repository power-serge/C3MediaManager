package com.c3mm.model;

import com.c3mm.view.Columns;

public class BookModel extends AbstractMediaModel
{
	private String isbn = null;
	private String author = null;
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void retrieveModelbyISBN(String isbn)
	{
		retrieveModel("books", "isbn", isbn);
		
		this.setRec_id(Integer.parseInt(getResults().get(Columns.REC_ID)));
		this.setIsbn(getResults().get(Columns.ISBN));
		this.setTitle(getResults().get(Columns.TITLE));
		this.setAuthor(getResults().get(Columns.AUTHOR));
		this.setLocation(getResults().get(Columns.LOCATION));
		this.setPubDate(getResults().get(Columns.PUBDATE));
		this.setStatus(getResults().get(Columns.STATUS));
	}
}
