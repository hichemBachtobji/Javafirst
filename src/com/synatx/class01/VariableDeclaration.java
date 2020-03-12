package com.synatx.class01;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		//create a variable and store value 
		//declaring a variable and assigning the value
		
		boolean b= true;
		
// 2nd way: 1st step--> declare variable
		//2nd step--> assign the value
		
		int i;
		i=1000;
		
		// declaring multiple variables and assign value later
		
		char x, y, z;
		
		x='A';
		y='M';
		z='0';
		
		// we cannot have variables with the same name in 1 program
		// double i= 12.99 --> java will complain
		
		double i1=12.99;
		
		z='#'; // reassining the value
		i=2000;
		
		System.out.println(z);
		System.out.println(i);
	}

}
