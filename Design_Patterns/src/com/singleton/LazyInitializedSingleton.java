package com.singleton;

/**
 * @author kaustavmanna
 *
 */
public class LazyInitializedSingleton
{
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton()
	{
		/*For Future Purpose*/
	}
	
	public static LazyInitializedSingleton getInstance()
	{
		if(instance == null)
			instance = new LazyInitializedSingleton();
		
		return instance;
	}
}
