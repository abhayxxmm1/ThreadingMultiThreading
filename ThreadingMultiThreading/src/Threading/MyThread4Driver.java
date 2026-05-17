package Threading;

public class MyThread4Driver {

	public static void main(String[] args) {
		
		Demo d1 = new Demo();
		
		MyThread4 t1 = new MyThread4("Raju", d1);
		MyThread4 t2 = new MyThread4("Raniiiiiiiiiiiiiii", d1);
		
		t1.start();
		t2.start();
		
	}
}
