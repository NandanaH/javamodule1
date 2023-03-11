package oopsday4.polymorphism;

public class Square extends Shape {
	private int side;
	public Square()
	{
		
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public Square(int side) {
		super();
		this.side = side;
	}@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.side *this.side;
	}
 
}
