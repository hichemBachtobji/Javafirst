package com.syntax.class11;

import java.util.Scanner;

public class TaskStrings {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
System.out.println("Please enter user name");
		String userName= new String();
		
		String password= new String();
		
		userName=scan.nextLine();
		System.out.println("Please enter password");
		password=scan.nextLine();
		
		
		boolean empty= userName.isEmpty();
		System.out.println(empty);
		
		boolean empty1=password.isEmpty();
System.out.println(empty1);

int size=password.length();

System.out.println("String length is "+size);
if(size<8) {
	System.out.println("password is too short");
	
}
if (password!=userName) {
	System.out.println("password cannot contain user name");
	
}

String confirmedPassword= new String();

if (password.equals(confirmedPassword)) {
	
}else {
	System.out.println("Password not matched");
}

	}

}
