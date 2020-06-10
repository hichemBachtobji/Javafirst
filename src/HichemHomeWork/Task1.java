package HichemHomeWork;

public class Task1 {
	
//	Create an Interface ‘Shape’ with undefined methods as calculateArea
//	and calculatePerimiter. Create 2 classes Circle & Square
//	that implements functionality defined in the Shape Interface. Test your code.
}
	 interface Shape{
		 void calculateArea();
		 void calculatePerimiter();
		
	}
	


class Circle implements Shape{
	
	public static final double PI=3.14;
	int r;
	Circle (int r) {
		this.r=r;
	}
	
	@Override
	public void calculatePerimiter() {
		double ar=2*PI*r;
		System.out.println("Perimeter of the circle is "+ar);
		
	}
	@Override
	public void calculateArea() {
		double area=r*r*PI;
		System.out.println("Area of the circle is "+area);
		
	}
}



class Square implements Shape{
	int length;
			
	Square (int length){
		this.length=length;
	}
	
	public void calculateArea() {
		double area=length*length;
		System.out.println("Area of the square is"+area);
	}

	@Override
	public void calculatePerimiter() {
		double peri=4*length;
		System.out.println("Perimeter of the square is"+peri);
	}
	
}

