package chapter9.thread;
import java.lang.Thread;

//to maintain concurrency we need to extend thread class
public class MyThread extends Thread {
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			}
	}
	
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		t1.start();//this activates the run method
		
		MyThread t2= new MyThread();
		t2.start();//this activates the run method
	}

}
