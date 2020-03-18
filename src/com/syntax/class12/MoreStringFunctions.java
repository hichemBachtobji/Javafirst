package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me="I am a good tester";
		
		System.out.println("------replace() Function-----");
		
		//replace old value with new value
		String newString =me.replace("a","c");
		System.out.println(newString);
		
		// if it finds matching char sequence --> then replace
		me=me.replace("good","great");
		System.out.println(me);
		
		//if it is not finding matching sequence --> not replace
		me=me.replace("Great", "awesome");
		System.out.println(me);
		
		String car= "I have a Toyota";
		car=car.replace("Toyota", "Mercedes");
		System.out.println(car);
		
		System.out.println("------replaceAll() Function------");
		
		String str="Phone number is 1234567";
		str=str.replaceAll("[A-Z]", "");
		
		System.out.println(str);
		
		str=str.replaceAll("[a-z]", "");
		
		System.out.println(str);
		
		String str1="Hello12334***%$#   !!89";
		
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello123%^&*$(";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String subject="Java";
		
		subject=subject.replace("a", "e").replace("J", "I").toUpperCase();
		System.out.println(subject);
		System.out.println(subject.replaceFirst("E", "g"));

	}

}
