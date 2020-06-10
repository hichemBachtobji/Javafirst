package com.syntax.class25;

public interface WebDriver {
	
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();

}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Browser opened");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Browser closed");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println(" maximize window");
		
	}

	@Override
	public void findElement() {
		System.out.println("Browser found element");
		
	}
	
	
}
class FireFoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximizeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}
	
	
}
