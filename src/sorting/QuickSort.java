package sorting;

import java.util.Arrays;

public class QuickSort {

	/* approach 1:
	 * pick a pivot and place it in its correct place in the sorted array
	 * smaller on the left, larger on the right
	 */
	// time complexity: O(n * log(n) [best & avg]; O(n^2) [worst]
	// space complexity: O(1) + O(n)
	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotIndex = placePivot(arr, low, high);
			quickSort(arr, low, pivotIndex-1);
			quickSort(arr, pivotIndex+1, high);
		}
		
	}
	
	// this method places the pivot at its current index position
	public static int placePivot(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		while(i < j) {
			while(i <= high && arr[i] <= pivot) {
				i++;
			}
			while(j >= low && arr[j] > pivot) {
				j--;
			}
			if(i < j) {
				swap(arr, i, j);
			}
		}
		swap(arr, low, j);
		return j;
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 1, 0, 7};
		quickSort(arr, 0, arr.length-1);
		System.out.println("After sorting: " + Arrays.toString(arr));

	}

}
