package HichemHomeWork;

public class Main164 {

	 final static int avgElements(int [] array){
		    int average=0;
		    for (int i=0;i<array.length;i++){
		      int a=array.length;
		      average += a/5;
		    }
		    return average;
		  } 
		  
		  
		  
			public static void main(String[] args) {
				int[] a = {2,7,3,8,4};
				System.out.println(avgElements(a)); //should print 4.8
			}
}
