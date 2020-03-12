package com.syntax.class10;

public class taskHW {

	public static void main(String[] args) {
		//Create a 2D array where you will store the following values:
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
			//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.


		String name [][] ={{"Mr","Mrs","Ms","Miss"},
				{"Smith","Jordan","Jackson","Obama"}
			
		};
		int rows=name.length;
		int firstArray= name[0].length;
		System.out.println(firstArray);
		
		for (int i=0;i<name.length;i++) {
			for (int j=0;j<name[i].length;j++) {
				
				
			}
			
		}
		System.out.println(name[0][1]+" "+name[1][0]);
		System.out.println((name[0][0]+" "+name[1][3]));
		System.out.println(name[0][2]+" "+name[1][2]);
		System.out.println(name[0][3]+" "+name[1][1]);
		
		System.out.println("----task 2-------");
		

		//Create a 2D array that first row will contain 4 names
	//and second row will contain grades.
	//Then you program should print name of the students that has A and B grade
		
		
		
		String [][] names= {
				{"hich","bach","bachta","hichem"},
				{"A","B","C","D"}
				
		};
		for(int a=0;a< names.length;a++) {
			for(char b=0;b<names[a].length;b++) {
				
			}
		}
		System.out.println(names[0][0]+" "+names[1][1]);
	}

}
