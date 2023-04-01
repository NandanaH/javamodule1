package factorymethod;

public class Seltos implements Vehicle {

	@Override
	public void start() {
		System.out.println("started......."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("stopped....."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void honk() {
		System.out.println("boom boom...."+getClass());
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println("it's moving....."+getClass());
		
		// TODO Auto-generated method stub

	}

}
