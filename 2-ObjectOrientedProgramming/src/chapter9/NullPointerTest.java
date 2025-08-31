package chapter9;

public class NullPointerTest {
	
	public static void main(String[] args) {
		
		String s= null;
		String name="virinchi";
		
		try {
		System.out.println(s.length());
		
		throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
	System.out.println("Your string value is null");
		}
		
	}

}
