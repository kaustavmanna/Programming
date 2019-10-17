package com.user.dao;

/**
 * @author kaustavmanna
 *
 */
public class User
{
	private String card;
	private String username;
	private int pin;
	private int amount;
		
	public User(String card, String username, int pin)
	{
		this.card = card;
		this.pin = pin;
		this.amount = 0;
	}
	
	public synchronized boolean isValidPin(int pin)
	{
		if(this.pin == pin)
			return true;
		else
			return false;
	}
	
	public String getCard()
	{
		return this.card;
	}
	
	public String getUserName()
	{
		return this.username;
	}
	
	public synchronized void setPin(int pin)
	{
		this.pin = pin;
		System.out.println("New Pin has been set!");
	}
	
	public synchronized int getAmount()
	{
		return this.amount;
	}
	
	public synchronized void updateAmount(int amount)
	{
		this.amount -= amount;
	}
}
