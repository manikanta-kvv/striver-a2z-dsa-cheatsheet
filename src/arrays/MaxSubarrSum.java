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
	 * if sum > max, then set maxSum = sum
	 * if sum < 0, which means negative values doesn't give us the required maximum sum, so set sum = 0
	 */
	// time complexity : O(N)
	// space complexity : O(1)
	public static int maxSubArrSum_ap2(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if(sum > maxSum) {
				maxSum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
	
		
		}
		//System.out.println("MaxSum: " + maxSum);
		return maxSum;
	}
	
	
	/* follow-up question for Kadane's algorithm
	 * display the subarray having the max sum
	 * to displaying the subarray with max sum, take two varibles subArrStart and subArrEnd initialized to -1, and a start variable to zero
	 * before adding the current element to the sum, check if the sum == 0, if so, then set start = i, which means the subarray starts from the current index i
	 * if sum > max, then set maxSum = sum, subArrStart = start and subArrEnd = i,
	 * so whenever a sum > max, we are storing the current index i as subArrEnd 
	 */
	public static int maxSubArrSum_ap2_followUp(int[] arr) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		int subArrStart = -1;
		int subArrEnd = -1; 
		for(int i = 0; i < arr.length; i++) {
			if(sum == 0) start = i;
			sum += arr[i];
			if(sum > maxSum) {
				maxSum = sum;
				subArrStart = start;
				subArrEnd = i;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		
		System.out.print("Sub array is : [");
		for(int i = subArrStart; i <= subArrEnd; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]\n");
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1};
		int res1 = maxSubArrSum_ap1(arr);
		int res2 = maxSubArrSum_ap2(arr);
		int res3 = maxSubArrSum_ap2_followUp(arr);
		System.out.println("Max Sum of subarray is: " + res1);
		System.out.println("Max Sum of subarray is: " + res2);
		System.out.println("Max Sum of subarray is: " + res3);

	}

}
