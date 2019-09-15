package xin;
import java.util.Scanner;//Scanner is the java.util package
public class aa0202 {
	public static void main(String[] args) {
		//Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	//Prompt the user t enter a radius
	System.out.print("Enter a number for raduis:");
	double radius = input.nextDouble();
	
	//Compute area
	double area = radius*radius*3.14159;
	
	//Display results
	System.out.println("The area for the circle of radius "+radius+" is "+area);
	}
}