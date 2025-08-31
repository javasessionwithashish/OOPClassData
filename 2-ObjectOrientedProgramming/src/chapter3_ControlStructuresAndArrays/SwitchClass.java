package chapter3_ControlStructuresAndArrays;
import java.util.Scanner;


public class SwitchClass {
public static void main(String[] args) {
	//1. For Scanner class object 'sc'
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first number:");
	int firstNum = sc.nextInt(); 
			
	System.out.println("Enter the second number:");
	int secondNum= sc.nextInt();
	
	System.out.println("Which calculation: +,-,*");
	char calculation= sc.next().charAt(0);
	
	int result;
	
	switch(calculation)
	{
	case '+' :
	{
		result=firstNum+secondNum;
		System.out.println(result);
		break;
	}
	case '-' :
	{
		result=firstNum-secondNum;
		System.out.println(result);
		break;
	}
	case '*':
	{
		result=firstNum*secondNum;
		System.out.println(result);
		break;
	}
	default:
	{
		System.out.println("enter +,- or *");
	}
	
	
	}
	
}
}
