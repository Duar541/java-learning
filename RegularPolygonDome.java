package xin;

public class RegularPolygonDome {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
		
		
		System.out.println("Perimeter is " + p1.getPerimeter()+"  Area is "+p1.getArea() );
		System.out.println("Perimeter is " + p2.getPerimeter()+"  Area is " +p2.getArea());
		System.out.println("Perimeter is " + p3.getPerimeter()+"  Area is " + p3.getArea());
	}

}

