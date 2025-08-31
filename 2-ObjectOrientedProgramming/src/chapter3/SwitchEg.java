package chapter3;

public class SwitchEg {
	
	public static void main(String[] args) {
		
		int a=1;
		
		//switch(value), value will be checked in case
		
		switch(a) 
		{
		case  5:
		{
			System.out.println("5");
			// In every case, we need to add a break statement at the end
			break;
		}
		case 6:
		{
			System.out.println("6");
			break;
		}
		
		default:
		{
			System.out.println("Not according to cases");
			break;
		}
		
			
		}
		
		
	}

}
