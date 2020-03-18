package HichemHomeWork;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//--------- Write a program to Swap 2 strings without a temporary variable? -------------
			System.out.println("Please enter a value for 'First String': ");
			String str1 = scan.nextLine();
			System.out.println("Please enter a value for 'Second String': ");
			String str2 = scan.nextLine();
			System.out.format("The value of 'First String' is %s and the value of 'Second String' is %s.\n",str1,str2);
			str1 = str1+str2;
			str2 = str1.replace(str2, "");
			str1 = str1.replace(str2, "");
			System.out.format("The new value of 'First String' is %s and the new value of 'Second String' is %s.\n",str1,str2);


	}

}
