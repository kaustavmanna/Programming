package com.trafficlight;

/**
 * @author kaustavmanna
 *
 */
public class Light
{
	private Color color;
	private boolean state;
	
	public Light(Color color)
	{
		this.color = color;
	}
	
	public boolean getState()
	{
		return this.state;
	}
	
	public void changeState()
	{
		state = !state;
		if(state == true)
			System.out.println(color + " is on!");
		else
			System.out.println(color + " is Off!");
	}
	
	public Color getColor()
	{
		return this.color;
	}
}
