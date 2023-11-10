package sorting;

import java.util.Arrays;

public class BubbleSort {

	/* approach 1:
	 * push the max to the last by adjacent swaps
	 */
	// time complexity: O(n^2) [worst and avg]; O(n) [best]
	// space complexity: O(1)
	public static void bubbleSort_ap1(int[] arr) {
		int n = arr.length;
		/* if everything is in ascending order, then also it will loop for n^2 times giving O(n^2) as time complexity
		 * in order to optimize in this type of scenarios, we use didSwap variable, if didSwap == 0 after 1st iteration, 
		 * then it means given array is in ascending order, so we can break the loop
		*/
		int didSwap = 0;
		for(int i = n-1; i >= 1; i--) {
			for(int j = 0; j <= i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
					didSwap = 1;
				}
			}
			if(didSwap == 0) {
				System.out.println(didSwap);
				break;
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
		int[] arr = {2, 5, 7, 8, 9};
		bubbleSort_ap1(arr);

	}

}
