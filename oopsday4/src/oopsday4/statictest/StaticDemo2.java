package oopsday4.statictest;

public class StaticDemo2 {
	static int a;
	public static void method()
	{
		System.out.println("From method"+a);
		
	}
	public void method2() {
		System.out.println(a);
		method();
	}

}
