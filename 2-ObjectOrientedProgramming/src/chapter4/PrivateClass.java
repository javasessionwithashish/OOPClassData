package chapter4;

public class PrivateClass {
	
	private int id; //default access modifier
	protected String name; //default access modifier
	
	public static void main(String[] args) {
		PrivateClass p1= new PrivateClass();
		p1.id=4;
	}

}
