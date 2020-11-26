package simeon;

public class Circle {
	public double r;
	
	public Circle() {
		r = 1; //default
	}
	
	public Circle(double newR) {
		r = newR;
	}
	
	public double getArea() {
		return Math.PI*radius*r;
	}
	
	public double getPerimeter() {
		return Math.PI*r*2;
	}
	
	public void setRadius(double newRadius) {
		r = newRadius;
	}
}
