package oopsdays3.overloading;

public class TestMath {

	public static void main(String[] args) {
		Math math = new Math();
		int result = math.add(10,20);
		System.out.println(result);
		result = math.add(10, 20, 30);
		System.out.println(result);
		
		
		
		
		double result2 = math.add(0.25, 25.25);
	    System.out.println(result2);
		// TODO Auto-generated method stub

				
	    result2 = math.add(0.25, 25.25,35.5);
		System.out.println(result2);
		
		
		result2 = math.add(10L, 20L ,30L);
		System.out.println("long"+result2);
		
		result2 = math.add(0.25f, 30.5f);
		System.out.println("float"+result2);
	}

}
