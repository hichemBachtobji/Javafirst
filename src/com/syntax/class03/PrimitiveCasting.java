package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		//widening happens implicitly(automatically)
		
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99;--> compole time error saying:
		//type mismatch, cannot convert double to int
		
		//narrowing, explicitly implementing (manually)
int i=(int)10.99;
System.out.println(i);

//byte -128 to 127

byte b=(byte)1284;// 4 is not supported and will be shown in the syso
System.out.println(b);



	}

}
