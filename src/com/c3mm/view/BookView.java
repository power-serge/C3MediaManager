package com.c3mm.view;

import java.util.HashMap;

public class BookView
{
	public void printBookInfo(HashMap<String, String> the_map)
	{
		if (the_map.isEmpty())
			System.out.println("Query returned no results");
		
		System.out.println("Book Info");
		System.out.println("------------------------");
		System.out.println("Title: " + the_map.get(Columns.TITLE));
		System.out.println("Author: " + the_map.get(Columns.AUTHOR));
		System.out.println("Published on: " + the_map.get(Columns.PUBDATE));
		System.out.println("ISBN: " + the_map.get(Columns.ISBN));
		System.out.println("Status: " + the_map.get(Columns.STATUS));
		System.out.println("Location: " + the_map.get(Columns.LOCATION));
		System.out.println();
	}
}
