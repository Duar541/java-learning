package aa1107;

public class TextCircleRectangle {
public static void main(String[] args) {
	 CircleFromSimpleGeometricObject circle = new CircleFromSimpleGeometricObject(1);
		 System.out.println("A circle "+circle.toString());
		 System.out.println("The color "+circle.getColor());
		 System.out.println("The radius is "+circle.getRadius());
		 System.out.println("The area is "+circle.getArea());
		 System.out.println("The diameter is "+circle.getDiameter());
	 
	 RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
		 System.out.println("\nA rectanle "+rectangle.toString());
		 System.out.println("The area is "+rectangle.getArea());
		 System.out.println("The perimeter "+rectangle.getArea());
		 System.out.println("The perimeter is "+rectangle.getPerimeter());
	 }
	
}
