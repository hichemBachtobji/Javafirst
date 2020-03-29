package HichemHomeWork;

public class Repl {
	
	 String spaceOut(String a){
		    
		    for (int i=0;i<a.length();i++){
		    	char ch =a.charAt(i);
		    	int space=0;
		    	space=space+ ch;
		    }
			return a;
		  }
		  public static void main (String [] args){
		    
		    Repl obj=new Repl();
		  
		   
		     System.out.println(obj.spaceOut("Hello") );
		  }

}
