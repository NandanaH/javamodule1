package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.MicroUsbPhone;

public class Android implements MicroUsbPhone {
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge Finished");
		}
		else {
			System.out.println("Connect Lightning phone");
		}

	}

	@Override
	public void useMicroUsb() {
		connector=true;
		System.out.println("Lightning  connected");
		// TODO Auto-generated method stub

	}

}
