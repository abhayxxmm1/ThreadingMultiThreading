package dobts;

import java.util.Scanner;

public class Nonstatic {

	static int a;
	
	{
		Scanner sc = new  Scanner(System.in);
		a = sc.nextInt();
	}
	public static void main(String[] args) {
		a=10;
		System.out.println(a);
		Nonstatic nonstatic = new Nonstatic();
		
	}
}
