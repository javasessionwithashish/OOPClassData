package chapter9.thread;
import java.lang.Runnable;

public class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Thread2 t1= new Thread2();
		
		Thread t = new Thread(t1);
		t.start();
		
	}

}
