package sorting;

import java.util.Arrays;

public class SelectionSort {

	/* approach 1:
	 * select minimum's in the array and swap
	 */
	// time complexity: O(n^2)
	// space complexity: O(1)
	public static void selectionSort_ap1(int[] arr) {

		for(int i = 0; i < arr.length-1; i++) {
			int minIndexValue = findMinimum(arr, i, arr.length);
			swap(arr, i, minIndexValue);
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static Integer findMinimum(int[] arr, int start, int end) {
		Integer min = Integer.MAX_VALUE;
		int indexValue = -1;
		for(int i = start; i < end; i++) {
			if(arr[i] < min) {
				min = arr[i];
				indexValue = i;
			}
		}
		System.out.println("Minimum: " + min + " Index Value: " + indexValue);
		return indexValue;
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 5, 9, 2, 8};
		selectionSort_ap1(arr);

	}

}
