package chapter5.Abstraction;

public interface TestInterface {
//We cannot create implementation details
	//inside Interface on any functions, as it is
	//100% Abstraction.
	
	public void show();
	
	//To create implementation details( method body)
	//of an interface, we need to:
	//Create a class and then inherit the properties
	//of interface with another keyword 'implements'
	//'implements' keyword does the same work as
	//'extends'
	
	
	 void display1();
	 
	 int sum();
	 
	
}
