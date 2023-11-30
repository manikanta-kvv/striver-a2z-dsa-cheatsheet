package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* Examples:
 * Example 1:
Input Format: arr[] = {2,2,1}
Result: 1
Explanation: In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format: arr[] = {4,1,2,1,2}
Result: 4
Explanation: In this array, only element 4 appear once and the other elements appear twice. So, 4 is the answer.
 */

public class FindNumberAppearsOnce {

	
	/* approach 1:
	 * using hashMap
	 */
	//	Time Complexity: O(N*logM) + O(M), where M = size of the map i.e. M = (N/2)+1. N = size of the array.
	//	Space Complexity: O(M) as we are using a map data structure. Here M = size of the map i.e. M = (N/2)+1.
	public static void numAppearsOnce_ap1(int[] arr) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			}
			else {
				hashMap.put(arr[i], 1);
			}
		}
		System.out.println(hashMap);
		for(Entry<Integer, Integer> e : hashMap.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println("Number appearing once is: " + e.getKey());
			}
		}
	}
	
	
	/* approach 2:
	 * using XOR between all elements of array
	 * XOR of any two numbers is zero, so by using XOR approach,
	 * all the numbers that appears twice will be zero and we left with a number that appears once
	 */
	public static void numAppearsOnce_ap2(int[] arr) {
		int xorOfArrElems = 0;
		for(int i = 0; i < arr.length; i++) {
			xorOfArrElems = xorOfArrElems ^ arr[i];
		}
		
		System.out.println("Number appearing once is: " + xorOfArrElems);
	}
	
	public static void main(String[] args) {
		int[] arr = {4,1,2,1,2};
		numAppearsOnce_ap1(arr);
		numAppearsOnce_ap2(arr);

	}

}
