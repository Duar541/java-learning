package xin;

public class aa0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    printMax(34,3,3,2,56.5);
    printMax(new double[] {1,2,3});
	}
	public static void printMax(double...numbers) {
		if(numbers.length == 0) {
			System.out.println("No arguement passed");
			return;
		}
		
		double result = numbers[0];
		
		for(int i = 1;i<numbers.length;i++)
			result = numbers[i];
		System.out.println("The max value is "+result);
		}
}
