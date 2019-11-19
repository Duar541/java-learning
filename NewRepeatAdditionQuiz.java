package aa1107;

import java.util.Scanner;

public class NewRepeatAdditionQuiz extends RepeatAdditionQuiz {
	private int[] before = new int [100];
	private int i = 0;
	
	
    public void getAnswer() {
    	System.out.println("What is "+number1 +" + "+number2 + " ?");
        Scanner input = new Scanner(System.in);
        
        answer = input.nextInt();
        
    	while(number1 + number2 != answer) {
    		before[i++] = answer;
    		System.out.println("Wrong answer. Try again. What is " + number1 + "+ " +number2 +"? ");
           
    		for(int j = 0;j< i-1;j++) {
            	if(before[j] == answer) {
            		System.out.println("You already entered " + answer);
            	}
            }
    		answer = input.nextInt();
    	}
    	
    	System.out.println("You got it!");
    	
    }
 	
	
}
