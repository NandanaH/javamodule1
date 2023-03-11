package oopsday1.setget;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 Car zen = new Car();
		
		  zen.setColor("blue"); zen.setBrand("audi"); zen.setModel("Audi A4");
		  zen.setPrice(4505000);
		 
		System.out.println(zen.getColor());
		System.out.println(zen.getPrice());
		System.out.println(zen.getBrand());
		System.out.println(zen.getModel());
		System.out.println(zen);
		
		
		
		   Car zen1 =new Car(); 
		   zen1.setColor("blue");
		   zen1.setBrand("audi");
		   zen1.setPrice(4505000);
		   zen1.setModel("Audi A4");
		   System.out.println(zen1.getColor());
		   System.out.println(zen1.getBrand()); 
		   System.out.println(zen1.getPrice());
	       System.out.println(zen1.getModel());
		 
		   System.out.println("\n");
		
		
		
		
		/*
		 * Car bmw=new Car(); bmw.color="WHITE"; bmw.brand="bmw"; bmw.price=4505000;
		 * bmw.model="SUV"; System.out.println(bmw.color);
		 * System.out.println(bmw.brand); System.out.println(bmw.price);
		 * System.out.println(bmw.model);
		 */
	
		// TODO Auto-generated method stub

	}

}
