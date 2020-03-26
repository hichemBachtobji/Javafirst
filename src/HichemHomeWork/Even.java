package HichemHomeWork;

public class Even {
	String evenNumbers (int a, int b) {
		
	
	  
	  String Str = "message";
	  java.lang.String message;
	if (a%2==0 && b%2==0){
	    message="true";
	    
	  }else {
	   message="false";
	  }
		return message;
	
		
			
		}
	public static void main (String [] args) {
		Even obj=new Even();
		String str;
		obj.evenNumbers(4, 6);
		obj.toString();
		System.out.println(obj.evenNumbers(4, 5));
		
	}
}

