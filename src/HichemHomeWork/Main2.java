package HichemHomeWork;

public class Main2 {

	int sumEven(int x) {
		

	for(int i = 0;i<x;i++){
		if (x%2==0) {
			int sumEven=x+ sumEven(i);
		}
		
		
	}
	return x;
}
	public static void main(String[] args) {
		Main2 obj= new Main2();
		
		System.out.println(obj.sumEven(5));
	}
	}
