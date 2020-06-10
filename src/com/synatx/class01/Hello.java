package com.synatx.class01;

public class Hello {

	public static void main (String [] args) {
		//this is my comment
		
		/* this is multiline
		 * comment
		 */
		System.out.println("Hello");
		
		StringBuffer s=new StringBuffer("hello");
		System.out.println(s.reverse());
		System.out.println(s.capacity());
		System.out.println(s.lastIndexOf("hich"));
		System.out.println(s.indexOf("hichem"));
		System.out.println(s.charAt(1));
		System.out.println(s.length());
	}	
	
}
