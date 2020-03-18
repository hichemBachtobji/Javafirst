package com.syntax.class12;

public class TaskSubString {

	public static void main(String[] args) {
		
		String str="Sunday";
		char reverse;
		
		for (int i=str.length()-1;i>-1;i--) {
			reverse=str.charAt(i);
			System.out.print(reverse);
			
		}
		System.out.println();
		
		String text="Good Morning";
		char letter;
		if (!text.isEmpty()) {
			if (text.length()%2==0 && text.length() >=3) {
				System.out.println(text.charAt((text.length())/2));
			}else {
				System.out.println("Even numbers");
			}
		}
		
		
		}

	}


