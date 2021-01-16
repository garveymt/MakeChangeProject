package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double guestMoney = 0.0;
		double remainder = 0.0;
		double restMoney = 0.0;
		int tenDoll; int fiveDoll; int oneDoll;
		double quarter; double dime; double nickle; double penny;
	
		//double change;

		System.out.println("Welcome to cash register. Please"
				+ " enter the price of your item: ");
		itemPrice = kb.nextDouble();
		System.out.println("Please enter the amount for your item: ");
		guestMoney = kb.nextDouble();
		
		if(itemPrice == guestMoney) {
			System.out.println("You provided the exact amount.");
		} 
		if(itemPrice < guestMoney) {
			System.out.println("Your change will be: ");
		} 
		
		//limit needs to be made 20
		
		if (itemPrice != guestMoney) {
			remainder = itemPrice - guestMoney;
			System.out.println("You entered less than the amount stated. "
					+ "Please enter the remaining total of: " + remainder);
			restMoney = kb.nextDouble();
			
			
		}
		
		//System.out.println("Your change will be ");
		System.out.println("Thank you for shopping with us.");
	}

	}
