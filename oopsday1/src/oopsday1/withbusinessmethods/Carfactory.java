package oopsday1.withbusinessmethods;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car zen = new Car("blue", 4505000 ,"audi","Audi A4");
		zen.start();
		zen.changegear();
		zen.stop();
		
		
		System.out.println("\n");
		
		Car bmw = new Car("WHITE","bmw",4505000,"SUV");
	    bmw.start();
	    bmw.changegear();
	    bmw.stop();
		
		
		
		/*
		 * Car bmw=new Car(); bmw.color="WHITE"; bmw.brand="bmw"; bmw.price=4505000;
		 * bmw.model="SUV"; System.out.println(bmw.color);
		 * System.out.println(bmw.brand); System.out.println(bmw.price);
		 * System.out.println(bmw.model);
		 */
	
		// TODO Auto-generated method stub

	}

}
