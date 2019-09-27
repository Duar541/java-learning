package xin;
import java.util.Scanner;

public class aa0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	     Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     double  Sum = 0;
	     double [] numbers = new double[n];
	     for(int i = 0;i<n;i++)
	     {
	    	 numbers[i] = in.nextDouble();
	         Sum += numbers[i];
	     }
			double Average = Sum / n;
			int Count = 0;
			for(double k : numbers)
			{
				if(k > Average)
				{
					Count ++;
				}
			}
	      System.out.println("Average is : " + Average);
	      System.out.println("Count : " + Count);
	      
		}
	}
		

