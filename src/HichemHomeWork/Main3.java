package HichemHomeWork;

public class Main3 {
	
	int sumEvenToX(int [] x){
	    int sum=0;
	    for (int i=0;i <x.length;i++){
	    	
	    	 if (x[i] %2==0){
	    		 sum=sum+x[i];
			  
		      }
	    	 
	    }
		return sum;
		
	    
	  }
	  public static void main (String [] args){
	    Main3 obj=new Main3 ();
	    int [] x={0,1,2,3,4,5,6,7,8};
	    
	    int arr=obj.sumEvenToX(x);
	    
		
	    System.out.println(arr);
	   
	  }

}
