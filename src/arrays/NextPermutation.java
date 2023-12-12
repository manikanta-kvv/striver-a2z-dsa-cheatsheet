package arrays;

import java.util.Arrays;

/* Examples:
 * Example 1:
 * Input format: Arr[] = {1,3,2}
Output: Arr[] = {2,1,3}
Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
 
 * Example 2:
 * Input format: Arr[] = {3,2,1}
Output: Arr[] = {1,2,3}
Explanation: As we see all permutations of {1,2,3}, we find {3,2,1} at the last position. So, we have to return the topmost permutation.
 */

public class NextPermutation {

	
	/* approach 1:
	 * loop through from back of the array, check if there exists a decreasing element
	 * if the current element < next element(i < i+1), then set index to i and we have to break the loop at that point
	 * loop through from back of the array, then check for the next highest element for the index element 
	 * (for example, for 1, out of 3, 4, 5, 3 is the next highest element
	 * after finding the next highest element, swap the elements at ith and index positions of the array
	 * after that, reverse the array from index+1 position to end of the array (n-1)
	 */
	//	Time Complexity: O(3N)
	//	Space Complexity: O(1)
	public static void nextPermutation_ap1(int[] arr) {
		int index = -1;
		int n = arr.length;
		//checking if there exists a decreasing element from the back of array
		for(int i = n-2; i >= 0; i--) {
			if(arr[i] < arr[i+1]) {
				index = i;
				break;
			}
		}
		System.out.println("Index: " + index);
		//if there is no decreasing element exists, index value remains at -1, in that case, we just have to reverse the given array from start to n-1
		if(index == -1) {
			reverseArray(arr, 0, n-1);
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		//checking for the next highest element for the element at index position from the back of array
		for(int i = n-1; i > index; i--) {
			if(arr[i] > arr[index]) {
				//swap arr[i] and arr[index]
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				System.out.println(arr[i] );
				System.out.println(arr[index]);
				break;
			}
		}
		
		//reverse array from index+1 to n-1
		int start = index + 1;
		int end = n-1;
		reverseArray(arr, start, end);

		
		
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void reverseArray(int[] arr, int start, int end) {	
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 0, 0, 4, 6, 9};
		nextPermutation_ap1(arr);

	}

}
