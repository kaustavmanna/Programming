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
		this.state = false;
	}
	
	public boolean getState()
	{
		return this.state;
	}
	
	public void changeState()
	{
		state = !state;
	}
	
	public Color getColor()
	{
		return this.color;
	}
}
