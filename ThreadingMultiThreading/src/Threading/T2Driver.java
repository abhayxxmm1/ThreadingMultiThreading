package Threading;

public class T2Driver {
	public static void main(String[] args) {
		Thread2 t1 = new Thread2();
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("hola");
//		t1.setId();
		t1.start();
		
		System.out.println(Thread.currentThread().getName()+" Started");
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+" Ended");
		
		/// Slight delay leads to execution of next thread
	}
}
