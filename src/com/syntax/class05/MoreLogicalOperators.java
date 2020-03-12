package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*we have total 7 days in aweek
		 * if day is 2 or 3-->SDLC class
		 * if day 6,7-->java class
		 * if day 1,5--> off day 
		 *if day 4 --> review class
		 */
		
		int day=6;
		// to compare two numbers we use (==)
		if (day==2 || day==3) {
			System.out.println("today is sdlc class");
			
		}else if (day==6 || day==7) {
			
			System.out.println("today is java class");
			
		}else if (day==1 || day==5) {
			System.out.println("today is no class, it is a day off");
			
		}else if (day==4) {
			System.out.println("today is a review class with Elion");
		}else {
			System.out.println("Ivalid day");
		}

		System.out.println("---------------------------------------------");
		
		String day1="saturday";
		// if we want to compare two strings we use (.equals(""))
		
		if (day1.equals("tuesday") || day1.equals("wednesday")) {
			
			System.out.println("today is SDLC class");
			
		}else if (day1.equals ("saturday") || day1.equals("Sunday")) {
			System.out.println("today is java class");
			
		}else {
			System.out.println("invalid day");
		}
		
	}

}
