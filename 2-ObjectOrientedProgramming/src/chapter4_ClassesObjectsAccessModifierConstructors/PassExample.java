package chapter4_ClassesObjectsAccessModifierConstructors;

public class PassExample {
	/*
	 * We can either pass by value or pass by reference
	 */

	static void display(int a, int b)//Pass By value
	{
		System.out.println("Sum:"+(a+b));
	}
	
	void displayObject(PassExample p, String name, int[] array)
	{
		System.out.println(p);
		System.out.println(name);
		System.out.println(array);
	}
	
	public static void main(String[] args) {
		
		display(4,5);//Pass By value
		int x=2,y=5;
		display(x,y);
		
		//Pass By Reference
		PassExample p1= new PassExample();
		String name="virinchi";
		//p1.displayObject(p1,name);//Pass By Reference
		
		int[] arr= {1,2,3,4,5};
		p1.displayObject(p1, name, arr);
	}
}
