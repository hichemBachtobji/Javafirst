package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String school="Syntax";
		
		String str=new String("HELLO");
		
		String str1="this is a string 57739,%$*";
		
		//how many characters String has
		
		System.out.println(school.length());
		
		int size=str.length();
		System.out.println("String length is "+size);
		
		// convert String to lower case or upper case
		System.out.println("----to UPPERCASE/lowercase----");
		
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		
		// concatinate 2 Strings 
		System.out.println("----Concatinate Functions ----");
		
		String newString=str+school;
		System.out.println(newString);
		
		// another way
		System.out.println("---another way---");
		String day = "Saturday";
		String date="14th";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade ='A';
		String str2="Student";
		// below code will give CE,
		//since concat() method is used to attach 1 string to another string
		//str2.concat(grade)
		
		
		System.out.println("----- isEmpty Function ----");
		//tells true if there is no characters inside the String 
		
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("-------trim() function-------");
		// removes empty/wide space at the beginning and end of String
		String str4="    Welcome to syntax!    ";
		
		str4=str4.trim();
		System.out.println("string with no leading or trailing spaces: "+str4);
		

	}

}
