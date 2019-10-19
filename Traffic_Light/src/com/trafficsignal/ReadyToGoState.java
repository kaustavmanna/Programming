package com.trafficsignal;

import com.trafficlight.*;

/**
 * @author kaustavmanna
 *
 */
public class ReadyToGoState implements TrafficSignalState
{
	private Signal signal;

	protected ReadyToGoState(Signal signal)
	{
		this.signal = signal;
	}

	@Override
	public void display()
	{
		System.out.println(signal.getID() + " is in Ready To Go State Now!");
		for(int i = 0; i < signal.signal_light.size(); i++)
		{
			Light light = signal.signal_light.get(i);
			
			if(light.getColor() != Color.Yellow && light.getState() != false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is off!");
			}
			
			else if(light.getColor() == Color.Yellow && light.getState() == false)
			{
				light.changeState();
				System.out.println(signal.getID() + ": " + light.getColor() + " is on!");
			}
		}
	}

	@Override
	public void setState()
	{
		signal.state = new GoState(signal);
		signal.state.display();
	}
}
