package com.syntax.class08;

import java.util.Scanner;

public class taskTwo {

	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range prints the sum of the even and odd integers.
		System.out.println("----my work------");

		Scanner scan=new Scanner (System.in);
		System.out.println("enter even number");
		int evens = scan.nextInt();
		System.out.println("enter odd number");
		int odds = scan.nextInt();
		for(int a=1; a<=20;a++) {
			
			if (a%2==0) {
				
				evens=evens+a;
				
			}else  {
				
				odds=odds+a;
			}
			
		}	
		System.out.println("odd "+evens);
		System.out.println("even"+odds);
		System.out.println("----------ASEL work----------");
		
		int totalEven=0;
		int totalOdd=0;
		System.out.println("Enter num1");
		int min=scan.nextInt();
		System.out.println("enter num2");
		int max=scan.nextInt();
		for (int i = min; i <= max; i++) {
		  if (i % 2 == 0) {
			  totalEven=totalEven+i;
			}else {
				totalOdd=totalOdd+i;
			}
		}System.out.println("total of even number between = "+totalEven);
		  System.out.println("total of odd number between = "+totalOdd);
		
		System.out.println("======2======");
		
		//Write a program to ask a user to enter item they want to buy and the price of that item.
		// Every time user enters money accumulate the amount and tell the user
		//how much is left to pay off the amount.
		//If user give more money program should return a change. 
		//Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner s ;
		String item;
		
		double money;
		double amount = 0;
		double change;
		double remainBalance;
		
		s=new Scanner (System.in);
		double price ;
		
		price= s.nextDouble();
		
		System.out.println("what are you buying today?");
		item=s.nextLine();
		
		System.out.println("what is the price for the "+item);
		item=s.nextLine();
		
		do {
		System.out.println("please give payment");	
			money=s.nextDouble();
			
			money=amount+money;
			
			if(amount<price) {
				remainBalance=price-amount;
				System.out.println("please give more "+remainBalance);
				}else if (amount>price) {
					change=amount-price;
					System.out.println("here is your change "+change);
					break;
				}
			
		}while(price!=amount);
		
		
			System.out.println("thank you for shopping");
		}
		
	}


