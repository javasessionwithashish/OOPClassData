package chapter4;

public class ClassExample {
//Instance Variable - variable that is recognized throughout the program
//Attributes

	private int id; //private access modifier
	protected String name;//protected access modifier
	public float salary;//public access modifier
	String address;//default access modifier
	
//Access modifier gives any variable or method the 
//privilege to be accessed by any other class.
	
	public static void main(String[] args) {
//Local Variable - Recognized locally inside a method
		
		ClassExample c= new ClassExample();
		
		c.id=4;
		c.name="virinchi";
		c.address="kumaripati";
		c.salary=700000000.100f;
		
		System.out.println(c.id);
		
	}

}
