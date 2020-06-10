package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {

	public static void main(String[] args) throws IOException {


		String filePath="C:\\Users\\bacht\\eclipse-workspace\\JavaBasics\\configs\\Config.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
		Properties prop =new Properties();
		prop.load(fis);
		
		String str =prop.getProperty("browser");
		String str1 =prop.getProperty("url");
		
		System.out.println(str);
		System.out.println(str1);

	}

}
