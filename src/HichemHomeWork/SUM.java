package HichemHomeWork;

public class SUM {
	
	public void sum (int [][] array){
	    int arr=0;
	    for (int i=0;i<array.length;i++){
	      for (int y=0;y<array[i].length;y++){
	        arr+=array[i][y];
	      }
	    }
	   
		System.out.println(arr);
	  }
public static void main(String[] args) {
	int[][] a = { 
            { 1, 2, 3 }, 
            { 4, 5, 6 }, 
            { 7, 8, 9 } 
                              };
	
	SUM s=new SUM();
	s.sum(a);
	
}
}
