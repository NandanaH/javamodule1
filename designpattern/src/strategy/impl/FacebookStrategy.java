package strategy.impl;

import startegy.iface.ISocialMediaStrategy;

public class FacebookStrategy implements ISocialMediaStrategy {
	

		public void connectTo(String friendName) 
		  {
		    System.out.println(
		    		"Connecting with " + friendName + " through Facebook");
		  }

	}



