package HichemHomeWork;

import java.util.Scanner;

public class GroupTask {

	public static void main(String[] args) {
		
		
	
			
				Scanner scan = new Scanner(System.in);
				//--------------- Write a program to swap 2 numbers without a temporary variable? ---------------
					System.out.print("Please enter a number for 'A': ");
					int a = scan.nextInt();
					System.out.print("Please enter another number for 'B': ");
					int b = scan.nextInt();
					System.out.format("\nThe value of 'A' is %d and the value of 'B' is %d. \n",a,b);
					a = a + b;
					b = a - b;
					a = a - b;
					System.out.format("The new value of 'A' is %d and the new value of 'B' is %d. \n",a,b);
			}
	}


