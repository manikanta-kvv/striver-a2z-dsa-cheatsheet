package arrays;

import java.util.HashMap;
import java.util.Map;

/* Examples:
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
 
 * Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */

public class CountSubarraySumEqualsK {

	/* approach 1: using hashMap
	 * take a hashMap which stores the prefixSum and its occurances
	 * initialize the hashMap by adding (prefixSum, occurance) > (0, 1)
	 * add every element of array to prefixSum
	 * if (prefixSum - k) is in hashMap, then get the occurance of that element and add to the count, else add zero to the count
	 * update the hashMap with prefixSum, if prefixSum exists update it by incrementing 1 or else add prefixSum with 1
	 */
	//	Time Complexity: O(N) 
	//	Space Complexity: O(N) 
	public static void countSubArrSumEqualsK_ap1(int[] arr, int k) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int prefixSum = 0;
		int count = 0;
		hashMap.put(0, 1);
		
		for(int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];
			
			int remove = prefixSum - k;
			count += hashMap.getOrDefault(remove, 0);
			
			hashMap.put(prefixSum, hashMap.getOrDefault(prefixSum, 0) + 1);
		}
		
		System.out.println("No of subarrays with given sum(k) " + k + " are: " + count);
		
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		countSubArrSumEqualsK_ap1(arr, 3);

	}

}
