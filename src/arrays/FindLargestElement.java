package arrays;

/* Examples: 
 * Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 5
Explanation: 5 is the largest element in the array. 

 * Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 10
Explanation: 10 is the largest element in the array. 
 * 
 */


public class FindLargestElement {
	
	/* approach 1:
	 * loop through every element in the array and keep track of the largest element by comparing with every other element in the array with a variable
	 */
	//	Time Complexity: O(N)
	//	Space Complexity: O(1)
	public static int findLargest_ap1(int[] arr) {
		int largest = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] arr = {2,5,1,3,0};
		int res = findLargest_ap1(arr);
		System.out.println("Largest Element in the array: " + res);

	}

}
