package chapter5.constructorBehavior;

public class PrivateConstructorTest {
	public static void main(String[] args) {
		
//PrivateConstructorExample p1 = new PrivateConstructorExample();
//PrivateConstructorExample p1 = new PrivateConstructorExample(1);		

PrivateConstructorExample p1 = PrivateConstructorExample.getPrivateConstructor();
		p1.display();
		
	}

}
