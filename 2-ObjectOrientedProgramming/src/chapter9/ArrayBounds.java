package chapter9;
import java.lang.ArrayIndexOutOfBoundsException;

public class ArrayBounds {
	public static void main(String[] args) {
		
		try {
		int[] array= new int[5];
		array[3]=5;
		
		//throw new ArrayIndexOutOfBoundsException();
	//	array[5]=40;
		}
		catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Check your array size before adding data");	
		}
		
	}

}
