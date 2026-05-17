package Threading;

public class Thread2 extends Thread{
	
	@Override
	public void run() {
	

		System.out.println(Thread.currentThread().getName()+" Started");
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+" Ended");
	}
	
}
