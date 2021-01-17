package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double guestMoney = 0.0;
		double twentyDoll = 20; double tenDoll = 10; double fiveDoll = 5; double oneDoll = 1;
		double quarter = 0.25; double dime = 0.10; double nickel =0.05; double penny = 0.01;
		double change = 0.0; double hundredDoll = 100;
		

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
					+ "Please enter the amount needed: " );
			guestMoney = kb.nextDouble();
			
		}
		
		if(itemPrice < guestMoney) {
			System.out.println("Your change will be: ");
			
			System.out.println(twentyDoll + " dollar(s)");
			System.out.println(tenDoll + " dollar(s)");
			System.out.println(fiveDoll + " dollar(s)");
			System.out.println(oneDoll + " dollar(s)");
			System.out.println(quarter + " quarter(s)");
			System.out.println(dime + " dimes");
			System.out.println(nickel + " nickel(s)");
			System.out.println(penny + " pennies");
			// dollar equations
			
			oneDoll = guestMoney - itemPrice+50;
				hundredDoll = oneDoll/100;
					oneDoll = oneDoll % 100;
					
				twentyDoll = oneDoll/20;
					oneDoll = oneDoll % 20;
			
				tenDoll = oneDoll/10;
					oneDoll = oneDoll % 10;
					
				fiveDoll = oneDoll/5;
					oneDoll = oneDoll % 5;
					
				oneDoll = oneDoll/1;
					oneDoll = oneDoll % 1;
					
					
			// change equations
			
			penny = guestMoney - itemPrice+50;
				oneDoll = penny/100;
					penny = penny % 100;
					
				quarter = penny/25;
					penny = penny % 25;
					
				dime = penny/10;
					penny = penny % 25;
					
				nickel = penny/5;
					penny = penny % 5;
					
				penny = penny/1;
					penny = penny % 1;
	
		} 
		//limit needs to be made 20
		kb.close();
		System.out.println("Thank you for shopping with us.");
		
		
	} 
	}
	
