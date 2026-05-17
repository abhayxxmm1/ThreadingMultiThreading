package Threading;

public class MyThread4 extends Thread{
	
	Demo d;
	
	String name;
	
	public MyThread4() {
		// TODO Auto-generated constructor stub
	}
	
	public MyThread4(String name, Demo d) {
		this.name = name;
		this.d = d;
	}
	
	@Override
	public void run() {
		d.greetings(name);
	}

}
