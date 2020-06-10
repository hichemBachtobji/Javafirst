package HichemHomeWork;

public class CarObjects {
	
	 String model;
	  double price;
	  int quantity;
	
	  
	  CarObjects(String model , double price){
	    this.model=model;
	   this. price=price;
	    this.quantity=quantity;
	    
	  }
	  public double carStockValue(){
		double price1=price;
		double total=price1+this.price;
		return total;   
	  }void display (){
		  System.out.println(model+" "+ carStockValue());
	  }
	
	  public static void main (String [] args){
		    CarObjects obj=new CarObjects("Toyota 2019", 1250000);
		    obj.display();
		     CarObjects obj1=new CarObjects("BMW 2019", 326490);
		    obj1.display();
		    
		  }
}
