package chapter3;

public class ArrayTest {
	public static void main(String[] args) {
	//Array always has a fixed size.	
//1. Implicit Way of creating array	
	int[] arr= {1,2,3,6,5};//Recommended
	int arr1[]= {1,2,3};//In C
	
//2. Explicit Way of creating array in Java
	int[] arr2= new int[] {2,3,4};
	
int a,arr3[];//Create a variable and array in 1 line
a=5;
arr3= new int[] {1,2,3};

//int arr5[10];//Wrong way
//int[10] arr6;// Wrong way

int[] arr7; 

int[] arr8 = new int[10];

arr8[0]=1;
arr8[1]=2;

int[] b;

b=arr.clone();//Duplicate

	System.out.println(b[0]);	
		
		
	}

}
