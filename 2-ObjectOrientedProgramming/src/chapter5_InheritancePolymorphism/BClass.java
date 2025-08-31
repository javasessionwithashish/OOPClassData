package chapter5_InheritancePolymorphism;

import chapter4_ClassesObjectsAccessModifierConstructors.AClass;

//SubClass
public class BClass extends AClass{
	

	public static void main(String[] args) {
		BClass b = new BClass();
		//b is object of subclass
		b.a=5;
		b.display();
		
	}

}
