package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double guestMoney = 0.0;
		

		System.out.println("Welcome to cash register. Please"
				+ " enter the price of your item: ");
		itemPrice = kb.nextDouble();
		System.out.println("Please enter the amount for your item: ");
		guestMoney = kb.nextDouble();
		
		if(itemPrice == guestMoney) {
			System.out.println("You provided the exact amount.");
		} 
		if (itemPrice != guestMoney) {
			System.out.println("You entered less than the amount stated. "
					+ "Please the remaining total of: ");
		}
		
		//System.out.println("Your change will be ");
		System.out.println("Thank you for shopping with us.");
		

	}

}
