package chapter4;

public class PassTest {
	
	//Pass By Value
	void method1(int x, int y)
	{
		System.out.println(x+" "+y);
		System.out.println(y);
	}
	
	//Pass By Reference
	void method2( PassTest p, int [] array)
	{
		System.out.println(p);
		System.out.println(array);
	}
	
	public static void main(String[] args) {
		
		PassTest p1= new PassTest();
		int a=3,b=4;
		p1.method1(a, b);//Pass By Value
		
		int[] arr= {5,6,7};
		p1.method2(p1, arr);
		
	}

}
