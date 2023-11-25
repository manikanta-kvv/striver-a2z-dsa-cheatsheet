package arrays;

import java.util.Arrays;

/* Examples:
 * Example 1:
Input Format: N = 5, array[] = {1,2,4,5}
Result: 3
Explanation: In the given array, number 3 is missing. So, 3 is the answer.

Example 2:
Input Format: N = 3, array[] = {1,3}
Result: 2
Explanation: In the given array, number 2 is missing. So, 2 is the answer.
 */

public class MissingNumber {

	/* approach 1:
	 * do a linear search using two for loops, to find the number
	 * for every i from 1 to N, if i is not present in the array, then it is missing number so return i
	 * flag is used to whether the particular element is present in the array
	 * if the element is in the array, then set flag = 1 or else flag = 0
	 */
	// time complexity: O(N^2)
	// space complexity: O(1)
	public static int findMissingNumber_ap1(int[] arr, int n) {
		for(int i = 1; i <= n; i++) {
			int flag = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) return i;
		}
		return -1;
	}
	
	
	/* approach 2 : using hashing and maintain their frequencies
	 * if frequency of a number is zero, then it means that is the missing number
	 */
	//	Time Complexity: O(N) + O(N) ~ O(2*N)
	//	Space Complexity: O(N)
	public static int findMissingNumber_ap2(int[] arr, int n) {
		int[] hashMap = new int[n+1];
		for(int i = 0; i < arr.length; i++) {
			hashMap[arr[i]]++;
		}
		
		for(int i = 1; i < hashMap.length; i++) {
			if(hashMap[i] == 0) {
				return i;
			}
		}
		return 0;
		
	}
	
	
	/* approach 3: summation approach
	 * we know that formula for sum of n natural numbers is n*(n+1)/2
	 * so sum of n natural numbers - sum of all elements in array = missing number
	 */
	// time complexity: O(N)
	// space complexity: O(1)
	public static int findMissingNumber_ap3(int[] arr, int n) {
		int sumOfArrElems = 0;
		int sumOfNaturalNums = (n * (n + 1))/2;
		for(int i = 0; i < arr.length; i++) {
			sumOfArrElems += arr[i];
		}
		int missingNum = sumOfNaturalNums - sumOfArrElems;
		return missingNum;
	}
	
	
	/* approach 4 : XOR approach
	 * XOR of two same numbers is always 0 i.e. a ^ a = 0. Property 1.
	 * XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  Property 2
	 * so do XOR of (XOR(array elments) and XOR(natural numbers from 1 to N))
	 */
	// time complexity: O(N)
	// space complexity: O(1)
	public static int findMissingNumber_ap4(int[] arr, int n) {
		int naturalNumsXOR = 0;
		int arrElemsXOR = 0;
		for(int i = 0; i <= n; i++) {
			if(i > 0 && i <= n) {
				naturalNumsXOR = naturalNumsXOR ^ i;				
			}
			if(i < arr.length) {
				arrElemsXOR = arrElemsXOR ^ arr[i];
			}
		}
		int missingNum = naturalNumsXOR ^ arrElemsXOR;
		return missingNum;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,4};
		int res1 = findMissingNumber_ap1(arr, 5);
		int res2 = findMissingNumber_ap2(arr, 5);
		int res3 = findMissingNumber_ap3(arr, 5);
		int res4 = findMissingNumber_ap4(arr, 5);
		System.out.println("Missing Number: " + res4);

	}

}
