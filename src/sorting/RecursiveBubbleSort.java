package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {

	/* approach 1:
	 * instead of using two loops, we can use recursion for the first loop
	 */
	public static void recursiveBubbleSort(int[] arr, int i ) {
		//recursive function
		
		//base condition
		if(i == 0) return;
		//logic
		for(int j = 0; j < i; j++) {
			if(arr[j] > arr[j+1]) {
				swap(arr, j, j+1);
			}
		}
		recursiveBubbleSort(arr, i-1);
	}
	
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 5, 9, 2, 8};
		recursiveBubbleSort(arr, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
