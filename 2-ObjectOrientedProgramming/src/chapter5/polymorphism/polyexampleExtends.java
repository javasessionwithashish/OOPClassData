package chapter5.polymorphism;

public class polyexampleExtends extends polyexample {

	static void function1()
	{
		System.out.println("This is from second class");
	}
	
	void show()
	{
		
	}
	
	
	public static void main(String[] args) {
		function1();
		polyexample pe = new polyexampleExtends();
		pe.function1();
	}

}
