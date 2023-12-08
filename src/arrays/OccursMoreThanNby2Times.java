package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Examples:
 * Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation: When we just count the occurrences of each number and compare with half of the size of the array, you will get 3 for the above solution. 

Example 2:
Input Format:  N = 7, nums[] = {2,2,1,1,1,2,2}

Result: 2

Explanation: After counting the number of times each element appears and comparing it with half of array size, we get 2 as result.

Example 3:
Input Format:  N = 10, nums[] = {4,4,2,4,3,4,4,3,2,4}

Result: 4
 */

public class OccursMoreThanNby2Times {

	
	/*approach 1: using hashMap
	 * count the occurance of every element in array, and 
	 * then check if the cound of any element in array is greater than N/2, where N is size of the array
	 * 
	 */
	// time complexity : O(N*logN) + O(N)
	// space complexity : O(N)
	public static void moreThanNby2Times_ap1(int[] arr) {
		int nBy2 = arr.length/2;
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			}
			else {
				hashMap.put(arr[i], 1);
			}
		}
		//System.out.println(hashMap);
		for(Entry<Integer, Integer> e : hashMap.entrySet()) {
			if(e.getValue() > nBy2) {
				System.out.println(e.getKey());
				return;
			}
		}
		System.out.println(-1);
	}
	
	
	/* approach 2: Moore's voting algorithm
	 * it's like pick a element and vote for that element if again the pickup element exists in array by increment count
	 * if the current value is not an picked up element, decrease voting for that element by decrementing count
	 * take two variables element and count
	 * initialize count to 0
	 * if count == 0, then change the element to arr[i], where i is the current index and set count to 1
	 * if arr[i] == elem, increment count by 1
	 * if arr[i] != elem, decrement count by 1
	 * after the for loop, elem contains a value that its count != 0 at the time of loop execution stopped
	 * loop through array, then check if count of elem in array is greater than n/2
	 * if yes, return elem, or else return -1
	 */
	// time complexity : O(N) + O(N)
	// space complexity : O(1)
	public static void moreThanNby2Times_ap2(int[] arr) {
		int ele = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(count == 0) {
				ele = arr[i];
				count = 1;
			}
			else if (arr[i] == ele) {
				count++;
			}
			else {
				count--;
			}	
		}
		int count1= 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) count1++;
		}
		if(count1 > arr.length/2) System.out.println(ele);
		else System.out.println(-1);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
		moreThanNby2Times_ap1(arr);
		moreThanNby2Times_ap2(arr);

	}

}
