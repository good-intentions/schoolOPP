package simeon;

public class Circle {
	public double radius;
	
	public Circle() {
		radius = 1; //default
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return Math.PI*radius*2;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
