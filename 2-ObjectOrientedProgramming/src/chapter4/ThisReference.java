package chapter4;

public class ThisReference {
	//Q. There should be an instance variable named "number"
	// there should be a method called display(int number)
	//the variable inside the method should call the instance
	//variable
	
int number;//instance variable


int getNumber()
{
	return this.number;
}

void setNumber(int number)
{
	this.number=number;
}


void display(int number)
{
	this.number=number;
	System.out.println("The number is:"+this.number);
}

public static void main(String[] args) {
	ThisReference tr = new ThisReference();
	
	tr.display(5);
	
}
}
