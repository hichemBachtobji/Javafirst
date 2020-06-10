package HichemHomeWork;

public class Main130 {

	 private void method(){
		    System.out.println("This is Private Method");
		  }
		  void method1 (){
		    System.out.println("This is default Method");
		  }
		 protected void method2(){
		   System.out.println("This is Protected Method");
		 }
		 public void method3(){
		   System.out.println("This is Public Method");
		 }
		 public static void main (String [] args){
		   Main130 obj=new Main130();
		   
		   obj.method();
		   obj.method1();
		   obj.method2();
		   obj.method3();
		   
	 }
}
