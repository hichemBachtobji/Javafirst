package com.syntax.class07;

public class whileLoopIntro {

	public static void main(String[] args) {
		
		int time=10;
		
		if (time<12) {
			System.out.println("good morning");
			
		}
		System.out.println("--------WHILE LOOP---------");
		
		// WHILE(TIME<12){
		//System.out.println("GOOD MORNING");--> code will execute infintely
//}
		
		while (time>12) {
			
			System.out.println("good morning");
			time++;
		}
		
		// how to print numbers from 1 to 5o?
		
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
			//how to print numbers from 20 to 30
			
			int num1=1;
			while(num1<=30) {
				System.out.println(num1);
				num++;
			}
			
			System.out.println("*********************************8");
			// how to print numbers from 5 to 15 all in 1 line
			
			int num2=5;
			while (num2<=15){
				System.out.print(num2+" ");
				num2++;
			}
			System.out.println("*********************************8");
			
			//how to print values from 10 to 1?
			
			int num3=10;
			
			while (num3>=1) {
				System.out.println(num3);
				num3--;
			}
			System.out.println("*********************************8");
			
			//how to print 50 to 1?
			// how to print odds numbers from 1 to 20
			
			System.out.println("*********************************8");
			
			
			
			
			
			
			
		}
	}


