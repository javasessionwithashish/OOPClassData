package chapter5.singleInheritance;

public class Class1 {

	int roll;
	String name;
	
	void display()
	{
	System.out.println("THis is from class1");
	}
	
//If you dont want a function to be overriden
//in a child class, use the keyword "final".
	
	final void show()
	{
System.out.println("This is from class1 show");
	}
}
