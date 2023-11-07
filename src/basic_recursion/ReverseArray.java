package basic_recursion;

import java.util.Arrays;
import java.util.Collections;

/* Examples:
 * Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

 * Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.
 
 */

public class ReverseArray {

	/* approach 1:
	 * run loop for n/2 times, and for every iteration, swap array values at ith index and n-i-1 index
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	
	public static void reverse_ap1(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			swap_ap1(start, end, arr);
			start++;
			end--;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void swap_ap1(int start, int end, int[] arr) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
	}
	
	
	/* approach 2: using recursion method
	 * declare a recursive function with arr, start index, end index as parameters, and swap the values at start and end index positions
	 * loop will run till start < end and for every iteration start will be start + 1, end will be end - 1
	 * 
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static void reverse_ap2(int[] arr, int start, int end) {
		
		//base condition
		if(start > end) return;
		swap_ap1(start, end, arr);
		reverse_ap2(arr, start+1, end-1);
	}
	
	
	/* approach 3: using built-in reverse method in Collections class
	 * in this approach, instead of using primitive data type int, we use Integer wrapper class
	 */
	// time complexity: O(n)
	// space complexity: O(1)
	public static void reverse_ap3(Integer[] arr) {
		Collections.reverse(Arrays.asList(arr));
		
	}
	
	
	// main method
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6,7};
		Integer[] arr = {1,2,3,4,5,6,7};
		reverse_ap1(arr1);
		//reverse_ap2(arr1, 0, arr1.length-1);
		reverse_ap3(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
