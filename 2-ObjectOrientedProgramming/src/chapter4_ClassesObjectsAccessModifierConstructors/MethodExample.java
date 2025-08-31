package chapter4_ClassesObjectsAccessModifierConstructors;

public class MethodExample {
// We donot create a function inside main method,
// We create it inside a class but outside main method.
	
	/*
	 * Function in Java
	 * 
	 * accessmodifier static returntype methodName(parameter )
	 * {
	 * }
	 * 
	 */
	
	 void display()
	{
		System.out.println("HELLO I AM FROM DISPLAY");
	}
	 
	 void sum(int a, int b)
	 {
		 int sum= a+b;
		 System.out.println("SUM IS:"+sum);
	 }
	 
	 int substract(int a, int b)
	 {
		 int minus=a-b;
		 
		 return minus;
	 }
	 
	 
	
	public static void main(String[] args) {
		MethodExample m= new MethodExample();
		
		m.display();
		m.sum(4, 5);
		
	int minus= m.substract(4, 2);
	
	System.out.println("SUBSTRACTION IS:"+minus);
		
	}

}
