package com.singleton;

/**
 * @author kaustavmanna
 *
 */
public class EagerInitializedSingleton
{
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton()
	{
		/*For Future Purpose*/
	}
	
	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
}
