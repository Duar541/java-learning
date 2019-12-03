package ÀÊ“‚;
import java.util.Scanner;
public class work75 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		int t =10;
		Scanner in = new Scanner(System.in);
		int[] a = new int [10];
		while(t-- != 0) {
		int x = in.nextInt();
		for(i =0;i<10;i++) {
			if(a[i]==x) {
				break;
			}
		}if(i == 10) {
			a[j++] = x;
		}
		}
		
		for(i =0;i<j;i++) {
			System.out.print(a[i]+" ");
		}
}
}