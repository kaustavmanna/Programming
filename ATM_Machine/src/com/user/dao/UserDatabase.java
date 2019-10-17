package com.user.dao;

import java.util.ArrayList;

/**
 * @author kaustavmanna
 *
 */
public class UserDatabase
{
	private ArrayList<User> userlist;
	
	public UserDatabase()
	{
		userlist = new ArrayList<User> ();
	}
	
	public void addUser(String card, String username, int pin)
	{
		if(card.length() != 10)
			System.out.println("Card Number should be 10 digits!");
		else if(username.length() < 5 || (username.charAt(0) < 65 || username.charAt(0) > 90))
			System.out.println("Invaid User Name!... User Name should start with A-Z");
		else if(pin < 0 || pin > 9999)
			System.out.println("Invalid Pin!... Valid range of Pin is 0000 to 9999");
		else
		{
			User newuser = new User(card, username, pin);
			userlist.add(newuser);
		}
	}
	
	
}
