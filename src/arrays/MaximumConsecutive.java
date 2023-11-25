package arrays;

/* Examples:
 * Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

 * Example 2:
Input: prices = {1, 0, 1, 1, 0, 1} 
Output: 2
Explanation: There are two consecutive 1's in the array. 
 */
public class MaximumConsecutive {
	
	/* approach 1:
	 * loop through array elements, if found 1 increment the count, else set count to zero 
	 * if at any point, count > max_count, then set max_count to count
	 */
	//	Time Complexity: O(N) 
	//	Space Complexity: O(1)
	public static void findConsecutive_ap1(int[] arr) {
		int count = 0;
		int max_count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
			else {
				count = 0;
			}
			if(count > max_count) {
				max_count = count;
			}
			
		}
		
		System.out.println("The maximum  consecutive 1's are " + max_count);
			
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 1, 0, 1, 1, 1};
		findConsecutive_ap1(arr);
	}

}
