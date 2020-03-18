package HichemHomeWork;

import java.util.Scanner;

public class repl93 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = sc.nextLine();

		String str = new String("Java");
		String str1 = new String("C");
		String str2 = new String("C++");
		
		if (language.equals(str)) {
			System.out.println(str+" is a programming language");
		}
		
		else if (language.equals(str1)) {
			System.out.println(str1+" is a procedural programming language");
		}
		
		else if (language.equals(str2)) {
					System.out.println(str2 + " is a procedural programming language");

			}else {
				System.out.println("Doesn't match any programming language");
			}
		
		// 2 nd way with switch
		System.out.println("---- Switch method----");
		
		String message;

		switch (language.toLowerCase()) {

		case "java":
			message = "Java is a programming language";
			break;
		case "c":
			message = "C is a procedural programming language";
			break;
		case "c++":
			message = "C++ is a middle-level programming language";
			break;
		default:
			message = "Doesn't match any programming language";
		}

		System.out.println(message);
	}

}
