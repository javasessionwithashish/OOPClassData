package chapter3;

public class MultipleArray {
public static void main(String[] args) {
	
	int [][] array= {{1,2,3},{4,5,6},{5,6,8},{11,12,13}};
	
	//Print the array in matrix form
	//ROW
	for(int i=0;i<array.length;i++)
	{
		//COLUMN
		for(int j=0;j<array[i].length;j++)
		{
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
	}
}
}
