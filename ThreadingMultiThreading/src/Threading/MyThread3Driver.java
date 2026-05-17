package Threading;

public class MyThread3Driver {

	public static void main(String[] args) {
		MyThread3 m3 = new MyThread3();
		m3.start();
		m3.interrupt(); // interrupts the exe of current thread
	}
}
