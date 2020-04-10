package com.c3mm.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.HashMap;

public abstract class AbstractMediaModel
{
	private int rec_id = 0;
	private String status;
	private String title;
	private String location;
	private String pubDate; // publication date
	
	private HashMap<String, String> values = new HashMap<String, String>();
	
	/**
	 * Default No arg constructor Initializes all the instance variables to default
	 * values
	 */
	public AbstractMediaModel()
	{
		this.setRec_id(0);
		this.status = "";
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
	public AbstractMediaModel(int record_id, String status, String author, String title, String location,
			String pubDate)
	{
		this.setRec_id(record_id);
		this.status = status;
		this.title = title;
		this.location = location;
		this.pubDate = pubDate;
	}
	
	public HashMap<String, String> retrieveModel(String table, String column, String value)
	{
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet results = null;
		try
		{
			String url = "jdbc:sqlite:C:\\db\\media\\media.db";
			con = DriverManager.getConnection(url);
			String sql = "select * from " + table + " where " + column + " = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, value);
			
			results = stmt.executeQuery();
			ResultSetMetaData rsmd = results.getMetaData();
			int numberOfColumns = rsmd.getColumnCount();
			
			if (results.next() == false)
			{
				System.out.println("Query Returned no results");
			}
			else
			{
				do
				{
					for (int i=1; i<=numberOfColumns; i++)
					{
						values.put(rsmd.getColumnName(i), results.getString(i));
					}
				}
				while (results.next());
			}
			
			if (stmt != null)
			{
				stmt.close();
			}
			
			if (con != null)
			{
				con.close();
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return values;
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

	public HashMap<String, String> getResults()
	{
		return values;
	}
}
