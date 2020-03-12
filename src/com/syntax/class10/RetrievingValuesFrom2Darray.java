package com.syntax.class10;

public class RetrievingValuesFrom2Darray {

	public static void main(String[] args) {
		
		String [][] month= {
				{"january","February","March","april"},
				{"MAy","June","July","august"},
				{"september","october","november","december"},
		};
		int rows=month.length;// how many arrays
		int firstArray=month[0].length;
		System.out.println(firstArray);
		
		System.out.println("------------");
		
		for (int i=0;i<month.length;i++) {// iterates over rows
			
			for (int j=0;j<month[i].length;j++) {//iterates over columns
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}

	}

}
