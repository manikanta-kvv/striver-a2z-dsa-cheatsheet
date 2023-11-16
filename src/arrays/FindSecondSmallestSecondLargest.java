package arrays;

/* Examples:
 * Example 1:
Input: [1,2,4,7,7,5]
Output: Second Smallest : 2
		Second Largest : 5
Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

Example 2:
Input: [1]
Output: Second Smallest : -1
		Second Largest : -1
Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array. There is no second largest or second smallest element present.
 * 
 */


public class FindSecondSmallestSecondLargest {

	/* approach 1: 
	 * find the first smallest and first largest and then loop through every element in array where the element != first smallest/largest
	 * 
	 */
	//	Time Complexity: O(N), We do two linear traversals in our array
	//	Space Complexity: O(1)
	public static void secondSmallestSecondLargest_ap1(int[] arr ) {
		if(arr.length == 0 || arr.length == 1) {
			System.out.println("Second Smallest: " + -1);
			System.out.println("Second Largest: " + -1);
			return;
		}
		int firstSmallest = Integer.MAX_VALUE;
		int firstLargest = Integer.MIN_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < firstSmallest) {
				firstSmallest = arr[i];
			}
			if(arr[i] > firstLargest) {
				firstLargest = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < secondSmallest &&  arr[i] != firstSmallest) {
				secondSmallest = arr[i];
			}
			if(arr[i] > secondLargest && arr[i] != firstLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("Second Smallest: " + secondSmallest);
		System.out.println("Second Largest: " + secondLargest);
	}
	
	
	/* approach 2:
	 * updating the largest, secondLargest and smallest, secondSmallest at the same time 
	 */
	public static void secondSmallestSecondLargest_ap2(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] != largest && arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}
			else if(arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println("Second Smallest: " + secondSmallest);
		System.out.println("Second Largest: " + secondLargest);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,7,7,5};
		secondSmallestSecondLargest_ap1(arr);
		secondSmallestSecondLargest_ap2(arr);

	}

}
