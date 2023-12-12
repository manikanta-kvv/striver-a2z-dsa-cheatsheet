package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* Examples:
 * Example 1:

Input: [100, 200, 1, 3, 2, 4]

Output: 4

Explanation: The longest consecutive subsequence is 1, 2, 3, and 4.

Input: [3, 8, 5, 7, 6]

Output: 4

Explanation: The longest consecutive subsequence is 5, 6, 7, and 8.
 */

public class LongestConsecutiveSequence {

	
	/* approach 1: 
	 * sort the given array, 
	 * and loop through array, find the consecutive elements by comparing current and next element
	 * if the difference between current and next elements is 1, then we can say they are two consecutive numbers, so increment count by 1
	 */	
	//	Time Complexity: O(NlogN) + O(N), where (NlogN) for sorting the array, N for the loop used
	//	Space Complexity: O(1)
	public static void longestConsecutiveSeq_ap1(int[] arr) {
		Arrays.sort(arr);
		int count = 1;
		for(int i = 0; i < arr.length-1; i++) {
			if((arr[i+1] - arr[i]) == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	/* approach 2: using hash set
	 * add every element in array to hash set
	 * if the (current element - 1), is not exists in the set, we can say that the current element is the starting element in consecutive elements sequence
	 * after finding the starting element for the consecutive sequence, check if (x+1), (x+2), (x+3)... elements exists in the set, where x is the current element
	 * for every next consecutive element present in set, we increment the count by 1, update the x by its next element, i.e., x = x + 1
	 * after that, store the max value between count and longestCount in longestCount variable
	 */
	//	Time Complexity: O(N) + O(2*N) ~ O(3*N)
	//	Space Complexity: O(N)
	public static void longestConsecutiveSeq_ap2(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int longestCount = 1;
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for(int ele : set) {
			if(!set.contains(ele - 1)) {
				int count = 1;
				int currentElem = ele;
				while(set.contains(currentElem+1)) {
					currentElem = currentElem + 1;
					count++;
				}
				longestCount = Math.max(count, longestCount);
			}
		}
		System.out.println(longestCount);
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 8,  7, 6, 10, 12};
		longestConsecutiveSeq_ap1(arr);
		longestConsecutiveSeq_ap2(arr);

	}

}
