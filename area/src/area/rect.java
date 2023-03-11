package area;

public class rect implements shape {
	private double length;
	private double breadth;
	
	public rect(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}


	@Override
	public String toString() {
		return "rect [length=" + length + ", breadth=" + breadth + "]";
	}


	@Override
	public void areaa() {
		
		double Rectarea=length*breadth;
		System.out.println("area of rectangle="+Rectarea);
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
		shape s = new rect(5,6);
		s.areaa();
		
	}
	
	

	
}
