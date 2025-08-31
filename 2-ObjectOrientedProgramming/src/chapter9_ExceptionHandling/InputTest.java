package chapter9_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		while(true) //Infinite loop
		{
		try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int number= sc.nextInt();
		
		System.out.println("Please enter your name:");
		String name=sc.next();
		
		System.out.println(number);
		System.out.println(name);
		}
		catch
		(InputMismatchException e)
		{
			System.out.println("Recheck your integer value");
			
		}
		}
	}

}
