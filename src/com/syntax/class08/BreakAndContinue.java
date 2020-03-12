package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// once i=4--> we want to stop the loop
		
		System.out.println("---------BREAK---------");
		
		for (int i=1;i<=10;i++) {
			
			if (i==4) {
			System.out.println("I'm stopping loop");
			break;
			}
			System.out.println(i);
		}
		
System.out.println("I am outside of the loop");

System.out.println("----------------CONTINUE---------------------");

for(int y=1;y<=10;y++) {
	if (y==4) {
		System.out.println("I am skipping iteration");
		continue;
	}
	System.out.println("I am inside the loops");
	System.out.println(y);
}
System.out.println("_________MORE CONTINUE_________________ ");
//write a program that print numbers from 1 to 20 
// I do not want to print 5,6,7
for (int i =1;i <21;i++) {
	if(i==5 || i==6 || i ==7) {
		continue;
	}
	System.out.println(i);
	
}
	System.out.println("------CONTINUE EXAMPLE----------");
	//write a program that prints numbers 1 to 100
			//skip numbers 35-55
			for(int a=1; a<=100; a++) {
				if (a>=35 && a<=55) {
					continue;
				}
				System.out.println(a);
			}






	
}

	}


