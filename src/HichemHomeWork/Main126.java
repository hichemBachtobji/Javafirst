package HichemHomeWork;

public class Main126 {
	
	static String thirdLetter(String s){
	    String thirdLetter="";
	    for (int i=0;i<s.length();i+=3){
	      char ch=s.charAt(i);
	      thirdLetter=thirdLetter+ch;
	    }
		return thirdLetter;
	    
	    
	  }
	  
		

		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(thirdLetter("hello there")); //"hltr"
			System.out.println(thirdLetter("technology")); //"thly"
		}

}
