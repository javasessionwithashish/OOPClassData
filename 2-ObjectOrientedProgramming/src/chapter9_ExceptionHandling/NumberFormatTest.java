package chapter9_ExceptionHandling;
import java.lang.NumberFormatException;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		String name="kumaripati";
		
	try {
		int n= Integer.parseInt(name);
		System.out.println(n);
	}
	catch(NumberFormatException e)
	{
System.out.println("String cannot be converted into integer");
	}
	}

}
