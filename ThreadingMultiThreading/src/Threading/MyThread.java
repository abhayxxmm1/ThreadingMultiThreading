package Threading;

public class MyThread extends Thread{

	@Override
	public void run() {
	
		Thread.yield(); 	
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield(); 	// lets to execution of other threads before its 
		}
		
	}
	
}
