package chapter3;

public class Example {
	
	public static void main(String[] args) {
		
		int[] array1= new int[5];
		
		array1[0]=4;
		array1[2]=5;
		
		int[] array2;
		array2= array1.clone();
		
		System.out.println(array2[0]);
		
		
		
		
	}

}
