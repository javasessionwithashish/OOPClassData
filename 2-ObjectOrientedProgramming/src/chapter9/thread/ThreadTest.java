package chapter9.thread;
import java.lang.Thread;

public class ThreadTest extends Thread {
	
	void display()
	{

		for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
	}
	void show()
	{

		for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	//Run multiple processes concurrently
	
	@Override
	public void run() {
		
		

		for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadTest t1= new ThreadTest();
		t1.start();//0-9
		
		ThreadTest t2= new ThreadTest();
		t2.start();//0-9
		
	}

}
