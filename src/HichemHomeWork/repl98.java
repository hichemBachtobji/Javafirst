package HichemHomeWork;

import java.util.Scanner;

public class repl98 {

	public static void main(String[] args) {
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
		    
		    String output = "";
		    for (int i=0;i<word.length();i+=2) {
		    	char output1=word.charAt(i);
		    	
		    	System.out.print(output1);
		    }
		    System.out.println();
	}

}
