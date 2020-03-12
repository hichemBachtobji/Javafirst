package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		/* if hour is:
		 * between 1-11-->morning
		 * if hour between 12-15--> afternoon
		 * 16-20-->evening
		 * 21-24--> night
		 */

		int hour=21;
		String timeOfDay;
		
		if (hour>=1 && hour <=11) {
			
			timeOfDay="Morning";
		}else if (hour >=12 && hour <=15) {
			timeOfDay="Afternoon";
		}else if (hour>=16 && hour <=20) {
			timeOfDay="Evening";
			
		}else if (hour>=21 && hour<=24) {
			timeOfDay="night";
			
		}else {
			timeOfDay="Unkown";
		}
		
		//if time of the day is not unkown--> only then I want to see the message
		if(!timeOfDay.equals("unkown")) {
			System.out.println("Right nos is"+timeOfDay);
		}
		
		
	}

}
