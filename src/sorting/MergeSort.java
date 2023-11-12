package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
	
	/* approach 1:
	 * Divide and merge -> divide the given array until its size reduces to 1, and then do backtracking by merging the left and right arrays
	 */

	public static void mergeSortDivide_ap1(int[] arr, int low, int high) {
		
		//base condition
		if(low >= high) return;
		
		int mid = (low + high)/2;
		
		//left half of the array
		mergeSortDivide_ap1(arr, low, mid);
		//right half of the array
		mergeSortDivide_ap1(arr, mid+1, high);
		
		//after sorting the left and right halves of the array, merge both arrays
		mergeSortMerge_ap1(arr, low, mid, high);
	}
	
	public static void mergeSortMerge_ap1(int[] arr, int low, int mid, int high) {
		List<Integer> temp = new ArrayList<>();
		//left pointer
		int left = low;
		//right pointer
		int right = mid+1;
		
		while(left <= mid && right <= high) {
			while(left <= mid && arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			while(right <= high && arr[left] > arr[right]) {
				temp.add(arr[right]);
				right++;
			}
			
		}
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		for(int i = low; i <= high; i++) {
			arr[i] = temp.get(i-low);
		}
	
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 5, 9, 2, 8};
		mergeSortDivide_ap1(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
