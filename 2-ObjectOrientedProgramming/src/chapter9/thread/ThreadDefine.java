package chapter9.thread;

public class ThreadDefine {
	
	//Note:
	/*
	 * Thread helps in the concurrent action of different processes
	 * Concurrent - running multiple processes at once
	 * Processes - methods/ functions
	 * 
	 * So, to achieve concurrency ,
	 * our simple class needs to extends Thread(java.lang.Thread)
	 * or our simple class needs to implement Runnable(java.lang.Runnable)
	 * 
	 * Here, in our super class .i.e: Thread or Runnable
	 * there is a function named as run(),
	 * we need to override so as to maintain concurrency by
	 * providing method call/ operations inside run() method.
	 * 
	 * 
	 * We start/call/activate the run function by the help of the keyword
	 * "start" 
	 * e.g.: SimpleClass s1= new SimpleClass();
	 * s1.start();
	 * start will call the run function for concurrency.
	 * 
	 * 
	 * 
	 */
	
	

}
