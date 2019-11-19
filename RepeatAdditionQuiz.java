package aa1107;
import java.util.Scanner;

public class RepeatAdditionQuiz {
    public int  number1 = (int)(Math.random()*10);
    public int number2 = (int)(Math.random()*10); 
    public int answer;
   
    public void getAnswer() {  	
    	System.out.println("What is "+number1 +" + "+number2 + " ?");
        Scanner input = new Scanner(System.in);
        
        answer = input.nextInt();
    	while(number1 + number2 != answer) {
    		System.out.println("Wrong answer. Try again. What is " + number1 + "+ " +number2 +"? ");
    	   answer = input.nextInt();
    	}
    	
    	System.out.println("You got it!");
    	
    }
    
    

}
