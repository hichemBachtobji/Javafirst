package HichemHomeWork;

public class Main129 {
	
	static String surround(String s, String search_term) {
		String str=s.replace(search_term, "("+search_term+")");
		
		
		return str;
		
	}
	
	public static void main(String[] args){
		System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
		System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
	}

}
