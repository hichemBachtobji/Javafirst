package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		// write into exinsting file and add values
		String filePath="C:\\Users\\bacht\\eclipse-workspace\\JavaBasics\\configs\\TaskConfig.properties";
		
		FileInputStream fis= new FileInputStream(filePath);
		
		Properties prop =new Properties();
		
		prop.load(fis);
		prop.setProperty("city", "Tunis");
		prop.setProperty("phoneNumber", "123456789");
		
		
		
		
		FileOutputStream fos=new FileOutputStream(filePath);
		
		prop.store(fos, "Added additional key");
		prop.store(fos, "Dc");

	}

}
