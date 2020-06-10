package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File f=new JavaFile();
		f.close();
		f.edit();
		f.open();
		
		File w=new WordFile();
		w.close();
		w.edit();
		w.open();
		
		
		

	}

}
