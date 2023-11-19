package arrays;

/* Examples:
 * Example 1:
Input: arr[]= 1 2 3 4 5, num = 3
Output: 2
Explanation: 3 is present in the 2nd index

Example 2:
Input: arr[]= 5 4 3 2 1, num = 5
Output: 0
Explanation: 5 is present in the 0th index
 */

public class LinearSearch {

	/* approach 1:
	 * loop through array and if there's a element in array, return its index or else return -1
	 */
	//	Time Complexity: O(n), where n is the length of the array.
	//	Space Complexity: O(1)
	public static int linearSearch(int[] arr , int num) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == num) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int res = linearSearch(arr, 31);
		System.out.println(res);

	}

}
