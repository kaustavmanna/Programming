package com.content;

/**
 * @author kaustavmanna
 *
 */
public interface Content
{
	public String getISBN();
	public String getTitle();
	public String getAuthor();
	public String getPublisher();
	public int getPublishingYear();
	public String getEdition();
	public int getAvailableCount();
	public void setAvailableCount(int count);
}