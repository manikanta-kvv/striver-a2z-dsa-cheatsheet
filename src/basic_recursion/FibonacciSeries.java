package basic_recursion;

/* Examples:
 * Example 1:
Input: N = 5
Output: 0 1 1 2 3 5
Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

 * Example 2:
Input: 6

Output: 0 1 1 2 3 5 8
Explanation: 0 1 1 2 3 5 8 is the fibonacci series upto 6th term.(o based indexing)
 */

public class FibonacciSeries {

	/* approach 1:
	 * using recursion method
	 */
	// time complexity: O(n)
	// space complexity: O(n)
	public static String fibonacci_ap1(int n, int a, int b) {
		
		//base condition
		if(n == 0) return "";
		
		return String.valueOf(b) + " " +fibonacci_ap1(n-1, b, a+b);
	}
	
	
	/* approach 2:
	 * space optimized approach
	 * store the last and secondLast values and for every iteration from 2, add last, secondLast and store that into current value
	 * after that, secondLast will be the last, and current value will be the last for the next iteration 
	 */
	// time complexity:
	// space complexity:
	public static void fibonacci_ap2(int n) {
		if(n == 0) {
			System.out.print(0);
		}
		else {
			int last = 1; // (n-1)
			int secondLast = 0; // (n-2)
			System.out.print(secondLast + " " + last + " ");
			int current;
			for(int i = 2; i <= n; i++) {
				current = last + secondLast;
				secondLast = last;
				last = current;
				System.out.print(current + " ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int n = 5;
		String series = fibonacci_ap1(n, 0, 1);
		System.out.println("0 " + series);
		fibonacci_ap2(2);
	}

}
