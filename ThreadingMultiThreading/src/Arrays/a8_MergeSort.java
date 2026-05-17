package Arrays;

import java.util.Arrays;

public class a8_MergeSort {

	public static void main(String[] args) {
		
		int []arr= {1,4,2,1,3,5,7};
		System.out.println(Arrays.toString(arr));
		
	mergesort(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void mergesort(int[] arr,int l, int r) {
		if (l<r) {
			int mid=(l+r)/2;
			mergesort(arr, l, mid);
			mergesort(arr, mid+1, r);
			merege(arr,l,mid,r);
		}
	}

	public static void merege(int[] arr, int l, int mid, int r) {
		int letL=mid-l+1;
		int letR=r-mid;
		
		int [] left=new int[letL];
		int [] right=new int[letR];
		
		for (int i = 0; i < letL; i++) {
			left[i]=arr[l+i];			/// arr[l+i];
		}
		for (int i = 0; i < letR; i++) {
			right[i]=arr[mid+1+i];			/// arr[mid+1+i];
		}
		
		int i=0,j=0,k=l;
		
		while (i<letL && j<letR) {
			if (left[i]<right[i]) {
				arr[k++]=left[i++];
				
			}else {
				arr[k++]=right[i++];
			}
		}
		
		while (i<letR) {
			arr[k++]=left[i++];
		}
		while (i<letL) {
			arr[k++]=right[i++];
		}
	}
}
