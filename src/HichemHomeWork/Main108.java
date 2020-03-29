package HichemHomeWork;

public class Main108 {
	
	String spaceOut (String str ) {
		
	String sum="";
		for (int i=0;i<str.length();i++) {
			sum+=str.charAt(i)+" ";
		
		
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Main108 obj=new Main108();
		String s=obj.spaceOut("Hello");
		String h=obj.spaceOut("technology");
		System.out.println(s);
		System.out.println(h);
		
	}
	}
