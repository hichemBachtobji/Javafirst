package com.syntax.class07;

public class taskOne {

	public static void main(String[] args) {
	boolean workDay = true;
	int day=5;
	
	while(workDay) {
		
		if (day<6) {
			System.out.println("I need a day off");
		}else {
			System.out.println(" I don't need a day off");
			workDay=false;
		}
		day++;
	
	}

	}

}
