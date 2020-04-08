package com.c3mm.model;

public abstract class AbstractMediaModel
{
	final static String REC_ID = "REC_ID";	
	final static String TITLE = "TITLE";
	final static String AUTHOR = "AUTHOR";
	final static String LOCATION = "LOCATION";
	final static String PUBDATE = "PUBDATE";
	final static String STATUS = "STATUS";
	
	private int rec_id = 0;
	private String status;
	private String author;
	private String title;
	private String location;
	private String pubDate; // publication date
	
	/**
	 * Default No arg constructor Initializes all the instance variables to default
	 * values
	 */
	public AbstractMediaModel()
	{
		this.setRec_id(0);
		this.status = "";
		this.author = "";
		this.title = "";
		this.location = "";
		this.pubDate = "";
	}
	
	/**
	 * Convenience method to create a Model object with all parameters given
	 * @param record_id
	 * @param status
	 * @param author
	 * @param title
	 * @param location
	 * @param pubDate
	 */
	public AbstractMediaModel(int record_id, String status, String author, String title, String location, String pubDate)
	{
		this.setRec_id(record_id);
		this.status = status;
		this.author = author;
		this.title = title;
		this.location = location;
		this.pubDate = pubDate;
	}
	
	public int getRec_id()
	{
		return rec_id;
	}
	
	public void setRec_id(int rec_id)
	{
		this.rec_id = rec_id;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setLocation(String location)
	{
		this.location = location;
	}
	
	public String getPubDate()
	{
		return pubDate;
	}
	
	public void setPubDate(String pubDate)
	{
		this.pubDate = pubDate;
	}
	
}
