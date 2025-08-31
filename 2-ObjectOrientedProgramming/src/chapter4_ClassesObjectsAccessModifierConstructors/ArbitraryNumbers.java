package chapter4_ClassesObjectsAccessModifierConstructors;

public class ArbitraryNumbers {
	
	static void add(int... numbers)
	{
//There is no variable length for numbers variable above
		System.out.println(numbers[0]);
	}
	
	static void addArray (int[] arr)
	{
		System.out.println(arr[0]);
	}
	
	public static void main(String[] args) {
		
		add(1,2,3,4);
		add(1);
		add(1,2,3,4,8,1,2,3,3,3);
		
		int[] arr= {1,2,3,4};
		addArray(arr);
	}

}
