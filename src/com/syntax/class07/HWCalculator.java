package com.syntax.class07;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {
	
		  Scanner scan=new Scanner(System.in);
		  double num1;
		  double num2;
		  char operator;
		  double result = 0;
		  System.out.println("Please enter two numbers");
		  num1=scan.nextDouble();
		  num2=scan.nextDouble();
		  System.out.println("Please enter operator: +, -, /, *");
		  operator=scan.next().charAt(0);
		  switch(operator){
		  case '+':
		    result=num1+num2;
		    break;
		    case '-':
		      result=num1-num2;
		      break;
		      case '/':
		        result=num1/num2;
		        break;
		        case '*':
		          result=num1*num2;
		          break;
		          default:
		          System.out.println("Invalid operator");
		  }
		  System.out.println("The result "+result);
		}

	}


