package com.trafficsignal;

import com.trafficlight.*;

/**
 * @author kaustavmanna
 *
 */

public class OffState implements TrafficSignalState
{
	private Signal signal;
	
	protected OffState(Signal signal)
	{
		this.signal = signal;
	}
	
	public void display()
	{
		System.out.println(signal.getID() + " is Turned Off Now!");
		for(int i = 0; i < signal.signal_light.size(); i++)
		{
			Light light = signal.signal_light.get(i);
			
			if(light.getState() != false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is off!");
			}
		}
	}
	
	public void setState()
	{
		signal.state = new StopState(signal);
		signal.state.display();
	}
}
