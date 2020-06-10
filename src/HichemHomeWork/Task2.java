package HichemHomeWork;

abstract class Marks {
	
	int sub1;
	int sub2;
	int sub3;
	
	Marks (int sub1,int sub2,int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;		
	}
	
//	We have to calculate the average of marks obtained in three subjects
//	by student A and by student B. Create class ‘Marks’ with an 
//	abstract method ‘getPercentage’ that will be returning the average percentage of marks.
//	Provide implementation of abstract method in classes ‘A’ and ‘B’. 
//	The constructor of student A takes the marks in three subjects as its parameters
//	and the marks in four subjects as its parameters for student B. Test your code
	
	

	abstract double getPercentage();
	
}




class A extends Marks{

	A(int sub1, int sub2, int sub3) {
		super(sub1, sub2, sub3);
		
	}
	@Override
	double getPercentage() {
		double average=(sub1+sub2+sub3)/3;
			return average;	
	}
	
}
class B extends Marks{
	int s4;
	B(int sub1,int sub2, int sub3,int s4){
		super(sub1,sub2,sub3);
		this.s4=s4;
		
	}
	@Override
	double getPercentage() {
		int aver=(sub1+sub2+sub3+s4)/4;
		return aver;
		
	}
	
	
}