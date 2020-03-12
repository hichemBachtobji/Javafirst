package com.syntax.class10;

public class taskRetrieveElements {

	public static void main(String[] args) {
		
		// task 1) Create an array of animals
		//and store 6 elements into it. Using 2 different loops
		//print all elements from the array.
		
		String [] animals= {"tiger","lion","dog","cat","zebra","eagle"};
		for (String animal:animals) {
			System.out.println(animal);
		}

		//task 2) Create an array on integers and calculate 
		//the sum of all integer elements in an array.
		
		System.out.println("----Task 2------");
		

		int [] numbers= {10,20,30,40,50,60};
		int total = 0;
	
		for (int num:numbers) {
			
				total+=num;
		}
		System.out.println(total);
		//another way
		System.out.println("---task 2-- another way-------");
		
		int sum1=0;
		for (int i=0;i<numbers.length;i++) {
			sum1 +=numbers[i];
		}
		System.out.println(sum1);
		
		// task 3) Create an array of countries.
		//While retrieving all values from an array print capital for each country.
		//(use 2 different loops).
		System.out.println("----task 3------");
		
		String [] countries={"Tunisia","Russia","Iran","Afghanistan","Philippines"};
		
		for (int i=0;i<countries.length;i++) {
			if (countries.equals("Tunisia")) {
				System.out.println("tunis");
			}else if (countries.equals("Russia")){
					System.out.println("Moscow");
			}else if (countries.equals("Iran")) {
						System.out.println("Tehan");
					}
			
		}
		System.out.println(countries);
		
		//task3)
		System.out.println("---Asel work-- 2nd way----");
		
		String[] countries1= {"USA", "Russia", "Italy", "France"};
	      for (int y=0; y<countries1.length; y++) {
	    	switch(countries1[y]) {
	    	case "USA":
	    		System.out.println("Capital is Washington DC");
	    		break;
	    	case "Russia":
	    		System.out.println("Capital is Moscow");
	    		break;
	    	case "Italy":
	    		System.out.println("Capital is Rome");
	    		break;
	    	case "France":
	    		System.out.println("Capital is Paris");
	    				break;
	    	}
	    	}

















		}
	}

	
