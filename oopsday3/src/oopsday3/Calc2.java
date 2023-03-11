package oopsday3;

public class Calc2 implements mathIface {
	
	private Calc n = new Calc(153);

	@Override
	public int factorial(int num) {
		int temp=1,i;
		for(i=1;i<=num;i++) {
			temp=temp*i;
		}
		// TODO Auto-generated method stub
		return temp;
	}

	@Override
	public int prime(int num) {
		int count=0,i;
		for(i=0;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
			
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int armstrong(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int evenorodd(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
