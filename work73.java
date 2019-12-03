package ËæÒâ;
import java.util.Scanner;

public class work73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   int []a = new int[100];
		   
		   for(int i = 0;i< 100;i++) {
			   a[i] = 0;
		   }
		    
		   Scanner in = new Scanner(System.in);
		   for(;;) {
			   int b = in.nextInt();
			   if(b == 0) {
		           for(int i = 1;i<=100;i++) {
			          if(a[i] != 0) {
			     	   System.out.println(i+" occurs " + a[i] +" times");
			          }
	        	   }
		           break;
	           }
			   else {
				   a[b] ++ ;
			   }
			   
		   }
	}
}

