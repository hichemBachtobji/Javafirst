package HichemHomeWork;

import java.util.Scanner;

public class repl94 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the browser name to proceed further with execution");
	    String browser = sc.nextLine(); 
	    String message;
	    switch(browser.toLowerCase()) {
	    case"chrome":
	    	message="Proceed with Chrome browser";
	    	break;
	    case"firefox":
	    	message="Proceed with FireFOX browser";
	    	break;
	    case"ie":
	    	message="Proceed with IE browser";
	    	default:
	    		message="Invalid browser";
	    	
	    
	    }
	    System.out.println(message);

	}

}
