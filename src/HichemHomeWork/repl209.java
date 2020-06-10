package HichemHomeWork;

public class repl209 {
	
	public static void temperature(int temp) {
		
		if(temp<32) {
			throw new RuntimeException("It is freezing");
		}
		
	}

	public static void main(String[] args) {
		
		try {
			temperature(30);
		}catch(RuntimeException e) {
			System.out.println(e);
			
		}
		
		

	}

}
