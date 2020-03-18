package com.syntax.class11;

public class Task {

	public static void main(String[] args) {
		/*Create an array of cars : american, german, korean, italian.
		 *  Then retrieve all values from that array using 2 different loops
		 */



		
		String [] [] cars= {{"Ford","Chevy","GM"},
				{"BMW","Mercedes","VW"},
				{"Hyunday","Kia","Totyota"},
				{"Fiat","Ferrari","Lambo"},
				
		};
		for (int i=0;i<cars.length;i++) {
			for (int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("-- advanced loop --");
		for (String [] car:cars) {
			for (String c:car) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		System.out.println("--- 2) task ---");
		
		//Create an array of countries: north america countries, south america countries
				//, europe countries, asian countries, african countries. 
				//Then print all values from that array using 2 different loops 
				//and calculate how many total countries been stored.
		
		String [][] countries = {{"Canada", "USA","Mexico"},
				{"Colombia","Venezuella","Peru","Brasil"},
				{"Italy","France","Spain","Portugal"},
				{"China","Japan","South Korea","India"},
				{"Tunisia","Morrocco","Senegal","Nigeria"}
				
		};
		
		int total =0;
		for (String [] country:countries) {
			for (String c:country) {
				System.out.print(c+" ");
				total++;
			}
			System.out.println();
			System.out.println("total countries "+total);
		}
		
	}

}
