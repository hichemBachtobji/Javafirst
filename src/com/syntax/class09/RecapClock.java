package com.syntax.class09;

public class RecapClock {

	public static void main(String[] args) {
		
		// print out a clock

		for (int h=1; h<=23; h++) {
			for(int m=0;m<=59; m++) {
				if (m>=0 && m<10) {
					System.out.println(h+":"+"0"+m);
				}else {
					System.out.println(h+":"+m);
				}
				
			}
		}
	}

}
