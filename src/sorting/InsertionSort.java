package sorting;

import java.util.Arrays;

public class InsertionSort {

	/* approach 1:
	 * take an element and place it in its current order
	 */
	// time complexity: O(n^2) [worst and avg]; O(n) [best]
	// space complexity: O(1)
	public static void insertionSort_ap1(int[] arr) {
		int n = arr.length;
		for(int i = 0; i <= n-1; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				swap(arr, j-1, j);
				j--;
			}
		}
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 0, 7};
		insertionSort_ap1(arr);

	}

}
