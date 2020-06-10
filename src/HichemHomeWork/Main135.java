package HichemHomeWork;

public class Main135 {
	
	public static int maxValue (int [] arr){
	    int a=arr[0];
	    for (int i=0;i<arr.length;i++){
	    
	      if (a<arr[i]){
	      a=arr[i];
	      }
	  
	    }
		return a;
	    
	  }
	  
		public static void main(String[] args) {
			int[] arr = {55,12,-3,7,3,22};
			System.out.println(maxValue(arr)); //should print 22
		}
		
		
	}


