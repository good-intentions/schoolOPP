package simeon;

public class RegularPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon p1 = new RegularPolygon();
		System.out.println("The perimeter is " + p1.getPerimeter(p1.getN(), p1.getSideLength()));
		System.out.println("The area is " + p1.getArea(p1.getN(), p1.getSideLength()));
		
		RegularPolygon p2 = new RegularPolygon();
		p2.setN(5);
		p2.setSideLength(3);
		System.out.println("The perimeter is " + p2.getPerimeter(p2.getN(), p2.getSideLength()));
		System.out.println("The area is " + p2.getArea(p2.getN(), p2.getSideLength()));
		
		RegularPolygon p3 = new RegularPolygon();
		p3.setN(9);
		p3.setSideLength(3);
		p3.setX(4.6);
		p3.setY(6.8);
		System.out.println("The perimeter is " + p3.getPerimeter(p3.getN(), p3.getSideLength()));
		System.out.println("The area is " + p3.getArea(p3.getN(), p3.getSideLength()));
	}

}