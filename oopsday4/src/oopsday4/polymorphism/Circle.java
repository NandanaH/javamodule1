package oopsday4.polymorphism;

public class Circle extends Shape {
	
    double radius;
	public Circle()
	{
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	

}
