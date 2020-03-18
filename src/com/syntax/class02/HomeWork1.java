package com.syntax.class02;

public class HomeWork1 {
	
	public static void main (String[] args) {
		
int [][] numbers = new int [2][3];
		
		numbers[0][2]=8;
		numbers[1][0]=9;
		numbers [0][0]=5;
		numbers [0][1]=6;
		numbers [1][1]=2;
		numbers [1][2]=3;
		
		System.out.println();
		
// 2nd way of 2D array
		
		int [] [] numbers2 = {{5,6,8},{9,2,3}
				
		};
		System.out.println("let's get values from numbers2");
		int Sum1= numbers2[0][0]+numbers2[0][1]+numbers2[0][2];
		System.out.println(Sum1);
	}
}
