package arrays;

import java.util.Arrays;

/* Examples:
 * Example 1:
Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

Example 2:
Input: 1,2,0,1,0,4,0
Output: 1,2,1,4,0,0,0
Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */

public class MoveAllZeroesToEnd {

	/* approach 1: two pointer approach
	 * j pointer will move until it find a non-zero element and i pointer will move until it find zero element
	 * after j at non-zero element and i at zero element, swap elements in index positions i and j
	 */
	//	Time Complexity: O(N)
	//	Space Complexity: O(1)
	public static void moveZeroesToEnd_ap1(int[] arr ) {
		int i = 0;
		int j = 1;
		while(i < arr.length && j < arr.length) {
			while(j < arr.length && arr[j] == 0) {
				j++;
			}
			while(i < arr.length && arr[i] != 0) {
				i++;
			}
			if(i < j && j < arr.length) {
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
			
		}
		System.out.println("After moving zeroes to the end: " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1};
		moveZeroesToEnd_ap1(arr);

	}

}
