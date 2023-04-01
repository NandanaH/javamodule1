package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.LightningPhone;

public class Iphone implements LightningPhone {
	
	private boolean connector;

	@Override
	public void recharge() {
		if(connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge Finished");
		}
		else {
			System.out.println("Connect Lightning phone");
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void useLightning() {
		connector=true;
		System.out.println("Lightning  connected");
		// TODO Auto-generated method stub

	}

}
