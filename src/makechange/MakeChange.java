package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double guestMoney = 0.0;
		int twentyDoll = 2000, tenDoll = 1000, fiveDoll = 500, oneDoll = 100;
		int quarter = 25, dime = 10, nickel = 5, penny = 1;
		double change = 0;
		

		System.out.println("Welcome to cash register. Please"
				+ " enter the price of your item: ");
		itemPrice = kb.nextDouble();
		System.out.println("Please insert currency: ");
		guestMoney = kb.nextDouble();
		boolean changeGiven = false;
		
		while(!changeGiven) {
		
			if(itemPrice == guestMoney) {
				System.out.println("You provided the exact amount.");
			} 
		
			else if(itemPrice < guestMoney) {
				change = (guestMoney - itemPrice) * 100;
				System.out.println("Your change will be: " + change / 100);
				int changeBack = (int)Math.ceil(change);
				int twenties = 0;
				twenties = changeBack / twentyDoll;
					changeBack = changeBack % twentyDoll;
				System.out.println(twenties + " twenty dollar bill(s)");
				
				int tens = 0;
				tens = changeBack / tenDoll;
				changeBack = changeBack % tenDoll;
				System.out.println(tens + " ten dollar bill(s)");
				
				int fives = 0;
				fives = changeBack / fiveDoll;
				changeBack = changeBack % fiveDoll;
				System.out.println(fives + " five dollar bill(s)");
			
				int ones = 0;
				ones = changeBack / oneDoll;
				changeBack = changeBack % oneDoll;
				System.out.println(ones + " one dollar bill(s)");
				
				int quarters = 0;
				quarters = changeBack / quarter;
				changeBack = changeBack % quarter;
				System.out.println(quarters + " quarter(s)");
				
				int dimes = 0;
				dimes = changeBack / dime;
				changeBack = changeBack % dime;
				System.out.println(dimes + " dime(s)");
				
				int nickels = 0;
				nickels = changeBack / nickel;
				changeBack = changeBack % nickel;
				System.out.println(nickels + " nickel(s)");
				
				int pennies = 0;
				pennies = changeBack / penny;
				changeBack = changeBack % penny;
				System.out.println(pennies + " penny(ies)");
				changeGiven = true;
		} 
		else if (itemPrice != guestMoney) {
			System.out.println("You entered less than the amount stated. "
					+ "Please enter the amount needed: " );
			guestMoney = kb.nextDouble();
			
		}
		}
		//limit needs to be made 20
		kb.close();
		System.out.println("Thank you for shopping with us.");
		
		
	} 
	}