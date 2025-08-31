package chapter5.multiLevelInheritance;

//SubClass of SuperClass(ClassA) 
//as well as ClassB
public class ClassC extends ClassB {
	
	@Override
	void functionB() {
super.functionB();
	}
	

	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.functionA();
		c.functionB();
}

	
}
