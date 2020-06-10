package HichemHomeWork;

public class Child1 {
	
	Child1(){
	    System.out.println("Child Constructor without argument");
	    
	  }
	 int a;
	  Child1(int a){
		  super();
		 this.a=a;
	   
	  }
	  
	  public static void main (String [] args){
		    
		    
		    Child1 obj= new Child1();
		  
		    Child1 obj1= new Child1(10);
		  
		  }
		  
}
