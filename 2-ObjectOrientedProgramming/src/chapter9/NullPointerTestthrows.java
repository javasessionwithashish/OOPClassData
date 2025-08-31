package chapter9;

public class NullPointerTestthrows {
	
	void display() throws NullPointerException
	{
		String name=null;
		System.out.println(name.length());
	}
	
	
	
	public static void main(String[] args) throws NullPointerException {
		
		String s= null;
		String name="virinchi";
		

		System.out.println(s.length());
		
		
		
		
		
	}

}
