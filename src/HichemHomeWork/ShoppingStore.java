package HichemHomeWork;

public class ShoppingStore {
	
	 String item;
	  double price;
	  int quantity;
	  
	  ShoppingStore(String item, double price, int quantity){
	    this.item=item;
	    this.price=price;
	    this.quantity=quantity;
	  }
	  public double itemTotalPrice(){
	    
	    double total=this.price*this.quantity;
	    return total;
	  }
	  
	  public void display (){
	    
	    System.out.println(item+" "+"total value "+itemTotalPrice());
	  }


	  public static void main (String [] args){
		  
		  ShoppingStore obj =new ShoppingStore("Blanket", 49.99 , 2);
		  obj.display();
		  ShoppingStore obj1 =new ShoppingStore("Matress",43.918,10);
		  obj1.display();
		  
		double b=obj.itemTotalPrice();
		double c=obj1.itemTotalPrice();
		double tot=b+c;
		System.out.println("you purshased "+tot+" Today");
		

		 
		}  
}
