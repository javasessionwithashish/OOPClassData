package chapter9;

public class ExceptionHandling {

	//Tools for Exception Handling:
	/* 
	 * 1. Try
	 * 2. Catch
	 * 3. Throw
	 * 4. Throws
	 * 5. Finally
	 */
	
	public static void main(String[] args) {
		
		try
		{
			//Potential error logic should be inside try block
		int a=5/0;
		throw new ArithmeticException();
		}
		//With try, there should always be a catch block
		catch(ArithmeticException e)
		{
			//e.printStackTrace();//This prints suitable error message
			//to the console
			System.out.println("Arithmetic Exception inside try block");
		}
		finally {
			System.out.println("Coming from finally");
		}
		
		
		
	}
	
	
}
