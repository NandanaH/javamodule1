package oopsday6exception;

public class ExceptionDemo2 {
	

	public static void main(String[] args) {
		System.out.println("Program started");
		try
		{
			
		int b = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int c = b/a;
		String name = args[2];
		int data[] = {a,b};
		System.out.println("Program task completed");
		}catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}catch (NumberFormatException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}

	}

}