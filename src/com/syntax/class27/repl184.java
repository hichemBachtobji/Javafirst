package com.syntax.class27;

import java.util.*;

public class repl184 {

	public static void main(String[] args) {
		
		List<Integer> list= new LinkedList<>();
		
		int a=0;
		int b=1;
		int c;
		
		for (int i=0;i<10;i++) {
			list.add(a);
			c=a+b;
			a=b;
			b=c;	
		}
		for(int l:list) {
			System.out.print(l+" ");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
		
//		int a=0;
//		int b=1;
//		int c;
//		
//		
//		
//		for(int i=0;i<10;i++) {
//			list.add(a);
//			c=a+b;
//			a=b;
//			b=c;
//
//		}
//		for (int l:list ) {
//			System.out.print(l+" ");
//		}
//		
//	}
//
//}
