package Arrays;

import java.util.Arrays;

public class a9_QickSort {

	public static void main(String[] args) {
		
		int []arr= {1,4,2,1,3,5,7};
//		System.out.println(Arrays.toString(arr));
		
		quickSort(arr,0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void quickSort(int [] arr, int start,int end) { 
		
		
		if (start<end ) return;
		
		int pivot= partition(arr,start,end);
		quickSort(arr, start, pivot-1);		
		quickSort(arr, pivot+1, end);
		
		
	}
	
	public static int partition(int []arr,int start,int end) {
		int pivot=arr[end];
		int j=start-1;
		
		for (int i = start; i < end; i++) {
			if (arr[i]<pivot) {
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		j++;
		int temp=arr[j];
		arr[j]=arr[end];
		arr[end]=temp;
		
		return j;
	}
}
