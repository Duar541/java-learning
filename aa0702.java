package xin;
import java.util.Scanner;

public class aa0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


			int[] deck = new int[12];
			String[] suits  = {"Spandes","Hearts","Diamonds","Clus"};
			String[] ranks  = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
			

			//Initialize the cards
			for(int i = 0;i < deck.length ;i++)
			{
				deck[i] = i;
			}
			
			//Shuffle the cards
			for(int j = 0 ;j<deck.length ;j++)
			{
				// Generate an index randomly
				int index = (int)(Math.random()*deck.length);
				int temp = deck[j];
				deck[j]= deck[index];
				deck[index]= temp;
			}
			 
			//Display the first four cards
			for(int k = 0;k<4;k++)
			{
			 	String suit = suits[deck[k] / 13];
			 	String rank = ranks[deck[k] % 13];
			 	System.out.println("Card number "+deck[k]+": "+ rank + " of "+suit);
			}
		
	}

}
