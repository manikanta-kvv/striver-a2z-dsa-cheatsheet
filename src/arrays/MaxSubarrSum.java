package arrays;

/* Examples:
 * Example 1:

Input: arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output: 6 

Explanation: [4,-1,2,1] has the largest sum = 6. 

Examples 2: 

Input: arr = [1] 

Output: 1 

Explanation: Array has only one element and which is giving positive sum of 1. 
 */

public class MaxSubarrSum {

	
	/* approach 1: using two loops
	 * checking every subarray and its sum
	 */
	// time complexity : O(N^2)
	// space complexity : O(1)
	public static int maxSubArrSum_ap1(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			int sum = 0;
			for(int j = i; j < arr.length; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		//System.out.println(maxSum);
		return maxSum;
	}
	
	/* approach 2: using Kadane's algorithm 
	 * take two variables sum and maxSum
	 * for every element in array, add the element to sum
	 * if sum == 0, then we have to start the sum from that current element, so set sum = arr[i]
	 * if sum < 0, which means negative values doesn't give us the required maximum sum, so set sum = 0 and continue the next iteration
	 * take the maximum betweeen maxSum and sum, then store it in maxSum
	 */
	// time complexity : O(N)
	// space complexity : O(1)
	public static int maxSubArrSum_ap2(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum ==0) {
				sum = arr[i];
			}
			else if(sum < 0) {
				sum = 0;
				continue;
			}
			maxSum = Math.max(maxSum, sum);
		
		}
		//System.out.println("MaxSum: " + maxSum);
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1};
		int res1 = maxSubArrSum_ap1(arr);
		int res2 = maxSubArrSum_ap2(arr);
		System.out.println("Max Sum of subarray is: " + res1);
		System.out.println("Max Sum of subarray is: " + res2);

	}

}
