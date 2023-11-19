package arrays;

import java.util.Arrays;

/* Examples:
 * Example 1:
Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
Output: 6 7 1 2 3 4 5
Explanation: array is rotated to right by 2 position .

Example 2:
Input: N = 6, array[] = {3,7,8,9,10,11} , k=3 , left 
Output: 9 10 11 3 7 8
Explanation: Array is rotated to right by 3 position.
 */

public class RotateArrayByKPlaces {
	
	/* approach 1:
	 * by swapping the first element to its next element till the end of the array,
	 * such that we will get the first element to the last index and all other elements will move left by one position
	 * do this step k times, where k is the number of times array has to rotate
	 */
	// time complexity: O(N^2)
	// space complexity: O(1)
	public static void leftRotateByK_ap1(int[] arr, int k) {
		for(int m = 0; m < k; m++) {
			
			for(int i = 0; i < arr.length-1; i++) {
				//swap
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println("Array after rotating left by " + k + " positions: " + Arrays.toString(arr));
	}
	/* by following approach 1:
	 * by swapping the last element to its previous element till the end of the array
	 * such that we will get the last element to the first index and all other elements will move right by one position
	 * do this step k times, where k is the number of times array has to rotate
	 */
	public static void rightRotateByK_ap1(int[] arr, int k) {
		for(int m = 0; m < k; m++) {
			
			for(int i = arr.length-1; i >= 1; i--) {
				//swap
				int temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
		}
		System.out.println("Array after rotating right by " + k + " positions: " + Arrays.toString(arr));
	}
	
	
	/* approach 2:
	 * for right rotate, if k = 2, rotate the last two elements and rotate the elements from 0 to n-3 position, then rotate the entire array by reversing 
	 */
	// time complexity: O(N)
	// space complexity: O(1)
	public static void leftRotateByK_ap2(int[] arr, int k) {
		rotate(arr, 0, k-1);
		rotate(arr, k, arr.length-1);
		rotate(arr, 0, arr.length-1);
		System.out.println("Array after rotating left by " + k + " positions: " + Arrays.toString(arr));
	}
	//reversing the array by swapping the elements
	public static void rotate(int[] arr, int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	/* by following approach 2:
	 * for left rotate, if k = 2, rotate the first two elements and rotate the elements from 2nd to n-1 position, then rotate the entire array by reversing 
	 */
	public static void rightRotateByK_ap2(int[] arr, int k) {
		rotate(arr, 0, arr.length - k -1);
		rotate(arr, arr.length - k, arr.length -1);
		rotate(arr, 0, arr.length-1);
		System.out.println("Array after rotating right by " + k + " positions: " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		leftRotateByK_ap1(arr, 2);
		rightRotateByK_ap1(arr, 3);
		leftRotateByK_ap2(arr, 3);
		rightRotateByK_ap2(arr, 2);

	}

}
