package strategy.context;

import startegy.iface.ISocialMediaStrategy;

public class SocialMediaContext {

	ISocialMediaStrategy smStrategy;

	public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy) {
		this.smStrategy = smStrategy;
	}

	public void connect(String name) {
		smStrategy.connectTo(name);
	}

}