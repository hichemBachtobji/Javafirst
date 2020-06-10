package HichemHomeWork;

public class Main125 {
	
	 static String mixString(String s1, String s2){
		 String str="";
		 for (int i=0;i<s1.length();i++) {
			 char ch =s1.charAt(i);
			 char ch2=s2.charAt(i);
			 str =str+ch+ch2;
		 }
		 
		 
		return str;		    
	  }
		
		
		//test case below (dont change):
		public static void main(String[] args){
		  String firstValue = mixString("12345","abcde"); 
			System.out.println(firstValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
		}
	}


