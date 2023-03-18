package examplelsp;

public class Rectangle implements Shape {
	
	private int length;
	private int breadth;
	
	
	public Rectangle (int length,int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public int getArea() {
		return this.length * this.breadth;
	}

}
