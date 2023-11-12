package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {

	/* approach 1:
	 * instead of using two loops, we can use recursion for the first loop
	 */
	// time complexity: O(n^2)
	// space complexity: O(n) [for recursive stack space]	
	public static void recursiveInsertionSort(int[] arr, int i) {
		
		//base condition
		if(i == arr.length) return;
		//logic
		int j = i;
		while(j > 0 && arr[j] < arr[j-1]) {
			swap(arr, j, j-1);
			j--;
		}
		recursiveInsertionSort(arr, i+1);
	}
	
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {7, 5, 9, 2, 8};
		recursiveInsertionSort(arr, 0);
		System.out.println(Arrays.toString(arr));
	}

}
