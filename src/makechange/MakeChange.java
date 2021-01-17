package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double itemPrice = 0.0;
		double guestMoney = 0.0;
		double twentyDoll = 20, tenDoll = 10, fiveDoll = 5, oneDoll = 1;
		double quarter = 0.25, dime = 0.10, nickel =0.05, penny = 0.01;
		double change = 0.0, moneyBack;
		

		System.out.println("Welcome to cash register. Please"
				+ " enter the price of your item: ");
		itemPrice = kb.nextDouble();
		System.out.println("Please enter the amount for your item: ");
		guestMoney = kb.nextDouble();
		
		
		
		if(itemPrice == guestMoney) {
			System.out.println("You provided the exact amount.");
		} 
		
		if(itemPrice < guestMoney) {
			change = guestMoney - itemPrice;
			System.out.println("Your change will be: " + change);
			
			
			double changeBack =(double)(Math.floor(change * 100));
			
			double Twenty = changeBack / twentyDoll;
				changeBack = changeBack % twentyDoll;
				
			moneyBack = guestMoney - itemPrice + 0.0005;
			System.out.println(Twenty + " twenty dollar bill(s)");
			
			double Ten = changeBack / tenDoll;
				changeBack = changeBack % tenDoll;
			System.out.println(Ten + " ten dollar bill(s)");
			
			double Five = changeBack / fiveDoll;
				changeBack = changeBack % fiveDoll;
			System.out.println(Five + " five dollar bill(s)");
			
			double One = changeBack / oneDoll;
				changeBack = changeBack % oneDoll;
			System.out.println(One + " one dollar bill(s)");
			
			double Quarter = changeBack / quarter;
				changeBack = changeBack % quarter;
			System.out.println(Quarter + " quarter(s)");
			
			double Dime = changeBack / dime;
				changeBack = changeBack % dime;
			System.out.println(Dime + " dime(s)");
			
			double Nickel = changeBack / nickel;
				changeBack = changeBack % nickel;
			System.out.println(nickel + " nickel(s)");
			
			double Penny = changeBack / penny;
				changeBack = changeBack % penny;
			System.out.println(penny + " penny(ies)");
//			// dollar equations
//			
//			oneDoll = guestMoney - itemPrice+50;
//				hundredDoll = oneDoll/100;
//					oneDoll = oneDoll % 100;
//					
//				twentyDoll = oneDoll/20;
//					oneDoll = oneDoll % 20;
//			
//				tenDoll = oneDoll/10;
//					oneDoll = oneDoll % 10;
//					
//				fiveDoll = oneDoll/5;
//					oneDoll = oneDoll % 5;
//					
//				oneDoll = oneDoll/1;
//					oneDoll = oneDoll % 1;
//					
//					
//			// change equations
//			
//			penny = guestMoney - itemPrice+50;
//				oneDoll = penny/100;
//					penny = penny % 100;
//					
//				quarter = penny/25;
//					penny = penny % 25;
//					
//				dime = penny/10;
//					penny = penny % 25;
//					
//				nickel = penny/5;
//					penny = penny % 5;
//					
//				penny = penny/1;
//					penny = penny % 1;
//	
		} 
		else if (itemPrice != guestMoney) {
			System.out.println("You entered less than the amount stated. "
					+ "Please enter the amount needed: " );
			guestMoney = kb.nextDouble();
			
		}
		//limit needs to be made 20
		kb.close();
		System.out.println("Thank you for shopping with us.");
		
		
	} 
	}
	
