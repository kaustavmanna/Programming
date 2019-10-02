package com.singleton;

/**
 * @author kaustavmanna
 *
 */
public class StaticBlockSingleton
{
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton()
	{
		/*For Future Use*/
	}
	
	static
	{
		try
		{
			instance = new StaticBlockSingleton();
		}
		catch(Exception e)
		{
			throw new RuntimeException("Exception occured in creating singleton instance!");
		}
	}
	
	public static StaticBlockSingleton getInstance()
	{
		return instance;
	}
}
