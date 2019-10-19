package com.trafficsignal;

import com.trafficlight.*;
import java.util.ArrayList;

/**
 * @author kaustavmanna
 *
 */
public class Signal
{
	private String signal_id;
	protected ArrayList<Light> signal_light;
	protected TrafficSignalState state;
	
	public Signal(String signal_id)
	{
		this.signal_id = signal_id;
		this.signal_light = new ArrayList<Light>();
		this.state = new OffState(this);
	}
	
	public String getID()
	{
		return this.signal_id;
	}
	
	public void addLight(Color color)
	{
		for(int i = 0; !signal_light.isEmpty() && i < signal_light.size(); i++)
		{
			if(signal_light.get(i).getColor() == color)
			{
				System.out.println(color + " is already added!");
				return;
			}
		}
		
		Light newlight = new Light(color);
		signal_light.add(newlight);
		System.out.println(color + " is added to the Traffic Signal: " + signal_id);
	}
	
	public void removeLight(Color color)
	{
		for(int i = 0; i < signal_light.size(); i++)
		{
			if(signal_light.get(i).getColor() == color)
			{
				signal_light.remove(i);
				System.out.println(color + " is removed from the Traffic Signal: " + signal_id);
				break;
			}	
		}
	}
	
	public void changeSignal()
	{
		state.setState();
	}
		
	public void turn_off()
	{
		state = new OffState(this);
	}
}
