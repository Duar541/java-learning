package ËæÒâ;
import java.util.Scanner;

public class work719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num = 0 ;
	int i = 0;
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	
	int[] a  =new int[num];
	for(i = 0;i<num;i++) {
		a[i] = in.nextInt();
	}
		
	for(i = 0;i<num-1;i++) {
		if(a[i] > a[i+1]) {
			break;
		}
	}
	if(i != num-1) {
		System.out.println("The list is not sorted");
	}else {
		System.out.println("The list is already sorted");
	}
		
	}

}
