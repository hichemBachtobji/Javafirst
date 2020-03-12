package com.syntax.class04;

public class MoreNested {

	public static void main(String[] args) {
		//declare date and a day
		// if day is friday --> if date is 13-->watch scary movie
		//                  --> if date is not 13 --> watch a comedy
		
		boolean isFriday=false;
		int date=14;
		
		if (isFriday) {
			{System.out.println("today is friday, Im going to watch a movie");
			
			if(date==13){
				System.out.println("i will watch a scary movie");
			}else {System.out.println(" i will watch a comedy");
			}
			
			}
			
		}else {System.out.println("today is not friday,Im staying at home");
			
			}
		}
}
	


