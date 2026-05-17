package Arrays;

public class a4_sumOfArrayEles {

	public static void main(String[] args) {
		int [] a = {3,234,6,3,2,56,7} ;
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
