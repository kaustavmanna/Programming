package com.trafficsignal;

import com.trafficlight.*;

/**
 * @author kaustavmanna
 *
 */

public class StopState implements TrafficSignalState
{
	private Signal signal;
	
	protected StopState(Signal signal)
	{
		this.signal = signal;
	}
	
	public void display()
	{
		System.out.println(signal.getID() + " is in Stop State Now!");
		for(int i = 0; i < signal.signal_light.size(); i++)
		{
			Light light = signal.signal_light.get(i);
			
			if(light.getColor() != Color.Red && light.getState() != false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is off!");
			}
			
			else if(light.getColor() == Color.Red && light.getState() == false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is on!");
			}
		}
	}
	
	public void setState()
	{
		signal.state = new ReadyToGoState(signal);
		signal.state.display();
	}
}
