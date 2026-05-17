package Threading;

public class MyThread3 extends Thread{

	@Override
	public void run() {
	

		System.out.println("From "+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		

			System.out.println("Thread Interrupted");
		}
	}
}
