package HichemHomeWork;

import java.util.Scanner;

public class GroupPrimeNumber {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
				Scanner scan=new Scanner(System.in);
				int num;
				System.out.println("please enter number greater than 1");
				while(true) {//just for the while loop to start
					 num=scan.nextInt();
					if(num>1) {break;
					}System.out.println("Please enter valid number");
				}
				if (num==2) {//2 is the very first prime number 
					System.out.println("This is prime number");
				}else {
					for(int i=2; i<num;i++) {
						if(num%i==0) {System.out.println("This number is not prime");break;
						} if(i==num-1) {//to check if the i is number before the user's number/last i;
							System.out.println("This is a prime number");
						}
	}

				}
				
				
				
				
				
				int num1 = 5;//this is the number we check
			    boolean prime =true;//variable to check boolean condition
			    for(int b1 = 2;b1<num1;b1++)//2 is 1st prime num1,until that num1
			    {
			      // condition for non prime number
			      if(num % b1 == 0)//number entered is divisible by nums less than itself
			      {
			        prime = false;
			        break;
			      }
			    }
			    if (prime)//true
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
}
}