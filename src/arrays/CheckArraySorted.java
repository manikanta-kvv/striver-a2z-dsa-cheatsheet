package arrays;

/* Examples:
 * Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: True.
Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.

 * Example 2:
Input: N = 5, array[] = {5,4,6,7,8}
Output: False.
Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.

Here element 5 is not smaller than or equal to its future elements.
 */

public class CheckArraySorted {
	
	/* approach 1:
	 * loop through array and check if current element is smaller than next element, if yes, return true or else false
	 */
	//	Time Complexity: O(N)
	//	Space Complexity: O(1)
	public static boolean isArraySorted(int[] arr ) {
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		int[] arr = {5,4,6,7,8};
		boolean res = isArraySorted(arr);
		System.out.println("is Array Sorted: " + res);

	}

}
