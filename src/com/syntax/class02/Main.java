package com.syntax.class02;

import java.util.ArrayList;


class Main {
	 public static void main (String [] args){
		    
		  ArrayList<String> list= new ArrayList<>();
		    
		    list.add("hi");
		    list.add("yo");
		    list.add("sup");
		    list.add("yolo");
		    list.add("boop");
		    
		    list.remove("hi");
		    list.remove("sup");
		    list.remove("boop");
		    
		    System.out.println(list);
		  }

}	

