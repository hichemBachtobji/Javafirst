package com.syntax.class21;

	public class userInfo extends userClass{
		
		String address;
		
		userInfo(String name, int number,String address){
			super(name, number);
			this.address=address;
		}
	void display () {
		System.out.println(name+" "+number+" "+address);
	}
	
	public static void main(String[] args) {
		
		userInfo user= new userInfo("Hichem",2022277365,"Washington");
		user.display();
	}
}
