package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayNegPosZeros {

	
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
	 * and check if the sum == , then update maxLen
	 * let sum = (sum - k) + k, then prefixSum will be (sum - k)
	 * check if prefixSum (sum -k) present in hashMap, 
	 * if present then take max of (maxLen and (i - value of prefixSum present in hashMap))
	 * and if hashMap does not contain sum, then add sum to hashMap
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
			//same as LongestSubarrayPositives, but the only difference here is
			//add sum to hashMap if and only if the sum doesn't exist in hashMap
			if(!hashMap.containsKey(sum)) {
				
				hashMap.put(sum, i);
			}
		}
		System.out.println("Length of longest subarray is: " + maxLen);
	}
	
	
	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
		int[] arr = {1, -1, 0, 1, -1};
		int k = 0;
		longestSubarray_ap2(arr, k);

	}

}
