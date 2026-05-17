package Arrays;

import java.util.Iterator;

public class a2_largest_ele {

	public static void main(String[] args) {
		int [] a = {3,234,6,3,2,56,7} ;
		int i = Integer.MIN_VALUE;
		for (int j = 0; j < a.length; j++) {
			if (i<a[j]) {
				i=a[j];
			}
		}
		System.out.println(i);
		
	}
}
