package com.syntax.class24;

public abstract class File {

	public abstract void open();

	public void edit() {
		System.out.println("File can edit");
	}

	public  void close() {
		System.out.println("File can close");
	}

}

class JavaFile extends File{
	
	public void open() {
		System.out.println("to open java file we need note pad++");
	}
	
}
class WordFile extends File{
	public void open() {
		System.out.println("to open word file we need Microsoft word");
	}
	
}
class PDFFile extends File{
	public void open() {
		System.out.println("to open PDF file we need PDF ");
	}
}