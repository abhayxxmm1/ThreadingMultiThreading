package Arrays;

import java.util.Arrays;

public class a6_reverse_copy {

	public static void main(String[] args) {
		int [] a = {3,234,6,3,2,56,7} ;
		
		int dup[]=new int[a.length];
		for (int i = 0; i < dup.length; i++) {
			dup[a.length-1-i]=a[i];
		}
		System.out.println(Arrays.toString(dup));
	}
}
