package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		
		/*if declared number is 
		 * between 1-10--> this number is small
		 * betwwen 11-100--> this is a big number
		 * between 101-1000--> this is a large number
		 */

		int num=78;
		
		if (num>1 && num<=10) {
			
			System.out.println("this number is small");
		}else if (num>10 && num<100) {
			
			System.out.println("This is a big number");
		}else if (num>100 && num<=1000) {
			
		}else {
			
			System.out.println("number is super large");
		}
		
		
		
		
	}

}
