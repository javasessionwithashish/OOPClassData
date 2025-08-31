package chapter5.constructorBehavior;
//Constructor Behavior in Inheritance
public class TestClass {

	public TestClass()
	{
		//default constructor
		
		System.out.println("This is from TestClass Constructor");
	}
	public TestClass(int a)
	{
		//parameterized constructor
System.out.println("Parameterized Constructor from superclass");
	}
	
	void display() {
		//simple void function
	}
	
}
