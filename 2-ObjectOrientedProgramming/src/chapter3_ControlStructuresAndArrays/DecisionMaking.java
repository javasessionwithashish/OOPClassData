package chapter3_ControlStructuresAndArrays;

public class DecisionMaking {
	//Nested If-Else
	public static void main(String[] args) {
		int a=4, b=2 ,c=3;
		int max;
		
		
		if(a>b)
		{
			if(a>c)
			{
				max=a;
			}
			else
			{
				max=c;
			}
		}
		else
		{
			if(b>c)
			{
				max=b;
			}
			else
			{
				max=c;
			}
		}
		
		
		
		System.out.println(max);
	}

}
