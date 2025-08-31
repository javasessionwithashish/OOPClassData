package chapter9;
import java.lang.NumberFormatException;

public class NumberFormatTestthrows {
	
	public static void main(String[] args) throws NumberFormatException {
		String name="kumaripati";
		

		int n= Integer.parseInt(name);
		System.out.println(n);
	
System.out.println("String cannot be converted into integer");
	
	}

}
