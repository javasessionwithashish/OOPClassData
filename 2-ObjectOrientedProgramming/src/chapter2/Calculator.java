package chapter2;

import java.util.Scanner;
//This is a singleline comment

/*this is a multiline comment
 *
 */
//sirs comments



public class Calculator {
	
	public static void main (String[] args)
	{
		int x,y,total;
		
	System.out.println("Enter the first number:");
Scanner scObj = new Scanner(System.in);//Object of Scanner class
x=scObj.nextInt();//Puts value given by user to 'x'
//System.out.println(x);
System.out.println("Enter the second number:");
y=scObj.nextInt();

//Mathematical Equation
total=x-y;
System.out.println("The addition of x and y is:"+total);

		
	}

}
