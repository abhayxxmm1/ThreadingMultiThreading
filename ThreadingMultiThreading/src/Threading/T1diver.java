package Threading;

public class T1diver {

	public static void main(String[] args) {
		String nameString = Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		long id = Thread.currentThread().getId();
		
		System.out.println(nameString);
		System.out.println(priority);
		System.out.println(id);
	}
}
