package chapter5.constructorBehavior;

public class PrivateConstructorExample {

	private PrivateConstructorExample()
	{
		//SingleTon Pattern in JAVA
		//Yes, constructor can be private
		
	}
	private PrivateConstructorExample(int a)
	{
		
	}
	
	//public int function_name()
	//{
		
	//}
	
public static PrivateConstructorExample getPrivateConstructor()
{
PrivateConstructorExample p1= new PrivateConstructorExample();
return p1;
}
	
	
	
	void display()
	{
		System.out.println("hi");
	}
}
