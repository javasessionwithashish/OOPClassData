package chapter3_ControlStructuresAndArrays;

import java.util.Scanner;


public class Calculator {
public static void main(String[] args) {
	//Variable declare
	int firstValue, secondValue;
	//Object of Scanner Class
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first value: ");
	firstValue= sc.nextInt();
	
	System.out.println("Enter the second value: ");
	secondValue=sc.nextInt();
	
	System.out.println("For calculation, enter: +, -, *: ");
	String operator; //String is also applicable
	operator = sc.next();
	
	int result = 0;
	
	if(operator=="+")
	{
		result=firstValue+secondValue;
	}
	else if(operator=="-")
	{
		result=firstValue-secondValue;
	}
	else if(operator=="*")
	{
		result=firstValue*secondValue;
	}
	System.out.println(result);
	
	
	
	
}
}
