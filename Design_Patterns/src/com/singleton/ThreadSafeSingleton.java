package com.singleton;

/**
 * @author kaustavmanna
 *
 */
public class ThreadSafeSingleton
{
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton()
	{
		/*For Future Use*/
	}
	
	public static ThreadSafeSingleton getInstance()
	{
		if(instance == null)
		{
			synchronized(ThreadSafeSingleton.class)
			{
				/*After getting the lock checking again if the object is created or not*/
				if(instance == null)
					instance = new ThreadSafeSingleton();
			}
		}
		
		return instance;
	}

}
