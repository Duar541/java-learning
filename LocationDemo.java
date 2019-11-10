package xin;
import java.util.Scanner;

public class LocationDemo {
	public static void main(String[] args) {
		System.out.println("please input rows and columns in the array");
      Location p1 = new Location();
      Scanner in = new Scanner(System.in);
     int row = in.nextInt();
       int column = in.nextInt();
      for(int i = 0;i< row;i++){
    	  for(int j = 0;j<column;j++){
    		  double n = in.nextDouble();
    		  p1.Compare(n,i,j);
    	  }
      }
      System.out.println("The location of the large element is " + p1.maxValue +" at ("+p1.row+", " +p1.column +")");
      
	}

}

