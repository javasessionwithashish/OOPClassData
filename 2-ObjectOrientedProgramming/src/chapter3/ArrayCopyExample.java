package chapter3;
//ArrayCopyDemo.java
 // Demonstrate arraycopy in Java
 public class ArrayCopyExample
 {
 public static void main(String[] args)
 {
 int[] copyFrom = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
int[] copyTo = new int[7];

System.arraycopy(copyFrom, 2, copyTo, 0, 6);
int i;
System.out.println("Content of copyTo:");

for (i = 0; i < copyTo.length; i++)
System.out.print(copyTo[i] + " ");
}
}