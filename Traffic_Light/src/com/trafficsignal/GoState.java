package com.trafficsignal;

import com.trafficlight.*;

/**
 * @author kaustavmanna
 *
 */
public class GoState implements TrafficSignalState
{
	private Signal signal;

	protected GoState(Signal signal)
	{
		this.signal = signal;
	}

	@Override
	public void display()
	{
		System.out.println(signal.getID() + " is in Go State Now!");
		for(int i = 0; i < signal.signal_light.size(); i++)
		{
			Light light = signal.signal_light.get(i);
			
			if(light.getColor() != Color.Green && light.getState() != false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is off!");
			}
			
			else if(light.getColor() == Color.Green && light.getState() == false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is on!");
			}
		}
	}

	@Override
	public void setState()
	{
		signal.state = new SlowDownState(signal);
		signal.state.display();
	}
}
