package com.syntax.class26;

public class Registration {
	
	/*Create Registration Class in which you would have variables as email, 
	 * userName and password that have an access scope only within its own class. 
	 * After creating an object of the class user should be able to call methods 
	 * and in each method separately pass values to set users email, username and password. 
	 * 
	 */
	
	private String email;
	private String userName;
	private String password;
	
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			this.email=email;
		}
			
	}
	public void SetuserName(String userName) {
		if (userName.isEmpty() && userName.length()>6) {
			this.userName=userName;
		}
		
}
	public void Setpassword (String password) {
		if (password.isEmpty() && password.length()>6) {
			if (!password.contains(userName)) {
				this.password=password;
			}
			
		}
		
	}
	
	public String getEmail() {
		return email;
	}
	public String getuserName() {
		return userName;
	}
	public String getpassword() {
		return password;
	}
}