package chapter5;

public class Dog extends Animal{
	//Method Overriding 
		@Override
		void bark() {
			//super.bark(), super keyword will call super class methods
			System.out.println("Coming from dog class");	
		}
	
	public static void main(String[] args) {
		
		Dog d= new Dog();
		d.bark();
		d.eat();
	}
	

}
