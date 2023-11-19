package arrays;

import java.util.Arrays;
import java.util.HashSet;

/* Examples:
 * Example 1: 

Input: arr[1,1,2,2,2,3,3]

Output: arr[1,2,3,_,_,_,_]

Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

Example 2: 

Input: arr[1,1,1,2,2,3,3,3,3,4,4]

Output: arr[1,2,3,4,_,_,_,_,_,_,_]

Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 */

public class RemoveDuplicatesInPlace {
	
	/* approach 1: we can use hash set
	 * hash set only stores unique elements
	 */
	//	Time complexity: O(n*log(n))+O(n)
	//	Space Complexity: O(n) 
	public static void removeDuplicates_ap1(int[] arr ) {
		HashSet<Integer> hashSet = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			hashSet.add(arr[i]);
		}
		System.out.println("Using hashSet: " + hashSet);
	}

	
	/* approach 2:
	 * using two pointer approach
	 */
	//	Time Complexity: O(N)
	//	Space Complexity: O(1)
	public static void removeDuplicates_ap2(int[] arr) {
		int i = 0; 
		int j = 1;
		while( i < arr.length && j < arr.length) {
			while(j < arr.length && arr[j] == arr[i]) {
				j++;
			}
			if(i < arr.length && j < arr.length) {
				i++;
				arr[i] = arr[j];
			}
		}
		for(int m = i+1; m < arr.length; m++) {
			arr[m] = 0; //marking every other element after unique elements as zero
		}
		System.out.println("Updated array: " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3};
		removeDuplicates_ap1(arr);
		removeDuplicates_ap2(arr);
	}

}
