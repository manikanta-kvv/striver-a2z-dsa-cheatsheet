package arrays;

import java.util.HashMap;
import java.util.Map;

/* Examples:
 * Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
 */

public class LongestSubarrayPositives {

	
	/* approach 1: brute force
	 * generate all the subarrays of the given array
	 * i to j -> will be the subarray
	 * everytime i pointer will move from 0 to n-1 
	 * and j pointer starts from i to n-1
	 * and for every j, add arr[j] to sum
	 * after adding to the sum, check if the sum is equal to k
	 * if so, find the length of the subarray by using (j-i+1) and take the max value between (j-i+1) and len
	 */
	// time complexity: O(N^2)
	// space complexity: O(1)
	public static void longestSubarray_ap1(int[] arr, int k) {
		int len = 0;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum == k) {
					len = Math.max(j-i+1, len);
				}
			}
		}
		System.out.println("Length of longest subarray is: " + len);
	}
	
	
	/* approach 2: using hashMap
	 * run a loop and add every element in array to sum
	 * and check if the sum == k, then update maxLen
	 * let sum = (sum - k) + k, then prefixSum will be (sum - k)
	 * check if prefixSum (sum -k) present in hashMap, 
	 * if present then take max of (maxLen and (i - value of prefixSum present in hashMap))
	 * and everytime add sum to hashMap
	 * 
	 */
	// time complexity: O(N*logN)
	// space complexity: O(N)
	public static void longestSubarray_ap2(int[] arr, int k) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(sum == k) {
				maxLen = Math.max(maxLen, i+1);
			}
			int rem = sum - k;
			if(hashMap.containsKey(rem)) {
				int len = i - hashMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}
			hashMap.put(sum, i);
		}
		System.out.println("Length of longest subarray is: " + maxLen);
	}
	
	
	/* approach 3: using two pointer approach
	 * take two pointers i, j initialized to zero
	 * while the sum > k, keep on removing arr[i] and increment i by 1
	 * if sum == k, then update maxLen
	 * increment j by 1 and keep on adding arr[j] to sum till (j < arr.length)
	 * 
	 */
	// time complexity: O(2*N)
	// space complexity: O(1)
	public static void longestSubarray_ap3(int[] arr, int k) {
		int sum = arr[0];
		int maxLen = 0;
		int i = 0;
		int j = 0;
		while(j < arr.length) {
			while(i <= j && sum > k) {
				sum -= arr[i];
				i++;
			}
			if(sum == k) {
				maxLen = Math.max(maxLen, j-i+1);
			}
			j++;
			if(j < arr.length) sum += arr[j];
			
		}
		System.out.println("Length of longest subarray is: " + maxLen);
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 5, 1, 9};
		int k = 5;
		longestSubarray_ap3(arr, k);

	}

}
