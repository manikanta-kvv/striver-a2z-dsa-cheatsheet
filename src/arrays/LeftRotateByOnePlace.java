package arrays;

import java.util.Arrays;

/* Examples:
 * Example 1:
Input: N = 5, array[] = {1,2,3,4,5}
Output: 2,3,4,5,1
Explanation: 
Since all the elements in array will be shifted 
toward left by one so ‘2’ will now become the 
first index and and ‘1’ which was present at 
first index will be shifted at last.


Example 2:
Input: N = 1, array[] = {3}
Output: 3
Explanation: Here only element is present and so 
the element at first index will be shifted to 
last index which is also by the way the first index.
 */

public class LeftRotateByOnePlace {

	/* approach 1:
	 * by swapping the first element to its next element till the end of the array,
	 * such that we will get the first element to the last index and all other elements will move left by one position
	 */
	// time complexity: O(N)
	// space complexity: O(1)
	public static void leftRotateByOne_ap1(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			//swap
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		System.out.println("Array after rotating left by one position: " + Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		leftRotateByOne_ap1(arr);

	}

}
