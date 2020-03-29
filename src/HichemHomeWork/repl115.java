package HichemHomeWork;

public class repl115 {
	
	String censorLetter(String str, char ch){
		str=str.replace(ch, '*');
		
	    
	    return str;
	  }
public static void main(String[] args) {
	repl115 obj=new repl115();
	System.out.println(obj.censorLetter("computer science", 'e'));
	System.out.println(obj.censorLetter("trick or treat ", 't'));
}
}
