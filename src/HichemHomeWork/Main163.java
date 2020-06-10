package HichemHomeWork;

public class Main163 {
	
	public static final String str="hello";
	
	public final String method (String str){
	     str="";
	    for (int i=str.length()-1;i>=0;i--){	     
	      str+=str.charAt(i);
	      //System.out.println(str);
	    }
	   // System.out.println(str);
		return str;
	  }
	public static void main(String [] args){
	  
	  Main163 obj=new Main163();
	  String s =obj.method("hello");
	  System.out.println();
	 
	}

}
