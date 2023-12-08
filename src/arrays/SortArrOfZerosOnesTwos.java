package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Examples:
 * Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Input: nums = [2,0,1]
Output: [0,1,2]

Input: nums = [0]
Output: [0]
 */

public class SortArrOfZerosOnesTwos {

	/* approach 1:
	 * maintaining their count and replacing the given array with the values (0, 1, 2) based on their count
	 */
	//	Time Complexity: O(N) + O(N)
	//	Space Complexity: O(1)
	public static void sortArrayZOTs_ap1(int[] arr) {
		int cnt_0 = 0;
		int cnt_1 = 0;
		int cnt_2 = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) cnt_0++;
			if(arr[i] == 1) cnt_1++;
			if(arr[i] == 2) cnt_2++;
		}
		for(int i = 0; i < cnt_0; i++) {
			arr[i] = 0;
		}
		for(int i = cnt_0; i < cnt_0 + cnt_1; i++) {
			arr[i] = 1;
		}
		for(int i =cnt_0 + cnt_1; i < arr.length; i++) {
			arr[i] = 2;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	/* approach 2:Dutch National flag algorithm
	 * > arr[0...low-1] contains 0
	 * > arr[low...mid-1] contains 1
	 * > arr[high+1...n-1] contains 2
	 * > arr[mid...high] is the unsorted segment of the array
	 * if arr[mid] == 0, swap arr[low] and arr[mid], increment both low and mid
	 * if arr[mid] == 1, increment mid
	 * if arr[mid] == 2, swap arr[mid] and arr[high], decrement high 
	 */
	// time complexity : O(N)
	// space complexity : O(1)
	public static void sortArrayZOTs_ap2(int[] arr) {
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		while(mid < high) {
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}
			if(arr[mid] == 1) {
				mid++;
			}
			if(arr[mid] == 2) {
				int temp2 = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp2;
				high--;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		sortArrayZOTs_ap2(arr);

	}

}
