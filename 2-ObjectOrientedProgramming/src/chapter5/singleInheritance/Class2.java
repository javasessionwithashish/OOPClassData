package chapter5.singleInheritance;

public class Class2 extends Class1{
	
	void display()
	{
		super.display();
	}
	
	//@- Annotations
	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	
	public static void main(String[] args) {
		Class2 c2 = new Class2();
		c2.roll=5;
		c2.name="virinchi";
		c2.display();
		
		
	}

}
