package HichemHomeWork;

import java.util.Scanner;

public class repl97 {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.print("In:");
		String text = inp.nextLine();
		// write your code below

		String rev="";
		int length=text.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+text.charAt(i);
		}
		if(text.equalsIgnoreCase(rev)) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println(rev);
		}

}

}