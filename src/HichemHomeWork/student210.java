package HichemHomeWork;

public class student210 {
	
	public static void method(int grade) {
		
		if (grade >90) {
			throw new SyntaxStudentException("You are an exceptionally awesome student");
		}
		else {
			System.out.println( "You are a great student");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
			method(99);
		}catch(SyntaxStudentException e) {
			System.out.println(e);
		}
		
		
	}

}

class SyntaxStudentException extends RuntimeException{
	SyntaxStudentException(String message){
		super(message);
	}
	
}