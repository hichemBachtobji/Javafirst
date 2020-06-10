package HichemHomeWork;

public class Task2Test {
	
	public static void main(String[] args) {
		
	
	
	A a=new A(80,90,100);
	double av=a.getPercentage();
	System.out.println("Student's 1 grade is : "+av);
	
	
	Marks b= new B(70,80,90,100);
	double ave=b.getPercentage();
	System.out.println("Student's 2 grade is : "+ave);
	}
}
