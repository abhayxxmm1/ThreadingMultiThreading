package Arrays;

public class a3_second_largest_element {

	public static void main(String[] args) {
		int [] a = {3,234,6,3,2,56,7} ;
		int i = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for (int j = 0; j < a.length; j++) {
				
				s=i;
			if (i<a[j]) {
				i=a[j];
			}
		}
		System.out.println(s);
		
	}
}
