package chapter2;

public class ArithmeticOperators {
public static void main(String[] args) {
	int number1 = 15, number2 = 10;
	char chr1 = 'a', chr2 = 'b';
	String str1 = "Hello ", str2 = "World";

	System.out.println("");
	System.out.println("number1 (before ++) = " + number1);
	System.out.println("number1++ = " + (number1++));
	System.out.println("number1 (after ++) = " + number1);
	System.out.println("");
	System.out.println("number2 (before ++) = " + number2);
	System.out.println("++number2 = " + (++number2));
	System.out.println("number2 (after ++) = " + number2);
	System.out.println("");
	System.out.println("Number 1 + Number 2:"+ (number1+number2));
	System.out.println("chr1 + chr2 = " + (chr1 + chr2));
	System.out.println("str1 + str2 = " + (str1 + str2));
	
	
	
}
}
