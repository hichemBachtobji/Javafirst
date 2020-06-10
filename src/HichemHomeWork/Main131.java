package HichemHomeWork;

public class Main131 {

	private String name;
	public String city;
	String school;
	protected int batch;
	
	void display () {
		
		System.out.println("My name is "+name+" and I live in "+city+". I study at "+school+" in batch "+batch);
		
	}
	public static void main(String[] args) {
		Main131 obj=new Main131();
		obj.name="John";
		obj.city="Miami";
		obj.school="Syntax";
		obj.batch=6;
		
		obj.display();
	}
}
