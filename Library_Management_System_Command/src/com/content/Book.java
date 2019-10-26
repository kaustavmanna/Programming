package com.content;

/**
 * @author kaustavmanna
 *
 */
public class Book implements Content
{
	private String ISBN;
	private String title;
	private String author;
	private String publisher;
	private int publish_year;
	private String edition;
	private int available_count;
	
	public Book()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getISBN()
	{
		return ISBN;
	}
	
	@Override
	public String getTitle()
	{
		return title;
	}

	@Override
	public String getAuthor()
	{
		return author;
	}

	@Override
	public String getPublisher()
	{
		return publisher;
	}

	@Override
	public int getPublishingYear()
	{
		return publish_year;
	}

	@Override
	public String getEdition()
	{
		return edition;
	}
	
	@Override
	public int getAvailableCount()
	{
		return available_count;
	}
	
	@Override
	public void setAvailableCount(int available_count)
	{
		this.available_count = available_count;
	}
}
