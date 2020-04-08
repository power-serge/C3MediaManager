package com.c3mm.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookModel extends AbstractMediaModel
{
	final static String ISBN = "ISBN";
	
	private String isbn = null;
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void retrieveModelbyISBN(String isbn)
	{
		Connection con = null;
		PreparedStatement stmt = null;
		try
		{
			String url = "jdbc:sqlite:C:\\db\\media\\media.db";
			con = DriverManager.getConnection(url);
			String sql = "select * from books where isbn = ?";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, isbn);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next() == false)
			{
				System.out.println("Query Returned no results");
			}
			else
			{
				do
				{
					this.setRec_id(rs.getInt(REC_ID));
					this.setIsbn(rs.getString(ISBN));
					this.setTitle(rs.getString(TITLE));
					this.setAuthor(rs.getString(AUTHOR));
					this.setLocation(rs.getString(LOCATION));
					this.setPubDate(rs.getString(PUBDATE));
					this.setStatus(rs.getString(STATUS));
				}
				while (rs.next());
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
	}
}
