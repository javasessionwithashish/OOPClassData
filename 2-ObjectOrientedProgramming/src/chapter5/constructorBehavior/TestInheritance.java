package chapter5.constructorBehavior;

public class TestInheritance extends TestClass{
	
	public TestInheritance()
	{
		super();
	}
	
	public TestInheritance(String a)
	{
		super(1);
	}
	
	@Override
	void display() {
	super.display();//Will call the super class
	}
	
	
	public static void main(String[] args) {
	TestInheritance t1 = new TestInheritance();
	TestInheritance t2= new TestInheritance("j");
		t1.display();
	}

}
