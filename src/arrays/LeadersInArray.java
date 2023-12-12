package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Examples:
 * Example 1:
Input:
 arr = [4, 7, 1, 0]
Output:
 7 1 0
Explanation:
 Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

Example 2:
Input:
 arr = [10, 22, 12, 3, 0, 6]
Output:
 22 12 6
Explanation:
 6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), also 22 is greater than 12, 3, 0, 6.
 */

public class LeadersInArray {

	/* approach 1: using two loops
	 * if the current element is greater than its rightmost elements, then the current element knows as leader of the array
	 * checking the current element with its rightmost elements using another loop
	 * if at any point, current element is less than its rightmost elements, then break the loop and proceed to next iteration 
	 */
	//	Time Complexity: O(N^2)
	//	Space Complexity: O(1)
	public static void leadersInArr_ap1(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			boolean isLeader = true;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader) System.out.println(arr[i]);
			
		}
		System.out.println(arr[arr.length-1]);
	}
	
	
	/* approach 2:
	 * loop through the array from last element, such that we will remember the highest(max element) so far,
	 * if we find a element greater than the (highest so far) element, then we consider the current element as leader of the array
	 */
	//	Time Complexity: O(N)
	//	Space Complexity: O(N)
	public static void leadersInArr_ap2(int[] arr) {
		int max = Integer.MIN_VALUE;
		List<Integer> leaders = new ArrayList<>();
		for(int i = arr.length-1; i >= 0; i--) {
			if(arr[i] > max) {	
				max = arr[i];
				leaders.add(arr[i]);
			}
		}
		System.out.println(leaders);
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 22, 12, 3, 0, 6};
		leadersInArr_ap1(arr);
		leadersInArr_ap2(arr);

	}

}
