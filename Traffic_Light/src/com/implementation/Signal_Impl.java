package com.implementation;

import com.trafficsignal.Signal;
import com.trafficlight.Color;

/**
 * @author kaustavmanna
 *
 */

public class Signal_Impl
{
	public static void main(String[] args)
	{
		Signal signal1 = new Signal("Tram Depot");
		Signal signal2 = new Signal("Manton");
		
		signal1.addLight(Color.Red);
		signal1.addLight(Color.Yellow);
		signal1.addLight(Color.Green);
		
		signal2.addLight(Color.Red);
		signal2.addLight(Color.Yellow);
		signal2.addLight(Color.Green);
		
		signal1.changeSignal();
		signal2.changeSignal();
		signal1.changeSignal();
		signal2.changeSignal();
	}
}
