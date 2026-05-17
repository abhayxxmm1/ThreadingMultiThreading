package Threading;

public class Demo extends Thread{

	public  void greetings(String name) /// do synchronized  access Modifier here
	{
		for (int i = 0; i < 10; i++) {
			System.out.println("good Morning " + name);
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//
//
//				
//			}
		}
	}
}
