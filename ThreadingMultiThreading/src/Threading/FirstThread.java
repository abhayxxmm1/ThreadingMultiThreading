package Threading;

public class FirstThread extends Thread{

	@Override
	public void run() {
	
		System.out.println(":First thread Begin");
		System.out.println("From 1st thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getId());
		System.out.println("First thread ended");
		
	}
	
}
