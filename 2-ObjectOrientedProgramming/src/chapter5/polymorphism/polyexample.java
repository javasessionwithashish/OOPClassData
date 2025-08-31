package chapter5.polymorphism;

public class polyexample {
	//polymorphism - same name, different forms
	//Types:
	/*
	 * 1. Method Overriding - Needs different classes
	 * .i.e Inheritance is involved.
	 * 2. Method Overloading - Same class, same function name
	 * Different parameters
	 * 
	 * Compile Time - Code is getting validated for execution/run
	 * Run Time - Code is being executed, running
	 * 
	 * Types:
	 * 
	 * 1. Compile Time Polymorphism (Method Overloading)
	 * 2. Run Time Polymorphism (Method Overriding)
	 */
	

	static void function1()
	{
		System.out.println("This is from first/super class");
	}
	
	
	static void function1(float b)
	{
		
	}
	
	static void function1(int a)
	{
		
	}
	
	static void function1(int b, int c)
	{
		
	}
	
	static void function1(int a, String b)
	{
		
	}
	
	static void function1(String a, String b)
	{
		
	}
	
	public static void main(String[] args) {
		function1();
		function1(5);
		function1(1,2);
		
	}
	
	
	
}
