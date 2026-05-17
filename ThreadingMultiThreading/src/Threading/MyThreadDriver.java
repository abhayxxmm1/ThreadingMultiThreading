package Threading;

public class MyThreadDriver {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		m1.start();
		MyThread2 m2 = new MyThread2();
		m2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("From "+ Thread.currentThread().getName());
		}
		
	}
}
