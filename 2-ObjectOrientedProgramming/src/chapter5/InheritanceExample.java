package chapter5;

public class InheritanceExample {
/*Inheritance in Java is a terminology utilized for 
 * inheriting properties(variables, methods) 
 * from a superclass/ parent class
 *  to its subclasses/child class.	
 */
	
//Child Class 'extends' the properties of Super Class
	
	
static int a=5;

}

 class subClass extends InheritanceExample
 {
public static void main(String[] args) {
	a=6;
	System.out.println(a);
}

}
