package aa1107;

public class PolymrophisDemo {
 
	/*Main method*/
	public static void main(String[] args) {
		//Display circle and rectangle properties
		displayObject(new RectangleFromSimpleGeometricObject(1,1,"black",true));
	}
	
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+", Color is " + object.getColor());
	}
}
